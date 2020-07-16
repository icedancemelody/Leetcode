package subject_1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.*;

class Tosum {

    public int[] twosum(int[] nums,int target){
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            if(map.containsKey(temp)){

                return new int[]{i,map.get(temp)};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public void print(int []result){
        out.print("[");
        for(int i=result.length-1;i>-1;i--){
            if(i==0){
                out.print(result[i]);
            }
            else out.print(result[i]+",");

        }
       out.print("]");
    }
}

class MainTest1{

    public static void main(String[] args) {
        Scanner ms=new Scanner(System.in);
        Tosum x=new Tosum();
        int []nums={2,7,11,15};
        int target=9;
        int []result=x.twosum(nums,target);
        x.print(result);
    }
}