public class Fun_length {

    public interface Calc {

        int len(String value);

    }



    public static void main(String[] args){

        Fun_length.Calc calc = (String val) -> val.length();

        System.out.println(calc.len("Ayushi"));

    }
}
