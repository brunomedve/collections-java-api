package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    //Atributo
    private Set<Convidado> convidadoSet;

    //construtor
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    //Metodos
    public void adcionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removeCandidatoPorCodigoDeConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set Convidados");

        conjuntoConvidados.adcionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adcionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adcionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adcionarConvidado("Convidado 4", 1236);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set de convidados");

        conjuntoConvidados.removeCandidatoPorCodigoDeConvite(1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro so set convidados");

        conjuntoConvidados.exibirConvidados();

    }
}
