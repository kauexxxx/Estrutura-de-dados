import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> carros = new LinkedList<>();

        carros.add("BMW");
        carros.add("honda");
        carros.add("Fiat");
        carros.add("porsche");

        System.out.println(" Topo da fila: " + carros.poll());
        System.out.println(carros);
        System.out.println("Se o carro que for tirado for:" + carros.poll());
        System.out.println("O carro que estará no topo da fila será:" + carros.peek());
        System.out.println(carros.isEmpty()?"A fila está vazia":"A fila tem carros");

    }
}