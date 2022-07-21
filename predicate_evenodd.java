

import java.util.Scanner;
import java.util.function.Predicate;

public class predicate_evenodd {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        // lambda expression to evaluate number is EVEN using Predicate FI
        Predicate<Integer> p = i -> i%2 == 0;
               if(p.test(sc.nextInt()))
               {
                   System.out.println("even");
               }
               else
               {
                   System.out.println("odd");
               }
        // testing number using Predicate

 }
}

