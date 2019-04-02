package com.vxcompany.talentlab.dthschatbotapi.controller;

import com.vxcompany.talentlab.dthschatbotapi.model.Data;
import com.vxcompany.talentlab.dthschatbotapi.repository.DataRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/dthsdata")
public class RequestController {

    private final DataRepository repo;

    public RequestController(DataRepository repo) {
        this.repo = repo;
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Data> getAllDthsData() {
        System.out.println("entered");
        Iterable<Data> allData = repo.findAll();
        System.out.println(allData);
        return allData;
    }
}
