package data_structure;

import java.util.ArrayList;
import java.util.List;

/*
    - sequence
    - allows duplicates
    - not fixed in size
    - lists are interface and have different implementations such as ArrayList, Stack, Vector, ...
 */
public class _lists {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<String> colors = List.of("red", "blue");
        names.add("Ahmed");
        names.add("Ali");
        names.add("Ibrahim");
        System.out.println(names);
        names.remove("Ahmed");
        names.forEach(System.out::println);

    }
}
