class Cal
{
float x;
float y;
float z;
void area(float r)
{
float s=(float)3.1*r*r;
System.out.println("area is"+s);
}
void area(float l,float b)
{
float a=l*b;
System.out.println("area is"+a);
}
void area(float a, float b,float c)
{
float l=(a+b+c)/2;
float t=(l*a)+(l*b)+(l*c);
System.out.println("area is"+t);
}
}
class CalTest
{
public static void main(String args[])
{
Cal c1=new Cal();
c1.x=4;
c1.y=5;
c1.z=6;
c1.area(c1.x);
c1.area(c1.x, c1.y);
c1.area(c1.x, c1.y, c1.z);
}
}