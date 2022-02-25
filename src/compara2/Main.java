package compara2;

public class Main {
    public static void main(String[] args) {
        String a = "Z";
        String b = "Y";
        System.out.println(a.compareTo(b));
        Cliente ca = new Cliente("AAAAA",2);
        Cliente cb = new Cliente("AAAAA",19);
        System.out.println("-----");
        System.out.println(ca.equals(cb));
        System.out.println(ca.compareTo(cb));

    }
}
