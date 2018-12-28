class A {
		int a=10;
}
class B extends A {
                  
		B() {
			 a=30;
       				}
		  void dis() {
			    a=30;
			    System.out.println("a:"+a);
		            System.out.println("a:"+this.a);
			    System.out.println("a:"+super.a);
			}
}
class That {
	    public static void main(String args[]) {
	     B obj=new B();
             obj.dis();
             }
}