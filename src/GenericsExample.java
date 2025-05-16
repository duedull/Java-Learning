public class GenericsExample<T, U> {
    public T a;
    public U b;

    GenericsExample(T a, U b){
        this.a = a;
        this.b = b;
    }

    void show(){
        System.out.println(this.a + " " + this.b);
    }
}
