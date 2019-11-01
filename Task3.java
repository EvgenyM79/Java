public class Task3 {


    static public void main(String[] args){
        //Калькулятор для двух чисел
        String res = "25 + 7";
        int Result = 0;
        System.out.println("Выражение = " + res);
        String[] exp = res.split(" ");
        for (int i = 0; i < exp.length; i++ ){
            switch (exp[i]) {
                case "+": {
                    Result = Integer.valueOf(exp[i - 1]) + Integer.valueOf(exp[i + 1]);
                    break;
                }
                case "-": {
                    Result = Integer.valueOf(exp[i - 1]) - Integer.valueOf(exp[i + 1]);
                    break;
                }
                case "*": {
                    Result = Integer.valueOf(exp[i - 1]) * Integer.valueOf(exp[i + 1]);
                    break;
                }
                case "/": {
                    Result = Integer.valueOf(exp[i - 1]) / Integer.valueOf(exp[i + 1]);
                    break;
                }

            }

        }
        System.out.println(Result);


    }
}
