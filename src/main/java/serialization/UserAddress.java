package serialization;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class UserAddress {
    private String street;
    private String houseNumber;
    private String city;
    private String country;
}
