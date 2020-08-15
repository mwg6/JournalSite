package com.maximgoodman.JournalSite.Service;

import com.maximgoodman.JournalSite.Model.Repositories.UserRepository;
import com.maximgoodman.JournalSite.Model.UserModel;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import java.util.List;

@Component
public class UserService implements  IUserService{
    @Autowired
    private UserRepository userRepository;


    @Override
    public List<UserModel> findAll() {
        return (List<UserModel>) userRepository.findAll();
    }

    public void addUser(UserModel um){
        userRepository.save(um);
    }
}
