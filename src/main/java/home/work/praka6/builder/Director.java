package home.work.praka6.builder;

public class Director {
    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void Construct() {
        builder.BuildEngine();
        builder.SetDirector();
    }
}
