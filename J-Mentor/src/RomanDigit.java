public class RomanDigit {
    public String [] romanDigit = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
    public String [] digit = {"1","2","3","4","5","6","7","8","9","10"};

    private static int result;


    public RomanDigit(String opera,int n1,int n2){



        romanDigit[n1 - 1] = digit[n1 - 1];
        int rom1 = Integer.parseInt(digit[n1 - 1]);
        romanDigit[n2 - 1] = digit[n2 - 1];
        int rom2 = Integer.parseInt(digit[n2 - 1]);
        Acalc(opera,rom1,rom2);
    }

    public RomanDigit(String opera,String romDS1,String romDS2) {

        int romD1 = 0;
        int romD2 = 0;
        for (int i = 0; i < 10; i++) {
            if (romDS1.equals(romanDigit[i])) {
                romD1 = Integer.parseInt(digit[i]);
            }
            if (romDS2.equals(romanDigit[i])) {
                romD2 = Integer.parseInt(digit[i]);
            }
        }
        Acalc(opera, romD1, romD2);
    }


    public static int Acalc(String opera, int n1, int n2){
        //Write the calulator

        if (opera.equals("+")) {result=n1+n2;}

        else if (opera.equals("-")) {result=n1-n2;}

        else if (opera.equals("*")) {result=n1*n2;}

        else if (opera.equals("/")) {result=n1/n2;}

        return result;
    }

    public int getResult(){
        return result;
    }

    public String getRomanResult(){
        return romanDigit[getResult()-1];
    }
}
