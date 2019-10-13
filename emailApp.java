package EmailApp;

public class emailApp {

	public static void main(String[] args) {
		Email em1 = new Email("Nena", "Mehta");
		Email em2 = new Email("Samip", "Mehta");
		
		
		em1.setAlternateEmail("Nena@gmail.com");
		System.out.println("ALTERNATIVE EMAIL: " + em1.getAlternateEmail());
	}
}
