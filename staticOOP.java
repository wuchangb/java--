class foo{
	public static String classvar = "I class var";
	public String instancevar = "I instance var";
	
	public static void classmethod() {
		System.out.println(classvar);  //OK
//		System.out.println(foo.instancevar); //Error
	}
	public void instancemethod() {
		System.out.println(classvar);  //OK
		System.out.println(instancevar); //OK
	}
	
}

public class staticOOP {

	public static void main(String[] args) {
			System.out.println(foo.classvar);  //OK
//			System.out.println(foo.instancevar); //Error
			foo f1 = new foo();
			foo f2 = new foo();
			System.out.println(f1.classvar);
			System.out.println(f1.instancevar);
			
	}


	
}