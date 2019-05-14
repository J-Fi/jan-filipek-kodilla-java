package com.kodilla.testing.forum.statistics;

public class StatisticsCollector {
    int usersNumber;
    int postsNumber;
    int commentsNumber;
    double postsPerUser;
    double commentsPerUser;
    double commentsPerPost;

    public boolean calculateAdvStatistics(Statistics statistics) {
        usersNumber = statistics.userNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();
        if (usersNumber != 0) {
            postsPerUser = postsNumber / usersNumber;
            commentsPerUser = commentsNumber / usersNumber;
        } else {
            return false;
        }
        if (postsNumber != 0) {
            commentsPerPost = commentsNumber / postsNumber;
        } else {
            return false;
        }
        return true;
    }

    public void showStatistics() {
        System.out.println("Number of users: " + usersNumber);
        System.out.println("Number of posts: " + postsNumber);
        System.out.println("Number of comments: " + commentsNumber);
        System.out.println("Number of posts per user: " + postsPerUser);
        System.out.println("Number of comments per user: " + commentsPerUser);
        System.out.println("Number of comments per post: " + commentsPerPost);
    }
}
