package view;
import controller.iphoneController;

public class teste {
	public static void main(String[] args) {
		iphoneController iphoneC = new iphoneController("iPhone 14 pro MAX", "Jéssica Martins", "574295482432");
		
		//Navegador Web
		iphoneC.exibirPagina("www.Nathan.com");
		iphoneC.atualizarPagina();
		iphoneC.adcionarNovaAba();
		
		//Reprodutor Musical
		iphoneC.tocar("Starman");
		iphoneC.selecionarMusica("Rocketman");
		iphoneC.pausar();
		
		//Aparelho Telefônico
		iphoneC.ligar("43243243455");
		iphoneC.atender();
		iphoneC.iniciarCorreioVoz();
	
	}
}
