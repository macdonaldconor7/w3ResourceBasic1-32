package javaapplication10;

import java.util.Scanner;

public class JavaApplication10
{

    public static void main(String[] args)
    {

        System.out.println("Hello");
        System.out.println("My Name Is Conor");
        simpleMath();
        division(); 
        operations();
        basicMath();
        forLoop();
        javaShape();
        sciExpression();
        math();
        circle();
        inputCalculator();
        rectangle();
        swapVariable();
        face();
        binaryNumber();//This doesn't work right, i have no idea how it works...  */
        compare();

    }

    private static void simpleMath()
    {
        //To change body of generated methods, choose Tools | Templates.
        int a = 73;
        int b = 36;
        int z = a + b;
        System.out.print(z);
    }

    private static void division()
    {
        int a = 50;
        int b = 3;
        System.out.println(50 / 3);
    }

    private static void operations()
    {

        int a = 5;
        int aa = -5;
        int b = 8;
        int bb = 6;
        int c = 55;
        int d = 9;
        int e = 20;
        int f = -3;
        int g = 15;
        int h = 3;

        System.out.println(aa + b * bb);
        System.out.println((c + d) % d);
        System.out.println(e + f * g / b);
        System.out.println(a + g / h * 3 - b % h);

    }

    private static void basicMath()
    {

        int a = 125;
        int b = 24;

        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a % b);

    }

    private static void forLoop()
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Input a number: ");
        int num1 = input.nextInt();

        for (int i = 0; i < 9; i++)
        {
            System.out.println(num1 + "x" + (i + 1) + "=" + (num1 * (i + 1)));
        }

    }

    private static void javaShape()
    {
        System.out.println("    j    a    v      v    a");
        System.out.println("    j   a a    v    v    a a");
        System.out.println("j   j  aaaaaa   v  v    aaaaaa");
        System.out.println(" jj   a      a   v     a      a");

    }

    private static void sciExpression()
    {

        double a = 4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
        System.out.println(a);

    }

    private static void math()
    {
        double a;
        a = (25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5);
        System.out.println(a);
    }

    private static void circle()
    {
        double area, perimeter;
        double radius = 7.5;

        area = Math.PI * Math.pow(radius, 2);
        perimeter = 2 * Math.PI * radius;

        System.out.println("The area of the circle is: " + area);
        System.out.println("The perimeter of the circle is: " + perimeter);
    }

    private static void inputCalculator()
    {
        Scanner input = new Scanner(System.in);
        double a, b, c, d;

        System.out.println("Please enter three numbers either seperated by spaces or pressing enter each time.");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        d = (a + b + c) / 3;
        System.out.println("The average of your input was: " + d);
    }

    private static void rectangle()
    {
        double width = 5.6, height = 8.5, area, perimeter;

        area = width * height;
        perimeter = 2 * (width + height);
        String perimetera = String.format("%.2f", perimeter);
        String areaa = String.format("%.2f", area);

        System.out.println("The area of the rectange is: " + areaa + " and the perimeter is: " + perimetera);
    }

    private static void swapVariable()
    {
        //String str = "word", str2 = "drow";
        //double a = 5, b = 10;
        int c = 1, d = 3, e;
        System.out.println("Before swap C = " + c + " and D = " + d);
        e = c;
        c = d;
        d = e;
        System.out.println("After the swap C = " + c + " and D = " + e);

    }

    private static void face()
    {
        System.out.println(" +\"\"\"\"\"+");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  |");
        System.out.println(" | '_' |");
        System.out.println(" +-----+");
    }

    private static void binaryNumber()
    {
        long binary1, binary2, multiply = 0;
        int digit, factor = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first binary number: ");
        binary1 = input.nextLong();
        System.out.print("Input the second binary number: ");
        binary2 = input.nextLong();
        while (binary2 != 0)
        {
            digit = (int) (binary2 % 10);
            System.out.println(digit);
            if (digit == 1)
            {
                binary1 = binary1 * factor;
                multiply = binaryproduct((int) binary1, (int) binary2);
            }
            else
            {
                binary1 = binary1 * factor;
            }
            binary2 = binary2 / 10;
            factor = 10;
        }
        System.out.println("Product of the two binary numbers: " + multiply);

    }

    private static long binaryproduct(int binary1, int binary2)
    {
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        int binary_prod_result = 0;

        while (binary1 != 0 || binary2 != 0)
        {
            sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
            remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        if (remainder != 0)
        {
            sum[i++] = remainder;
        }
        --i;
        while (i > 0)
        {
            binary_prod_result = binary_prod_result * 10 + sum[i--];
        }

        return binary_prod_result;
    }

    private static void compare()
    {
        Scanner input = new Scanner(System.in);
        double a, b;
        System.out.println("Input first integer, followed by another");
        a = input.nextDouble();
        b = input.nextDouble();
        System.out.println("The first integer is: " + a + "  " + "\n" + "The second integer is: " + b + "\n" + "Comparision of input will commence.");

        evaluation(a, b);

    }

    private static void evaluation(double a, double b)
    {
        if (a == b)
        {
            System.out.println("The numbers are even:" + a + " = " + b);
        }
        else if (a > b)
        {
            System.out.println("The frist number: " + a + " is greater than the second: " + b);
        }
        else if (a < b)
        {
            System.out.println("The first number: " + a + " is less than the second: " +b);
        }
    }

}
