package serialization;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Owner {
    private String name;
    private UserAddress address;
}
