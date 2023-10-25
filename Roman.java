import java.io.*;
import java.util.*;
class Roman 
{
	public int romanToInteger(String str)
	{
		int d=0,temp=0,sum=0;
		for(int i=str.length()-1;i>=0;i--)
		{
			switch(str.charAt(i))
			{  
				case 'i':
				case 'I':  d=1;
				          break;
                case 'v':
				case 'V':  d=5;
				          break;
				case 'x':		  
		       case 'X':  d=10;
				 
							break;
               case 'l':
		        case 'L' : d=50;
				          break;
                case 'c':
			    case 'C':  d=100;
				          break;
                 case 'd':
			    case 'D':  d=500;
				          break;
			} 
			if(d<temp)
			{
				sum=sum-d;
				temp=d;
			}
			else
			{
			 sum=sum+d;
			temp=d;
			}
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roman Number:");
		String str=sc.nextLine();
		Roman obj=new Roman();
		int result=obj.romanToInteger(str);
		System.out.println("Integer Number: "+result);
	}
}
