package subject_2;



import java.util.LinkedList;
import java.util.Scanner;

class Solution {
    public LinkedList<Integer> addTwonumbers(LinkedList<Integer> l1,LinkedList<Integer> l2){
        LinkedList<Integer> result=new LinkedList<Integer>();

        int carry=0;
        int i=0;//指针

        while(l1.get(i)!=null||l2.get(i)!=null){
            result.add(0+carry);
            carry=0;
            if(l1.get(i)==null){
                l1.set(i,0);
            }
            else if(l2.get(i)==null){
                l2.set(i,0);
            }
            int temp=l1.get(i)+l2.get(i);
            if(temp>=10) {
                int mod = temp % 10;
                carry = (temp - mod) / 10;
                result.set(i,result.get(i)+mod);
            }
            else{
                result.set(i,result.get(i)+temp);
            }

            i++;
            if(i==Math.max(l1.size(),l2.size())){
                break;
            }
            if(l1.size()>l2.size()){
                l2.add(null);
            }
            else if(l1.size()<l2.size()){
                l1.add(null);
            }
        }


        return result;
    }
}

class MainTest2{

    public static void main(String[] args) {
        Solution x=new Solution();
        LinkedList<Integer> l1=new LinkedList<Integer>();
        l1.add(2);
        l1.add(4);
        l1.add(3);
//        l1.add(1);
//        l1.add(3);
        LinkedList<Integer> l2=new LinkedList<Integer>();
        l2.add(5);
        l2.add(6);
        l2.add(4);

        LinkedList<Integer>result=x.addTwonumbers(l1,l2);
        for(int i=result.size()-1;i>-1;i--){
            System.out.print(result.get(i));
        }
    }
}