package com.example.codingevents.data;

import com.example.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {
    private static final Map<Integer, Event> eventsList = new HashMap<>();

    public static Collection<Event> getAll() {
        return eventsList.values();
    }

    public static void add(Event event) {
        eventsList.put(event.getId(), event);
    }

    public static Event getById(int id) {
        return eventsList.get(id);
    }

    public static void remove(int id) {
        if (eventsList.containsKey(id)) {
            eventsList.remove(id);
        }
    }


}
