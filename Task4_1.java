public class Task4_1 {

    public static long calkulator(String stroka){
        String[] masForCalk = stroka.split(" ");
        int num = masForCalk.length;
        byte[] howCalk = new byte[num]; // массив, который показывает, очередь вычислений.
        long[] forLong = new long[num]; // массив целых чисел
        for (int i = 0; i < num; i += 2 ){
                forLong[i] = Long.valueOf(masForCalk[i]);
            }
        for (int i = 1; i < num; i += 2 ){
            if (masForCalk[i].equals("*")  || masForCalk[i].equals("/")) {
            howCalk[i] = 1;
            }
            else {
                howCalk[i] = 2;
            }
        }
        for (int i = 1; i < num; i +=2 ) {
            if (howCalk[i] == 1) {
                if (masForCalk[i].equals("*")) {
                    forLong[i + 1] = forLong[i - 1] * forLong[i + 1];
                    forLong[i - 1] = 0;
                    //howCalk[i] = 0;
                }
                if (masForCalk[i].equals("/")) {
                    forLong[i + 1] = forLong[i - 1] / forLong[i + 1];
                    forLong[i - 1] = 0;
                    //howCalk[i] = 0;
                }
            }
        }
        for (int i = 1; i < num; i +=2 ){
            if (howCalk[i] == 2 && masForCalk[i].equals("+")) {
                for (int j = i; j < num; j += 2) {
                    if (forLong[j + 1] != 0){
                        forLong[j + 1] = forLong[i - 1] + forLong[j + 1];
                        //forLong[i - 1] = 0;
                        //howCalk[i] = 0;
                        break;
                    }
                }
            }
            if (howCalk[i] == 2 && masForCalk[i].equals("-")) {
                for (int j = i; j < num; j += 2) {
                    if (forLong[j + 1] != 0){
                        forLong[j + 1] = forLong[i - 1] - forLong[j + 1];
                        //forLong[i - 1] = 0;
                        //howCalk[i] = 0;
                        break;
                    }
                }
            }
        }
        return forLong[num-1];
    }

    public static void main(String[] args) {
        String newStroka = "25 + 8 * 5 * 3 / 4 - 4 * 2 / 8";
        System.out.println(newStroka);
        System.out.println("Resultat = " + calkulator(newStroka));
    }
}
