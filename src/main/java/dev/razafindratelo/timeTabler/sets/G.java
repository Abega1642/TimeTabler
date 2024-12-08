package dev.razafindratelo.timeTabler.sets;

import dev.razafindratelo.timeTabler.elements.Group;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public final class G implements Sets {
    private List<Group> groups;

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
