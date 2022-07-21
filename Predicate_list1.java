import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Predicate_list1 {
    static Predicate<List> list = list -> list.isEmpty();

    static Function<Integer, Integer> f1 = i -> i/2;
    static Function<Integer, Integer> f2 = i -> 3*i;


    public static void ListIsEmpty(){
        List<Integer> nums = Collections.emptyList();
        System.out.println("Predicate to check whether list is empty or not : "+list.test(nums));



    }
    //divide a number by 2 and then multiply the result with 3 using Function chaining
    public static void divideAndMultiply(){
        System.out.println("Divide the number by 2 and then multiply it  with 3 : " + f1.andThen(f2).apply(12));
    }

    public static void main(String[] args) {

        ListIsEmpty();

        divideAndMultiply();
    }



}
