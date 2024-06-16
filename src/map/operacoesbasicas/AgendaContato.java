package map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {

    // atributo
    private Map<String, Integer> agendaContatoMap;

    // construtor
    public AgendaContato() {
        this.agendaContatoMap = new HashMap<>();
    }

    // Metodos
    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removeContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibiContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.adicionarContato("Camila", 123456);
        agendaContato.adicionarContato("Camila", 5665);
        agendaContato.adicionarContato("Camila Cavalcante", 111111);
        agendaContato.adicionarContato("Camila Dio", 6543210);
        agendaContato.adicionarContato("Maria Silva", 111111);
        agendaContato.adicionarContato("Camila", 44444);

        agendaContato.exibiContato();

        agendaContato.removeContato("Maria Silva");
        agendaContato.exibiContato();

    }
}
