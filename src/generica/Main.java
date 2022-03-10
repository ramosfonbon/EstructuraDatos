package generica;

public class Main {
    public static void main(String[] args) {
        System.out.println("Integer: ");
        Generica<Integer> genx;  //referencia
        genx = new Generica<>(50);
        genx.showType(); // Mostrar tipo
        System.out.println("Valor: " + genx.getValue()); // Mostrar valor
        genx.changeValue(75); // Cambiar valor
        System.out.println("Nuevo Valor: " + genx.getValue());
        System.out.println();
        System.out.println("String: ");
        Generica<String> gens;  //referencia
        gens = new Generica<>("HOLA");
        gens.showType(); // Mostrar tipo
        System.out.println("Valor: " + gens.getValue()); // Mostrar valor
    }
}
