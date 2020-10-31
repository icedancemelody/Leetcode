package subject_9;

import java.util.Scanner;

/**
 * 回文数判断
 * 这道题自己实现用字符串的解法，不用字符串的解法更重要：
 * 第一步先把得到的整型变量，通过操作得到他的反向数字
 * 具体的方法是将数字%10，就能得到第一位，然后将数字/10，消去刚刚得到的一位。如此反复。
 * 结束循环的条件，是我们得到的新数字比原来的数字大，这意味着已经反向读取了一半以上。
 * 当然，负数绝对不是回文数。
 **/

public class Solution {
    public boolean isPalindrome(int x) {
        String str=String.valueOf(x);


        for(int i=0;i<str.length()-1;i++){
            if(i==str.length()-1-i){
                return true;
            }
            else if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}



class MainTest9 {

    public static void main(String[] args){
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        int temp=sc.nextInt();
        boolean x=s.isPalindrome(temp);
        System.out.print(x);
    }
}