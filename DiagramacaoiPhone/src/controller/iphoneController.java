package controller;
import model.iphone;

public class iphoneController {
	iphone aparelho;

	public iphoneController(String modelo, String proprietario, String numero) {
		
		this.aparelho = new iphone(modelo, proprietario, numero);
	}
	
	
	public void exibirPagina(String urlPagina) {
		aparelho.exibirPagina(urlPagina);
		
	}

	
	public void adcionarNovaAba() {
		aparelho.adcionarNovaAba();
		
		
	}

	
	public void atualizarPagina() {
		aparelho.atualizarPagina();		
	}

	
	public void ligar(String numeroTelefone) {
		
		aparelho.ligar(numeroTelefone);
		
	}

	
	public void atender() {
		aparelho.atender();
		
	}

	
	public void iniciarCorreioVoz() {
		aparelho.iniciarCorreioVoz();
		
	}

	
	public void tocar(String nomeMusica) {
		aparelho.tocar(nomeMusica);
		
	}

	
	public void pausar() {
		aparelho.pausar();
		
	}

	
	public void selecionarMusica(String nomeMusica) {
		aparelho.selecionarMusica(nomeMusica);
		
	}
	
	
}
