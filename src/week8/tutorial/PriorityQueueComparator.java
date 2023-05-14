package week8.tutorial;
import java.util.*;

public class PriorityQueueComparator implements Comparator<String>{
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length()) {
        return -1;
        }
        if (s1.length() > s2.length()) {
        return 1;
        }
        return 0;
        }
}
