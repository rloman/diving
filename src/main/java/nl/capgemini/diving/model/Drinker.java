package nl.capgemini.diving.model;


import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Builder
@EqualsAndHashCode(of = {"name", "age"})
@ToString
public class Drinker {

    private String name;
    private int age;

}
