package com.maximgoodman.JournalSite.Model.Repositories;

import com.maximgoodman.JournalSite.Model.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Integer> {

}
