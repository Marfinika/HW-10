package org.example;

public class Radio {
    private int currentNumber;
    private int currentVolume;
    private final int minNum = 0;
    private final int maxNum = 9;
    private final int minVol = 0;
    private final int maxVol = 10;

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int newCurrentNumber) { // указываем границы диапазона
        if (newCurrentNumber < minNum) {
            return;
        }
        if (newCurrentNumber > maxNum) {
            return;
        }
        currentNumber = newCurrentNumber;
    }

    public void nextNumber() {
        if (currentNumber < maxNum) {
            currentNumber = currentNumber + 1;
        } else {
            currentNumber = minNum; // переход счетчика после 9 на 0
        }
    }

    public void prevNumber() {
        if (currentNumber > minNum) {
            currentNumber = currentNumber - 1;
        } else {
            currentNumber = maxNum; // переход счетчика после 0 на 9
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) { // указываем границы диапазона
        if (newCurrentVolume < minVol) {
            newCurrentVolume = minVol;
        }
        if (newCurrentVolume > maxVol) {
            newCurrentVolume = maxVol;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVol) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVol) {
            currentVolume = currentVolume - 1;
        }
    }
}
