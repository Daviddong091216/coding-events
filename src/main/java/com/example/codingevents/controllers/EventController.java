package com.example.codingevents.controllers;

import com.example.codingevents.data.EventData;
import com.example.codingevents.models.Event;
import com.example.codingevents.models.EventType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("coding-events")
public class EventController {
    //coding-events
    @GetMapping
    public String displayAllEvents(Model model) {
        model.addAttribute("events", EventData.getAll());
        model.addAttribute("title", "All Events");
        return "events/index";
    }

    //coding-events/create
    @GetMapping("create")
    public String renderCreateEventForm(Model model) {
        model.addAttribute("title", "Create Events");
        model.addAttribute("event",new Event());
        model.addAttribute("types", EventType.values());
        return "events/create";
    }

    //coding-events/create
    @PostMapping("create")
    public String createEvent(@ModelAttribute @Valid Event newEvent,
                              Errors errors, Model model) {
        if(errors.hasErrors()){
            model.addAttribute("title","Create Event");
            return "events/create";
        }
        EventData.add(newEvent);
        return "redirect:";

    }

    @GetMapping("delete")
    public String renderDeleteEventForm(Model model) {
        model.addAttribute("title", "Delete Events");
        model.addAttribute("events", EventData.getAll());
        return "events/delete";
    }

    @PostMapping("delete")
    public String processDeleteEventsForm(@RequestParam(required = false) int[] eventIds) {
        if (eventIds != null) {
            for (int id : eventIds) {
                EventData.remove(id);
            }
        }
        return "redirect:";
    }


}
