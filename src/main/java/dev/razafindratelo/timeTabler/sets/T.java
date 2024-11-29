package dev.razafindratelo.timeTabler.sets;

import dev.razafindratelo.timeTabler.elements.Teacher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Set;

@Data
@EqualsAndHashCode
@AllArgsConstructor
public final class T implements Sets{
    private Set<Teacher> teachers;

    @Override
    public String toString() {
        return String.format(
                "Teachers=%s",
                teachers.toString()
                        .replace("[", "{")
                        .replace("]", "}")
        );
    }
}
