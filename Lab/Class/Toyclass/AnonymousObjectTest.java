
public class AnonymousObjectTest {
	
	public static void main(String[] args) {
		AnonymousObjectTest obj = new AnonymousObjectTest();
		obj.showMessage(new String("I am an anonymous object"));
		
	}
	
	public void showMessage(String message) {
		System.out.println(message);
	}
}
