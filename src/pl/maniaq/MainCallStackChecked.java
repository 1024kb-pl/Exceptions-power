package pl.maniaq;

public class MainCallStackChecked {
    private static void metodaA() {
        System.out.println("Rozpoczynam wykonywanie metody A...");
        try {
            metodaB();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("W wywołaniu został rzucony wyjątek");
        }
        System.out.println("Zakończyłem wykonywanie metody A...");
    }

    private static void metodaB() throws Exception {
        System.out.println("Rozpoczynam wykonywanie metody B...");
        metodaC();
        System.out.println("Zakończyłem wykonywanie metody B...");

    }

    private static void metodaC() throws Exception {
        System.out.println("Rozpoczynam wykonywanie metody C...");
        throw new Exception();
    }

    public static void main(String[] args) {
        metodaA();
    }

}
