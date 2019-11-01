public class Task3 {

    public static void searchCh  (String stroka, char findCh) {
        System.out.println(stroka);
        int numCh = stroka.length()-1;
        System.out.println("Всего символов в строке " + numCh);
        char[] allCh = new char[numCh];
        allCh = stroka.toCharArray();
        int index = 0; numCh = 0;
        for (char masCh: allCh){
            if (masCh == findCh ) {
                System.out.println("Найден символ " + masCh + " - позиция " + index);
                numCh ++;
            }
            index ++;
        }
        System.out.println("Символ \"" + findCh + "\" встретился " + numCh + " раз(а)." );
    }

    public static void main(String[] args) {
        String newStroka = "sdfdsf,srwe14,7854,,dgd,afrfg6789421,afasd234,1235zcpoyudnvode..,10";
        char newfindCh = ',';
        searchCh(newStroka,newfindCh);
    }

}
