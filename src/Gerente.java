
public class Gerente extends Funcionario implements Autenticavel {
	
	private Autenticador autenticador;
	
	public Gerente() {
		this.autenticador = new Autenticador();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifica��o do Gerente");
		return super.getSalario();
	}


	

}
