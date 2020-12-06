package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class WarehouseTestSuite {

    @Test
    public void isGetOrderReturnCorrectNumber() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        Order order1 = new Order("1");
        warehouse.addOrder(order1);
        // when
        Order order = warehouse.getOrder("1");
        // then
        assertEquals("1", order.getNumber());

    }

    @Test(expected = OrderDoesntExistException.class)
    public void isGetOrderReturnException() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        // when
        Order order = warehouse.getOrder("5");
        // then

    }

}
