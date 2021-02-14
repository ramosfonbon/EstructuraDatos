public class Complejidad {

    public void lineal(int N){
        int iter = 0;
        for (int i= 0; i < N; i++){
            iter++;
        }
        System.out.println("N:" + N + " iter:" + iter);
    }

    public void cuadratica(int N){
        int iter = 0;
        for (int i= 0; i < N; i++){
            for (int j = 0; j < N ; j++) {
                iter++;
            }
        }
        System.out.println("N:" + N + " iter:" + iter);
    }
    // 0 1 2 3 4 5 6 7 8 9
    // 1 2 3 4 5 6 7 8 9 10
    public void gauss(int N){
        int iter = 0;
        for (int i= 0; i < N; i++){
            for (int j = 0; j <= i ; j++) {
                iter++;
            }
        }
        System.out.println("N:" + N + " iter:" + iter +
                            " gauss:" + (N*(1+N)/2 ));
    }

    public void log(int N){
        int c= 1, iter = 0;
        while (c < N) {
            iter++;
            c= 2*c;
        }
        System.out.println("N: " + N + " iter:" + iter +
                            " log:" + log2(N));
    }

    public void logd(int N){
        int c= N, iter = 0;

        while (c > 0) {
            iter++;
            c= c/2;
        }
        System.out.println("N: " + N + " iter:" + iter +
                " logd:" + log2(N));
    }

    public void nlogn(int N){
        int c= N, iter = 0;
        for (int i = 0; i < N ; i++) {
            c=N;
            while (c > 0) {
                iter++;
                c = c / 2;
            }
        }
        System.out.println("N: " + N + " iter:" + iter +
                " nlogn:" + N*log2(N));
    }



    public static double log2(int x)
    {
        return (Math.log(x) / Math.log(2));
    }

}
