package com.gmail.Poharksyi;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static com.gmail.Poharksyi.OperationSystem.WINDOWS11;

public class AppTest {

    @BeforeEach

    @Test
    void shouldReturnRightToStringFields() {
        // given

        // when
        PcSetup myPcSetup = new PcSetup(64, 8, "Firefly", "76562335-4D9A-481D-A8CA-2CF05D556F4C", WINDOWS11);
        String toStringTest = myPcSetup.toString();
        // then
        Assertions.assertTrue(toStringTest.contains("ramAmount=64"));
        Assertions.assertTrue(toStringTest.contains("coreAmount=8"));
        Assertions.assertTrue(toStringTest.contains("Firefly"));
        Assertions.assertTrue(toStringTest.contains("76562335-4D9A-481D-A8CA-2CF05D556F4C"));
        Assertions.assertTrue(toStringTest.contains("WINDOWS11"));

    }






}
