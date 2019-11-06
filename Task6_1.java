public class Task6_1 {

        public static String joinStrok(String stroka1, String stroka2) {
            //String result = stroka1 + stroka2;
            System.out.println(stroka1);
            System.out.println(stroka2);
            String result = (stroka1 + stroka2).chars().distinct().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
            return result;
        }

        public static void main(String[] args) {
            String newStroka1 = "Первая строка";
            String newStroka2 = "Большая строка";
            System.out.println(joinStrok(newStroka1, newStroka2));
        }
    }


