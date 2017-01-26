package Chapter_8;

/**
 * Created by bnamora on 1/26/17.
 */
public class ex_17_ch_8_financial_tsunami {
    public static void main(String[] args) {
        double[][] dataBankLoan = {
                {25,2,1,100.5,4,320.5},
                {125,2,2,40,3,85},
                {175,2,0,125,3,75},
                {75,1,0,125},
                {181,1,2,125}
        };
        int limit = 201;
        boolean[] listUnSaveBank = new boolean[dataBankLoan.length];

        boolean flag = true;

        while(flag) {
            flag = getTotalAsset(dataBankLoan, limit, listUnSaveBank);
        }

        print(listUnSaveBank);

    }

    public static boolean getTotalAsset(double[][] dataBankLoan,int limit,boolean[] listUnSaveBank){
        for(int row = 0; row < listUnSaveBank.length; row++){
            double assetEachBank = dataBankLoan[row][0];
            int indexForLoan = 3;
            for(int k = 0; k < dataBankLoan[row][1]; k ++){
                assetEachBank +=  dataBankLoan[row][indexForLoan];
                indexForLoan +=2;
            }

            if(assetEachBank < limit && !listUnSaveBank[row]){
                listUnSaveBank[row] = true;
                decreaseLoanBankUnSave(dataBankLoan, row);
                return true;
            }
        }

        return false;
    }

    public static void decreaseLoanBankUnSave(double[][] dataBankLoan, int IdForUnSaveBank){
        for(int row = 0; row < dataBankLoan.length; row++){
            int indexForIDLoan = 2;
            for(int k = 0; k < dataBankLoan[row][1]; k++){

                if(dataBankLoan[row][indexForIDLoan] == IdForUnSaveBank){
                    dataBankLoan[row][indexForIDLoan+1] = 0;
                }
                indexForIDLoan +=2;
            }
        }
    }

    public static void print(boolean[] listUnSaveBank){
        System.out.print("UnSave Bank is : ");
        for(int i = 0; i < listUnSaveBank.length; i++){
            System.out.print(listUnSaveBank[i] ? +i+" ":"");
        }
    }





    /*public static void makeZeroBankUnSave(double[][] dataBankLoan,double ID, boolean[] listUnSaveBank,int indexForIDLoan,int row){

        for(int i = 0; i < listUnSaveBank.length; i++){
            if(listUnSaveBank[i]){
                dataBankLoan[row][indexForIDLoan+1] = 0;
            }
        }
    }*/
    //  System.out.println("Ini bank ke : "+row+" total asset : "+assetEachBank);
    //System.out.println(" "+row);
    /*public static void decreaseLoanBankUnSave(double[][] dataBankLoan,boolean[] listUnSaveBank){
        for(int row = 0; row < dataBankLoan.length; row++){
            int indexForIDLoan = 2;
            for(int k = 0; k < dataBankLoan[row][1]; k++){
                makeZeroBankUnSave(dataBankLoan,dataBankLoan[row][indexForIDLoan],listUnSaveBank,indexForIDLoan,row);
                indexForIDLoan +=2;
            }
        }
    }*/
}
