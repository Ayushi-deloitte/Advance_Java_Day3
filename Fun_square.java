

import java.util.*;

public class Fun_square {

    public interface Calc {

        int square(int value);

    }



    public static void main(String[] args){

        Calc calc = (int val) -> val * val;

        System.out.println(calc.square(5));

    }


}
