package com.gmail.Poharksyi;

import static com.gmail.Poharksyi.OperationSystem.*;

public class App
{
    public static void main( String[] args )
    {
        PcSetup myPcSetup = new PcSetup(64, 8, "Firefly", "76562335-4D9A-481D-A8CA-2CF05D556F4C", WINDOWS11);
        PcSetup liohaPcSetup = new PcSetup(32, 8, "LiohaPC", "76562335-4D9A-481D-A8CA-2CF05KJHSSd", MACOS);
        PcSetup myPcSetupClone = new PcSetup(64, 8, "Firefly", "76562335-4D9A-481D-A8CA-2CFSDAW56F4C", WINDOWS11);
        PcSetup valeriaPcSetup = new PcSetup(64, 4, "LiohaPC", "76562335-4D9A-481D-A8CA-2CFASDWFEA", DEBIAN);

        System.out.println(myPcSetup.equals(liohaPcSetup));
        System.out.println(myPcSetup.equals(myPcSetup));
        System.out.println(myPcSetup.hashCode() == liohaPcSetup.hashCode());
        System.out.println(myPcSetup.hashCode() == myPcSetup.hashCode());

        System.out.println();

        System.out.println(myPcSetup.hashCode() == myPcSetupClone.hashCode());
        System.out.println(myPcSetup.equals(myPcSetupClone));

        System.out.println();

        System.out.println(myPcSetup.equalsJustRam(valeriaPcSetup));

        System.out.println();

        System.out.println(myPcSetup.toString());
    }
}
