package ru.netology.statistic;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation >= 0 && currentRadioStation <= 9) {
            this.currentRadioStation = currentRadioStation;
        } else return;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void nextStation() {
        if (currentRadioStation == 9) {
            setCurrentRadioStation(0);
        } else {
            currentRadioStation++;
        }
    }

    public void previousStation() {
        if (currentRadioStation == 0) {
            setCurrentRadioStation(9);
        } else {
            currentRadioStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 0 && currentVolume <= 100) {
            this.currentVolume = currentVolume;
        } else return;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
