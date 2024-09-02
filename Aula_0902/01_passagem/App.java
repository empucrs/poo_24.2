public class App {

    public static void main(String[] args) {
        Executive pn = new Executive("001.002.003-04", "Edevagindo Pereira", 1552.34);
        System.out.println(pn);
        System.out.println("-=-=-=-=-=-=-");

        pn.defineAssento("15F");
        System.out.println(pn);
        System.out.println("-=-=-=-=-=-=-");

        pn.custoBagagem(3, new int[]{15, 20, 32} );
        System.out.println(pn);
        System.out.println("-=-=-=-=-=-=-");

    }
    
}
