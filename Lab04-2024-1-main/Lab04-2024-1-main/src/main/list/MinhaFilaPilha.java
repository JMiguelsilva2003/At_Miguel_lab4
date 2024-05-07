package list;
import java.util.Stack;

public class MinhaFilaPilha {
    private Stack<Integer> entrada;
    private Stack<Integer> saida;

    public MinhaFilaPilha() {
        entrada = new Stack<>();
        saida = new Stack<>();
    }

    public void enqueue(int item) {
        entrada.push(item); 
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia");
        }
        if (saida.isEmpty()) {
            transferirParaSaida();
        }
        return saida.pop();
    }

    public boolean isEmpty() {
        return entrada.isEmpty() && saida.isEmpty();
    }

    public int size() {
        return entrada.size() + saida.size();
    }

    private void transferirParaSaida() {
        while (!entrada.isEmpty()) {
            saida.push(entrada.pop());
        }
    }
}
