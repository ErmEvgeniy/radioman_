package netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void getCurrentStation() {
    }

    @Test
    void getMinStationNumber() {
    }

    @Test

    public void testRadioNextStation() {

        Radio radio = new Radio(7,10);

        radio.nextStation();
        assertEquals(8, radio.getStationNumber());

        radio.nextStation();
        assertEquals(9, radio.getStationNumber());

        radio.nextStation();
        assertEquals(10, radio.getStationNumber());

        //Если текущая радиостанция - 10 и клиент нажал на кнопку next (следующая) на пульте, то текущей должна стать 0-ая
        radio.nextStation();
        assertEquals(0, radio.getStationNumber());

    void getMaxStationNumber() {
    }

    @Test
    void getMinSound() {
    }

    @Test
    void getMaxSound() {
    }

    @Test
    void getCurrentSound() {
    }

    @Test
    void setCurrentStation() {
    }

    @Test
    void setCurrentSound() {
    }
}