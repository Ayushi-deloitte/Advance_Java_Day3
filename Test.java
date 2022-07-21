import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
 class Student {

    int id;
    String name;
    String email;
    String dob;
    String branch;
    int marks[];

    public Student(int id, String name, String email, String dob, String branch, int[] marks) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.branch = branch;
        this.marks = marks;
    }

}


public class Test {
    public static void main(String args[]) throws IOException, ParseException {
//        Student s1=new Student(1,"Ayushi","ayukumari@gmail.com","21/07/1987","CSE",new int[]{95,96,87,56,23});
//        Student s2=new Student(2,"Neha","neha@gmail.com","30/09/1999","CSE",new int[]{96,87,67,89,54});
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student s[] = new Student[n];

        for(int i=0;i<n;i++) {
            int id = sc.nextInt();
            String name = sc.next();
            String email = sc.next();
            String dob = sc.next();
            String branch = sc.next();
            int marks[] = new int[5];
            int avg=0;
            for (int j = 0; j < 5; j++) {
                marks[j] = sc.nextInt();
                avg+=marks[j];

            }
            List<Integer> l=new ArrayList<>();
            for(int k=0;k<marks.length;k++)
            {
                System.out.println(l.add(marks[i]));
            }
            System.out.println(avg/5);
            s[i] = new Student(id, name, email, dob, branch, marks);
            System.out.println(s[i].id);


        }
        for (int i = 0; i < n; i++) {
            String d = s[i].dob.substring(6);
            int x = Integer.parseInt(d);
            System.out.println(x);
            if (x > 1997) {
                System.out.println(s[i].id + " " + s[i].name);
            }
            if(s[i].branch.equalsIgnoreCase("CSE") && x<1997)
            {
                System.out.println(s[i].id + " " + s[i].name);

            }
            if(s[i].name.startsWith("P"))
            {
                System.out.println(s[i].id + " " + s[i].name);

            }
            Date d1=new SimpleDateFormat("dd/MM/yyyy").parse(s[i].dob);
            if(s[i].email.contains("gmail.com"))
            {
                System.out.println(s[i].id + " " + s[i].name);

            }

        }
    }
}



