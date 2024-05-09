package aparelho;


public class Main {

  public static void main(String[] args) {
    AparelhoMultiUso aparelho = new AparelhoMultiUso();

    System.out.println("------------->");
    aparelho.selecionarMusica();
    aparelho.tocar();
    aparelho.pausar();

    System.out.println("------------->");
    aparelho.atender();
    aparelho.iniciarCorreioVoz();
    aparelho.ligar();

    System.out.println("------------->");
    aparelho.exibirPagina();
    aparelho.atualizarPagina();
    aparelho.adicionarNovaAba();

    System.out.println("------------->");
  }

}