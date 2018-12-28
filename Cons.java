class A {
	 A()
		{
			this(100);
			System.out.println("A()");
		}
   	 A(int x) {
			System.out.println("A(int)");
		}
}
class B extends A {
    			B() {
				this(10);
				System.out.println("B class construcvtor");
				}
			B(int x) {
			System.out.println("B(int)");
			}
}
class Cons {
		public static void main(String args[]) {
                 B obj1=new B();
		}
}