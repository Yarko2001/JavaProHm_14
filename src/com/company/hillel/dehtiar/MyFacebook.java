package com.company.hillel.dehtiar;

import com.company.hillel.dehtiar.entity.Photo;
import com.company.hillel.dehtiar.entity.Post;
import com.company.hillel.dehtiar.entity.Video;
import com.company.hillel.dehtiar.entity.users.BestFriend;
import com.company.hillel.dehtiar.entity.users.Follower;
import com.company.hillel.dehtiar.entity.users.Writer;

public class MyFacebook {

  public static <Picture> void main(String[] args) {
    Writer tomasShelbi = new Writer("@TomShelbi");
    Writer maxTruhovskiy = new Writer("@max_true");

    tomasShelbi.follow(new Follower("@Sensei",21));
    tomasShelbi.follow(new Follower("@TrepleX",33));
    tomasShelbi.follow(new BestFriend("@Helix",24));

    tomasShelbi.post("It was an amazing week !!!");

    Post video = new Video("Sunshine",1024L);
    Post photo = new Photo("Apple",230L);
    tomasShelbi.load(video);
    tomasShelbi.load(photo);
    tomasShelbi.post(video);
    tomasShelbi.post(photo);

    maxTruhovskiy.follow(new Follower("@Drax",43));
    maxTruhovskiy.follow(tomasShelbi);
    maxTruhovskiy.post("Hey,how are doing there?",tomasShelbi);

  }
}
