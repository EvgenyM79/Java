public class Task5 {

    public static int toNumber(String name) {
        int number = 0;
        for (int i = 0; i < name.length(); i++) {
            number = number * 26 + (name.charAt(i) - ('A' - 1));
        }
        return number;
    }

    public static void main(String[] args) {
        String newColumn = "AA";
        System.out.println("Столбец " + toNumber(newColumn));
    }
}