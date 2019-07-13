package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User jan = new Millenials("Jan Filipek");
        User adam = new YGenerations("Adam Żebro");
        User anna = new ZGenerations("Anna Kołacz");

        //When
        String janPosted = jan.sharePost("Hi! I have over 1000 likes! Thanks!");
        System.out.println("Jan has posted: " + janPosted);
        String adamPosted = adam.sharePost("I wanna twitter a bit!");
        System.out.println("Adam has posted: " + adamPosted);
        String annaPosted = anna.sharePost("I am loving chatting here!");
        System.out.println("Anna has posted: " + annaPosted);

        //Then
        Assert.assertEquals("[Facebook] Hi! I have over 1000 likes! Thanks!", janPosted);
        Assert.assertEquals("[Twitter] I wanna twitter a bit!", adamPosted);
        Assert.assertEquals("[Snapchat] I am loving chatting here!", annaPosted);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User jan = new Millenials("Jan Filipek");

        //When
        String janPosted = jan.sharePost("Here I am!");
        System.out.println("Jan posted: " + janPosted);
        jan.setSocialPublisher(new TwitterPublisher());
        String janPostedAgain = jan.sharePost("Here I am on different social media!");
        System.out.println("Jan posted: " + janPostedAgain);

        //Then
        Assert.assertEquals("[Facebook] Here I am!", janPosted);
        Assert.assertEquals("[Twitter] Here I am on different social media!", janPostedAgain);
    }
}
