
public class Duck {
	
	public boolean canfly = false;
	
	public Duck(boolean canfly) { //public：在這個class之外也能被使用；private只能在自己的class被使用
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
	
	public void swim(int distance) { //吃進的參數是從呼叫他的function中複製一份過來
		distance = distance - 1;
		System.out.println("The distance of my swimming is "+ distance);
	}
	
}

