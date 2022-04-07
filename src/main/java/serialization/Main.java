package serialization;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        // Deserialization
        String restaurantJson = "{ 'name':'Future Studio Steak House'," +
                " 'owner':{ 'name':'Christian', 'address':{ 'city':'Magdeburg', 'country':'Germany', 'houseNumber':'42', 'street':'Main Street'}}," +
                "'cook':{ 'age':18, 'name': 'Marcus', 'salary': 1500 }, 'waiter':{ 'age':18, 'name': 'Norman', 'salary': 1000}}";
        Gson gson = new Gson();
        Restaurant restaurant = gson.fromJson(restaurantJson, Restaurant.class);



    }
}
