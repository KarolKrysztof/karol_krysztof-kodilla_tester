package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));
        warehouse.addOrder(new Order("4"));
        try {
            Order order = warehouse.getOrder("19");
            System.out.println("Order number: " + order.getNumber() + " is in the Warehouse");
        } catch (OrderDoesntExistException e) {
            System.out.println("There is no such order in the Warehouse" + e.getMissingNumber());
        } finally {
            System.out.println("Thank you for your enquiry");
        }
    }
}
