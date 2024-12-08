package dev.razafindratelo.timeTabler.sets;

import dev.razafindratelo.timeTabler.elements.Room;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;

@Data
@EqualsAndHashCode
@AllArgsConstructor
public final class R implements Sets {
    private List<Room> rooms;

    @Override
    public String toString() {
        return String.format(
                "Rooms=%s",
                rooms.toString()
                        .replace("[", "{")
                        .replace("]", "}")
        );
    }
}
