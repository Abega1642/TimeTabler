package dev.razafindratelo.timeTabler.elements;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@AllArgsConstructor
public final class CourseMap implements Element {
    private Course course;
    private Teacher teacher;
    private Group group;

    @Override
    public String toString() {
        return String.format(
                "Course Mapping: [c=%s][t=%s][g=%s]",
                course.getName(),
                teacher.getName(),
                group.getName()
        );
    }
}
