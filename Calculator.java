import java.util.Scanner;

public class Calculator{
    
  static int add(int a,int b){
    return a+b;
  }
  
  public static int sub(int a,int b){
    return a-b;
  }
  
   public static int mul(int a,int b){
     return a*b;
   }
   
   public static int div(int a,int b){
     return a/b;
   }
   
  public static void main(String []args){
      
      Scanner sc = new Scanner(System.in);
      
      int a,b;
      System.out.println("Enter two  numbers");
      a=sc.nextInt();
      b=sc.nextInt();
      
      System.out.println("Addition="+add(a,b));
      System.out.println("Subtraction="+sub(a,b));
      System.out.println("Multiplication="+mul(a,b));
      System.out.println("Divison="+div(a,b));                       
  }
}
