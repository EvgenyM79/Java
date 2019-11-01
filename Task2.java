public class Task2 {

    public static String revertstroka (String stroka) {
        System.out.println(stroka);
        String[] masWord = stroka.split(" ");
        String Simbol = "";

        for (int i = masWord.length - 1; i > -1; i--) {
            // System.out.println(masWord[i]);
            Simbol = masWord[i].substring(masWord[i].length() - 1, masWord[i].length());
            if (Simbol.equals(",")) {
                masWord[i] = masWord[i].substring(0, masWord[i].length() - 1);
                masWord[i + 2] = masWord[i + 2] + ",";
                //System.out.println(a);
                //System.out.println(masWord[i]);
                //System.out.println(masWord[i + 2]);
            }
        }
        String  reverseStroka = "";
        for (int i = masWord.length - 1; i > -1; i--) {
            reverseStroka +=  masWord[i];
            if  (i > 0) reverseStroka += " ";
          //  System.out.println(b);
        }
        return reverseStroka;
    }

    public static void main(String[] args) {
        String newStroka = "Программирование это хорошо, но есть что-то лучше";
        System.out.println(revertstroka(newStroka));


    }
}


