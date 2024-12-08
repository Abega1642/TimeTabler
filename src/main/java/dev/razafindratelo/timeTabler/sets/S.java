package dev.razafindratelo.timeTabler.sets;

import dev.razafindratelo.timeTabler.elements.Slot;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.List;


@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public final class S implements Sets {
    private List<Slot> slots;

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
