/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturasdados;

/**
 *
 * @author marco
 */
public class DinamicStack<T> {
    private LinkedList<T> stack = new LinkedList<>();
    private int size = 0;

    public void push(T element){
        stack.insertAtBeginning(element);
        size ++;
    }
    
    public T pop() throws Exception{
        T saida = stack.getFirst().getData();
        stack.removeAtBeginning();
        size --;
        return saida;
    }
    
    public T peek(){
        return stack.getFirst().getData();
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public int size(){
        return this.size;
    }
    
    public void clear(){
        stack = new LinkedList<>();
        size = 0;
    }

    @Override
    public String toString() {
        return stack.toString();
    }
    
}
