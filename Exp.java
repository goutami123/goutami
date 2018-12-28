
class Exp
{
        public static void main(String args[]) {
		try{
		int res =10/Integer.parseInt(args[0]);
		System.out.println("result:"+res);
		}catch(Exception e) {
			System.out.println(e.toString());
          	}
		finally {
			System.out.println("final block");
          	}
		System.out.println("Bye");
	}

}
