public class Task6 {

        public static String joinStrok(String stroka1, String stroka2) {
            String result = "";
            System.out.println(stroka1);
            System.out.println(stroka2);
            int num1 = stroka1.length() - 1;
            boolean[] trueChForStroka1 = new boolean[num1 + 1];
            int num2 = stroka2.length() - 1;
            boolean[] trueChForStroka2 = new boolean[num2 + 1];
            // System.out.println("Всего символов в строке " + (num1));
            // System.out.println("Всего символов в строке " + (num2));
            char[] chFromStroka1 = new char[num1 - 1];
            char[] chFromStroka2 = new char[num2 - 1];
            for (int i = 0; i <= num1; i++) {
                trueChForStroka1[i] = true;
            }
            for (int i = 0; i <= num2; i++) {
                trueChForStroka2[i] = true;
            }
            chFromStroka1 = stroka1.toCharArray();
            chFromStroka2 = stroka2.toCharArray();
            for (int i = 0; i <= num1; i++) {
                for (int j = i + 1; j <= num1; j++) {
                    // System.out.print(num1 + " " + i + " " + j + " " + chFromStroka1[i] + " " + chFromStroka1[j] + " " + trueChForStroka1[j]);
                    // System.out.println("");
                    if (chFromStroka1[i] == chFromStroka1[j] && trueChForStroka1[j]) {
                        trueChForStroka1[j] = false;
                        // System.out.println("Строка 1 символа \"" + chFromStroka1[i] + "\"" + " позиция " + i + " совпал с индксом строки 1 позиция " + j);
                    }
                }
                for (int j = 0; j <= num2; j++) {
                    // System.out.print(num2 + " " + i + " " + j + " " + chFromStroka1[i] + " " + chFromStroka2[j] + " " + trueChForStroka2[j]);
                    // System.out.println("");
                    if (chFromStroka1[i] == chFromStroka2[j] && trueChForStroka2[j]) {
                        trueChForStroka2[j] = false;
                        // System.out.println("Строка 1 символа \"" + chFromStroka1[i] + "\"" + " позиция " + i + " совпал с индксом строки 2 позиция " + j);
                    }
                }
            }
       /* Проверка на праваильность массива, который будет использован для сложения символов.
         for (int i = 0; i <= num1;  i++){
                System.out.println(i + " " + trueChForStroka1[i]);
            }2
            for (int i = 0; i <= num2;  i++){
                System.out.println(i + " " + trueChForStroka2[i]);
            }
            return stroka1 + stroka2;
        */
            for (int i = 0; i <= num1; i++) {
                if (trueChForStroka1[i]) {
                    result += chFromStroka1[i];
                }
            }
            for (int i = 0; i <= num2; i++) {
                if (trueChForStroka2[i]) {
                    result += chFromStroka2[i];

                }
            }
            return result;
        }

        public static void main(String[] args) {
            String newStroka1 = "Первая строка";
            String newStroka2 = "Большая строка";
            System.out.println(joinStrok(newStroka1, newStroka2));
        }
}

