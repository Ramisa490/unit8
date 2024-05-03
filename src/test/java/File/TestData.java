package File;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestData
{
    @Test(dataProvider = "userData", priority = 1)
    public void testLogin(String Name, String Email) {
        // Your test logic goes here
        System.out.println("Full Name: " + Name + ", Email: " + Email);
    }

    @DataProvider(name = "userData")
    public Object[][] provideUserData() {
        List<Object[]> testData = new ArrayList<>();

        try (FileReader reader = new FileReader("src/test/java/File/testdata.json")) {
            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
            JsonArray usersArray = jsonObject.getAsJsonArray("Users");

            for (JsonElement userElement : usersArray) {
                JsonObject userObject = userElement.getAsJsonObject();
                String Name = userObject.get("Full Name").getAsString();
                String Email = userObject.get("Email").getAsString();
                testData.add(new Object[]{Name, Email});
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return testData.toArray(new Object[0][]);
}
}
