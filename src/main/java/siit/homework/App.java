package siit.homework;

import java.util.*;


public class App {

    public static void main(String[] args) {

        Collection <Person> personTreeSet1 = new TreeSet<Person>(new AgeComparator());


        personTreeSet1.add(new Person("Sebastian", 18));
        personTreeSet1.add(new Person("Ade", 31));
        personTreeSet1.add(new Person("Bia", 24));
        personTreeSet1.add(new Person("Viorel", 12));

        for (Person set1 : personTreeSet1){
            System.out.println(set1);
        }

        System.out.println("**************************************************************");

        Collection <Person> personTreeSet2 = new TreeSet<Person>(new NameComparator());

        personTreeSet2.add(new Person("Sebastian", 18));
        personTreeSet2.add(new Person("Ade", 31));
        personTreeSet2.add(new Person("Bia", 24));
        personTreeSet2.add(new Person("Viorel", 12));

        for (Person set2 : personTreeSet2){
            System.out.println(set2);
        }
    }
}



