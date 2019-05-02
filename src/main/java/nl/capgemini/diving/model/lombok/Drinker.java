package nl.capgemini.diving.model.lombok;


import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data // => gives me getters and setters
@Builder // => gives me a builder for this class (DrinkerBuider)
@EqualsAndHashCode(of = {"name", "age"}) // => gives me an override of hashCode and equals based on name and age
@ToString // => gives me a toString method based on ALL properties
public class Drinker {

    private String name;
    private int age;

}
