package map.ordenacao;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {

    // Atributo
    private Map<LocalDate, Evento> eventosMap;

    // Construtor
    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        /*Set<LocalDate> dateSet = eventosMap.keySet();
        Collection<Evento> values = eventosMap.values();*/

        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
         if (entry.getKey().isEqual(dataAtual) || entry.getKey().isEqual(dataAtual)) {
            System.out.println("O próximo evento: " + entry.getValue() + "acontecerá na data" + entry.getKey());
            break;
         }   
        } 
        
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
    }

}
