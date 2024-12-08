package dev.razafindratelo.timeTabler.constraints;


import dev.razafindratelo.timeTabler.elements.CourseMap;
import dev.razafindratelo.timeTabler.elements.Room;
import dev.razafindratelo.timeTabler.sets.CM;
import dev.razafindratelo.timeTabler.sets.R;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Data
public class SuitableRoom extends Constraint {
    private CM courseMap;
    private R rooms;

    public Map<CourseMap, List<Room>> suitableRooms(CourseMap cm) {
        var suitableRooms = rooms.getRooms().stream()
                .filter(r -> r.getCapacity() >= cm.getGroup().getGroupSize())
                .toList();

        return Map.of(cm, suitableRooms);
    }

    public List<Map<CourseMap, List<Room>>> solve() {
        List<Map<CourseMap, List<Room>>> suitableRooms = new ArrayList<>();

        for(CourseMap cm : courseMap.getCourseMaps()) {
            suitableRooms.add(suitableRooms(cm));
        }
        return suitableRooms;
    }

}
