package home.work.praka5;

public class Singleton3 {
    private static Singleton INSTANCE;

    private Singleton3() {
    }

    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
