package oz.infra.json.utils.test;
import java.util.*;
import com.fasterxml.jackson.databind.*;
public class JSONArrayToList1 {
   public static void main(String args[]) {
      String jsonStr = "[\"INDIA\", \"AUSTRALIA\", \"ENGLAND\", \"SOUTH AFRICA\", \"WEST INDIES\"]";
      ObjectMapper objectMapper = new ObjectMapper();
      try {
         List<String> countries = objectMapper.readValue(jsonStr, List.class);
         System.out.println("The countries are:\n " + countries);
      } catch(Exception e) {
         e.printStackTrace();
      }
   }
}