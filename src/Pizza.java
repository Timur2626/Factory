public abstract class Pizza {
    String name;
    String dough;
    String sauce;

    public void prepare() {
        System.out.println("Готовим " + name);
        System.out.println("Месим тесто: " + dough);
        System.out.println("Добавляем соус: " + sauce);
    }

    public void bake() {
    }

    public void cut() {
    }

    public void box() {
    }

    public String getName() {
        return name;
    }
}