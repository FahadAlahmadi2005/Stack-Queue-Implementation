/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithms1;

/**
 *
 * @author fhad4
 * @param <E>
 */
public class QueueAsSimpleArray{
    
        int [] queue;
        int rear = -1;
        int front = 0;
        int size = 0;
        int capacity;
        
        QueueAsSimpleArray(int capacity){
        
            this.capacity = capacity;
            queue = new int [capacity];
    }
        
        public boolean empty(){
        
            return (rear == front-1);  
        }
        
        public boolean full(){
        
            return (rear+1 == capacity);
        }
        
        public void first(){
            if(empty()){
            
                System.out.println("The list is empty!");
                return;
            }
            
            System.out.println(queue[front]);
        }
        
        public void enqueue(int data){
        
            if(full()){
                
                System.out.println("The list is full!");
                return;
            }
            
            queue[++rear] = data;
            size++;
        }
        
        public int dequeue() {
           
            if(!empty()){
                
                return queue[front++];
            }else{
            
                size++;
                return 0;
            }
    }
        
        public void print(){
        
            for (int i = front; i < size; i++) {
                
                System.out.println(queue[i]);
            }
        }
}     
  

