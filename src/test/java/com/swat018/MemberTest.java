package com.swat018;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {

    @Test
    public void gettterSetter() {
        Member member = new Member();
        member.setName("jinwoo");

        Assert.assertEquals(member.getName(), "jinwoo");
    }
}