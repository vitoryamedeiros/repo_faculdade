package view;

import model.Livro;
import model.ObjetoLeitura;
import model.Revista;

public class Biblioteca {
    public static void main(String[] args) {
        Livro livro = new Livro();
        ObjetoLeitura revista = new Revista();

        livro.setUUID(3531523);
        livro.setNome("Java como amar");
        livro.setAnoPublicacao(2006);

        revista.setUUID(645657);
        revista.setNome("Java Magazine");
        revista.setAnoPublicacao(2020);
        ((Revista) revista).setTipoArtigo("resenha");
    }
}
