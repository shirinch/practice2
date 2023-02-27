import java.util.Scanner;

import static java.awt.SystemColor.text;


public class Methods {

    public static void main(String[] args) {
  thv();

    }

    public static void java(){
        System.out.println("Java is the best");
    }

    public static void python(){
        System.out.println("Python is the best");
    }


    public static int one(){
        int two = 100;
        int three = 21;
        int sum = two + three ;
        return sum;
    }

//    public static void method(){
//        int[]number={10,90,21,23,789,319};
//
//        for(int w = 0; w<number.length; w++) {
//            System.out.println(number[w]);
//        }
//        System.out.println("what is your name?");
//        Scanner scann = new Scanner(System.in);
//        name = scann.nextLine();
//        System.out.println("hello "+name);
//        System.out.println("Сколько тебе лет?");
//        age = scann.nextInt();
//
//    }

    public static int number(int a){
   if(a%2==0){
       System.out.println("число четное");
   }else{
       System.out.println("число нечетное");
   }
       return a;
    }

   public static void arif(){
       System.out.println("Введите три числа");
       Scanner num = new Scanner(System.in);
       int e = num.nextInt();
       int y = num.nextInt();
       int u = num.nextInt();
       double result=(double)(e+y+u)%3;
       System.out.println(result);

   }

   public static void nums(){
       System.out.println("введите число");
       Scanner first = new Scanner(System.in);
       int w = first.nextInt();
       int result = 0;
       for(int c =1; c<=w; c++){
           result+=c;
        if(c!=w){
           System.out.print( c+"+");
        }else{
            System.out.print(c);
        }
       }
           System.out.print("="+ result);
   }

   public static void massive( int[] m ){
       if (m[0]<m[1]) {
           System.out.println("наименьшее число "+ m[0]);
           }
           else if (m[1]<m[2]){
           System.out.println("наименьшее число "+ m[1]);
       if(m[2]<m[3]){
           System.out.println("наименьшее число "+ m[2]);}
           else if (m[3] < m[0]){
               System.out.println("наименьшее число "+ m[3]);
           }


       }

   }


   public static void f() {

       String[] text = {"солнце", "облако", "луна", "ветер"};
       for (String text2 : text) {
           System.out.println(text2);
       }
   }

public static void weather(){
        String[] you ={"Нуржан","Ширин","назгуль","Жазгуль"};
        for(String me : you){
            System.out.println(me+" какая погода тебе нравится?");
        }
}
public static void name(String a ){
    System.out.println(a);

}

//public static void nums(double y ){
//    double l;
//           l = Math.pow(y, );
//    for( double l: )
//    System.out.println(l);
//}

public static String methodReturn(String...f){
//   String[]n = {a,s,o,g};
   for(String i: f){
       System.out.println(i);
}
        return null;}

public static void varMethod(int...vars){
        for(int y  : vars){
    System.out.println(y);
        }
    }

public static void first(int...numbers){
        int result = 0;
      for(int once=0; once<numbers.length;once++){
          result += numbers[once];
      }
          System.out.print(result);
}

public static void second(int...numbers){
    System.out.println("количество аргументов: "+numbers.length);
    for(int m : numbers ){
        System.out.print( m + " ");
    }

}
public static void stars(){
    Scanner st = new Scanner(System.in);
    int star = st.nextInt();
    String one = "*";
    char two = ' ';
   for(int o = 0; o<star; o++ ){
   for(int e = 0; e<star-o; e++){
       System.out.print(two);
   }
   for(int y = 0; y<=o;y++ ){
       System.out.print(one);
   }
       System.out.println();
   }

}


public static void numbers(){
    System.out.println("введите число");
    Scanner none = new Scanner(System.in);
    int mine = none.nextInt();


    for(int t = 0;t<=mine;t++){
        if(t%2==0){
        System.out.print(t+" ");}
    }
}
public static void thv(){
    System.out.println("введите три любых  числа");
    Scanner scan = new Scanner(System.in);
    int one = scan.nextInt();
    int two = scan.nextInt();
    int three = scan.nextInt();
    if(one<two){
        System.out.println(one);
    }
    if(two<three){
        System.out.println(two);
    }
    if(three<two){
    System.out.println(three);
}
}






}









