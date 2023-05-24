package home.work.praka7;

import home.work.praka7.decorator.CompressionDecorator;
import home.work.praka7.decorator.DataSourceDecorator;
import home.work.praka7.decorator.EncryptionDecorator;
import home.work.praka7.decorator.FileDataSource;
import home.work.praka7.flyweight.SpectralType;
import home.work.praka7.flyweight.StarFactory;

import javax.sql.DataSource;

public class Main {
    public static void main(String[] args) {


        System.out.println("Flyweight example: ");
        StarFactory starFactory = new StarFactory();
        for (int i = 0; i < 10; i++) {
            switch (i % 3) {
                case 0 -> starFactory.createStar(SpectralType.M);
                case 1 -> starFactory.createStar(SpectralType.G);
                case 2 -> starFactory.createStar(SpectralType.A);
            }
        }
    }
}
