package com.bridgelabz.generics;
import com.generics.MaximumNumberProblem;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumNumberProblemTest {
    MaximumNumberProblem maximumNumberProblemObj;

    @Before
    public void setUp() {
        maximumNumberProblemObj = new MaximumNumberProblem();
    }

    @Test
    public void givenIntegerMaxNumber_WhenAtFirstPosition_ShouldReturnSameNumber() {
        Assert.assertSame(50, maximumNumberProblemObj.findMaximumNumber(50, 20, 30));
    }

    @Test
    public void givenIntegerMaxNumber_WhenAtSecondPosition_ShouldReturnSameNumber() {
        Assert.assertSame(50, maximumNumberProblemObj.findMaximumNumber(5, 50, 30));
    }

    @Test
    public void givenIntegerMaxNumber_WhenAtThirdPosition_ShouldReturnSameNumber() {
        Assert.assertSame(30, maximumNumberProblemObj.findMaximumNumber(10, 20, 30));
    }
    @Test
    public void givenFloatMaxNumber_WhenAtFirstPosition_ShouldReturnSameNumber() {
        Assert.assertEquals(50.2f,maximumNumberProblemObj.findMaximumNumber(50.2f,20.2f,30.2f),0.0f);
    }
    @Test
    public void givenFloatMaxNumber_WhenAtSecondPosition_ShouldReturnSameNumber() {
        Assert.assertEquals(50.2f,maximumNumberProblemObj.findMaximumNumber(5.2f,50.2f,30.2f),0.0f);
    }
    @Test
    public void givenFloatMaxNumber_WhenAtThirdPosition_ShouldReturnSameNumber() {
        Assert.assertEquals(30.2f,maximumNumberProblemObj.findMaximumNumber(10.2f,20.2f,30.2f),0.0f);
    }
    @Test
    public void givenStringValue_WhenAtFirstPosition_ShouldReturnMaxStringValue() {
        Assert.assertEquals("xyz", maximumNumberProblemObj.findMaximumNumber("xyz", "sam", "abc"));
    }

    @Test
    public void givenStringValue_WhenAtSecondPosition_ShouldReturnMaxStringValue() {
        Assert.assertEquals("xyz", maximumNumberProblemObj.findMaximumNumber("abc", "xyz", "sam"));
    }

    @Test
    public void givenStringValue_WhenAtThirdPosition_ShouldReturnMaxStringValue() {
        Assert.assertEquals("xyz", maximumNumberProblemObj.findMaximumNumber("abc", "sam", "xyz"));
    }
}
