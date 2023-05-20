// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        List sumList = new ArrayList();
        int a_sum = 0;
        int left = 0;
        int right = 0;

        for (int i : A) a_sum += i;
        
        for (int i=1; i< A.length; i++) {
            left += A[i-1];
            right = a_sum -left;
            sumList.add(Math.abs(left-right));
        }
        return (int)Collections.min(sumList);
    }
}
