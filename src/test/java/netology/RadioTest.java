package netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void testRadio() {
        Radio radio = new Radio();

        //увеличиваем громкость

        radio.increaseSound();
        assertEquals(7, radio.getCurrentSound());

        radio.increaseSound();
        assertEquals(8, radio.getCurrentSound());

        radio.increaseSound();
        assertEquals(9, radio.getCurrentSound());

        radio.increaseSound();
        assertEquals(10, radio.getCurrentSound());

        //дальнейшее нажатие ни к чему не привдит, значение остается прежним
        radio.increaseSound();
        assertEquals(10, radio.getCurrentSound());


        //уменьшаем громкость
        radio.decreaseSound();
        assertEquals(9, radio.getCurrentSound());

        radio.decreaseSound();
        assertEquals(8, radio.getCurrentSound());

        radio.decreaseSound();
        assertEquals(7, radio.getCurrentSound());

        radio.decreaseSound();
        assertEquals(6, radio.getCurrentSound());

        radio.decreaseSound();
        assertEquals(5, radio.getCurrentSound());

        radio.decreaseSound();
        assertEquals(4, radio.getCurrentSound());

        radio.decreaseSound();
        assertEquals(3, radio.getCurrentSound());

        radio.decreaseSound();
        assertEquals(2, radio.getCurrentSound());

        radio.decreaseSound();
        assertEquals(1, radio.getCurrentSound());

        radio.decreaseSound();
        assertEquals(0, radio.getCurrentSound());

        //дальнейшее нажатие ни к чему не привдит, значение остается прежним
        radio.decreaseSound();
        assertEquals(0, radio.getCurrentSound());


        //переключаем радиостанцию на следующую

        radio.nextStation();
        assertEquals(7, radio.getStationNumber());

        radio.nextStation();
        assertEquals(8, radio.getStationNumber());

        radio.nextStation();
        assertEquals(9, radio.getStationNumber());

        //Если текущая радиостанция - 9 и клиент нажал на кнопку next (следующая) на пульте, то текущей должна стать 0-ая
        radio.nextStation();
        assertEquals(0, radio.getStationNumber());


        //переключаем радиостанцию на предыдущую
        radio.prevStation();
        assertEquals(9, radio.getStationNumber());

        radio.prevStation();
        assertEquals(8, radio.getStationNumber());

        radio.prevStation();
        assertEquals(7, radio.getStationNumber());

        radio.prevStation();
        assertEquals(6, radio.getStationNumber());


        // выставляем станцию с цифрового пульта

        radio.setStation(3);

    }
}