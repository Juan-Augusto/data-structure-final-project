import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AgendaDeContatos {

    private Map<String, Contato> contatos;

    public AgendaDeContatos() {
        contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, String telefone, String nascimento, String email, String celular) {
        Contato contato = new Contato(nome, telefone, nascimento, email, celular);
        contatos.put(nome.toLowerCase(), contato);
        System.out.println("Contato adicionado com sucesso.");
    }

    public void excluirContato(String nome) {
        if (contatos.containsKey(nome.toLowerCase())) {
            contatos.remove(nome.toLowerCase());
            System.out.println("Contato removido com sucesso.");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public void pesquisarContato(String nome) {
        if (contatos.containsKey(nome.toLowerCase())) {
            Contato contato = contatos.get(nome.toLowerCase());
            System.out.println(contato);
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public void exibirListaDeContatos() {
        for (Contato contato : contatos.values()) {
            System.out.println(contato);
        }
    }

    public static void main(String[] args) {
        AgendaDeContatos agenda = new AgendaDeContatos();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adicionar contato");
            System.out.println("2. Excluir contato");
            System.out.println("3. Pesquisar contato");
            System.out.println("4. Exibir lista de contatos");
            System.out.println("5. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Data de nascimento: ");
                    String nascimento = scanner.nextLine();
                    System.out.print("E-mail: ");
                    String email = scanner.nextLine();
                    System.out.print("Celular: ");
                    String celular = scanner.nextLine();
                    agenda.adicionarContato(nome, telefone, nascimento, email, celular);
                    break;
                case 2:
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();
                    agenda.excluirContato(nome);
                    break;
                case 3:
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();
                    agenda.pesquisarContato(nome);
                    break;
                case 4:
                    agenda.exibirListaDeContatos();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
            System.out.println();
        }
    }

}

class Contato {

    private String nome;
    private String telefone;
    private String nascimento;
    private String email;
    private String celular;

    public Contato(String nome, String telefone, String nascimento, String email, String celular) {
        this.nome = nome;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.email = email;
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Telefone: " + telefone + "\n" +
                "Data de nascimento: " + nascimento + "\n" +
                "Email: " + email + "\n" +
                "Celular: " + celular;
    }
}