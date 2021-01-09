import java.util.Scanner;
public class konversiSuhu {
   public static void main(String[]args){
       Scanner masukan=new Scanner(System.in);
       System.out.println("=====================");
       System.out.println("Program Konversi Suhu");
       System.out.println("=====================");
       float c=78,r,f,k;
       r=4*c/5;
       System.out.println(c+" Celcius = "+r+" Reamur");
       f=9*c/5+32;
       System.out.println(c+" Celcius = "+f+" Farenheit");
       k=c+273;
       System.out.println(c+" Celcius = "+k+" Kelvin");
   } 
}
