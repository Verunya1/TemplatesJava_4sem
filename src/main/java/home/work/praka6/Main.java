package home.work.praka6;

import home.work.praka6.abstract_factory.Client;
import home.work.praka6.abstract_factory.IceCreamFactory;
import home.work.praka6.abstract_factory.IceCreamFactoryA;
import home.work.praka6.abstract_factory.IceCreamFactoryB;
import home.work.praka6.builder.Car;
import home.work.praka6.builder.Director;
import home.work.praka6.builder.Builder;
import home.work.praka6.builder.TeslaBuilder;
import home.work.praka6.builder.ToyotaBuilder;
import home.work.praka6.factory_method.CircleWaffleMaker;
import home.work.praka6.factory_method.RectangularWaffleMaker;
import home.work.praka6.factory_method.Waffle;
import home.work.praka6.factory_method.WaffleMaker;
import home.work.praka6.prototype.Packing;


public class Main {
    public static void main(String[] args) {
        System.out.println("Factory method example: ");
        WaffleMaker[] waffleMakers = { new CircleWaffleMaker(), new RectangularWaffleMaker() };
        for (WaffleMaker waffleMaker : waffleMakers) {
            Waffle waffle = waffleMaker.factoryMethod();
            waffle.print();
        }
        System.out.println();

        System.out.println("Abstract factory example: ");
        IceCreamFactory[] iceCreamFactories = { new IceCreamFactoryA(), new IceCreamFactoryB() };
        for (IceCreamFactory iceCreamFactory : iceCreamFactories) {
            Client client = new Client(iceCreamFactory);
            client.execute();
        }
        System.out.println();

        System.out.println("Builder example: ");
        Builder[] builders = { new TeslaBuilder(), new ToyotaBuilder() };
        for (Builder builder : builders) {
            Director director = new Director(builder);
            director.Construct();
            Car car = builder.GetResult();
            car.print();
        }
        System.out.println();

        System.out.println("Prototype example: ");
        Packing originalPacking = new Packing();
        Packing[] packingArray = new Packing[5];
        for (int i = 0; i < 5; i++) {
            try {
                packingArray[i] = originalPacking.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            packingArray[0].print();
        }
        System.out.println();
    }
}
