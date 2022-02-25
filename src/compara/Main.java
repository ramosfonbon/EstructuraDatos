package compara;

public class Main {
    public static void main(String[] args) {
        String a =  "BBBRR";
        System.out.println(a.compareTo("AAAAAA"));
        System.out.println(a.compareTo("ZZZZZZ"));
        System.out.println(a.compareTo("BBBBBB"));

        Recipiente r1 = new Recipiente("frijol",1,5);
        Recipiente r2 = new Recipiente("frijol",3,5);
        System.out.println("--------");
        System.out.println("equals: " + r1.equals(r2));
        System.out.println("compareTo:" + r1.compareTo(r2));


    }
}
