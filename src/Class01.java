public class Class01 {
    public static void main(String[] args) {












































        try {
            System.out.println("Hello world");

            foo3();
            foo2();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    public static void foo() {
        System.out.println("Function foo()");
    }

    public static void foo2() {
        System.out.println("Function foo2()");
    }

    public static void foo3() {
        System.out.println("Function foo3()");
    }
}


