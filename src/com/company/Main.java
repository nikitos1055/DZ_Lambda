package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a  = 0 , b = 0 , result;

        Integer action = null;

        Operationable operation;

        while(true){
            try {
                System.out.print("Enter x - ");
                a = sc.nextDouble();
                System.out.print("Enter y - ");
                b = sc.nextDouble();
            }catch (Exception e){
                System.out.println("Wrong symbol! Only numbers...");
            }
            menu(a, b);
            try {
                 action = sc.nextInt();
            }catch (Exception e){
                System.out.println("Wrong symbol! Only numbers...");
            }
                switch (action){
                    case 1:
                        operation = (x, y) -> x + y;
                         result = operation.calculate(a , b);
                        System.out.println("x + y = " + result);
                        lines();
                        break;

                     case 2:
                         operation = (x, y) -> x - y;
                          result = operation.calculate(a , b);
                         System.out.println("x - y = " + result);
                         lines();
                        break;

                     case 3:
                         operation = (x, y) -> x * y;
                         result = operation.calculate(a , b);
                         System.out.println("x * y = " + result);
                         lines();
                        break;

                     case 4:
                         if(b == 0){
                             System.out.println("Division by 0 is impossible...");
                         }else {
                             operation = (x, y) -> x / y;
                             result = operation.calculate(a, b);
                             System.out.println("x / y = " + result);
                         }
                         lines();
                        break;

                    case 0:
                        System.exit(0);
                        break;

                        default:
                        System.out.println("Wrong number. Numbers : [0-4] ...");
            }
        }
    }

    static void menu(double a, double b){
        System.out.println("Yours numbers: ("+ a +" , "+ b +")\nEnter action: \n 1. Plus. \n 2. Minus. \n 3. Multiply. \n 4. Devide. \n 0. To exit.");
    }

    static void lines(){
        System.out.println("================================================");
    }

    interface Operationable{
        double calculate(double x, double y);
    }

}


