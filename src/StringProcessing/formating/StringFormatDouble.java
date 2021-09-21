package StringProcessing.formating;

public class StringFormatDouble {

    public static void main(String[] args) {
        double n = 1.567D;
        String formatted = String.format("%.1f", n);
        System.out.println("formatted: " + formatted);

        float m = 3.567f;
        String formattedFloat = String.format("%.1f", m);
        System.out.println("formatted float: " + formattedFloat);
    }
}
