
public abstract class Mouse {
    private final String name;

    public Mouse(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    public abstract void run();
}
