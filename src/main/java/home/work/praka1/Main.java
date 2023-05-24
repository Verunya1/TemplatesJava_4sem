package home.work.praka1;

public class Main implements Predicate {
    public static void main(String[] args) {

        Predicate<Integer> isPinCode = x -> x > 999 && x < 10000 || x > 99999 && x < 1000000;

        System.out.println(isPinCode.test(123));
    }

    @Override
    public boolean test(Object o) {
        return false;
    }
}
