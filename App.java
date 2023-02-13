public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        int resultado = 0;
        resultado  = suma(5 , 2, 3);
        System.out.println(resultado);

    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

}

