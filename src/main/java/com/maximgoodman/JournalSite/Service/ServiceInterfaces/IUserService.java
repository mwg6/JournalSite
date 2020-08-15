package com.maximgoodman.JournalSite.Service.ServiceInterfaces;

import com.maximgoodman.JournalSite.Model.UserModel;

import java.util.List;

public interface IUserService {

    List<UserModel> findAll();
}
