/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturasdados;

/**
 *
 * @author marco
 */
public class Main {
    public static void main(String[] args) {
        // StaticStackTest();
        StaticQueueTest();
        
    }
    
    public static void StaticStackTest(){
        try {
            // Criando pilha de tamanho 5
            StaticStack<Integer> stack = new StaticStack<>(Integer.class, 5);

            System.out.println("Pilha está vazia? " + stack.isEmpty());

            // Testando push
            stack.push(10);
            stack.push(20);
            stack.push(30);

            System.out.println("Topo da pilha (peek): " + stack.peek());
            System.out.println("Tamanho da pilha: " + stack.size());

            // Testando pop
            System.out.println("Elemento removido (pop): " + stack.pop());
            System.out.println("Topo da pilha após pop: " + stack.peek());
            System.out.println("Tamanho da pilha: " + stack.size());

            // Preenchendo até ficar cheia
            stack.push(40);
            stack.push(50);
            stack.push(60); // último espaço

            System.out.println("Pilha está cheia? " + stack.isFull());
            System.out.println("Conteudo da pilha: " +  stack.toString());

            // Tentando adicionar em pilha cheia (gera exceção)
            // stack.push(70);

            // Limpando a pilha
            stack.clear();
            System.out.println("Pilha limpa. Está vazia? " + stack.isEmpty());
            System.out.println("Conteudo da pilha: " +  stack.toString());

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    public static void StaticQueueTest(){
        try {
            // Criando fila de tamanho 5
            StaticQueue<Integer> queue = new StaticQueue<>(Integer.class, 5);

            System.out.println("Fila está vazia? " + queue.isEmpty());

            // Testando enqueue
            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);

            System.out.println("Fila atual: " + queue);
            System.out.println("Primeiro da fila (front): " + queue.front());
            System.out.println("Último da fila (rear): " + queue.rear());
            System.out.println("Tamanho da fila: " + queue.size());

            // Testando dequeue
            System.out.println("Elemento removido (dequeue): " + queue.dequeue());
            System.out.println("Fila após dequeue: " + queue);

            // Preenchendo até ficar cheia
            queue.enqueue(40);
            queue.enqueue(50);
            queue.enqueue(60); // último espaço

            System.out.println("Fila cheia: " + queue);
            System.out.println("Fila está cheia? " + queue.isFull());

            // Tentando adicionar em fila cheia (gera exceção)
            // queue.enqueue(70);

            // Limpando a fila
            queue.clear();
            System.out.println("Fila limpa: " + queue);
            System.out.println("Fila está vazia? " + queue.isEmpty());

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
