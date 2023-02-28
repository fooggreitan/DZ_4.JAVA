// 2 Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя

import java.util.LinkedList;
import java.util.Queue;

public class Task2 {
    public static void main(String[] args) {
        Queue<Integer> array = new LinkedList<Integer>();
        array.add(23);
        array.add(3);
        array.add(1);
        array.add(5);
        array.add(6);
        System.out.println("Исходный список: " + "\n" + array);

        enqueue(array);
    }

    private static void enqueue(Queue<Integer> array){
        System.out.println("Список с добавлением элемента: ");
        array.offer(6);
        first(array);
    }

    private static void dequeue(Queue<Integer> array){
        int next = array.remove();
        System.out.println(array);
        System.out.println("Удаленный элемент: " + next);
    }

    private static void first(Queue<Integer> array){
        int ferst = array.peek();
        System.out.println(array);
        System.out.println("Первый элемент списка: " + ferst);
        dequeue(array);
    }
}
