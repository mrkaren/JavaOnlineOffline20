package homework;

public class A {

    //TODO retdhjhgjgfhds kgasparyan
    void method1() throws Throwable {
        System.out.println("from A method1");
        finalize();

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new A();
    }
}
