package dev.razafindratelo.timeTabler.elements;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.time.DayOfWeek;
import java.time.LocalDate;

@AllArgsConstructor
@Data
@EqualsAndHashCode
public class Day {
    private DayOfWeek dayOfWeek;
    private LocalDate date;
    private DayType dayType;


    private enum DayType {
        DAY_OFF, OPEN_DAY
    }

    @Override
    public String toString() {
        return String.format("Day: [day=%s][date=%s][type=%s]", dayOfWeek, date, dayType);
    }
}
