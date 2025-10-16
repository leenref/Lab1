import java.util.Scanner;
import java.util.SortedMap;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

       /* 1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
        two numbers , takes two numbers as input
        Test Data:
        Input first number: 125
        Input second number: 24
        Expected Output :
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5*/
        System.out.println("Q1");

        System.out.println("Enter first number for math operations:");
        int number1=scan.nextInt();

        System.out.println("Enter first number for math operations:");
        int number2=scan.nextInt();

        int sum, sub,multiplay;
        double devotion,modNum;

        sum= number1 + number2;
        sub= number1 - number2;
        multiplay= number1 * number2;
        devotion= number1 / number2;
        modNum= number1 % number2;


        System.out.println(number1 +" + "+ number2 +" = "+ sum +"\n"+
                number1 +" - "+ number2 +" = "+ sub +"\n"+
                number1 +" x "+ number2 +" = "+ multiplay +"\n"+
                number1 +" / "+ number2 +" = "+ devotion +"\n"+
                number1 +" mod "+ number2 +" = "+ modNum +"\n"
                );



      /*  2. Write a Java program that takes a number as input and prints its multiplication table up to
        10.
        Test Data:
        Input a number: 8
        Output :
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24
...
        8 x 10 = 80*/
        System.out.println("Q2");

        System.out.println("Enter a number for multiplication table: ");
        int num=scan.nextInt();

        for (int i=1; i<= 10; i++){
            System.out.println(num + " x "+ i + " = "+ num*i);
        }




        //3. Write a Java program to print the area and perimeter of a circle.
        System.out.println("Q3");

        System.out.println("Enter the radius: ");
        double radius = scan.nextDouble();

        double p = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + p);
        System.out.println("Area is = " + area);



      /*  Java program to find out the average of a set of integers
        Enter the count of numbers:
        5
        Enter an integer:
        3
        Enter an integer:
        8
        Enter an integer:
        6
        Enter an integer:
        7
        Enter an integer:
        2
        The average is: 5.2*/
        System.out.println("Q4");


        System.out.println("the count of numbers ");
        int numbersAmount = scan.nextInt();

        int sum=0;
        int inputNum=0;

            for ( int i=1  ; i<= numbersAmount; i++) {
                System.out.print("Enter a number: ");
                inputNum = scan.nextInt();
                sum +=inputNum ;

            }
        double avg= sum / numbersAmount;

        System.out.println("The average is: " + avg);


    /*    Write a Java program that accepts three integers as input, adds the first two integers
        together, and then determines whether the sum is equal to the third integer.

                Sample Output:
        Input the first number : 5
        Input the second number: 10
        Input the third number : 15
        The result is: true  --------
        Input the first number : 10
        Input the second number: 20
        Input the third number : 25
        The result is: false*/
        System.out.println("Q5");

        System.out.println("Input the first number :");
        int num1=scan.nextInt();

        System.out.println("Input the second number :");
        int num2=scan.nextInt();

        System.out.println("Input the third number :");
        int num3=scan.nextInt();

        int sum= num1+num2;
        if (sum == num3){
            System.out.println("The result is: true");

        }else{
            System.out.println("The result is: false");
        }



       /* 6. Write a Java program to reverse a word.
        Sample Output:
        Input a word: dsaf
        Reverse word: fasd*/
        System.out.println("Q6");

        System.out.println("Input a word: ");
        String wordInput= scan.nextLine();
        String reversed="";

        for( int i=wordInput.length()-1; i>=0; i--){
            reversed += wordInput.charAt(i);
        }

        System.out.println(" Reverse word: "+reversed);



     /*   7 -  Java program to check whether the given number is even or odd
        Enter a number:
        33
        The number is Odd
        Enter a number:
        24
        The number is Even*/
        System.out.println("Q7");


        while(true){
            System.out.println("Enter a number: ");
            int num=scan.nextInt();

            if (num%2==0){
                System.out.println(" The number is Even");
            } else if (num%2==1) {
                System.out.println(" The number is Odd");
            }
            else{
                break;
            }
        }



       /* 8 - Java program to convert the temperature in Centigrade to Fahrenheit
        Enter temperature in Centigrade:
        43
        Temperature in Fahrenheit is: 109.4*
        f= (c x 9/5 )+ 32
        /
        */
        System.out.println("Q8");

        System.out.println(" Enter temperature in Centigrade:");
        double c=scan.nextDouble();

        double f=((c * 9/5 ))+32;
        System.out.println("Temperature in Fahrenheit is:" + f);






        /*9.Write a Java program that takes a string and a number from the user,then prints the
character in the given index.
Test Data:
Input a string: Java Bootcamp
Input a number: 1
Expected Output:
a */
        System.out.println("Q9");

        System.out.println("Input a string:");
        String input=scan.nextLine();

        System.out.println("Input a number:");
        int indexNum=scan.nextInt();

        System.out.println(input.charAt(indexNum));




    /*    10. Write a Java program to print the area and perimeter of a rectangle.
                Test Data:
        Width = 5.5 Height = 8.5
        Expected Output
        Area is 5.6 * 8.5 = 47.60
        Perimeter is 2 * (5.6 + 8.5) = 28.20*/
        System.out.println("Q10");


        System.out.println("Width = " );
        double w= scan.nextDouble();

        System.out.println("Height = " );
        double h= scan.nextDouble();

        double area= w *h ;
        double p=(h + w) *2;

        System.out.println("Area is "+ w + " * "+ h +"= "+ area);
        System.out.println("Perimeter is 2 * "+"("+w+" + "+h+")= " + p);



   /*     11. Write a Java program to compare two numbers.
        Input Data:
        Input first integer: 25
        Input second integer: 39
        Expected Output
        25 != 39
        25 < 39
        25 <= 39*/
        System.out.println("Q11");

        System.out.println("input first integer: ");
        int firstNum=scan.nextInt();

        System.out.println("input second integer: ");
        int secondNum=scan.nextInt();

        if(firstNum == secondNum){
            System.out.println(firstNum+ " = "+ secondNum);
        }else{
            System.out.println(firstNum+ " != "+ secondNum);
        }

        if(firstNum > secondNum){
            System.out.println(firstNum+ " > "+ secondNum);
        }else{
            System.out.println(firstNum+ " < "+ secondNum);
        }

        if(firstNum >= secondNum ){
            System.out.println(firstNum+ " >= "+ secondNum);
        }else{
            System.out.println(firstNum+ " <= "+ secondNum);
        }




      /*  12. Write a Java program to convert seconds to hours, minutes and seconds.
        Sample Output:
        Input seconds: 86399
        23:59:59*/
        System.out.println("Q12");

        System.out.print("Input seconds: ");
        int totalSeconds = scan.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.printf("%2d:%2d:%2d", hours, minutes, seconds);



     /*   13. Write a Java program that accepts four integers from the user and prints equal if all
        four are equal, and not equal otherwise.
                Sample Output:
        Input first number: 25
        Input second number: 37
        Input third number: 45
        Input fourth number: 23
        Numbers are not equal!*/
        System.out.println("Q13");

        System.out.printf(" Input first number:");
        int num1=scan.nextInt();

        System.out.printf(" Input second number:");
        int num2=scan.nextInt();

        System.out.printf(" Input third number:");
        int num3=scan.nextInt();

        System.out.printf(" Input fourth number:");
        int num4=scan.nextInt();

        if(num1 == num2 && num2 == num3 && num3 == num4){
            System.out.printf("Numbers are equal!");

        }else{
            System.out.printf("Numbers are not equal!");

        } }

