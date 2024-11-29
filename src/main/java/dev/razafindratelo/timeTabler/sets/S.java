package dev.razafindratelo.timeTabler.sets;

import dev.razafindratelo.timeTabler.elements.Slot;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Set;

@Data
@EqualsAndHashCode
@AllArgsConstructor
public final class S implements Sets {
    private Set<Slot> slots;

    @Override
    public String toString() {
        return String.format(
                "Slots=%s",
                slots.toString()
                        .replace("[", "{")
                        .replace("]", "}")
        );
    }
}
