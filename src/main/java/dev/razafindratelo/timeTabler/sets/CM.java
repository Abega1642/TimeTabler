package dev.razafindratelo.timeTabler.sets;

import dev.razafindratelo.timeTabler.elements.CourseMap;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public final class CM implements Sets {
    private Set<CourseMap> courseMaps;

    @Override
    public String toString() {
        return String.format(
                "CourseMaps=%s",
                courseMaps.toString()
                        .replace("[", "{")
                        .replace("]", "}")
        );
    }
}
