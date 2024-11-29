package dev.razafindratelo.timeTabler.elements;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@AllArgsConstructor
public final class Course implements Element{
    private String name;

    @Override
    public String toString() {
        return String.format("Course: [c=%s]", name);
    }
}
