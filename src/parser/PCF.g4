grammar PCF;

// --- Règles syntaxiques ---

program : term EOF ;

term : 'let' ID '=' term 'in' term               # Let
     | 'ifz' term 'then' term 'else' term        # Cond
     | expr                                      # SimpleTerm
     ;

expr : expr OPLast factor                        # BinOpExpr
     | factor                                    # SimpleExpr
     ;

factor : factor OPFirst atom                     # BinOpFactor
       | atom                                    # SimpleFactor
       ;

atom : LIT                                       # Lit
     | ID                                        # Var
     | '(' term ')'                              # Parens
     ;

// --- Règles lexicales ---

// Mots-clés (définis AVANT ID pour qu'ils soient prioritaires)
LET  : 'let';
IN   : 'in';
IFZ  : 'ifz';
THEN : 'then';
ELSE : 'else';

ID   : [a-z][a-xzA-Z0-9]* ;    // Identifiants (variables, ex: x, y, var1)
LIT  : '0' | [1-9][0-9]* ;

OPFirst : '*' | '/' ;
OPLast  : '+' | '-' ;
WS      : [ \t\r\n]+ -> skip ;