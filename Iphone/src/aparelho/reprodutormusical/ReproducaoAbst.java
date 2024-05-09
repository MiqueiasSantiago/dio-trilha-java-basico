package aparelho.reprodutormusical;

public abstract class ReproducaoAbst implements ReproducaoIntfc {
	
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
}
