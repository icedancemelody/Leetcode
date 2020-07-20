package subject_3;



import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

class Solution3 {
    public int lengthOfLongestSubstring(String s){
         int result=0;
         if(s.length()==0) return 0;
         for(int i=0;i<s.length();i++) {
             for(int j=i+1;j<=s.length();j++){
                 if (allUnique(s, i, j)) result = Math.max(result, j - i);
             }

         }
        return result;
    }

    public boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }




    public int lengthOfLongestSubstring1(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}

class MainTest3 {

    public static void main(String[] args) {
        Solution3 x = new Solution3();

        String s = " ";
        //int result = x.lengthOfLongestSubstring(s);//蛮力法
        int result = x.lengthOfLongestSubstring1(s);//滑动哈希法
        System.out.print(result);
    }
}