package com.practice.twopointer;

public class Palindrome {

    public  static  void main (String[] args){
        String str = "madam";
        int left = 0 ;
         int right = str.length() -1 ;
         boolean palindrom = true ;
          while (left< right){
              if(str.charAt(left) != str.charAt(right)){
                  palindrom = false;
                  break;
              }
              left ++;
              right --;
          }
          if(palindrom){
              System.out.println(str);
          }
           System.out.println(palindrom);
    }
}
