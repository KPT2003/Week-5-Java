import java.util.ArrayList;
import java.util.Locale;

public class DoingIt {

    String[] cars = {"BMW", "AUDI", "MERCEDES BENZ", "TOYOTA", "PORSCHE"};

    public void lab1() {
        System.out.println(cars[cars.length - 2]); //good
        //String str1 = cars.toString();
        System.out.println(cars[0].length() + cars[1].length() + cars[2].length() + cars[3].length() + cars[4].length());

        boolean result = cars[0].length() == cars[cars.length - 1].length();
        System.out.println(result);
    }

    public void lab2() {
        Person[] students = new Person[3];
        int totalMark;
        students[0] = new Person();
        students[1].name = "Ellen"; // NullPointerException

        //System.out.println(totalMark); Compile error: Variable might not have been initialised
        //System.out.println(students[3]); Run-time error: NullPointerException (caused by an element of ‘students’ not ‘students’ itself)
        //System.out.println(students[]);
        System.out.println();


    }

    public void lab3() {
        ArrayList<Double> list = new ArrayList<Double>();

        list.add(Math.random() * 10); // [0,1)
        list.add(Math.random() * 10);
        list.add(Math.random() * 10);
        list.add(Math.random() * 10);
        list.add(Math.random() * 10);

        System.out.println(list);

    }

    public void lab4() {
        String str1 = "HeLLo";
        String str2 = "heLLo";
        String result1 = str1.substring(0, 4).toUpperCase().substring(1, 3).toLowerCase();
        String result2 = str2.substring(0, 4).toUpperCase().substring(1, 3).toLowerCase();

        if (str1.contains("example"))
    }


    public void lab5() {
        ArrayList<String> country = new ArrayList<String>();
        states.add("England");
        states.add("New Zealand");
        states.add("Australia");
        states.add("Canada");
        states.add("Korea");
        if (country == null || country.length < 1) {
            return "";
        }
        String largest = country[0];
        for (int i = 1; i < country.length; i++) {
            if (country[i].length() < largest.length()) {
                largest = country[i];
            }
        }
        return largest;
    }
}


