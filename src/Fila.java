public class Fila {
    private No inicio;
    private No fim;
    private int nElementos;

    public Fila() {
        inicio = null;
        fim = null;
        nElementos = 0;
    }

    public boolean vazia() {
        if (nElementos == 0) return true;
        else return false;
    }

    public int tamanho() {
        return nElementos;
    }

    public int primeiro() {
        if (vazia()) return -1;
        else return inicio.getConteudo();
    }

    public int ultimo(){
        if (vazia()) return -1;
        else return fim.getConteudo();
    }

    public boolean insere(int valor) {
        No novoNo = new No();
        novoNo.setConteudo(valor);
        novoNo.setProx(null);
        if (vazia()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.setProx(novoNo);
            fim = novoNo;
        }
        nElementos++;
        return true;
    }

    public int remove() {
        if (vazia()) return -1;
        int valor = primeiro();
        if (inicio == fim) {
            fim = null;
        }
        No aux = inicio;
        inicio=aux.getProx();
        aux=null;
        nElementos--;
        return valor;
    }

}