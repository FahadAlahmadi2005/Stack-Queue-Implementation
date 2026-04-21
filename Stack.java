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
public class Stack <E>{

    DLL <E> stack = new DLL ();
   
    public void push(E data){

        stack.insertFirst(data);
        
        stack.displayList();
        stack.countNodes();
        stack.displayCount();
        System.out.println("");
    }
    
    public void pop(){
             
         stack.deleteFirst();
         
         stack.displayList();
         stack.countNodes();
         stack.displayCount();
         System.out.println("");
    }
    
    private E popReverse(){
        
         DoubleNode oldHead = stack.head;   
         stack.deleteFirst();
         
         return (E) oldHead.data;
    }
  
    public void peek(){
        
        stack.dispalyFirst();
    }
    
    public void empty(){
        
       if (stack.empty()){
           
           System.out.println("The stack is empty!");
       }
    }
    
    public void size(){
        
        stack.displayList();
        stack.countNodes();
        stack.displayCount();
    }
    
    public void reverseStack(){
        
        Stack temp = new Stack();
        
        while(!stack.empty()){
        
            temp.push(popReverse());
        }
    }
}
