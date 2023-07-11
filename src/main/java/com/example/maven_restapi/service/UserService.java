package com.example.maven_restapi.service;

import java.util.List;

import com.example.maven_restapi.entity.User;

public interface UserService {
  String register(User newUser);
  void modify(User newUser);
  void remove(String id);

  User find(String id);
  List<User> findAll();
}
