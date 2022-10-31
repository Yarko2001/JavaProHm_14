package com.company.hillel.dehtiar.api;

import com.company.hillel.dehtiar.api.Observer;

public interface Publisher {

  boolean follow(Observer observer);

  boolean unfollow(Observer observer);

  <T> void notifyAllSubscribers(T message);

  <T> void notifyBestFriends(T message, Observer bestFriend);

}
