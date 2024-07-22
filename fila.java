import java.util.LinkedList;
import java.util.Queue;

public class filadePessoas {
    public static void main(String[] args) {

        Queue<String> pessoas = new LinkedList<>();

        pessoas.add("pessoa 1");
        pessoas.add("pessoa 2");
        pessoas.add("pessoa 3");
        pessoas.add("pessoa 4");
        pessoas.add("pessoa 5");

        String front = pessoas.poll();
        System.out.println("O elemento removido é " + front);

        System.out.println("O elemento que está no topo da fila é " + pessoas.peek());

        boolean Queue = pessoas.isEmpty();
        System.out.println("A fila está vazia? " + Queue);
    }
}