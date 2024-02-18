/**
 * @author Alessio Manià - IN2000247
 */
public class NewClass {
	private int number;

	public NewClass(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number+22;
	}

	public void setNumber(int number) {
		this.number = number+1;
	}

	public void sayHello() {
		System.out.println("Hello: " + number + "bubu");
	}
}
