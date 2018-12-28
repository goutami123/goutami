class Emp
{
int id;
string name;
float salary;
void design()
{
System.out.println("Design part done");
}
 void development()
{
Scanner obj=new Scanner(System.in);
}
void test()
{
System.out.println("testing part done");
}
}

class EmpFirst{
public static void main(String args[])
{
System.out.println("Main Method");
Emp sam=new Emp();
sam.design();
sam.test();
}

}