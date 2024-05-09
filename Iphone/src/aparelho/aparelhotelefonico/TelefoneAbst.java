package aparelho.aparelhotelefonico;

public abstract class TelefoneAbst implements TelefoneIntfc{

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
}
