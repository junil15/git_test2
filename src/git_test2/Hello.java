package git_test2;

public class Hello {

	String message;
	
	public void say() {

		String message = "안녕하세요";

		System.out.println(message);
	}

	public Hello() { this("안녕하세요"); }

	public Hello(String message) { this.message = message; }
}