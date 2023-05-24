package home.work.praka13;

import home.work.praka10.ConsolePrinter;
import home.work.praka10.FilePrinter;
import home.work.praka10.PrinterService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PrinterApplication {


    public static void main(String[] args) {
        var applicationContext = SpringApplication.run(PrinterApplication.class, args);
//        ApplicationContext context = SpringApplication.run(PrinterApplication.class, args);

//        try {
//            PrinterService printer1 = applicationContext.getBean(ConsolePrinter.class);
//            printer1.doPrint();
//            PrinterService printer2 = applicationContext.getBean(FilePrinter.class);
//            printer2.doPrint();
//
//        } catch (IndexOutOfBoundsException e) {
//            e.printStackTrace();
//            System.err.println("Expected 1 command line argument, found 0!");
//        }

    }
}
