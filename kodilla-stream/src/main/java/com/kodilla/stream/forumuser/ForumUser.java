package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate birthDay;
    private final int numberOfPublishedPosts;

    public ForumUser(final int userId, final String userName, final char sex, final LocalDate birthDay, final int numberOfPublishedPosts) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.birthDay = birthDay;
        this.numberOfPublishedPosts = numberOfPublishedPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getNumberOfPublishedPosts() {
        return numberOfPublishedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDay=" + birthDay +
                ", numberOfPublishedPosts=" + numberOfPublishedPosts +
                '}';
    }
}
