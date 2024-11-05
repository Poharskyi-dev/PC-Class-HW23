package com.gmail.Poharksyi;

import java.util.Objects;

public class PcSetup {
    private int ramAmount;
    private int coreAmount;
    private String name;
    private String uuid;
    private OperationSystem operationSystem;

    public PcSetup(int ramAmount, int coreAmount, String name, String uuid, OperationSystem operationSystem) {
        this.ramAmount = ramAmount;
        this.coreAmount = coreAmount;
        this.name = name;
        this.uuid = uuid;
        this.operationSystem = operationSystem;
    }

    public PcSetup () {
        System.out.println("PC Created");
    }

    public void setRamAmount(int ramAmount) {
        this.ramAmount = ramAmount;
    }

    public void setCoreAmount(int coreAmount) {
        this.coreAmount = coreAmount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setOperationSystem(OperationSystem operationSystem) {
        this.operationSystem = operationSystem;
    }

    public int getRamAmount() {
        return ramAmount;
    }

    public int getCoreAmount() {
        return coreAmount;
    }

    public String getName() {
        return name;
    }

    public String getUuid() {
        return uuid;
    }

    public OperationSystem getOperationSystem() {
        return operationSystem;
    }

    @Override
    public String toString() {
        return "PcSetup{" +
                "ramAmount=" + ramAmount +
                ", coreAmount=" + coreAmount +
                ", name='" + name + '\'' +
                ", uuid='" + uuid + '\'' +
                ", operationSystem=" + operationSystem +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PcSetup)) return false;
        PcSetup pcSetup = (PcSetup) o;
        return ramAmount == pcSetup.ramAmount && coreAmount == pcSetup.coreAmount && Objects.equals(name, pcSetup.name) && Objects.equals(uuid, pcSetup.uuid) && operationSystem == pcSetup.operationSystem;
    }

    public boolean equalsJustRam(Object o) {
        if (this == o) return true;
        if (!(o instanceof PcSetup)) return false;
        PcSetup pcSetup = (PcSetup) o;
        return ramAmount == pcSetup.ramAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ramAmount, coreAmount, name, uuid, operationSystem);
    }
}
