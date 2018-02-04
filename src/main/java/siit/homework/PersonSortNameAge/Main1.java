package siit.homework.PersonSortNameAge;

import java.util.*;


public class Main1 {

    public static void main(String[] args) {
        // create the TreeSet object container and pass the Comparator implementation through the TreeSet Constructor
        Set <Person> personTreeSet1 = new TreeSet<Person>(new AgeComparator());

        System.out.println("Set sort by age");
        System.out.println("***************");

        personTreeSet1.add(new Person("Sebastian", 18));
        personTreeSet1.add(new Person("Ade", 31));
        personTreeSet1.add(new Person("Bia", 24));
        personTreeSet1.add(new Person("Viorel", 12));

        for (Person set1 : personTreeSet1){
            System.out.println(set1);
        }
        System.out.println();
        System.out.println("Set sort by name");
        System.out.println("***************");

        // create the TreeSet object container and pass the Comparator implementation through the TreeSet Constructor
        Set <Person> personTreeSet2 = new TreeSet<Person>(new NameComparator());

        personTreeSet2.add(new Person("Sebastian", 18));
        personTreeSet2.add(new Person("Ade", 31));
        personTreeSet2.add(new Person("Bia", 24));
        personTreeSet2.add(new Person("Viorel", 12));

        for (Person set2 : personTreeSet2){
            System.out.println(set2);
        }
    }
}



