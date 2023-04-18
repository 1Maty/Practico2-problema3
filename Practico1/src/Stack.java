public class Stack<T extends Comparable<T>> implements MyStack<T>{
    public Node<T> head;
    @Override
    public T top() {
        Node<T> coso=head;
        while(coso.next!=null){
            coso=coso.next;
        }
        return coso.data;
    }

    @Override
    public boolean isEmpty() {
        boolean esta=false;
       if(head==null){
           esta = true;
       }
       return esta;
    }

    @Override
    public void pop() {
        Node<T> cabeza=head;
        if(cabeza.next==null){
            head=null;
            return;
        }
        while(cabeza.next.next!=null){
            cabeza=cabeza.next;
        }
        cabeza.next=null;

    }

    @Override
    public void push(T element) {
        Node<T> cabeza = head;
        Node<T> aAgregar = new Node<>();
        aAgregar.data = element;
        aAgregar.next = null;
        if (head == null) {
            head = aAgregar;
        } else {
            while (cabeza.next != null) {
                cabeza = cabeza.next;
            }
            cabeza.next = aAgregar;
        }
    }
    @Override
    public void makeEmpty() {
        head=null;
    }
    public static void main(String[] args){
        Stack<Integer> cositas = new Stack<>();
        cositas.push(10);
        cositas.push(20);
        cositas.push(30);
        cositas.push(40);
        cositas.push(50);
        System.out.println(cositas.top());
        cositas.pop();
        System.out.println(cositas.top());
        cositas.makeEmpty();
        System.out.println(cositas.isEmpty());
    }
}
