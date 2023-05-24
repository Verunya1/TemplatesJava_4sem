package home.work.praka10;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ConsolePrinter implements PrinterService {

    @Override
    public void doPrint() {
        System.out.println("console print");
    }



}
