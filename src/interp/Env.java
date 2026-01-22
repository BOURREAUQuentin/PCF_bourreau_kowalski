package interp;

import java.util.Optional;

public abstract class Env {
    public abstract Env add(String id, Value v);

    public abstract Optional<Value> lookup(String id);
}