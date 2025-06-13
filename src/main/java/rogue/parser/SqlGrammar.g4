grammar SqlGrammar;

start
    : dml EOF
    ;
dml
    : select
    ;
select
    : WITH (RECURSIVE)? cte (',' cte)* select_statement2
    | select_statement2
    ;
cte
    : id=ID AS '(' select_statement1 ')'
    ;
select_statement1
    : SELECT distinct=DISTINCT? columns=selectItem (',' selectItem)*
      FROM from=tableExpression
      (joins+=join)*
      (where=whereClause)?
      (groupBy=groupByClause)?
      (having=havingClause)?
      (orderBy=orderByClause)?
      (setOp=setOperation)?
      (limit=limitClause)?
      (forUpdate=forUpdateClause)?
      select_statement1*
    ;
select_statement2
    : SELECT distinct=DISTINCT? columns=selectItem (',' selectItem)*
      FROM from=tableExpression
      (joins+=join)*
      (where=whereClause)?
      (groupBy=groupByClause)?
      (having=havingClause)?
      (orderBy=orderByClause)?
      (setOp=setOperation)?
      (limit=limitClause)?
      (forUpdate=forUpdateClause)?
      ';'
    ;
selectItem
    : expression (AS? alias=ID)?
    | windowFunction (AS? alias=ID)?
    ;
windowFunction
    : (aggregationFunction | windowOnlyFunction)
      '(' (DISTINCT)? (args+=expression (',' args+=expression)*)? ')'
      OVER '('
        (PARTITION BY partitionExpr+=expression (',' partitionExpr+=expression)*)?
        (ORDER BY orderItems+=orderByItem (',' orderItems+=orderByItem)*)?
        (frameClause)?
      ')'
    ;
frameClause
    : (RANGE | ROWS | GROUPS) frameBound
    | (RANGE | ROWS | GROUPS) BETWEEN frameBound AND frameBound
    ;
frameBound
    : UNBOUNDED PRECEDING
    | UNBOUNDED FOLLOWING
    | CURRENT ROW
    | expression PRECEDING
    | expression FOLLOWING
    ;
tableExpression
    : tableReference (AS? alias=ID)?
    ;
tableReference
    : ID
    | STRING
    | '(' select_statement2 ')' (AS? alias=ID)?
    | '(' select_statement1 ')' (AS? alias=ID)?
    ;
join
    : (joinType=joinTypeSpec)?
      JOIN right=tableExpression
      ON condition=expression
    ;
joinTypeSpec
    : RIGHT
    | LEFT
    | INNER
    | FULL OUTER?
    | CROSS
    ;
whereClause
    : WHERE condition=expression
    ;
groupByClause
    : GROUP BY expressions+=expression (',' expressions+=expression)*
    ;
havingClause
    : HAVING condition=expression
    ;
setOperation
    : UNION ALL?
    | INTERSECT
    | EXCEPT
    ;
orderByClause
    : ORDER BY orderItems+=orderByItem (',' orderItems+=orderByItem)*
    ;
orderByItem
    : expression ((ASC | DESC | USING operator=ID))?
    ;
limitClause
    : LIMIT (count=INT | ALL) (('OFFSET')? offset=INT)?
    ;
forUpdateClause
    : FOR UPDATE (tableList+=ID (',' tableList+=ID)*)? (NOWAIT | SKIPED LOCKED)?
    ;
expression
    : '(' expression ')'
    | NOT expression
    | left=expression op=('*' | '/' | '%') right=expression
    | left=expression op=('+' | '-') right=expression
    | left=expression op=('=' | '<' | '>' | '!=' | '<=' | '>=' | '<>' | '~' | '~*' | '!~' | '!~*') right=expression
    | left=expression op=(AND | OR) right=expression
    | left=expression (LIKE | ILIKE | SIMILAR TO) right=expression
    | left=expression op=IS NOT? right=expression
    | left=expression op=IN inExpr='(' (select_statement1 | expression (',' expression)*) ')'
    | left=expression op=BETWEEN lower=expression AND upper=expression
    | functionCall
    | windowFunction
    | columnReference
    | literal
    | caseExpression
    ;
caseExpression
    : CASE caseExpr=expression? (WHEN whenExpr+=expression THEN thenExpr+=expression)+
      (ELSE elseExpr=expression)? END
    ;
