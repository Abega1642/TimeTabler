package dev.razafindratelo.timeTabler.variables;

import dev.razafindratelo.timeTabler.elements.Element;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class Variable {
    private String name;
    private Element element;
    private int value;

    @Override
    public String toString() {
        return String.format(
                "Variable:[name=%s][type=%s][value=%d]",
                name,
                element.getClass().getSimpleName(),
                value
        );
    }
}
