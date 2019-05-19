package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();
    public Forum() {
        forumUserList.add(new ForumUser(1, "Jan Filipek", 'M', LocalDate.of(1973,7, 21), 0));
        forumUserList.add(new ForumUser(2, "Karol Tetry", 'M', LocalDate.of(1974,6, 22), 2));
        forumUserList.add(new ForumUser(3, "Maria Zesio", 'F', LocalDate.of(1975,5, 23), 1));
        forumUserList.add(new ForumUser(4, "Karol Poterko", 'M', LocalDate.of(2014,4,24), 0));
        forumUserList.add(new ForumUser(5, "Jolanta Dzierży", 'F', LocalDate.of(1977,3, 25), 0));
        forumUserList.add(new ForumUser(6, "Kuba Rozpruwacz", 'M', LocalDate.of(1978,2, 26), 6));
        forumUserList.add(new ForumUser(7, "Patrycjusz Pindelski", 'M', LocalDate.of(2010,1, 27), 9));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}
