// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        // Implement your solution here
        int a_len = A.length;
        int S[] = new int[a_len];

        for (int i=0; i<a_len; i++) {
            S[(i+K)%a_len] = A[i];

        }
        System.out.println(S);

        return S;
    }
}