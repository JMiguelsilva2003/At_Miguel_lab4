package list;


import java.util.EmptyStackException;
import java.util.LinkedList;

public class MinhaPilha {
    private LinkedList<Integer> pilha;

    public MinhaPilha() {
        pilha = new LinkedList<>();
    }

    public boolean isEmpty() {
        return pilha.isEmpty();
    }

    public void push(int item) {
        pilha.addFirst(item);
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return pilha.removeFirst();
    }
}
