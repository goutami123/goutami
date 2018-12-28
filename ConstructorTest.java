class Constructor
{
Constructor()
{
System.out.println("object created");
}
void display()
{
System.out.println("display method");
}
}
class ConstructorTest
{
public static void main(String args[])
{
Constructor con=new Constructor();
con.display();
}
}