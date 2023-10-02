public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();

        System.out.println("Fila está vazia? " + fila.vazia());
        System.out.println("Tamanho da fila: " + fila.tamanho());

        System.out.println("Inserindo valores na fila...");
        for (int i = 1; i <= 5; i++) {
            fila.insere(i * 10);
            System.out.println("Elemento inserido " + fila.ultimo());
        }

        System.out.println("Fila está vazia? " + fila.vazia());
        System.out.println("Tamanho da fila: " + fila.tamanho());

        System.out.println("Primeiro elemento: " + fila.primeiro());

        System.out.println("Removendo elementos da fila...");
        while (!fila.vazia()) {
            System.out.println("Elemento removido: " + fila.remove());
            if (fila.tamanho()==2) System.out.println("\nPrimeiro elemento: " + fila.primeiro() +"\n");
        }

        System.out.println("\nFila está vazia? " + fila.vazia());
        System.out.println("Tamanho da fila: " + fila.tamanho());
    }
}