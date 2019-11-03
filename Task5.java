public class Task5 {

    public static int toNumber(String name) {
        int number = 0;
        for (int i = 0; i < name.length(); i++) {
            number = number * 26 + (name.charAt(i) - ('A' - 1));
        }
        return number;
    }

    public static void main(String[] args) {
        String newCell = "BB123";
        System.out.println(newCell);
        String newColumn = newCell.replaceAll("[0-9]+","");
        //System.out.println(newColumn);
        int nline = Integer.parseInt(newCell.replaceAll("[a-zA-Z]+",""));
        //System.out.println(nline);
        System.out.println("Столбец " + toNumber(newColumn));
        System.out.println("Строка " + nline);
    }
}