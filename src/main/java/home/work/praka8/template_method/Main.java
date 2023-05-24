package home.work.praka8.template_method;

public class Main {
    public static void main(String[] args) {
        System.out.println("Рисуем флаг России:");
        AbstractThreeRowsFlag russianFlag = new RussianFlag();
        russianFlag.drawFlag();

        System.out.println("\nРисуем флаг Нидерландов:");
        AbstractThreeRowsFlag netherlandsFlag = new NetherlandsFlag();
        netherlandsFlag.drawFlag();
    }
}
