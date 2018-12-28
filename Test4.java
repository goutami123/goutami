interface A {
	int add(int x, int y);
}
interface B {
	int sub(int x, int y);
}

class Cal implements  A,B {
	public int add(int x, int y){
		return x+y;
	}
	public int sub(int x, int y){
		return x-y;
	}
	public void ownMethod() {
		System.out.println("Cal class own method");
	}
}
class Test4 {
	public static void main(String args[]) {
	Cal obj1 = new Cal();	obj1.add(10,20);	obj1.sub(20,30);
	A obj2 = new Cal();
	B obj3 = new Cal();
	System.out.println(obj2.add(20,10));
	//System.out.println(obj2.sub(20,10));
	System.out.println(obj3.sub(20,10));
	System.out.println(obj1.sub(20,10));
	}
}