package test;

import java.math.BigDecimal;

public class RiskDataGen {

    /**
     * @param args
     */
    public static void main1(String[] args) {
       
        String prelimIdList = "2,21,22,23,24,27,28,29,30,31,32,33,34,35,36,37,41,47,53,57,58,59,60,61,62,63,64,65,66,86,106,107,108,109,110,111,126,127,128,129,146,166,186,209,210,211,213,214,215,216,226,247,248,249,250,251,252,253,254,255,257,258,259,266,267,268,269,270,271,272,275,278,279,280,281,282,283,284,286,287,288,289,306,307,308,309,310,311,312,313,326,346,347,366,386,387,406,407,408,411,414,426,427,428,429,430,431,432,433,434,435,436,437,438,439,446,447";
        String[] prelimIdArray = prelimIdList.split(",");
        StringBuilder strBuilder = new StringBuilder();
        int primaryKeyCounter = 30;
/*        for(int i=0; i<prelimIdArray.length; i++ ) {
            for(int j=1; j<500; j++ ) {
                strBuilder.append("Insert into CTH_RISK_DATA_PRE_INT_CHANGE (ID,PRELIMINARY_INT_CHANGE_ID,LOAN_ID,NEW_FXD_INT_PERIOD,STATUS,REMAINING_LOAN_AMT,PRODUCT_TYPE,START_DATE_OFFER,END_DATE_OFFER,OFF_START_DATE_NEW_FXT_INT_PRD,APPROVED_DATE,FIN_START_DATE_NEW_FXT_INT_PRD,OFFERED_PENALTY_FEE,APPROVED_PENALTY_FEE,OFF_INT_RATE_WITH_INT_AVG,OFF_INT_RATE_WITH_PENALTY_FEE,NEW_PREMIUM_FOR_INT_AVG,NEW_PREMIUM_FOR_PENALTY_FEE) values " +
                        "(" + primaryKeyCounter + "," + prelimIdArray[i] + ",'1049900596'," + j +",'Openstaande offerte',149114,'ROH',to_date('10-AUG-09','DD-MON-RR'),to_date('30-AUG-09','DD-MON-RR'),to_date('31-AUG-09','DD-MON-RR'),null,null,138.6,0,4.05,3.8,null,250.75);");
                strBuilder.append("\n");
                primaryKeyCounter ++;
            }
        }*/
        
/*        primaryKeyCounter = 58413;
      for(int i=0; i<prelimIdArray.length; i++ ) {
            for(int j=501; j<750; j++ ) {
                strBuilder.append("Insert into CTH_RISK_DATA_PRE_INT_CHANGE (ID,PRELIMINARY_INT_CHANGE_ID,LOAN_ID,NEW_FXD_INT_PERIOD,STATUS,REMAINING_LOAN_AMT,PRODUCT_TYPE,START_DATE_OFFER,END_DATE_OFFER,OFF_START_DATE_NEW_FXT_INT_PRD,APPROVED_DATE,FIN_START_DATE_NEW_FXT_INT_PRD,OFFERED_PENALTY_FEE,APPROVED_PENALTY_FEE,OFF_INT_RATE_WITH_INT_AVG,OFF_INT_RATE_WITH_PENALTY_FEE,NEW_PREMIUM_FOR_INT_AVG,NEW_PREMIUM_FOR_PENALTY_FEE) values " +
                        "(" + primaryKeyCounter + "," + prelimIdArray[i] + ",'1049900596'," + j +",'Geaccepteerde offerte voor rentemiddeling',149114,'ROH',to_date('01-AUG-09','DD-MON-RR'),to_date('30-AUG-09','DD-MON-RR'),to_date('31-AUG-09','DD-MON-RR'),null,null,138.6,0,4.05,3.8,null,250.75);");
                strBuilder.append("\n");
                primaryKeyCounter ++;
            }
        }*/
      
      primaryKeyCounter = 87546;
        
       for(int i=0; i<prelimIdArray.length; i++ ) {
            for(int j=750; j<1000; j++ ) {
                strBuilder.append("Insert into CTH_RISK_DATA_PRE_INT_CHANGE (ID,PRELIMINARY_INT_CHANGE_ID,LOAN_ID,NEW_FXD_INT_PERIOD,STATUS,REMAINING_LOAN_AMT,PRODUCT_TYPE,START_DATE_OFFER,END_DATE_OFFER,OFF_START_DATE_NEW_FXT_INT_PRD,APPROVED_DATE,FIN_START_DATE_NEW_FXT_INT_PRD,OFFERED_PENALTY_FEE,APPROVED_PENALTY_FEE,OFF_INT_RATE_WITH_INT_AVG,OFF_INT_RATE_WITH_PENALTY_FEE,NEW_PREMIUM_FOR_INT_AVG,NEW_PREMIUM_FOR_PENALTY_FEE) values " +
                        "(" + primaryKeyCounter + "," + prelimIdArray[i] + ",'1049900596'," + j +",'Openstaande offerte',149114,'ROH',to_date('21-JUL-09','DD-MON-RR'),to_date('10-AUG-09','DD-MON-RR'),to_date('31-AUG-09','DD-MON-RR'),null,null,138.6,0,4.05,3.8,null,250.75);");
                strBuilder.append("\n");
                primaryKeyCounter ++;
            }
        }
        
        System.out.println(strBuilder);
    }
    
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(23.341);
        BigDecimal b = a.setScale(2, BigDecimal.ROUND_UP);
        System.out.println(b);
        
    }
}
