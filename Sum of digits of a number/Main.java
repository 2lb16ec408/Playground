import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
 int a=0,x=0;
     while(n!=0)
     {
      a=n%10;
       x=x+a;
       
       n=n/10;
       
       
     }
              System.out.println(x);
      }
     
	
}