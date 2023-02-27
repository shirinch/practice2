import java.util.Scanner;

public class IfElse {
   public static void main (String[] args) {

//      Scanner scan = new Scanner(System.in);
//      String text = ("введите два числа");
//        System.out.println(text);
//      int number = scan.nextInt();
//      int number2 = scan.nextInt();
//
//      if (number < number2) {
//            System.out.println("наименьшее из этих чисел:"+number);
//
//        } else{
//            System.out.println("наименьшее из этих чисел:"+number2);
//        }
//
//
//
//
//       Scanner scan1 = new Scanner(System.in);
//        System.out.println("введите число");
//         int one = scan.nextInt();
//
//       if(number>9999){
//            System.out.println("Вы ввели 5-значное число ");
//        }
//        if(number>999){
//            System.out.println("Вы ввели 4-значное число ");
//        }
//
//        if(number>99){
//            System.out.println("Вы ввели 3-значное число ");
//        }
//        if(number<100){
//            System.out.println("вы ввели 2-значное число ");
//        }
//        if(number<10){
//            System.out.println("вы ввели 1-значное число ");
//       }



       Scanner scann= new Scanner(System.in);
       String hi = ("Введите число");
       System.out.println(hi);

       int s = scann.nextInt();

       int s1 = s/10000;
       int s2 = (s/1000)%10;
       int s3 = (s/100)%10;
       int s4 = (s/10)%10;
       int s5 = s%10;

       if(s1==s2 || s2==s3 || s3 ==s4 || s4==s5){
           System.out.println("есть");

       }else{
           System.out.println("нет");
       }












   }}