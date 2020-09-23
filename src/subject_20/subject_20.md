**subject_20**



**主要思路：**

为了判断括号的一一匹配性。首先用一个hashMap对左右括号进行初始化匹配。

![image-20200923082117575](C:\Users\15429\AppData\Roaming\Typora\typora-user-images\image-20200923082117575.png)



接着，用栈存储，从前向后扫描字符串，遇未出现则push，有匹配则将原来位置的括号pop。

![image-20200923082308375](C:\Users\15429\AppData\Roaming\Typora\typora-user-images\image-20200923082308375.png)