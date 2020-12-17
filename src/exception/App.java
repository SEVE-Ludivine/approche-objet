package exception;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("main begin");
        try {
            m1();
        } catch (ArithmeticException e ){
            System.err.println(e.getMessage());
        }
        System.out.println("main end");
    }
    public static void m1() throws Exception, ArithmeticException{
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 end");
    }

    private static void m2() throws ArithmeticException{
        System.out.println("m2 begin");
        int diviseur = (int) (Math.random() *2);

        System.out.println("La divisione de 1/" + diviseur + " = " + 1 / diviseur);

        System.out.println("m2 end");
    }
}
