import java.util.Stack;

public class Livros {
    public static void main(String[] args) {

        Stack<String> Livros = new Stack<>();

        Livros.push("Orgulho e Preconceito");
        Livros.push("As Vantagens de Ser Invísivel");
        Livros.push("A Blibioteca da Meia Noite");
        Livros.push("As Crônicas de Nárnia");
        Livros.push("O Pequeno Príncipe");

        String front = Livros.pop();
        System.out.println("O elemento removido é " + front);

        System.out.println("O elemento que está no topo da fila é " + Livros.peek());

        boolean FilaVazia = Livros.isEmpty();
        System.out.println("A fila está vazia? " + FilaVazia);
    }
}
