/**************************************
 * Nome: GRAZIELLE VITORYA - Lista de Produtos (Smartwatch)             
*************************************/

#include <stdio.h>
#include <string.h>

#define MAX 100

// Estrutura Produto
struct Produto {
    char lote[8];
    char modelo[30];
    int tamanho[2];
    char data_de_fabricacao[10];
    float peso;
    char marca[20];
};

// Estrutura Lista de Produtos
struct ListaProdutos {
    struct Produto produtos[MAX];
    int quantidade;
};

// Função para inicializar a lista de produtos
void inicializarLista(struct ListaProdutos *lista) {
    lista->quantidade = 0;
}

// Função para inserir um produto na lista
void inserirProduto(struct ListaProdutos *lista, struct Produto p) {
    if (lista->quantidade < MAX) {
        lista->produtos[lista->quantidade] = p;
        lista->quantidade++;
        printf("Produto inserido com sucesso!\n");
    } else {
        printf("Lista cheia!\n");
    }
}

// Função para exibir os produtos na lista
void exibirProdutos(struct ListaProdutos lista) {
    if (lista.quantidade == 0) {
        printf("Nenhum produto na lista.\n");
    } else {
        for (int i = 0; i < lista.quantidade; i++) {
            struct Produto p = lista.produtos[i];
            printf("Produto %d:\n", i + 1);
            printf("  Lote: %s\n", p.lote);
            printf("  Modelo: %s\n", p.modelo);
            printf("  Tamanho (L x A): %d x %d mm\n", p.tamanho[0], p.tamanho[1]);
            printf("  Data de Fabricacao: %s\n", p.data_de_fabricacao);
            printf("  Peso: %.2f gramas\n", p.peso);
            printf("  Marca: %s\n", p.marca);
        }
    }
}

// Função para remover o último produto da lista
void removerProduto(struct ListaProdutos *lista) {
    if (lista->quantidade > 0) {
        lista->quantidade--;
        printf("Produto removido com sucesso!\n");
    } else {
        printf("Nenhum produto para remover.\n");
    }
}

// Função para gerar arquivo com os produtos
void gerarArquivoTxt(struct ListaProdutos lista) {
    FILE *arquivo = fopen("produtos.txt", "w");
    if (arquivo == NULL) {
        printf("Erro ao criar arquivo!\n");
        return;
    }

    for (int i = 0; i < lista.quantidade; i++) {
        struct Produto p = lista.produtos[i];
        fprintf(arquivo, "Produto %d:\n", i + 1);
        fprintf(arquivo, "  Lote: %s\n", p.lote);
        fprintf(arquivo, "  Modelo: %s\n", p.modelo);
        fprintf(arquivo, "  Tamanho (L x A): %d x %d mm\n", p.tamanho[0], p.tamanho[1]);
        fprintf(arquivo, "  Data de Fabricacao: %s\n", p.data_de_fabricacao);
        fprintf(arquivo, "  Peso: %.2f gramas\n", p.peso);
        fprintf(arquivo, "  Marca: %s\n\n", p.marca);
    }

    fclose(arquivo);
    printf("Arquivo 'produtos.txt' gerado com sucesso!\n");
}

int main() {
    struct ListaProdutos lista;
    inicializarLista(&lista);

    // Criando um exemplo de produto Smartwatch
    struct Produto smartwatch = {
        "L123456", 
        "Model X200", 
        {42, 45}, 
        "01-10-2023", 
        75.5, 
        "TechBrand" 
    };

    // Inserindo o produto na lista
    inserirProduto(&lista, smartwatch);

    // Exibindo os produtos na lista
    exibirProdutos(lista);

    // Gerando arquivo com os produtos
    gerarArquivoTxt(lista);

    // Removendo um produto
    removerProduto(&lista);

    return 0;
}

