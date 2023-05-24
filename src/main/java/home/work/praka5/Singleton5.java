package home.work.praka5;

public class Singleton5 {
    private Singleton5() {
    }

    private static class SingletonHolder {
        public static final Singleton HOLDER_INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
