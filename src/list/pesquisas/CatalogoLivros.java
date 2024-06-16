package list.pesquisas;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    // Atributos

    private List<Livro> livroList;

    // construtor

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    //Metodos

    public void adicionarLivros(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisaPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisaPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivros("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivros("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivros("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivros("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivros("Livro 4", "Autor 4", 2024);

        System.out.println(catalogoLivros.pesquisaPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisaIntervaloAnos(2020, 2022));
        System.out.println(catalogoLivros.pesquisaPorTitulo("Livro 1"));
    }
}
