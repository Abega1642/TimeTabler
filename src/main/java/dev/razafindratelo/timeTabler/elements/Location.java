package dev.razafindratelo.timeTabler.elements;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;

@Data
@EqualsAndHashCode
@AllArgsConstructor
public final class Location implements Element {
    private String name;
    private List<Room> rooms;

    @Override
    public String toString() {
        return String.format("Location: [l=%s][rooms=%s]", this.name, this.rooms);
    }
}
