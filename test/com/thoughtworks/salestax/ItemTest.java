package com.thoughtworks.salestax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    @Test
    public void shouldReturnNetAmountSameAsBaseAmountGivenItemIsExemptedAndNotImported() {
        Item item = new Item("book", 12.49, true, false);

        assertEquals(12.49, item.netAmount(), 0.0001);
    }

    @Test
    public void shouldReturnNetAmountSameAsTenPercentOfBaseAmountGivenItemIsNotExemptedAndNotImported() {
        Item item = new Item("chocolate", 12.49, false, false);

        assertEquals(12.49 + (10 * 12.49 / 100), item.netAmount(), 0.0001);
    }
}
