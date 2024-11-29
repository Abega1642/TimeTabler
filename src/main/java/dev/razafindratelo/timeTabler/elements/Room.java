package dev.razafindratelo.timeTabler.elements;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@AllArgsConstructor
public final class Room implements Element {
    private String name;
    private int capacity;

    @Override
    public String toString() {
        return String.format("Room: [r=%s][capacity=%d]", this.name, this.capacity);
    }
}
