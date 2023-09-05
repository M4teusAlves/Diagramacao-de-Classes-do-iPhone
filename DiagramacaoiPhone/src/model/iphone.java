package model;


public class iphone implements reprodutorMusical, aparelhoTelefonico, navegadorWeb{
	String modelo;
	String proprietario;
	String numeroTelefone;
	
	//Constructor
	public iphone(String modelo, String proprietario, String numeroTelefone) {
		this.modelo = modelo;
		this.proprietario = proprietario;
		this.numeroTelefone = numeroTelefone;
	}
	
	//Getters and Setters
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	//To String
	@Override
	public String toString() {
		return "iphone [modelo=" + modelo + ", proprietario=" + proprietario + ", numeroTelefone=" + numeroTelefone
				+ "]";
	}

	@Override
	public void exibirPagina(String urlPagina) {
		System.out.println("Acessando... "+urlPagina+"\n");
		
	}

	@Override
	public void adcionarNovaAba() {
		System.out.println("Nova Aba Adcionada\n");
		
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página... \n\n Página Atualizada.\n");		
	}

	@Override
	public void ligar(String numeroTelefone) {
		
		System.out.println("Ligando para "+numeroTelefone+"\nChamando...\n\nEncaminhado para caixa de mensagens \n");
		
	}

	@Override
	public void atender() {
		System.out.println("Ligação atendida!!!\n");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Correio de Voz\n\n3 mensagens Amanda\n2 mensagens Pedro\n1 mensagem Maria\n");
		
	}

	@Override
	public void tocar(String nomeMusica) {
		System.out.println("Reproduzindo "+nomeMusica+"\n");
		
	}

	@Override
	public void pausar() {
		System.out.println("Música Pausada \n");
		
	}

	@Override
	public void selecionarMusica(String nomeMusica) {
		System.out.println("Selecionando...");
		this.tocar(nomeMusica);
		
	}
	
	
	
	
}
