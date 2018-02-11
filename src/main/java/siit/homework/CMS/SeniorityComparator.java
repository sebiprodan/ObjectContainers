package siit.homework.CMS;

import java.util.Comparator;

public class SeniorityComparator implements Comparator {
    public int compare(Object o1, Object o2) {

        Employee p1 = (Employee) o1;
        Employee p2 = (Employee) o2;

        if (p1.seniority == p2.seniority)
            return 0;
        else if (p1.seniority > p2.seniority)
            return 1;
        else
            return -1;
    }
}