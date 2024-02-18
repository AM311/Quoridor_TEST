/**
 * @author Alessio Manià - IN2000247
 */
public class NewClass {
	private int number;

	public NewClass(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void sayHello() {
		System.out.println("Hello: " + number + ". Bye bye");
	}
}
