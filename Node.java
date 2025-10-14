/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturasdados;

/**
 *
 * @author marco
 */
public class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() throws Exception{
        if (hasNext()){
            throw new Exception("Node dont has next.");
        }
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
    
    public boolean hasNext() {
        return next == null;
    }
    
    @Override
    public String toString() {
        return data.toString();
    }
    
}
