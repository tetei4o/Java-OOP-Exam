package JarT;

import java.util.ArrayDeque;

public class Jar<Type> {
    private ArrayDeque<Type> stack;

    public Jar() {
        this.stack = new ArrayDeque<>();
    }

    public void add(Type e) {
        this.stack.push(e);
    }

    public Type remove() {
        return this.stack.pop();
    }
}
