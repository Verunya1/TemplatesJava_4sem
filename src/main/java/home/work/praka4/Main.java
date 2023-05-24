package home.work.praka4;

public class Main {
    public static void main(String[] args) {
        MyExecutorService myExecutorService = new MyExecutorService(2);
        myExecutorService.execute(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Потом это");
        });

        myExecutorService.execute(() -> System.out.println("Сначала это"));
        myExecutorService.shutdown();

    }
}