/*
 Write a Java program that reads an integer and check whether it is negative, zero, or
positive.
Test Data Input a number: 7 Expected Output :
Number is positive
 */
       System.out.println("Q14");

       System.out.print("Input a number: ");
        int number = scan.nextInt();

        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }



        /*
        15.Write a program to enter the numbers till the user wants and at the end it
           should display the count of positive, negative and zeros entered  (End loop use -1 ,
           Don’t count -1).

         */
        System.out.println("Q15");

        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;


        while (true) {
            System.out.print("Enter a number (-1 to stop): ");
            int number = scan.nextInt();

            if (number == -1) {
                break;
            }

            if (number > 0) {
                posCount++;
            } else if (number < 0) {
                negCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println(posCount + " positives");
        System.out.println(zeroCount + " zeros");
        System.out.println(negCount + " negatives");


        /*
        16 - Write a program that prompts the user to input an integer and then outputs the
         number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
         */
        System.out.println("Q16");

        System.out.printf("Enter a number: ");
        String numTorRev=scan.nextLine();
        String reversedNum="";

        for( int i=numTorRev.length()-1; i>=0 ; i--){
                reversedNum += numTorRev.charAt(i);
        }
            System.out.println(reversedNum);





      /*  17 - Write a program to enter the numbers till the user wants and at the end the
        program should display the largest and smallest numbers entered.
                enter the number : 4
        enter the number : 5
        enter the number : -1
        enter the number : 9
        the large number : 9
        the small number : -1*/
        System.out.println("Q17");


        int l = Integer.MIN_VALUE;
        int s = Integer.MAX_VALUE;

        boolean flag = false;
        while (true) {
            System.out.print("Enter the number: ");
            int number = scan.nextInt();

            if (number == -1) {
                break;
            }

            flag = true;
            if (number > l) {
                l = number;
            }

            if (number < s) {
                s = number;
            }
        }

        if (flag) {
            System.out.println("The larg number : " + l);
            System.out.println("The small number : " + s);
        }



        /*
        18 - Determine and print the number of times the character ‘a’ appears in the input
              entered by the user.
              Enter String:
             Java bootcamp
             Output: Number of a's: 3
         */

        System.out.print("Enter String: ");
        String input = scan.nextLine();

        int counter = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'a' || c == 'A') {
                counter++;
            }
        }

        System.out.println("Number of a's: " + counter);





    }




}