
public class Duck {
	
	public boolean canfly = false;
	
	public Duck(boolean canfly) { //public�G�b�o��class���~�]��Q�ϥΡFprivate�u��b�ۤv��class�Q�ϥ�
		this.canfly = canfly;
	}
	
	public boolean getCanfly() {
		return canfly;
	}
	
	public void quack() {
		System.out.println("Quack!!");
	}
	
	public void quack(String sound) {
		System.out.println(sound);
	}
	
	public String eat(String food) {
		String message = "Thank you! The " + food +" is good!";
		return message;
		
	}
	
	public void swim(int distance) { //�Y�i���ѼƬO�q�I�s�L��function���ƻs�@���L��
		distance = distance - 1;
		System.out.println("The distance of my swimming is "+ distance);
	}
	
}

