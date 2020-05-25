package com.example.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("coding-events")
public class EventController {

    @GetMapping
    public String displayAllEvents(Model model) {
        List<String> eventsList = new ArrayList<>();
        eventsList.add("Code with pride");
        eventsList.add("Strange loop");
        eventsList.add("Apple WWDC");
        eventsList.add("SpringOne platform");
        model.addAttribute("events", eventsList);
        return "events/index";
    }


}
