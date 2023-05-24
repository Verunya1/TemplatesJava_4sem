package home.work.praka10;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class FilePrinter implements PrinterService{
    @Override
    public void doPrint() {
        System.out.println("file printer");
    }
}
