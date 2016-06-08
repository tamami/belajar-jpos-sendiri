package lab.aikibo.util; 

import java.text.SimpleDateFormat;

public class JastelHelper {
  private static final SimpleDateFormat formatterBit7 = new SimpleDateFormat("YYYYMMddHHmmss");
  private static final SimpleDateFormat formatterBit12 = new SimpleDateFormat("HHmmss");
  private static final SimpleDateFormat formatterBit13 = new SimpleDateFormat("YYYYMMDD");

  private static final String CURRENCY_CODE = "360";

  public static void createInquiryRequest(String nop, String thnPajak) {
    String panjangData = "022";
    String processingCode = "360000";   
  } 
}
