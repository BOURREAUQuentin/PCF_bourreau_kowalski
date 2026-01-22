package ast;

import interp.Env;
import interp.IntVal;
import interp.Value;

public class BinOp extends Term {
    public OP op;
    public Term term1, term2;

    public BinOp(OP op, Term term1, Term term2) {
        this.op = op;
        this.term1 = term1;
        this.term2 = term2;
    }

    @Override
    public Value interp(Env e) {
        Value v1 = term1.interp(e);
        Value v2 = term2.interp(e);

        int i1 = ((IntVal) v1).value;
        int i2 = ((IntVal) v2).value;

        int result = switch (this.op) {
            case PLUS -> i1 + i2;
            case MINUS -> i1 - i2;
            case TIMES -> i1 * i2;
            case DIVIDE -> {
                if (i2 == 0) {
                    throw new ArithmeticException("Division par zéro");
                }
                yield i1 / i2;
            }
        };

        return new IntVal(result);
    }
}