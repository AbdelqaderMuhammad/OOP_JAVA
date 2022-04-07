package serialization;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class Restaurant {

    @SerializedName("name")
    private String Name;
    private Owner owner;
    private Cook cook;
    private Waiter waiter;
}
