public class Battle {
    public final void start() {
        CatWarrior dean = new CatWarrior("Дин");
        MouseMagician sam = new MouseMagician("Сэм");
        System.out.println("Да начнется битва");
        dean.run();
        sam.run();
        dean.war();
        sam.protection();
        sam.conjures();
        dean.protection();
        dean.die();
        System.out.println("Таков путь");
    }
}
