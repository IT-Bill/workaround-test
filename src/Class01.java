public class Class01 {
    public static void main(String[] args) {
        try {
            System.out.println("Hello world");

            foo();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void foo() {
        System.out.println("Function foo()");
    }
}


