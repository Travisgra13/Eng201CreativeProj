package com.code.deity;

public class DataStorage {
    private int enumaElish;
    private int worksAndDays;
    private int genesis;
    private int populVuh;

    public DataStorage() {
        enumaElish = 0;
        worksAndDays = 0;
        genesis = 0;
        populVuh = 0;
    }

    public void increment(boolean incrementEnuma, boolean incrementWorks, boolean incrementGenesis, boolean incrementPopul) {
        if (incrementEnuma) {
            enumaElish++;
        }
        if (incrementWorks) {
            worksAndDays++;
        }
        if (incrementGenesis) {
            genesis++;
        }
        if (incrementPopul) {
            populVuh++;
        }
    }

    public int getEnumaElish() {
        return enumaElish;
    }

    public void setEnumaElish(int enumaElish) {
        this.enumaElish = enumaElish;
    }

    public int getWorksAndDays() {
        return worksAndDays;
    }

    public void setWorksAndDays(int worksAndDays) {
        this.worksAndDays = worksAndDays;
    }

    public int getGenesis() {
        return genesis;
    }

    public void setGenesis(int genesis) {
        this.genesis = genesis;
    }

    public int getPopulVuh() {
        return populVuh;
    }

    public void setPopulVuh(int populVuh) {
        this.populVuh = populVuh;
    }
}
