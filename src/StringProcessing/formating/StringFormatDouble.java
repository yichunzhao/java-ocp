package StringProcessing.formating;

public class StringFormatDouble {

    public static void main(String[] args) {
        double n = 1.567D;
        String formatted = String.format("%.1f", n);
        System.out.println("formatted: " + formatted);
    }
}
