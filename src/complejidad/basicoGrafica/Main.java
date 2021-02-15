package complejidad.basicoGrafica;

public class Main {

    public static void main(String[] args) {
	    Complejidad c = new Complejidad();
	    int ejecuciones = 20;
        int resultados[][] = new int[ejecuciones][2];
/*
        for (int renglon=0; renglon < ejecuciones; renglon++) {
            int n = (renglon + 1) * 1;
            resultados[renglon][0] = n;
            resultados[renglon][1] = c.lineal(n);
        }
        imprimir(resultados);

        for (int renglon=0; renglon < ejecuciones; renglon++) {
            int n = (renglon + 1) * 1;
            resultados[renglon][0] = n;
            resultados[renglon][1] = c.cuadratica(n);
        }
        imprimir(resultados);
*/
        for (int renglon=0; renglon < ejecuciones; renglon++) {
            int n = (renglon + 1) * 100;
            resultados[renglon][0] = n;
            resultados[renglon][1] = c.log(n);
        }
        imprimir(resultados);
    }

    private static void imprimir(int [][] resultado){
        for (int renglon = 0; renglon < resultado.length ; renglon++){
            for(int veces = 0; veces < resultado[renglon][1]; veces++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
