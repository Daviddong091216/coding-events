package com.example.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("coding-events")
public class EventController {
    private static List<String> eventsList = new ArrayList<>();

    @GetMapping
    public String displayAllEvents(Model model) {
//        eventsList.add("Code with pride");
//        eventsList.add("Strange loop");
//        eventsList.add("Apple WWDC");
//        eventsList.add("SpringOne platform");
        model.addAttribute("events", eventsList);
        return "events/index";
    }

    //coding-events/create
    @GetMapping("create")
    public String renderCreateEventForm(){
        return "events/create";
    }

    //coding-events/create
    @PostMapping("create")
    public String createEvent(@RequestParam String eventName,Model model){
        eventsList.add(eventName);
        model.addAttribute("events",eventsList);
        return "events/index";//it is easy to understand, we do not use displayAllEvents method.
//        return "redirect:";

    }


}
