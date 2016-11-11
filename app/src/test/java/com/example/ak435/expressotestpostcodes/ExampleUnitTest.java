package com.example.ak435.expressotestpostcodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


    @Test
    public void emailValidator_CorrectEmailSimple_ReturnsTrue() throws Exception  {
        assertTrue (myUnit.validPostcode("BN1 9PE"));
    }






}