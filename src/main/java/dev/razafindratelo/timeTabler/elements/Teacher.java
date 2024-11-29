package dev.razafindratelo.timeTabler.elements;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Date;
import java.util.List;

@Data
@EqualsAndHashCode
@AllArgsConstructor
public final class Teacher implements Element {
    private String name;
    private List<Date> availabilities;

    @Override
    public String toString() {
        return String.format("Teacher: [t=%s]", this.name);
    }
}
