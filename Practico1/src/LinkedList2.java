public class LinkedList2<T extends Comparable<T>> implements Lista<T>{


        public Node<T> head;
    @Override
    public T get(int position) {
        Node<T> coso = head;
        Node<T> respuesta = null;
        for (int indice = 0; coso != null; indice++) {
            if (indice == position) {
                respuesta = coso;
            }
            coso = coso.next;
        }
        return (T) respuesta;
    } @Override
        public void add(T value){

            Node<T> aAñadir = new Node<>();
            aAñadir.data = value;
            aAñadir.next = null;
            if (head.data==null){
                head=aAñadir;
            }
            else{
                Node<T> coso=head;
                while (coso.next!= null) {
                    coso=coso.next;
                }
                coso.next=aAñadir;
            }}

        @Override
        public void remove(int position) {
            Node coso=head;
            if(position==0){
                head=head.next;
            }
            else{
                for(int indice=0;coso!=null;indice++){
                    if (indice==position-1){
                        coso.next=coso.next.next;
                        break;
                    }
                    coso=coso.next;

                }


            }}
        public boolean seEncuentra(T data){
            Node coso = head;
            boolean esta=false;
            while(coso!=null){
                if(coso.data==data){
                    esta=true;
                }
                coso=coso.next;
            }
            return esta;
        }
        public void addFirst(T value){
            Node nuevo= new Node();
            nuevo.data= value;
            nuevo.next=head;
            head=nuevo;
        }
        public void addLast(T value){
            Node ultimo= new Node();
            ultimo.data=value;
            ultimo.next=null;
            Node coso=head;
            while(coso!=null){
                if(coso.next==null){
                    coso.next=ultimo;
                    break;
                }
                coso=coso.next;
            }
        }
    public int size(){
        Node coso=head;
        int tamaño;
        for(tamaño=1;coso.next!=null;tamaño++){
            coso=coso.next;
        }
        return tamaño;
        }
       public void agregarEnOrden(T value) {
           Node<T> coso = new Node<>();
           Node<T> aAgregar = new Node<>();
           aAgregar.data = value;
           boolean sePudo = false;
           if (head == null) {
               coso.data = value;
               coso.next = null;
               head = coso;
           } else if (head.data.compareTo(value) < 0) {
               head = aAgregar;
               aAgregar.next = coso;
               sePudo = true;
           } else {
               Node<T> cabeza = head;
               while (cabeza.next != null || sePudo != true) {
                   if (cabeza.next.data.compareTo(value) < 0) {
                       aAgregar.next = coso.next;
                       cabeza.next = aAgregar;
                       sePudo = true;
                   } else {
                       cabeza = cabeza.next;
                   }
               }

               if (sePudo == false) {
                   cabeza.next = aAgregar;
                   aAgregar.next = null;
               }
           }
       }

    public void mostrar(){
        Node coso = head;
        while(coso.next!= null){
            System.out.println(coso.data);
            coso=coso.next;
        }
        System.out.println(coso.data);
    }
    public static void main(String [] args){
        LinkedList2 listita = new LinkedList2();
        listita.agregarEnOrden(4);
        listita.agregarEnOrden(3);
        listita.agregarEnOrden(1);
        listita.mostrar();
    }
    }
