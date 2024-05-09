package aparelho.navegadorinternet;

public abstract class NavegadorAbst implements NavegadorIntfc {
	
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
