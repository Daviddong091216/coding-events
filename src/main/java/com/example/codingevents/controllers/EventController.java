package com.example.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping("events")

public class EventController {

    //    @GetMapping
    @GetMapping("events")
    public String displayAllEvents(Model model) {
        List<String> events = new ArrayList<>();
        events.add("Code with pride");
        events.add("Strange loop");
        events.add("Apple WWDC");
        events.add("SpringOne platform");
        model.addAttribute("events", events);
        return "events/index";

    }


}