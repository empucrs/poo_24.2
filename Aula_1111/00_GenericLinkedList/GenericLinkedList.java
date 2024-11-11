public class GenericLinkedList< E > {
    private class Nodo{
        public Nodo proximo;
        public E elemento;
        public Nodo(E e) {
            elemento=e;
        }
        public Nodo(E e, Nodo ref) {
            elemento=e;
            proximo=ref;
        }
    }

    private int count;
    private Nodo header;

    public GenericLinkedList() {
        clear();
    }

    public void clear(){
        count=0;
        header=null;
    }

    public void add(E elemento){
        if(count==0)
            header=new Nodo(elemento);
        else{
            Nodo aux = new Nodo(elemento, header);
            header=aux;
        }
        count++;
    }

    public E get(int index){
        if((index<0) || (index>=count))
            throw new IllegalArgumentException("Indice informado está fora do interavo valido.");

        Nodo aux = header;
        while(index>0){
            aux=aux.proximo;
            index--;
        }

        return aux.elemento;
            
    }

    public int size(){
        return count;
    }
    
}