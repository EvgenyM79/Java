import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3_2 {

        public static void searchCh  (String stroka, char findCh) {
            StringBuilder poiskCh = new StringBuilder(stroka);
            System.out.println(poiskCh);
            String regexp = String.valueOf(findCh);
            Pattern pattern = Pattern.compile(regexp);
            Matcher matcher = pattern.matcher(poiskCh);
            int numFindCh = 0;
            while (matcher.find()) {
                System.out.println("Найден символ \"" + findCh + "\" - позиция " + (matcher.end() - 1) );
                numFindCh++;
            }
            System.out.println("Символ \"" + findCh + "\" встретился " + numFindCh + " раз(а)." );

        }

        public static void main(String[] args) {
            String newStroka = "sdfdsf,srwe14,7854,,dgd,afrfg6789421,afasd234,1235zcpoyudnvode..,10";
            char newfindCh = ',';
            searchCh(newStroka, newfindCh);
        }
    }


