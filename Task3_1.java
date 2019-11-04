public class Task3_1 {


        public static void searchCh  (String stroka, char findCh) {
            System.out.println(stroka);
            int numCh = stroka.length();
            int i = 0;
            int numFindCh = 0;
            while (i < numCh) {
                if (stroka.charAt(i) == findCh) {
                    numFindCh++;
                    System.out.println("Найден символ \"" + findCh + "\" - позиция " + i);
                }
                i++;
            }
            System.out.println("Символ \"" + findCh + "\" встретился " + numFindCh + " раз(а)." );
        }


        public static void main(String[] args) {
            String newStroka = "sdfdsf,srwe14,7854,,dgd,afrfg6789421,afasd234,1235zcpoyudnvode..,10";
            char newfindCh = ',';
            searchCh(newStroka, newfindCh);
        }
    }

