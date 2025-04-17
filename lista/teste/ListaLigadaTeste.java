package lista.teste;

import lista.ListaLigada;

public class ListaLigadaTeste {
    public static void main(String[] args) {
        ListaLigada<Integer> lista = new ListaLigada<>();
        lista.adiciona(1);

        System.out.println(lista);
    }
}
