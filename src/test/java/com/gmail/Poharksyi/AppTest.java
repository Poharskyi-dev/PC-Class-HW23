package com.gmail.Poharksyi;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static com.gmail.Poharksyi.OperationSystem.WINDOWS11;

public class AppTest {

    @BeforeEach
    void setUp() {

//            PcSetup myPcSetup = new PcSetup(64, 8, "Firefly", "76562335-4D9A-481D-A8CA-2CF05D556F4C", WINDOWS11);
//            System.out.println(myPcSetup.toString());
    }

    @Test
    void shouldReturnRightToStringFields() {
        // given
        PcSetup myPcSetup = new PcSetup(64, 8, "Firefly", "76562335-4D9A-481D-A8CA-2CF05D556F4C", WINDOWS11);
        String toStringTest = myPcSetup.toString();
        // when

        // then
        Assertions.assertTrue(toStringTest.contains("ramAmount=64"), "toString() have no 'ramAmount=64'.");
        Assertions.assertTrue(toStringTest.contains("coreAmount=8"), "toString() have no 'coreAmount=8'.");
        Assertions.assertTrue(toStringTest.contains("Firefly"), "toString() нhave no 'Firefly'.");
        Assertions.assertTrue(toStringTest.contains("76562335-4D9A-481D-A8CA-2CF05D556F4C"), "toString() have no '76562335-4D9A-481D-A8CA-2CF05D556F4C'.");
        Assertions.assertTrue(toStringTest.contains("WINDOWS11"), "toString() have no 'WINDOWS11'.");

    }






}
