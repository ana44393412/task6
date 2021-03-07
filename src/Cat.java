public abstract class Cat {
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    public abstract void run();

    public final void die() {
        System.out.println(name + " теперь смертельно убитый труп");
    }
}
