package dev.razafindratelo.timeTabler.sets;

import dev.razafindratelo.timeTabler.elements.CourseMap;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public final class CM implements Sets {
    private List<CourseMap> courseMaps;

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
