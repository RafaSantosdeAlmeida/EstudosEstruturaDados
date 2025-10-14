/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturasdados;

import java.lang.reflect.Array;

/**
 *
 * @author marco
 */
public class StaticQueue<T> {
    int end;
    private T[] queue;

    public StaticQueue(Class <T> classe, int lenght) {
        this.queue = (T[]) Array.newInstance(classe, lenght);
    }
    
    public void enqueue(T elemento) throws Exception{
        if (isFull()){
            throw new Exception("Queue is full.");
        }
        queue[end] = elemento;
        end ++;
    }
    
    public T dequeue() throws Exception{
        
        if (isEmpty()){
            throw new Exception("Queue is empty.");
        }
        
        T next;
        
        next = queue[0];
        
        for (int i = 0; i < end-1; i++) {
            queue[i] = queue[i+1];
        }
        
        end --;
        
        return next;
    }
    
    public T front() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty.");
        }
        return queue[0];
    }
    
    public T rear() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty.");
        }
        return queue[end-1];
    }
    
    public boolean isEmpty() {
        return end == 0;
    }
    
    public boolean isFull() {
        return end == queue.length;
    }
    
    public int size() {
        return end;
    }
    
    public void clear() {
        end = 0;
    }
    
    @Override
    public String toString(){
        String outString;
        
        if (isEmpty()){
            return "[]";
        }
        
        outString = "[" + queue[0];
        for (int i = 1; i < end; i++) {
            outString += ", " + queue[i];
        }
        return outString + "]";
    }
    
}
