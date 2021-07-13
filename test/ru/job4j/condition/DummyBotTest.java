package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class DummyBotTest  {

    @Test
    public void whenGreetBot() {
        String expected = "Привет, умник.";
        String in = "Привет, Бот.";
        String out = DummyBot.answer(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenByeBot() {
        String expected = "До скорой встречи.";
        String in = "Пока.";
        String out = DummyBot.answer(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenUnknownBot() {
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        String in = "Привет";
        String out = DummyBot.answer(in);
        Assert.assertEquals(expected, out);
    }

}