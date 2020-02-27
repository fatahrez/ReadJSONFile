import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class App {
    public static void main(String args[]) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        int counter = 0;

        List<User> users = mapper.readValue(new File("/home/fatah/Documents/Algorithms/Kotlin/Users/src/MOCK_DATA (1).json"),  new TypeReference<List<User>>() {});
        for (User user : users) {
            if (user.getGender().equals("Female")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
