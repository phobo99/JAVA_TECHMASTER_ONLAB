interface MyMethod{
    MethodreferenceExample display(String saySomeThing);
}
public class MethodreferenceExample {
    public MethodreferenceExample(String saySomeThing){
        System.out.println(saySomeThing);
    }

    public static void main(String[] args) {
        MethodreferenceExample myMethod = new MethodreferenceExample("Hello");
        MyMethod method = MethodreferenceExample::new;
        method.display("Xin chao");
    }
}
