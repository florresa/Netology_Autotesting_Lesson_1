package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

        @Test
        public void testRemainIfAmountIs999() {
            CashbackHackService service = new CashbackHackService();
            int expected = 1;
            int actual = service.remain(999);
            Assert.assertEquals(actual, expected);
        }

        @Test
        public void testRemainIfAmountIs1001() {
            CashbackHackService service = new CashbackHackService();
            int expected = 999;
            int actual = service.remain(1001);
            Assert.assertEquals(actual, expected);
        }

        @Test
        public void testRemainIfAmountIs500() {
            CashbackHackService service = new CashbackHackService();
            int expected = 500;
            int actual = service.remain(500);
            Assert.assertEquals(actual, expected);
        }

        @Test
        public void testRemainIfAmountIs3850() {
            CashbackHackService service = new CashbackHackService();
            int expected = 150;
            int actual = service.remain(3850);
            Assert.assertEquals(actual, expected);
        }

        @Test
        public void testRemainIfAmountIs1000() {
            CashbackHackService service = new CashbackHackService();
            int expected = 0;
            int actual = service.remain(1000);
            Assert.assertEquals(actual, expected);
        }
    }
