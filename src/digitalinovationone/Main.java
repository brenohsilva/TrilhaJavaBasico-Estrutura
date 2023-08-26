package digitalinovationone;

public class Main {
    public static void main(String[] args) {
        Iphone novoIphone = new Iphone();

        novoIphone.adicionarContatos();
        novoIphone.adicionarMusicas();

        novoIphone.ligar("Camyla");
        novoIphone.ligar("Breno");
        novoIphone.ligar("Gordo");

        novoIphone.atender("Camyla");
        novoIphone.atender("Cayo");
        novoIphone.atender("Gordo");

        novoIphone.iniciarCorreioVoz("Camyla");
        novoIphone.selecionarMusica("A vida é desafio - Racionais");
        novoIphone.selecionarMusica("Brega Funk");

        novoIphone.abrirNavegador();
        novoIphone.atualizar("www.google.com");
    }
}