
import java.util.function.Predicate;
import java.util.*;
public class Predicate_startswithG {


//    public static void predicate_or(List<String> list)
//    {
//
//        Predicate<String> containsLetterA = p -> p.startsWith("G");
//        String containsA = "Giraffe";
//        boolean outcome = (containsLetterA).test(containsA);
//        System.out.println(outcome);
//    }

    public static List<String> process(List<String> list,
                                     Predicate<String> predicate)
    {
        List<String> result = new ArrayList<String>();
        for (String i:list)
            if (predicate.test(i))
                result.add(i);
        return result;
    }

    public static void main(String[] args)
    {
        List<String> list=new ArrayList<>();
        list.add("Giraffe");
        list.add("Gaya");
        list.add("Patna");

        List admins = process(list, (p) -> p.startsWith("G"));
        System.out.println(admins);

    }
}
