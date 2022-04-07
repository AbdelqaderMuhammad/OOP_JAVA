package serialization;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Waiter {
    private String name;
    private int age;
    private int salary;
}
