package comm1;
import java.util.Scanner;
public class C {
		public static void main(String[] args) {
			//Scanner s = new Scanner (System.in);
			//System.out.println("enter no");
			//int a;
//			 a=s.nextInt();
//			//int a=10;
//			while(a>=1)
//			{
//			System.out.println(a);
//			a--;
//			}
			
//			for(int i=2;i<=20;i=i+2)
//			{
//			System.out.println(i);
//			}
//			================================================================================================================
					
			
			
			//Q.print no series 10,30,50,...190
			
//			for(int i=10;i<=200;i=i+20)
//			{
//			System.out.println(i);
//			}
//			
			//Q.print no series 5,10,15...50
			
//			for(int i=5;i<=50;i=i+5)
//			{
//			System.out.println(i);
//			}
			
//			================================================================================================================
					
			
			//Q.print no series 50,48,46,...0
			
//			for(int i=50;i>=0;i=i-2)
//			{
//			System.out.println(i);
//			}
			
//			================================================================================================================
					
//			for(int i=100;i!=0;i--)
//			{
//				System.out.println(i);
//			}
			
//			================================================================================================================
					
//			Scanner s = new Scanner (System.in);
//			System.out.println("enter no a & b");
//			int a,b;
//			a=s.nextInt();
//			b=s.nextInt();
//			if(a==b)
//			{
//				int c=a+b;
//			System.out.println("Addition is :" +c);
//			}
//			else
//			{
//				int c=a-b;
//			System.out.println("Subtration is :" +c);
//			}
			
//			================================================================================================================
					
//			Scanner s = new Scanner (System.in);
//			System.out.println("enter no");
//			int a,sum=0,d;
//			a=s.nextInt();
//			 while(a!=0)
//			 {
//				 d=a%10;
//				sum=sum+d;
//				a=a/10;
//			 }
//				System.out.println(sum);
//			 
//			================================================================================================================
					
			// count the no in given no
			
//			Scanner s = new Scanner (System.in);
//			System.out.println("enter no");
//			int a=s.nextInt();
//			int count =0;
//			while(a>0)
//			{
//				count= count+1;
//				a=a/10;
//			}
//			System.out.println(count);
		
//			================================================================================================================
//			Reverse the given no
			
			
//			Scanner s = new Scanner (System.in);
//			System.out.println("enter no");
//			int a=s.nextInt();
//			int rev=0;
//			while(a!=0)
//			{
//				int digit = a%10;
//				rev = rev*10+digit;
//				a/=10;
//			}
//			System.out.println(rev);
			
//			================================================================================================================
			
			//  WAP whether the enter no is Neon  no or Not
			
//			Scanner s = new Scanner (System.in);
//			System.out.println("enter no");
//			int a=s.nextInt();
//			int square=a*a;
//			int sum=0;
//			 //while(square!=0) 
//			for(sum=0;square!=0;square/=10)
//			 {
//				int d=square%10;
//				sum=sum+d;
//				//square=square/10;
//		     }
//			 if(sum==a)
//			 {
//				 System.out.println("The enter no is Neon no");
//			 }
//			 else
//			 {
//				 System.out.println("The enter no is not Neon no");
//			 }
//			====================================================================================================================		
//			WAP of given no is perfect or not
			
			Scanner s = new Scanner (System.in);
			System.out.println("enter no");
			int n=s.nextInt();
			int sum=0;
			for(int i=1;i<n;i++)
			 {
				if(n%i==0)
			sum=sum+i;
				
		     }
			 if(sum==n)
			 {
				 System.out.println("The enter no is Perfect no");
			 }
			 else
			 {
				 System.out.println("The enter no is not Perfect no");
			 }
			

}

}
