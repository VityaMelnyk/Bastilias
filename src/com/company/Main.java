package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("14 июля - взятия Бастилии");
        System.out.println("Java convention code");
int a = 3;
int b = 4;
int c = a + b;
int d = a - b;
int e = a * b;
// целая
        int f = a / b;
// дробная часть
int g = a % b;
// значок = єто присвоить
// для сравнения используется ==
// не равно пишется !=
// оператор сравнения
// условний оператор
        if (a > e){
            System.out.println("а больше е");
        }else {
            System.out.println("б больше е");
        }
        if (a == e){
            System.out.println("а ровно е");
        }else {
            System.out.println("a не ровно е");
        }
        //инкримент увеличить на единичку
        a = a + 1;
                //аналоги
        a++;
        a+=1;
        a+=20;
        a=a+20;
        String hello = "Hello World";
        System.out.println(hello.charAt(5));
        System.out.println(hello.length());
        for (int i = 0; i <hello.length(); i+=2) {
           System.out.println(hello.charAt(i));
        }
        String abba= "ABBA";
boolean res = false;
        for (int i = 0; i < abba.length()/2; i++) {
          if (abba.charAt(i)==abba.charAt(abba.length()-1-i)){
              res = true;
          }
        }
        System.out.println(res);
    }
}