// 1 Пусть дан LinkedList с несколькими элементами. Реализуйте метод,
// который вернет “перевернутый” список.

import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> array = new LinkedList<>();
        array.add(23);
        array.add(3);
        array.add(1);
        array.add(5);
        array.add(6);
        array.add(6);
        System.out.println(array);
        reverce(array);
        System.out.println(array);
    }

    private static void reverce(LinkedList<Integer> array){
        for (int i = 0; i < array.size() / 2; i++) {
            int temp = array.get(i);
            array.set(i, array.get(array.size() - i - 1));
            array.set(array.size() - i - 1, temp);
        }
    }
}
