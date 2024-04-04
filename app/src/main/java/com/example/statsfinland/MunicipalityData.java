package com.example.statsfinland;

public class MunicipalityData {
    private static MunicipalityData instance;
    private String municipalityName;

    private MunicipalityData() {

    }

    public static MunicipalityData getInstance() {
        if (instance == null) {
            instance = new MunicipalityData();
        }
        return instance;
    }

    public String getMunicipalityName() {
        return municipalityName;
    }

    public void setMunicipalityName(String municipalityName) {
        this.municipalityName = municipalityName;
    }

}
