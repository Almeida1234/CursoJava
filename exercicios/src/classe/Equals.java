package classe;

public class Equals {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "Pedro.silva@ezemail.com.br";
		
		Usuario u2 = new Usuario("Pedro Silva");
		u2.email = "Pedro.silva@ezemail.com.br";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u1.hashCode() == u2.hashCode());
		//System.out.println(u2.equals(new Date()));
		
	}
}
