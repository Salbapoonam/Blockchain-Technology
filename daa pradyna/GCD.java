package DAA;
import java.util.*;
public class GCD
 {    
    public GCD() {   }
    public int gcd(int n1, int n2)
    {
    	if(n2==0)
    	{
    		return(n1);
    	}
    	else if(n1==0)
    	{
    			return(n2);
    	}
    	else{
    	while(n2>0)
    		{
    		if (n1<n2)
    		{
    			int temp;                       //swapping
    			temp=n1;
    			n1=n2;
    			n2=temp;
    		}
    		int t1;
    		t1=n1;
    		n1=n2;
    		n2=t1%n2;	
    	}
    	return(n1);
    	}    	
    }

    public static void main(String[] args)throws Exception  
    {
        // TODO code application logic here
    	System.out.println("Name: Pradnya Sharad Kulkarni......................Roll Number: 20123071");
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number:");
        a= sc.nextInt();
        System.out.println("Enter Second Number:");
        b=sc.nextInt();
        GCD o1=new GCD();
        c=o1.gcd(a,b);
        System.out.println("GCD of given two numbers is:"+c); 

        
    }
     }
