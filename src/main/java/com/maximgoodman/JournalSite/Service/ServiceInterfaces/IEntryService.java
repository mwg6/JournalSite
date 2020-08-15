package com.maximgoodman.JournalSite.Service.ServiceInterfaces;

import com.maximgoodman.JournalSite.Model.EntryModel;

import java.util.List;
import java.util.Optional;

public interface IEntryService {

    List<EntryModel> findAll();
}
