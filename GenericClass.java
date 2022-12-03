public class GenericClass<T> {
    public T t[];
    private int currentSize = 0;

    public GenericClass(int size) {
        this.t = (T[]) new Object[size];
    }

    public void add(T t) {
        this.t[this.currentSize++] = t;
    }

    public T getFirst() {
        return t[0];
    }

    public T getLast() {
        return t[this.currentSize - 1];
    }

    public int size() {
        return this.currentSize;
    };

    /**
     * @param args
     */
    public static void main(String[] args) {
        GenericClass<Integer> integerGenericClass = new GenericClass<Integer>(100);
        GenericClass<String> stringGenericClass = new GenericClass<String>(1000);

        integerGenericClass.add(10);
        integerGenericClass.add(20);
        integerGenericClass.add(30);
        stringGenericClass.add(new String("Hello World"));
        stringGenericClass.add(new String("Hello World!!!!"));
        stringGenericClass.add(new String("Hello World. It is just my code"));

        System.out.printf("Integer Value :%d\n\n", integerGenericClass.getFirst());
        System.out.printf("String Value :%s\n", stringGenericClass.getLast());
    }
}