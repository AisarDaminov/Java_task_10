import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.statistic.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void shouldSwitchRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        int excepted = 5;
        int actual = radio.getCurrentRadioStation();

        assertEquals(excepted, actual);
    }

    @Test
    public void shouldSwitchToNextRadioStation() {
        Radio radio = new Radio();

        radio.nextStation();

        int excepted = 1;
        int actual = radio.getCurrentRadioStation();

        assertEquals(excepted, actual);
    }

    @Test
    public void shouldSwitchToZeroStationFromNine() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.nextStation();

        int excepted = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(excepted, actual);
    }

    @Test
    public void shouldSwitchToPreviousRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);
        radio.previousStation();

        int excepted = 4;
        int actual = radio.getCurrentRadioStation();

        assertEquals(excepted, actual);
    }

    @Test
    public void shouldSwitchFromZeroStationToNine() {
        Radio radio = new Radio();

        radio.previousStation();

        int excepted = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(excepted, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        Radio radio = new Radio();

        radio.increaseVolume();

        int excepted = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(excepted, actual);
    }

    @Test
    public void shouldDoNothingWithMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int excepted = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(excepted, actual);
    }

    @Test
    void shouldSetCurrentVolumeWithinRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeIfAboveZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void shouldNotDecreaseVolumeIfAtZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldSetVolumeIfInRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    void shouldNotSetVolumeIfOutOfRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(150);
        assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(-10);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldNotSetStationIfOutOfRange() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        assertEquals(0, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(-1);
        assertEquals(0, radio.getCurrentRadioStation());
    }

}
