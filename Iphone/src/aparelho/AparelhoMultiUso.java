package aparelho;

import aparelho.aparelhotelefonico.TelefoneIntfc;
import aparelho.navegadorinternet.NavegadorIntfc;
import aparelho.reprodutormusical.ReproducaoIntfc;

public class AparelhoMultiUso implements NavegadorIntfc, ReproducaoIntfc, TelefoneIntfc {

	@Override
	public void ligar() {
		System.out.println("Ligando...");
	};
	
	@Override
	public void atender() {
		System.out.println("Atendendo...");
	};
	
	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz iniciado");
	};

	@Override
	public void tocar() {
		System.out.println("Tocando");
	};
	
	@Override
	public void pausar() {
		System.out.println("Pausando");
	};
	
	@Override
	public void selecionarMusica() {
		System.out.println("Musica selecionada");
	};

	@Override
	public void exibirPagina() {
		System.out.println("Exibendo pagina");
	};

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
	};
	
	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina");
	};

}
