package dev.razafindratelo.timeTabler.elements;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@AllArgsConstructor
public final class Group implements Element {
    private String name;
    private int groupSize;

    @Override
    public String toString() {
        return String.format("Group: [g=%s][studentNumber=%d]", name, groupSize);
    }
}
