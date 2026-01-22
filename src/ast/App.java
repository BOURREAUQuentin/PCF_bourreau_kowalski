package ast;

import interp.Env;
import interp.Value;
import interp.Closure;

public class App extends Term {
    public Term fun;
    public Term arg;

    public App(Term fun, Term arg) {
        this.fun = fun;
        this.arg = arg;
    }

    @Override
    public Value interp(Env e) {
        // évaluer l'argument (Appel par valeur)
        Value argVal = arg.interp(e);

        // évaluer la fonction (doit donner une Closure)
        Value funVal = fun.interp(e);

        if (!(funVal instanceof Closure)) {
            throw new RuntimeException("Erreur : tentative d'appel sur une non-fonction");
        }
        Closure closure = (Closure) funVal;

        // créer l'environnement d'exécution
        Env funEnv = closure.env.add(closure.arg, argVal);

        // exécuter le corps de la fonction
        return closure.body.interp(funEnv);
    }

    @Override
    public String toString() {
        return "(" + fun + " " + arg + ")";
    }
}