package masterdsa.Array;

class Solution {
    public void pattern5(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
}

public class first {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.pattern5(5);
        
    }
}
