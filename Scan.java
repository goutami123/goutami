
import java.util.Scanner;
class Scan
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);

System.out.println("enter the id");
int n=obj.nextInt();
System.out.println("enter the name");
String name=obj.nextline();
System.out.println("enter the salary");
float s=obj.nextFloat();
System.out.println("value id"+n);
System.out.println(name);
System.out.println("salary is"+s);

}
}