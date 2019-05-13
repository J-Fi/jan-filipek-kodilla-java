package com.kodilla.testing.forum;

public class ForumComment {
    ForumPost forumpost;
    String commentBody;
    String author;

    public ForumComment(ForumPost forumpost, String commentBody, String author) {
        this.forumpost = forumpost;
        this.commentBody = commentBody;
        this.author = author;
    }

    public ForumPost getForumpost() {
        return forumpost;
    }

    public String getCommentBody() {
        return commentBody;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumComment)) return false;

        ForumComment that = (ForumComment) o;

        if (!getForumpost().equals(that.getForumpost())) return false;
        if (!getCommentBody().equals(that.getCommentBody())) return false;
        return getAuthor().equals(that.getAuthor());

    }

    @Override
    public int hashCode() {
        int result = getForumpost().hashCode();
        result = 31 * result + getCommentBody().hashCode();
        result = 31 * result + getAuthor().hashCode();
        return result;
    }
}
