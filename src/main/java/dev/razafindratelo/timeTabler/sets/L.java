package dev.razafindratelo.timeTabler.sets;

import dev.razafindratelo.timeTabler.elements.Location;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public final class L implements Sets {
    private Set<Location> locations;


    @Override
    public String toString() {
        return String.format(
                "Locations=%s",
                locations.toString()
                        .replace("[", "{")
                        .replace("]", "}")
        );
    }
}
