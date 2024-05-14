

public class Main {

	public static void main(String[] args) {
	
		Cliente c1 = new Cliente("Maria");
		Cliente c2 = new Cliente("Joao");
		
		Conta cc = new ContaCorrente(c1);
		cc.depositar(1000);
		Conta poupanca = new ContaPoupanca(c2);
		cc.transferir(400, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