functionCall
    : name=ID '(' (DISTINCT)? args+=expression (',' args+=expression)* ')'
    | aggregationFunction '(' (DISTINCT)? arg=expression ')'
    ;
columnReference
    : (table=ID '.')? column=ID
    | '*'
    ;
literal
    : INT
    | DOUBLE
    | STRING
    | NULL
    | TRUE
    | FALSE
    ;
aggregationFunction
    : COUNT
    | SUM
    | AVG
    | MIN
    | MAX
    | GROUP_CONCAT
    ;
windowOnlyFunction
    : RANK
    | DENSE_RANK
    | ROW_NUMBER
    | NTILE
    | LEAD
    | LAG
    | FIRST_VALUE
    | LAST_VALUE
    | NTH_VALUE
    | PERCENT_RANK
    | CUME_DIST
    ;
SELECT: S E L E C T;
FROM: F R O M;
WHERE: W H E R E;
GROUP: G R O U P;
BY: B Y;
HAVING: H A V I N G;
ORDER: O R D E R;
LIMIT: L I M I T;
JOIN: J O I N;
ON: O N;
RIGHT: R I G H T;
LEFT: L E F T;
SKIPED : S K I P;
INNER: I N N E R;
FULL: F U L L;
OUTER: O U T E R;
CROSS: C R O S S;
DESC: D E S C;
ASC: A S C;
AS: A S;
RANK: R A N K;
DENSE_RANK: D E N S E '_' R A N K;
ROW_NUMBER: R O W '_' N U M B E R;
NTILE: N T I L E;
LEAD: L E A D;
LAG: L A G;
FIRST_VALUE: F I R S T '_' V A L U E;
LAST_VALUE: L A S T '_' V A L U E;
NTH_VALUE: N T H '_' V A L U E;
PERCENT_RANK: P E R C E N T '_' R A N K;
CUME_DIST: C U M E '_' D I S T;
OVER: O V E R;
PARTITION: P A R T I T I O N;
ROWS: R O W S;
RANGE: R A N G E;
GROUPS: G R O U P S;
UNBOUNDED: U N B O U N D E D;
PRECEDING: P R E C E D I N G;
FOLLOWING: F O L L O W I N G;
CURRENT: C U R R E N T;
ROW: R O W;
DISTINCT: D I S T I N C T;
WITH: W I T H;
RECURSIVE: R E C U R S I V E;
UNION: U N I O N;
ALL: A L L;
INTERSECT: I N T E R S E C T;
EXCEPT: E X C E P T;
COUNT: C O U N T;
SUM: S U M;
AVG: A V G;
MIN: M I N;
MAX: M A X;
GROUP_CONCAT: G R O U P '_' C O N C A T;
AND: A N D;
OR: O R;
NOT: N O T;
LIKE: L I K E;
ILIKE: I L I K E;
SIMILAR: S I M I L A R;
TO: T O;
IN: I N;
IS: I S;
NULL: N U L L;
TRUE: T R U E;
FALSE: F A L S E;
BETWEEN: B E T W E E N;
CASE: C A S E;
WHEN: W H E N;
THEN: T H E N;
ELSE: E L S E;
END: E N D;
FOR: F O R;
UPDATE: U P D A T E;
NOWAIT: N O W A I T;
USING: U S I N G;
LOCKED: L O C K E D;
fragment A: [aA];
fragment B: [bB];
fragment C: [cC];
fragment D: [dD];
fragment E: [eE];
fragment F: [fF];
fragment G: [gG];
fragment H: [hH];
fragment I: [iI];
fragment J: [jJ];
fragment K: [kK];
fragment L: [lL];
fragment M: [mM];
fragment N: [nN];
fragment O: [oO];
fragment P: [pP];
fragment Q: [qQ];
fragment R: [rR];
fragment S: [sS];
fragment T: [tT];
fragment U: [uU];
fragment V: [vV];
fragment W: [wW];
fragment X: [xX];
fragment Y: [yY];
fragment Z: [zZ];
ID: [a-zA-Z_][a-zA-Z0-9_]*;
STRING: '\'' (~'\'' | '\\\'')* '\'';
INT: '-'? [1-9][0-9]* | '0';
DOUBLE: INT '.' [0-9]+ ('e' '-'? [0-9]+)?;
WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '--' ~[\r\n]* -> skip;
MULTILINE_COMMENT: '/*' .*? '*/' -> skip;
