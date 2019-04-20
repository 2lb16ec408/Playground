import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner (System.in);
      int n=in.nextInt();
       int a=n/100,b=n%100;
      int d=b/10,c=n%10;
      int sum=(c*100)+(d*10)+a;
      System.out.println(sum);
	}
}