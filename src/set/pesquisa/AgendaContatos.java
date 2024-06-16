package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    //atributos

    private Set<Contatos> contatoSet;

    //construtor

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    //metodos

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contatos(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contatos> pesquisarPorNome(String nome) {
        Set<Contatos> contatosPorNome = new HashSet<>();
        for(Contatos c : contatoSet) {
            if(c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contatos atualizarNumeroContato(String nome, int novoNumero) {
        Contatos conatoAtualizado = null;
        for(Contatos c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                conatoAtualizado = c;
                break;
            }
        }
        return conatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 0);
        agendaContatos.adicionarContato("Camila Cavalcante", 1111111);
        agendaContatos.adicionarContato("Camila Dio", 654321);
        agendaContatos.adicionarContato("Maria Silva", 1111111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 55555555));

    }

}
