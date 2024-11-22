/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroToOop;
import java.util.Scanner;

public class IntroToOOP1 {
    public static void main (String []args){
    Scanner Input=new Scanner(System.in);
            int num1,num2,sum;
           System.out.println("Enter num1");
            num1 = Input.nextInt();
            System.out.println("Enter num2");
            num2 =Input.nextInt();
            sum = num1+num2;
            System.out.println("sum is:," +sum);
}
}

