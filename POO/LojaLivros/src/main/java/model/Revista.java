package model;

public class Revista extends ObjetoLeitura{
    private String tipoArtigo;

    public String getTipoArtigo() {
        return tipoArtigo;
    }

    public void setTipoArtigo(String tipoArtigo) {
        this.tipoArtigo = tipoArtigo;
    }

    public void gerarArtigo(){
        if (tipoArtigo.equalsIgnoreCase("tutorial")){
            System.out.printf("Escreva nesta sessão um tutorial");
        }
        else if (tipoArtigo.equalsIgnoreCase("resenha")){
            System.out.printf("Escreva aqui uma resenha");
        }
        else if (tipoArtigo.equalsIgnoreCase("informativo")){
            System.out.printf("Escreva aqui um artigo informativo");
        }
        else{
            System.out.printf("Escreva aqui um artigo de assunto livro");
        }
    }
}

