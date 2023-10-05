import java.util.HashMap;

public class Main3 {
    public static void main(String[] args) {

        try{


        HashMap<String, String> name_length = new HashMap<>();
        name_length.put("Анна","4");
        name_length.put("Елена","5");
        name_length.put("null","null");
        name_length.put("Владимир","?");
        name_length.put("Константин","?");
        name_length.put("Иван","4");


        for (String key : name_length.keySet()) {
            String value = name_length.get(null);
            if ("?".equals(value)) {
                name_length.put(key, String.valueOf(key.length()));
            }
        }

        System.out.println(name_length);
        }catch (Exception e){
            e.printStackTrace();

        }
    }
}
