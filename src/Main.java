import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Main {


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


    private static int order (Integer o2, Integer o1){
        if (o1 > o2) {
            return 1;
        } else if (o2 > o1) {
            return -1;
        }
        return 0;
    }

    public static <T, U> BiConsumer<T, U>  findMinMax
            (BiConsumer<? super T, ? super T> minMaxConsumer,
             Comparator<? super T> order,
             Stream<? extends T> stream){
        Stream<? extends T> min = stream;
        Stream<? extends T> max = stream;
        return minMaxConsumer.accept(min, max);

    }


}


