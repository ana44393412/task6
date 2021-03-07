
public class MouseMagician extends Mouse implements Magician {
    public MouseMagician(final String name) {
        super(name);
    }

    @Override
    public void conjures() {
        System.out.println(getName() + " применяет зелье с запахом сыра Дорблю");
    }

    @Override
    public void protection() {
        System.out.println(getName() + " использует мантию-сырнинку для защиты");
    }

    @Override
    public void run() {
        System.out.println(getName() + " догоняет на Uber");
    }
}
