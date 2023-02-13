public class Coche {
    public int puertas = 4;

    public void AumentarPuertas() {
        this.puertas ++;
    }

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Coche miCoche = new Coche();
        miCoche.AumentarPuertas();
        System.out.println(miCoche.puertas);
    }
}