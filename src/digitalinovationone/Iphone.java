package digitalinovationone;

import digitalinovationone.interfaces.Navegador;
import digitalinovationone.interfaces.ReprodutorMusical;
import digitalinovationone.interfaces.Telefone;

import java.util.*;

public class Iphone implements ReprodutorMusical, Telefone, Navegador {

    private Map<String, Integer> contatos;
    private List<String> musicas;

    public Iphone(){
        this.contatos = new HashMap<>();
        this.musicas = new ArrayList<>();
    }

    public void adicionarContatos() {
        contatos.put("Camyla", 1243);
        contatos.put("Bruno", 4583);
        contatos.put("Gabriel", 5498);
        contatos.put("Breno", 3487);
        contatos.put("Cayo", 4512);

    }

    public void adicionarMusicas(){
        musicas.add("A vida é desafio - Racionais");
        musicas.add("Vozes na Sala de Estar - Projota");
        musicas.add("Amigo - Latino");
        musicas.add("Eu Precisava voltar com A Folhinha - CesarMC");
        musicas.add("Gratidão - Raschid");
    }

    @Override
    public void ligar(String contato) {
        if (contatos.containsKey(contato)){
            Integer numero = contatos.get(contato);
            System.out.println("Ligando para " + contato + ": " + numero);
        } else System.out.println("Contato não encontrado!");

    }
    @Override
    public void atender(String contato) {
        if (contatos.containsKey(contato)){
            System.out.println("Atendendo ligação!");
        } else System.out.println("Ligação recusada");
    }

    @Override
    public void iniciarCorreioVoz(String contato) {
        if (contatos.containsKey(contato)){
            System.out.println("Iniciando correio de voz para " + contato);
        } else System.out.println("Contato não encontrado!");
    }
    @Override
    public void selecionarMusica(String musica) {
        if(musicas.contains(musica)){
            System.out.println("Musica Selecionada, Voce deseja toca-la? (sim ou não) ");
            Scanner scanner = new Scanner(System.in);
            String entrada = scanner.nextLine();
            if (Objects.equals(entrada, "sim")){
                tocar(musica);
            } else pausar(musica);
        } else System.out.println("Musica não encontrada!");

    }
    @Override
    public void tocar(String musica) {
        System.out.println("Tocando musica " + musica);
    }

    @Override
    public void pausar(String musica) {
        System.out.println(musica + " Pausada");

    }

    public void abrirNavegador(){
        System.out.println("Abrindo o navegador...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o site:");
        String entrada = scanner.nextLine();
        exibirPagina(entrada);
    }
    @Override
    public void exibirPagina(String site) {
        System.out.println("Abrindo o site: " + site);

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba em branco");

    }

    @Override
    public void atualizar(String site) {
        System.out.println("Atualizando a pagina " + site);

    }
}
