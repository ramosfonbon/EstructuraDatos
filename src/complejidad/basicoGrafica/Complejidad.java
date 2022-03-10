package complejidad.basicoGrafica;

public class Complejidad {

    public int lineal(int N){
        int iter = 0;
        for (int i= 0; i < N; i++){
            iter++;
        }
        return iter;
    }

    public int cuadratica(int N){
        int iter = 0;
        for (int i= 0; i < N; i++){
            for (int j = 0; j < N ; j++) {
                iter++;
            }
        }
        return iter;
    }
    // 0 1 2 3 4 5 6 7 8 9
    // 1 2 3 4 5 6 7 8 9 10
    public int gauss(int N){
        int iter = 0;
        for (int i= 0; i < N; i++){
            for (int j = 0; j <= i ; j++) {
                iter++;
            }
        }
        return iter;
    }

    public int log(int N){
        int c= 1, iter = 0;
        while (c < N) {
            iter++;
            c= 2*c;
        }
        return iter;
    }

    public int logd(int N){
        int c= N, iter = 0;

        while (c > 0) {
            iter++;
            c= c/2;
        }
        return iter;
    }

    public int nlogn(int N){
        int c= N, iter = 0;
        for (int i = 0; i < N ; i++) {
            c=N;
            while (c > 0) {
                iter++;
                c = c / 2;
            }
        }
        return iter;
    }



    public static double log2(int x)
    {
        return (Math.log(x) / Math.log(2));
    }

}
