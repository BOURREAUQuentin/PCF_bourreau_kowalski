package ast;

import interp.Env;
import interp.IntVal;
import interp.Value;

public class Cond extends Term {
    public Term test, branchTrue, branchFalse;

    public Cond(Term test, Term branchTrue, Term branchFalse) {
        this.test = test;
        this.branchTrue = branchTrue;
        this.branchFalse = branchFalse;
    }

    @Override
    public Value interp(Env e) {
        // évalue la condition
        Value testVal = test.interp(e);

        // vérifie que c'est bien un entier
        if (((IntVal) testVal).value == 0) {
            return branchTrue.interp(e);
        } else {
            return branchFalse.interp(e);
        }
    }
}