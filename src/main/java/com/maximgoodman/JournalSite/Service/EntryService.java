package com.maximgoodman.JournalSite.Service;

import com.maximgoodman.JournalSite.Model.EntryModel;
import com.maximgoodman.JournalSite.Model.Repositories.EntryRepository;
import com.maximgoodman.JournalSite.Service.ServiceInterfaces.IEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EntryService implements IEntryService {
    @Autowired
    private EntryRepository entryRepository;

    @Override
    public List<EntryModel> findAll() {
        return (List<EntryModel>) entryRepository.findAll();
    }

    public List<EntryModel> findByOwnerId(int id) {
        return findAll().stream()
                .filter(e -> e.getOwner_id() == id)
                .collect(Collectors.toList());
    }


}
