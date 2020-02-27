import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String args[]) throws IOException, ParseException {
        ObjectMapper mapper = new ObjectMapper();
        int counter = 0;

        List<User> users = mapper.readValue(new File("/home/fatah/Documents/Algorithms/Kotlin/Users/src/MOCK_DATA (1).json"),  new TypeReference<List<User>>() {});
        for (int i=0; i<users.size(); i++) {
            if (users.get(i).getGender().equals("Female")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
