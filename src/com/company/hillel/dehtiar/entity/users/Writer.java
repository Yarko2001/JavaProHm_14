package com.company.hillel.dehtiar.entity.users;

import com.company.hillel.dehtiar.api.Observer;
import com.company.hillel.dehtiar.api.Publisher;
import com.company.hillel.dehtiar.entity.Load;
import com.company.hillel.dehtiar.entity.Post;
import com.company.hillel.dehtiar.entity.Update;
import java.util.ArrayList;
import java.util.List;

public class Writer implements Observer, Publisher {

  private final String name;
  private final List<Observer> followers = new ArrayList<>();
  private final Load<Post> posts = new Load<>();

  public Writer(String name) {
    this.name = name;
  }

  public <T> void post(T post) {
    printPost(post);
  }

  public <T> void post(T post, Observer follower) {
    printPost(post);
    notifyBestFriends(post, follower);
  }

  private <T> void printPost(T post) {
    String message = "\n<--- " + name + " has posted : " + " \" " + post + " \" " + "\n";
    System.out.println(message);
  }

  public void load(Post post) {
    posts.add(post);
    loadMessage(post);
  }

  private void loadMessage(Post post) {
    String message = "..." + name + " is loading : " + post;
    System.out.println(message);
  }

  @Override
  public <T> void update(String name, T update) {
    String message = "---> " + this.name + " has received " + name + " post : " + update;
    System.out.println(message);
  }

  @Override
  public boolean follow(Observer observer) {
    return followers.add(observer);
  }

  @Override
  public boolean unfollow(Observer observer) {
    return followers.remove(observer);
  }

  @Override
  public <T> void notifyAllSubscribers(T message) {
    for (Observer follower : followers) {
      follower.update(name, new Update<>(message));
    }
  }

  @Override
  public <T> void notifyBestFriends(T message, Observer bestFriend) {
    bestFriend.update(name, new Update<>(message));
  }

  public String getName() {
    return name;
  }

  public List<Observer> getFollowers() {
    return followers;
  }


}
