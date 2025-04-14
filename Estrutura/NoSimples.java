package Estrutura;

public class NoSimples<T> {
    private T dado;
    private NoSimples<T> proximo;

    public NoSimples(T dado) {
        this.dado = dado;
        this.proximo = null;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public NoSimples<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoSimples<T> prixmo) {
        this.proximo = proximo;
    } 
}
