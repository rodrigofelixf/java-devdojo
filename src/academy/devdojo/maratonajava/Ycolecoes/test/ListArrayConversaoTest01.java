package academy.devdojo.maratonajava.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        Integer[] listToArray = numbers.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));
        System.out.println("--------------");
        Integer[] arraysNumbers = new Integer[3];
        arraysNumbers[0] = 1;
        arraysNumbers[1] = 2;
        arraysNumbers[2] = 3;

        List<Integer> arrayToList = Arrays.asList(arraysNumbers);
        arrayToList.set(0, 12);
        System.out.println(Arrays.toString(arraysNumbers));
        System.out.println(arrayToList);

        System.out.println("--------------");
        List<Integer> listNumbers = new ArrayList<>(Arrays.asList(arraysNumbers));
        listNumbers.add(15);
        listNumbers.set(0, 10);
        System.out.println(listNumbers);
    }
}
