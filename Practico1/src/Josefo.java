/*


public class Josefo {

    /**
     *
     *@param	m	indica	la	cantidad	de	lugares	antes	de	sacar	una	persona,	este
    valor	puede	ser	negativo	y	indica	la	dirección	con	la	cual	se	recorre	la
    ronda.
     *@param	colIntegrantes	los	integrantes	participantes	del juego,	es	una
    lista	de	enteros.
     *@throws	//IllegalArgumentsException	cuando	la	cantidad	m	es	mayor	que
    el	total	de	integrantes
     *	@return	la	lista	de	jugadores	que	fueron	eliminados	en	el	orden	de
    eliminación
     */
    /*public	static CircularLinkedList juego(int	m,	CircularLinkedList	colIntegrantes)	{
        CircularLinkedList lista2 = new CircularLinkedList();
        int posicion=1;
        Node coso= colIntegrantes.head;
        while (colIntegrantes.size()!=1){
            if(posicion%m==0){
                lista2.add(colIntegrantes.get(colIntegrantes.posicion(coso.data)));
                colIntegrantes.remove(colIntegrantes.posicion(coso.data));
               }
            coso=coso.next;
            posicion++;
           }
        return lista2;
    }
    public  static void main(String[] args){
        CircularLinkedList listuti = new CircularLinkedList();
        listuti.add(10);
        listuti.add(20);
        listuti.add(30);
        listuti.add(40);
        listuti.add(50);
        listuti.add(60);
        listuti.add(70);
        listuti.add(80);

        juego(3,listuti).mostrar();
    }
}*/