package lab.aikibo.util; 

import java.text.SimpleDateFormat;

public class JastelHelper {
  private static final SimpleDateFormat formatterBit7 = new SimpleDateFormat("YYYYMMddHHmmss");
  private static final SimpleDateFormat formatterBit12 = new SimpleDateFormat("HHmmss");
  private static final SimpleDateFormat formatterBit13 = new SimpleDateFormat("YYYYMMDD");

  private static final String CURRENCY_CODE = "360";

  public static ISOMsg createInquiryRequest(String nop, String thnPajak) {
    try {
      String panjangData = "022";
      String processingCode = "360000";   

      ISOMsg reqMsg = new ISOMsg();
      reqMsg.setMTI(ConstantsData.MTI_TRS_REQ);
    } catch(ISOException ex) {
      Logger.getLogger(JastelHelper.class.getName()).log(Level.Severe, 
    }
  } 
}
