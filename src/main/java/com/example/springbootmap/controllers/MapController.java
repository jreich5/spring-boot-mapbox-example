package com.example.springbootmap.controllers;

import com.example.springbootmap.models.Thing;
import com.example.springbootmap.repositories.ThingRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MapController {

    private final ThingRepository thingDao;

    public MapController(ThingRepository thingDao) {
        this.thingDao = thingDao;
    }

    @GetMapping("/map")
    public String showMap() {
        return "things";
    }

    @GetMapping("/api/things")
    @ResponseBody
    public List<Thing> getThings() {
        return thingDao.findAll();
    }

}
