public class App {

    public static void main(String[] args) {
        GenericLinkedList<Integer> gll = new GenericLinkedList<Integer>();
        gll.add(12);
        gll.add(18);
        gll.add(32);
        gll.add(562);
        gll.add(125);
        gll.add(122);
        gll.add(1298);

        for(int i=0; i< gll.size(); i++)
            System.out.println("["+i+"]: "+gll.get(i));


        GenericLinkedList<String> gll2 = new GenericLinkedList<>();
        gll2.add("Edson");
        gll2.add("Silvia");
        gll2.add("Francisco");
        gll2.add("Antonio");
        for(int i=0; i< gll2.size(); i++)
            System.out.println("["+i+"]: "+gll2.get(i));

        GenericLinkedList<Pessoa> gll3 = new GenericLinkedList<>();
        gll3.add(new Pessoa("Edson", 48));
        gll3.add(new Pessoa("Silvia", 44));
        gll3.add(new Pessoa("Francisco", 12));
        gll3.add(new Pessoa("Antonio", 8));
        for(int i=0; i< gll3.size(); i++)
            System.out.println("["+i+"]: "+gll3.get(i));





    }

    
}
