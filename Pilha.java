import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack<String> carros = new Stack<>();

        carros.push("BMW");
        carros.push("honda");
        carros.push("Fiat");
        carros.push("porsche");

        System.out.println(" Topo da pilha: " + carros.pop());
        System.out.println(carros);
        System.out.println("Se o carro que for tirado for:" + carros.pop());
        System.out.println("O carro que estará no topo da pilha será:" + carros.peek());
        System.out.println(carros.isEmpty()?"A pilha está vazia":"A pilha tem carros");

    }
}