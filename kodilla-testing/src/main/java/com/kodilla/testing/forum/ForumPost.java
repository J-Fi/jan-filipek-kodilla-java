package com.kodilla.testing.forum;

public class ForumPost {
    String postBody;
    String author;
    private static int objCounter = 0;

    public ForumPost(String postBody, String author) {
        this.postBody = postBody;
        this.author = author;
        this.objCounter++;
    }

    public String getPostBody() {
        return postBody;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumPost)) return false;

        ForumPost forumPost = (ForumPost) o;

        if (!getPostBody().equals(forumPost.getPostBody())) return false;
        return getAuthor().equals(forumPost.getAuthor());

    }

    public void getObjQty () {
        System.out.println("Liczba obiektów: " + objCounter);
    }

    @Override
    public int hashCode() {
        int result = getPostBody().hashCode();
        result = 31 * result + getAuthor().hashCode();
        return result;
    }
}

class Application {
    public static void main(String[] args) {
        ForumPost fp = new ForumPost("Aaaaa", "Jan Filipek");
        ForumPost fp1 = new ForumPost("Bbbbb", "Jana Filipek");
        fp1.getObjQty();
        System.out.println(ForumPost.class);
    }
}
