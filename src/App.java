public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Comercial b1 = new Comercial("553455X", "El primer barco", (float) (100),"tabaco");
        Recreo b2 = new Recreo("553455X", "El primer barco", (float) (260),"B");

        Amarre am1 = new Amarre((float) 240);
        Amarre am2 = new Amarre((float) 200);
        Amarre am3 = new Amarre((float) 300);

        Pantalan pant1 = new Pantalan("Comercial");
        Pantalan pant2 = new Pantalan("Recreo");

        pant1.getListAmarre().add(am1);
        pant1.getListAmarre().add(am2);
        pant2.getListAmarre().add(am3);

        Puerto p1 = new Puerto();

        p1.getBarcosEntrantes().add(b1);
        p1.getBarcosEntrantes().add(b2);

        p1.getListPantalan().add(pant1);
        p1.getListPantalan().add(pant2);

        Puerto.verAmarre();

        Puerto.buscarAmarre();

        Puerto.verAmarre();


    }
}
