package by.it.varvashevich.lesson03;

import java.util.Scanner;

/*
Lesson 03. Task B2. Нужно написать программу, которая вводит три числа  a b c типа int с клавиатуры
и вычисляет корни квадратного уравнения a*a*x + b*x + c = 0:
1) Если два корня, то выводится два корня через пробел.
2) Если один корень, то выводится только одно число - корень.
3) Если нет действительных корней, то выводится сообщение об ошибке "Отрицательный дискриминант"

В программе должен быть определен статический метод dis вычисления дискриминанта,
который принимает на входе три числа типа int a,b,c
а на выходе возвращает число типа double

Примеры работы

Ввод:
2 5 3
Вывод:
-1.0 -1.5

Ввод:
2 4 2
Вывод:
-1.0

Ввод:
2 2 2
Вывод:
Отрицательный дискриминант

*/
class TaskB2 {

    public static double dis(int e, int f, int g){
        double d;
        d = (double)(f*f-4*e*g);
        return d;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double dr;
        double x1; double x2;
        dr=dis(a,b,c);
        if (dr<0) {System.out.println(a+" "+b+" "+c);
            System.out.println("Отрицательный дискриминант");}
        if (dr>0) {x1=(-b+Math.sqrt(dr))/(2*a);
            x2=(-b-Math.sqrt(dr))/(2*a);
            System.out.println(a+" "+b+" "+c);
            System.out.println(x1+" "+x2);}
        if (dr==0) {x1=(-b+Math.sqrt(dr))/(2*a);
            System.out.println(a+" "+b+" "+c);
            System.out.println(x1);}


}}
