package dev.razafindratelo.timeTabler.sets;

import dev.razafindratelo.timeTabler.elements.Day;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public final class D implements Sets {
    private List<Day> days;

    @Override
    public String toString() {
        return String.format(
                "Courses=%s",
                days.toString()
                        .replace("[", "{")
                        .replace("]", "}")
        );
    }
}
