package home.work.praka2;

import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

@RequiredArgsConstructor
public class Main implements HumanService {
    private final HumanService humanService;
    static List<Human> humanList = new ArrayList<>();


    public static void main(String[] args) {
        Human human1 = new Human(15, "Изабелла", "Игоревна", LocalDate.of(2003, 12, 01), 45);
        Human human2 = new Human(30, "Изабелла", "Игоревна", LocalDate.of(2013, 10, 12), 21);


        humanList.add(human1);
        humanList.add(human2);

        System.out.println(humanList.stream()
                .filter(human -> human.weight() > human.age())
                .toList());

        Comparator<Human> comparator = (o1, o2) -> o1.age() - o2.age();
        System.out.println(humanList.stream()
                .sorted(comparator.reversed()).toList());


        System.out.println(humanList.stream().mapToInt(i-> i.age()).sum());


    }

    @Override
    public List<Human> filterHuman() {
        return humanList.stream()
                .filter(human -> human.weight() > human.age())
                .toList();
        //? - почему метод не могу вызвать
        //- выгрузить на гит, отпраивить на почту преподу
    }

    @Override
    public List<Human> sortedSecondName() {
        return null;
    }

    @Override
    public List<Human> summa() {
        return null;
    }


}
