package serialization;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cook {
    private String name;
    private int age;
    private int salary;
}
