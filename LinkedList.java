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

    public void insertAtBeginning(T element) {
        if (isEmpty()) {
            first = new Node<T>(element);
            last = new Node<T>(element);
            size = 1;
        }
        else {
            first = new Node<T>(element, first);
            size ++;
        }
    }

    public void insertAtEnd(T element) throws Exception {
        if (isEmpty()) {
            first = new Node<T>(element);
            last = new Node<T>(element);
            size = 1;
        }
        else {
            last.setNext(new Node<T>(element));
            last = last.getNext();
        }
    }

    public void insertAt(int position, T elemento) throws Exception {
        if (isEmpty()) {
            throw new Exception("A lista esta vazia.");
        }
        elif (size < position+1) {
            throw new Exce
        }
        else {

        }
    }

    public void removeAtBeginning() {
        
    }

    public void removeAtEnd() {
        
    }

    public void removeAt(int position) {
        
    }

    public T search(int position) {
        
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        if (isEmpty()){
            return 0;
        }
        else {
            return this.size;
        }
    }

    public void clear() {
        this.first = null;
        this.last = null;
    }

    @Override
    public String toString(){
        String saida;

        saida = "[" + this.first.getData();
        Node<T> no_aux = this.first;
        for (int i = 1; i < this.size; i++) {
            try {
                no_aux = no_aux.getNext();
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
            saida += ", " + no_aux.getData();
        }
        saida += "]";
        return saida;
    }
    
}
