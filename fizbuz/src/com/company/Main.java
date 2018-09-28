package com.company;
import java.util.Scanner;

class Number{
    private static String vord1="FIZZ";
    private static String vord2="BUZZ";
    private static String vord3="FizzBuzz";
    public static void printTextMoreTimes() {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println(vord3);
            }
            else if (i % 5 == 0) {
                System.out.println(vord2);
            }
            else if (i%3==0){
                System.out.println(vord1);
            }
            else{
                System.out.println(i);
            }
        }
    }

    public static void easyNum(int num){
        boolean isEASY=true;
        int temp;
        for (int i=2; i<num/2;i++){
            temp=num % i;
            if (temp==0){
                isEASY=false;
                break;
            }

        }
        if (isEASY){
            System.out.println("Easy "+ num);
        }
        else{
            System.out.println("NotEasy "+num);
        }

    }

    public static boolean isCorrect(String s){
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                sum++;
            }
            if (s.charAt(i) == ')') {
                sum--;
                if (sum < 0) {
                    return false;
                }
            }

        }
        if (sum == 0) {
            return true;
        } else {
            return false;
        }

    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
       // Number stroka=new Number();
        Number num = new Number();
        num.printTextMoreTimes();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int numbers= scanner.nextInt();
        num.easyNum(numbers);
        System.out.println("Enter string");
        String stroka=scanner.nextLine();
       System.out.println(Number.isCorrect("(())"));


    }
}
