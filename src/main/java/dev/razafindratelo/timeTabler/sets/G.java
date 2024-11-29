package dev.razafindratelo.timeTabler.sets;

import dev.razafindratelo.timeTabler.elements.Group;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Set;


@Data
@EqualsAndHashCode
@AllArgsConstructor
public final class G implements Sets {
    private Set<Group> groups;

    @Override
    public String toString() {
        return String.format(
                "Groups=%s",
                groups.toString()
                        .replace("[", "{")
                        .replace("]", "}")
        );
    }
}
