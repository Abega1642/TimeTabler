package dev.razafindratelo.timeTabler.elements;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Session {
    private CourseMap courseMap;
    private Slot slot;
    private Room room;
    private Day day;
    private boolean validated;

    @Override
    public String toString() {
        return String.format(
                "Session : {%s}{%s}{slot=%s}{%s}{%s}",
                courseMap,
                day,
                slot,
                room,
                this.validated ? "validated" : "invalid"
        );
    }
}
