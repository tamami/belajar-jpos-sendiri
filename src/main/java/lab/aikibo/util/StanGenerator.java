package lab.aikibo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StanGenerator {

  public String generate() {
    SimpleDateFormat sdf = new SimpleDateFormat("MMDDhhmmss");

    return sdf.format(new Date());
  }
  
}
