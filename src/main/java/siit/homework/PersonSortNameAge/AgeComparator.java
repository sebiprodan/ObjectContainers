package siit.homework.PersonSortNameAge;

import java.util.Comparator;

public class AgeComparator implements Comparator {
    public int compare(Object o1, Object o2) {

        Person p1 = (Person) o1;
        Person p2 = (Person) o2;

        if (p1.age == p2.age)
            return 0;
        else if (p1.age > p2.age)
            return 1;
        else
            return -1;
    }
}

