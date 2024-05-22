package Lista4_EstruturaDeDados;

public class Pilha {
    int vet[];
    int ultimo;

    //Lista vazia
    public Pilha(int tamanho){
        vet = new int[tamanho];
        ultimo = 0;
    }

    //Inserção de valores
    public void inserirElemento(int valor){
        if (ultimo < vet.length) {
            vet[ultimo] = valor;
            ultimo++;
        } else {
            System.out.println("Pilha cheia. Não é possível inserir mais elementos.");
        }
    }

    //Método para remover elementos
    public int removerElemento(){
        if (ultimo > 0) {
            ultimo--;
            return vet[ultimo];
        } else {
            System.out.println("Pilha vazia. Não há elementos para remover.");
            return -1; // ou outra indicação de erro
        }
    }
    //Método para exibir o conteúdo da Pilha
    public void exibir(){
        for (int i=0; i<ultimo;i++){
            System.out.println(vet[i]);
        }
    }
    public int numeroDeElementos() {
        return ultimo;
    }

    public static void main(String[] args) {
        Pilha pilha = new Pilha(10);
        pilha.inserirElemento(3);
        pilha.inserirElemento(4);
        pilha.inserirElemento(5);
        pilha.inserirElemento(8);
        pilha.inserirElemento(9);
        System.out.println("Conteúdo da pilha após inserções:");
        pilha.exibir();
        System.out.println("Removendo elemento: " + pilha.removerElemento());
        System.out.println("Removendo elemento: " + pilha.removerElemento());
        System.out.println("Conteúdo da pilha após remoções:");
        pilha.exibir();
        System.out.println("Número de elementos na pilha: " + pilha.numeroDeElementos());

    }
}
