grammar PCF;

program : term EOF ;

term : LET ID '=' term IN term                   # Let
     | FUN ID '->' term                          # Fun
     | IFZ term THEN term ELSE term              # Cond
     | expr                                      # SimpleTerm
     ;

expr : expr OPLast factor                        # BinOpExpr
     | factor                                    # SimpleExpr
     ;

factor : factor atom                             # App
       | factor OPFirst atom                     # BinOpFactor
       | atom                                    # SimpleFactor
       ;

atom : LIT                                       # Lit
     | ID                                        # Var
     | '(' term ')'                              # Parens
     ;


LET  : 'let';
IN   : 'in';
IFZ  : 'ifz';
THEN : 'then';
ELSE : 'else';
FUN  : 'fun';
ARROW: '->';

ID   : [a-z][a-zA-Z0-9]* ;
LIT  : '0' | [1-9][0-9]* ;

OPFirst : '*' | '/' ;
OPLast  : '+' | '-' ;
WS      : [ \t\r\n]+ -> skip ;