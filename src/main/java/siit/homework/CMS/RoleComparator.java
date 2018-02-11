package siit.homework.CMS;

import java.util.Comparator;

public class RoleComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        Employee p1=(Employee) o1;
        Employee p2=(Employee) o2;

        return p1.role.compareTo(p2.role);     }
}