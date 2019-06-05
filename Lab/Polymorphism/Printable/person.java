
public class person implements Printable {
	private String name = new String("Bill");
	private int age = 22;
	public void printAll() {
	System.out.println("Name is "+ name + ", age is " + age);
	}
	public void printLast() {
	System.out.println("Last Name is "+ name + ", age is " + age);
	}
}

