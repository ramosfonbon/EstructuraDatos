package generica;

public class Generica<T> {
    private T obj;
    Generica(T x)
    {
        obj = x;
    }
    public T getValue()
    {
        return obj;
    }
    public void changeValue(T y)
    {
        obj = y;
    }
    public void showType()
    {
        System.out.println("Tipo es: " + obj.getClass().getName());
    }
}
