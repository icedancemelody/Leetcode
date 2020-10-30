package subject_7;


import java.util.*;
//这题主要是要注意移除问题，这里只用了*10再/10是否相等一步就解决了，非常nb啊非常nb。

class Solution {
    public int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            if ((ans * 10) / 10 != ans) {
                ans = 0;
                break;
            }
            ans = ans * 10 + x % 10;
            x = x / 10;
        }
        return ans;
    }
}

class MainTest7 {

    public static void main(String[] args){
        Solution x = new Solution();
        Scanner s = new Scanner(System.in);//java接收用户输入
        int x1=s.nextInt();
        int str=x.reverse(x1);
        System.out.println(str);
    }
}