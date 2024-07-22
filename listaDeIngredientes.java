import java.util.ArrayList;
import java.util.List;

public class listaDeIngredientes {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Manteiga");
        lista.add("Farinha de Trigo");
        lista.add("Ovos");
        lista.add("Açucar");

        System.out.println("A lista é:");
        System.out.println(lista);

        String Y = lista.remove(1);
        System.out.println("O elemento removido da lista foi " + Y);

        lista.set(1, "Farinha de Rosca");
        System.out.println("A lista atualizada é " + lista);

        String elemento = lista.get(1);
        System.out.println("O segundo elemento da lista é: " + elemento);
    }
}
