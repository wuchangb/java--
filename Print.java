//Refactor 이용해 클래스 따로 뺌.
class Print {
	public static String delimiter = "";
	public Print(String _delimiter) {
		delimiter = _delimiter;
	}
	public static void A() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	public static void B() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}