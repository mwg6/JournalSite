package com.maximgoodman.JournalSite.Model.Repositories;

import com.maximgoodman.JournalSite.Model.EntryModel;
import org.springframework.data.repository.CrudRepository;

public interface EntryRepository extends CrudRepository<EntryModel, Integer> {
}
