// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        List<Integer> list = new ArrayList<>(); 
        for (int i : A) {
            list.add(i);
        }
        System.out.println(list);
        for (int i=1; i<=A.length+1; i++) {
            list.add(i);
        }
        System.out.println(list);

        int rs = 0;
        for (int i : list) {
            rs = rs ^ i;
        }

        return rs;
    }
}
