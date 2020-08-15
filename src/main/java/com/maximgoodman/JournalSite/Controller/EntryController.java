package com.maximgoodman.JournalSite.Controller;

import com.maximgoodman.JournalSite.Model.EntryModel;
import com.maximgoodman.JournalSite.Service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/home")
public class EntryController {
    @Autowired
    private EntryService entryService;

    @GetMapping("/{id}")
    public List<EntryModel> getEntriesForUser(@PathVariable("id") int id){
        return entryService.findByOwnerId(id);
    }

}
