package ll1;
import java.util.Scanner;
import java.util.*; 


public class l1 {
public static void chk1(String s1)
{
System.out.println(s1+" Keywords");
}
public static void chk2(String s1)
{
System.out.println(s1+" input function");	}
public static void chk3(String s1)
{
System.out.println(s1+" output function");
}
public static void chk4(String s1)
{
System.out.println(s1+" Left paranthesis");
}
public static void chk5(String s1)
{
System.out.println(s1+" Right paranthesis");
}
public static void chk6(String s1)
{
System.out.println(s1+" Right curly braces");
}
public static void chk7(String s1)
{
System.out.println(s1+" Left curly braces");
}
public static void chk8(String s1)
{
System.out.println(s1+" Assignment operator");
}
public static void chk9(String s1)
{
System.out.println(s1+" Logical operstors");
}
public static void chk10(String s1)
{
System.out.println(s1+" Arithmetic operators");
}
public static void chk11(String s1)
{
System.out.println(s1+" datatypes");
}
public static void chk12(String s1)
{
System.out.println(s1+" identefiers");
}
public static void main(String[] args)
{

Scanner in = new Scanner(System.in);
String s = in.nextLine();//input s
StringTokenizer st=new StringTokenizer(s);//string tokenizing
while (st.hasMoreTokens())	// syntax check
{
String s1=st.nextToken();

if(s1.equals("var")||s1.equals("main"))
chk1(s1);
else if(s1.equals("input"))
chk2( s1)	;		
else if(s1.equals("output"))
chk3( s1)	;
else if(s1.equals("("))
chk4(s1)		;
else if(s1.equals(")"))
chk5( s1)	;
else if(s1.equals("}"))
chk6( s1)	;		
else if(s1.equals("{"))
chk7( s1)	;
else if(s1.equals("="))
chk8( s1);
else if(s1.equals("&&")||s1.equals("||")||s1.equals("==")||s1.equals("!"))
chk9(s1);
else if(s1.equals("+")||s1.equals("-")||s1.equals("*")||s1.equals("/"))
chk10( s1)	;
else if(s1.equals("integer")||s1.equals("char")||s1.equals("string")||s1.equals("float"))
chk11(s1);
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
chk12( s1);					

}			 
}

}

}
