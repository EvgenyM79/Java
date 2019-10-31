public class Task1 {
        public static void gsm(){
            String [] Car = new String[] {"Z11-100", "Z12-150", "Z13-120", "Z11-80", "Z12-50", "Z13-40", "Z11-200", "Z12-0", "Z13-10", "Z11-170"};
            float Z11 = 46.10f, Z12 = 47.50f, Z13 = 48.90f;
            float Sum = 0f, sZ11 = 0f, sZ12= 0f, sZ13=0f;
            int km = 0;
            for (int i = 0; i < Car.length; i++ ){
                // System.out.println(Car[i].substring(0,3));
                km = Integer.valueOf(Car[i].substring(4,Car[i].length()));
                switch (Car[i].substring(0,3)) {
                    case "Z11":{
                        // System.out.println (km);
                        Sum += km * 15 * Z11 / 100;
                        sZ11 += km * 12.5F * Z11 / 100;
                        // System.out.println (Sum);
                        break;
                    }
                    case "Z12":{
                        // System.out.println (km);
                        Sum += km * 15 * Z12 / 100;
                        sZ12 += km * 12 * Z12 / 100;
                        // System.out.println (Sum);
                        break;
                    }
                    case "Z13":{
                       // System.out.println (km);
                        Sum += km * 15 * Z13 / 100;
                        sZ13 += km * 11.5F * Z13 / 100;
                       // System.out.println (Sum);
                        break;
                    }
                }
            }
            System.out.println ("Sum =" + Sum);
            //Max
            if (sZ12 > sZ11 && sZ12 > sZ13) {
                System.out.println("Max Z12 = " + sZ12);}
            else if (sZ11 > sZ12 && sZ11 > sZ13) {
                System.out.println("Max Z11 = " + sZ11);}
            else {
                System.out.println("Max Z13 = " + sZ13);
            }
            //Min
            if (sZ12 < sZ11 && sZ12 < sZ13) {
                System.out.println("Min Z12 = " + sZ12);}
            else if (sZ11<sZ12 && sZ11<sZ13) {
                System.out.println("Min Z11 = " + sZ11);}
            else System.out.println("Min Z13 = " + sZ13);

           // System.out.println (sZ11);
           // System.out.println (sZ12);
           // System.out.println (sZ13);
        }

        public static void main(String[] args) {
            gsm();
        }
    }