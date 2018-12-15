package pl.maniaq;

public class MainCallStackUnchecked {
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

    private static void metodaB(){
        System.out.println("Rozpoczynam wykonywanie metody B...");
        metodaC();
        System.out.println("Zakończyłem wykonywanie metody B...");

    }

    private static void metodaC() {
        System.out.println("Rozpoczynam wykonywanie metody C...");
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        metodaA();
    }

}
