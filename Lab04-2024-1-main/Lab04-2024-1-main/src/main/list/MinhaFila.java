package list;


import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MinhaFila {
    private LinkedList<Integer> fila;

    public MinhaFila() {
        fila = new LinkedList<>();
    }

    public void enqueue(int item) {
        fila.addLast(item); 
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Fila está vazia");
        }
        return fila.removeFirst(); 
    }

    public boolean isEmpty() {
        return fila.isEmpty();
    }

    public int size() {
        return fila.size();
    }
}

