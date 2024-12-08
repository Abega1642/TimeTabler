package dev.razafindratelo.timeTabler.sets;

import dev.razafindratelo.timeTabler.elements.Teacher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public final class T implements Sets{
    private List<Teacher> teachers;

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
