/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturasdados;

/**
 *
 * @author marco
 */
public class LinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    public Node<T> getFirst() {
        return first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void insertAtBeginning(T element) {
        if (isEmpty()) {
            first = new Node<T>(element);
            last = first;
        }
        else {
            Node<T> novo = new Node<T>(element, first);
            first = novo;
        }
        this.size ++;
    }

    public void insertAtEnd(T element) throws Exception {
        if (isEmpty()) {
            first = new Node<T>(element);
            last = first;
        }
        else {
            last.setNext(new Node<T>(element));
            last = last.getNext();
        }
        this.size++;
    }

    public void insertAt(int position, T element) throws Exception {
        if (isEmpty()) {
            throw new Exception("A lista esta vazia.");
        }
        else if (this.size < position+1) {
            throw new Exception("A posicao " + position + " nao existe na lista.");
        }
        else {
            Node<T> current = first;
            Node<T> no_aux = null;
            for (int i = 0; i < position; i++) {
                no_aux = current;
                current = current.getNext();
            }
            no_aux.setNext(new Node<T>(element, current));
            this.size ++;
        }
    }

    public void removeAtBeginning() throws Exception {
        if (isEmpty()) {
            throw new Exception("A lista esta vazia.");
        }
        first = first.getNext();
        this.size--;
        if (isEmpty()) {
            last = null;
        }
    }

    public void removeAtEnd() throws Exception {
        if (isEmpty()) {
            throw new Exception("A lista esta vazia.");
        }
        else if (size == 1) {
            first = null;
            last = null;
        }
        else {
            Node<T> aux = first;
            while (aux.getNext() != last) {
                aux = aux.getNext();
            }
            aux.setNext(null);
            last = aux;
        }
        size--;
    }

    public void removeAt(int position) throws Exception {
        if (isEmpty()) {
            throw new Exception("A lista esta vazia.");
        }
        else if (this.size < position+1) {
            throw new Exception("A posicao " + position + " nao existe na lista.");
        }
        else {
            Node<T> no_move = first;
            Node<T> aux = null;
            for (int i = 0; i < position; i++) {
                aux = no_move;
                no_move = no_move.getNext();
            }
            aux.setNext(no_move.getNext());
            this.size --;
        }
    }

    public T search(int position) throws Exception {
        if (isEmpty()) {
            throw new Exception("A lista esta vazia.");
        }
        else if (this.size < position+1) {
            throw new Exception("A posicao " + position + " nao existe na lista.");
        }
        else {
            Node<T> no_aux = first;
            for (int i = 0; i < position; i++) {
                no_aux = no_aux.getNext();
            }
            return no_aux.getData();
        }
    }

    public boolean contains(T element) throws Exception {
        Node<T> current = first;
        while (current != null) {
            if (current == element) return true;
            current = current.getNext();
        }
        return false;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }

    public void clear() {
        this.first = null;
        this.last = null;
        size = 0;
    }

    @Override
    public String toString(){
        if (isEmpty()) return "[]";

        String saida;

        StringBuilder sb = new StringBuilder("[");
        Node<T> current = this.first;
        while (current != null) {
            sb.append(current.getData());
            if (current.getNext() != null) sb.append(", ");
            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
    
}
