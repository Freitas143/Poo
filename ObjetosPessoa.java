package names;

public class ObjetosPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoaMessi = new Pessoa ();
		Pessoa pessoaTom = new Pessoa ();
		
		// Messi
		
		pessoaMessi.setNome("Messi");
		pessoaMessi.setIdade(35);
		pessoaMessi.setEndereco("Miami, USA");
		pessoaMessi.setProfissao("Jogador de Futebol");
		pessoaMessi.setCpf(87423486481l);
		pessoaMessi.setRg(782154064595863791l);
		
		//Tom cruise
		
		pessoaTom.setNome("Tom Cruise");
		pessoaTom.setIdade(60);
		pessoaTom.setEndereco("California, USA");
		pessoaTom.setProfissao("Ator");
		pessoaTom.setCpf(87423486481l);
		pessoaMessi.setRg(782154064595863791l);
		
		//Saida
		System.out.println("------------- Object 1 -------------");
		System.out.println(pessoaMessi.getName());
		System.out.println(pessoaMessi.getIdade());
		System.out.println(pessoaMessi.getEndereco());
		System.out.println(pessoaMessi.getProfissao());
		System.out.println(pessoaMessi.getCpf());
		System.out.println(pessoaMessi.getRg());
		
		System.out.println("------------- Object 2 -------------");
		System.out.println(pessoaTom.getName());
		System.out.println(pessoaTom.getIdade());
		System.out.println(pessoaTom.getEndereco());
		System.out.println(pessoaTom.getProfissao());
		System.out.println(pessoaTom.getCpf());
		System.out.println(pessoaTom.getRg());
		

	}

}
