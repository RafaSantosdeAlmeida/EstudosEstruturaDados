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
public class StaticStack<T> {
    private int top;
    private T[] stack;

    public StaticStack(Class <T> classe, int lenght) {
        this.stack = (T[]) Array.newInstance(classe, lenght);
    }
    
    public void push(T elemento) throws Exception{
        if (isFull()){
            throw new Exception("Stack is full.");
        }
        stack[top] = elemento;
        top ++;
    }
    
    public T pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is empty.");
        }
        return stack[--top];
    }
    
    public T peek(){
        return stack[top-1];
    }
    
    public boolean isEmpty(){
        return top == 0;
    }
    
    public boolean isFull(){
        return top == stack.length;
    }
    
    public int size(){
        return top;
    }
    
    public void clear(){
        top = 0;
    }
    
    @Override
    public String toString(){
        String outString;
        
        if (isEmpty()){
            return "[]";
        }
        
        outString = "[" + stack[0];
        for (int i = 1; i < top; i++) {
            outString += ", " + stack[i];
        }
        return outString + "]";
    }
    
}
