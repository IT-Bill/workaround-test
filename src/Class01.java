public class Class01 {
    public static void main(String[] args) {
        try {
            System.out.println("Hello world");

            foo();
            foo2();

        } catch (Exception | Error e) {
            e.printStackTrace();
        }
    }

    public static void foo() {
        System.out.println("Function foo()");
    }

    public static void foo2() {
        System.out.println("Function foo2()");
    }
}


