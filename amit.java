package epampack;
import java.io.*;
public class amit_asgt_calculator {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		int i=0,p=0,v1=0,v2=0;
		double d1=0,d2=0,r=0.0;
		char c;
		while(i!=-139)
		{   
			if(p==0)
				{ 	System.out.println("Enter the very First Number  ");
				v1=Integer.parseInt(in.readLine());	
			 	    System.out.println("Enter the very Second Number  ");
				v2=Integer.parseInt(in.readLine());
				p++;
				d1=(double)v1;
				}
			else
			{
				System.out.print("Enter Your Next Number or else to exit enter (-139) ");
				v2=Integer.parseInt(in.readLine());
			}
			i=v2;
			if(i==-139)
			break;
			d2=(double)v2;
			System.out.println("Enter Your choice|| Press a for addition|| Press s for subtraction|| Press m for multiplication|| Press d for division");
		    c=(char)in.read();
			switch(c)
			{
			case 'a':
				r=add(d1,d2);
				break;
			case 's':
				r=sub(d1,d2);
				break;
			case 'm':
				r=mul(d1,d2);
				break;
			case 'd':
				r=div(d1,d2);
			default:
				System.out.println("Wrong option");
			}
			System.out.println("The result of the last calculation is  "+r);
			
			d1=r;
		
		}
		
	}
	static double add(double a,double b)
	{
		return(a+b);
	}
	static double sub(double a,double b)
	{
		return(a-b);
	}
	static double mul(double a,double b)
	{
		return(a*b);
	}
	static double div(double a,double b)
	{
		return(a/b);
	}
}

