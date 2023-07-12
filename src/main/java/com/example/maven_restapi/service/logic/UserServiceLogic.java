package com.example.maven_restapi.service.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.maven_restapi.entity.User;
import com.example.maven_restapi.service.UserService;
import com.example.maven_restapi.store.UserStore;

import lombok.RequiredArgsConstructor;

// 3. Lombok 주입
// RequiredArgsConstructor Annotation 이용
// userStore 가 final 이므로 반드시 초기화해야 함

@Service
@RequiredArgsConstructor
public class UserServiceLogic implements UserService {

  // 3. Lombok 주입
  // 이 형태의 Field 만 있어도 자동으로 주입이 됨 (final)
  private final UserStore userStore;

  // 1. AutoWired Annotation 으로 지정 시, UserStore 의 구현 Class 찾음
  // userStore Logic 이 오직 하나이므로, 하나의 Class 가 주입이 될거임
  // @Autowired 
  // private UserStore userStore; // Spring Bean 으로 등록이 되어 DI 를 통해 주입됨

  // 2. 생성자 주입
  // Class 가 생성될 때, 생성자를 통해 UserStore 라는 Interface 구현할 구현체가 주입됨
  // 따로 Autowired 를 지정해주지 않아도 Bean 객체가 생성됨

  // 3. Lombok 주입
  // 위에 이어 하단과 같이 생성자가 추가가 됨
  // public UserServiceLogic(UserStore userStore) {
  //   this.userStore = userStore;
  // }
  

  @Override
  public String register(User newUser) {
    return this.userStore.create(newUser);
  }

  @Override
  public void modify(User newUser) {
    this.userStore.update(newUser);
  }

  @Override
  public void remove(String id) {
    this.userStore.delete(id);
  }

  @Override
  public User find(String id) {
    return this.userStore.retrieve(id);
  }

  @Override
  public List<User> findAll() {
    return this.userStore.retrieveAll();
  }
  
}
