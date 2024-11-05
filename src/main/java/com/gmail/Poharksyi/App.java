package com.gmail.Poharksyi;

import static com.gmail.Poharksyi.OperationSystem.WINDOWS11;

public class App
{
    public static void main( String[] args )
    {
        PcSetup myPcSetup = new PcSetup(64, 8, "Firefly", "76562335-4D9A-481D-A8CA-2CF05D556F4C", WINDOWS11);

        System.out.println(myPcSetup.toString());
    }
}
