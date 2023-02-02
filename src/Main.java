import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;


public class Main {



    private static Integer t2;

    public static void main(String[] args) {



        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(9);
        arr.add(3);
        arr.add(6);
        arr.add(8);

//
        //Задача №2

        Predicate<Integer> evenNum = integer -> {
            if (integer % 2 == 0) {
                return true;
            }
            return false;
        };

        Integer count = Math.toIntExact(arr.stream().filter(evenNum).count());
        System.out.println("Коллличество четных чисел - " + count);
        List<Integer> even = arr.stream().filter(evenNum).collect(Collectors.toList());
        System.out.println(even);
    }


    //Задача №1





    public static <T> void findMinMax
            (BiConsumer<? super T, ? super T> minMaxConsumer,
             Comparator<? super T> order,
             Stream<? extends T> stream){

//
        T min = (T) stream.collect(Collectors.toList()).stream().max(order).get();
        T max = (T) stream.collect(Collectors.toList()).stream().max(order).get();


        minMaxConsumer.accept(min, max);
    }






}


