package com.example.projectshoes.dao;


import com.example.projectshoes.model.UserModel;

public interface IUserDAO extends GenericDAO<UserModel> {

  UserModel findById(Long id);

  UserModel findByUsernameAndPassword(String username, String password);

  UserModel findByUserName(String username);

  UserModel findByEmail(String email);

  Long save(UserModel userModel);

  void update(UserModel userModel);

}
