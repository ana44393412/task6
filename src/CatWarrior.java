public class CatWarrior extends Cat implements Warrior {

    public CatWarrior(final String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " бежит по полю маков, но его тормозит встречный ветер");
    }

    @Override
    public void war() {
        System.out.println(getName() + " атакует сковородкой");
    }

    @Override
    public void protection() {
        System.out.println(getName() + " защищается скалкой");
    }
}
