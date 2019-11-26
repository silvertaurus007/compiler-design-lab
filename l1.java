package ll1;
import java.util.Scanner;
import java.util.*; 
public class l1 {
	 public static void main(String[] args)
	 {
		 
		 Scanner in = new Scanner(System.in);
		 String s = in.nextLine();//input s
		 StringTokenizer st=new StringTokenizer(s);//string tokenizing
		 while (st.hasMoreTokens())	// syntax check
		 {
			 String s1=st.nextToken();
			
			 if(s1.equals("var")||s1.equals("main"))
				 System.out.println(s1+" Keywords");
			 else if(s1.equals("input"))
			 System.out.println(s1+" input function");
			 else if(s1.equals("output"))
			 System.out.println(s1+" output function");
			 else if(s1.equals("("))
			 System.out.println(s1+" Left paranthesis");
			 else if(s1.equals(")"))
				 System.out.println(s1+" Right paranthesis");
			 else if(s1.equals("}"))
				 System.out.println(s1+" Right curly braces");
			 else if(s1.equals("{"))
				 System.out.println(s1+" Left curly braces");
			 else if(s1.equals("="))
				 System.out.println(s1+" Assignment operator");
			 else if(s1.equals("&&")||s1.equals("||")||s1.equals("==")||s1.equals("!"))
				 System.out.println(s1+" Logical operstors");
			 else if(s1.equals("+")||s1.equals("-")||s1.equals("*")||s1.equals("/"))
				 System.out.println(s1+" Arithmetic operators");
			 else if(s1.equals("integer")||s1.equals("char")||s1.equals("string")||s1.equals("float"))
				 System.out.println(s1+" datatypes");
			 else
			 {
				int fl=0;
				for(int i=0;i<s1.length();i++){
					int t=s1.charAt(i);
					if(i==0) {
						if( (t>=65&&t<=90)||(t>=97&&t<=122))
						{	
							 fl=0;
							
						}
						else
							{fl=1;break;}
					}
					else
					{
						if((t>=65&&t<=90)||(t>=97&&t<=122)||(t>=48&&t<=57))
							fl=0;
						else
						{
							fl=1;break;
						}
							
					}
				}
				if(fl==0)
					 System.out.println(s1+" identefiers");
					
				
			 }
			 
				 
			 
			 
			 //Identifiers
			 
			 
				 
		 }
		 
	 }

}
