package pessoa;

public class SistemaCadaastro {
	
	public static void main(String[] args) {
		
		Pessoa marcos = new Pessoa("123", "Lucas");
		Pessoa renan = new Pessoa();
		
		marcos.setEndereco("Rua das marias");
		
		
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
	}
	
	

}
