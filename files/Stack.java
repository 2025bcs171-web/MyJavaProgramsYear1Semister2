class Node{
  int data;
  Node next;
  Node (int data){
    this.data = data;
    this.next = null;
  }
}
class StackLinkedList{
  Node top;
  StackLinkedList(){
    top = null;
  }
  boolean isEmpty(){
    return top == null;
  }
  void push(int value){
    Node newNode = new Node(value);
    newNode.next = top;
    top = newNode;
  }
  int pop(){
    if(isEmpty()){
      System.out.println("Stack Underflow");
      return -1;
    }
    int value = top.data;
    top = top.next;
    return value;
  }
  int peek(){
    if(isEmpty()){
      System.out.println("Stack is Empty.");
      return -1;
    }
    return top.data;
  }
}
public class Stack{
  public static void main(String [] args){
    StackLinkedList stack  = new StackLinkedList();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);
    System.out.println("Top Element is: " + stack.peek());
    System.out.println("Removed: " + stack.pop() + "from the stack.");
    System.out.println("Top Element on the stack now is: " + stack.peek()); 
  }
}
