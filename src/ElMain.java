public class ElMain {
    static PilaLista p1 = new PilaLista();
    static PilaLista p2 = new PilaLista();
    static PilaLista p3 = new PilaLista();
    static PilaLista p4 = new PilaLista();
    static PilaLista p5 = new PilaLista();

    public void entrada(int i, int j) throws Exception {

        if (i != 0) {
            if(i > 0) {
                if (i == 1) {
                    p1.insertar(j);
                } else if (i == 2) {
                    p2.insertar(j);
                } else if (i == 3) {
                    p3.insertar(j);
                } else if (i == 4) {
                    p4.insertar(j);
                } else if (i == 5) {
                    p5.insertar(j);
                }
            }
            if (i < 0) {
                if (i == -1) {
                    System.out.println("Elemento eliminado: " + p1.quitar());
                    System.out.println();
                } else if (i == -2) {
                    System.out.println("Elemento eliminado: " + p2.quitar());
                    System.out.println();
                } else if (i == -3) {
                    System.out.println("Elemento eliminado: " + p3.quitar());
                    System.out.println();
                } else if (i == -4) {

                    System.out.println("Elemento eliminado: " + p4.quitar());
                    System.out.println();
                } else if (i == -5) {
                    System.out.println("Elemento eliminado: " + p5.quitar());
                    System.out.println();
                }
            }
        } else {
            System.out.println("Introduzca un numero diferente de 0");
        }
    }
    public static void main(String[] args) throws Exception {

        ElMain main = new ElMain();

        //Entradas

        main.entrada(1,2);
        main.entrada(2,8);
        main.entrada(2,7);
        main.entrada(6,9);
        main.entrada(6,1);

        //Parte del codigo
        System.out.println("Elementos de la pila 1");
        while (!p1.pilaVacia()) {

        System.out.println((int)p1.quitar());
        }

        System.out.println("Elementos de la pila 2");
        while (!p2.pilaVacia()) {

            System.out.println((int)p2.quitar());
        }

        System.out.println("Elementos de la pila 3");
        while (!p3.pilaVacia()) {

            System.out.println((int)p3.quitar());
        }

        System.out.println("Elementos de la pila 4");
        while (!p4.pilaVacia()) {

            System.out.println((int)p4.quitar());
        }

        System.out.println("Elementos de la pila 5");
        while (!p5.pilaVacia()) {

            System.out.println((int)p5.quitar());
        }
    }
}
