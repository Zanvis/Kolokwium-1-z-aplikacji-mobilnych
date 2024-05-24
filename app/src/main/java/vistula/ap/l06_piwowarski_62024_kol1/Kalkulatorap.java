package vistula.ap.l06_piwowarski_62024_kol1;

public class Kalkulatorap {
    static int calculationsap(int n1ap, int n2ap, String operator){
        int resultap = 0;
        switch (operator){
            case "+":
                resultap = n1ap + n2ap;
                break;
            case "-":
                resultap = n1ap - n2ap;
                break;
            case "*":
                resultap = n1ap*n2ap;
                break;
        }
        return resultap;
    }
}
