package dev.razafindratelo.timeTabler.sets;

import dev.razafindratelo.timeTabler.elements.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Set;

@Data
@EqualsAndHashCode
@AllArgsConstructor
public final class C implements Sets {
    private Set<Course> courses;

    @Override
    public String toString() {
        return String.format(
                "Courses=%s",
                courses.toString()
                        .replace("[", "{")
                        .replace("]", "}")
        );
    }

}
