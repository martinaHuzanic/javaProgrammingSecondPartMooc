
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {      
        
        HashMap<String, String> nickNames = new HashMap<>();
        
        nickNames.put("mathhew", "matt");
        nickNames.put("micheael", "mix");
        nickNames.put("arthur", "artie");
        
        System.out.println(nickNames.get("mathhew"));
      
    }

}