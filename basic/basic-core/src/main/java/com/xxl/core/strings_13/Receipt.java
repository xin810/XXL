
package com.xxl.core.strings_13;

import java.util.Formatter;

/**
 * %[argument_index$][flags][width][.precision]conversion
 * <br><一句话功能简述>
 * <功能详细描述>
 *
 * @author Administrator
 * @version [1.0.0, Administrator]
 */
public class Receipt
{
    private double total = 0;
    private Formatter f = new Formatter(System.out);

    public void printTitle()
    {
        f.format("%-15s %5s %10s\n", "Item", "Qty", "Price");
        f.format("%-15s %5s %10s\n", "----", "---", "-----");
    }

    public void print(String name, int qty, double price)
    {
        f.format("%-15.15s %5d %10.2f\n", name, qty, price);
        total += price*qty;
    }

    public void printTotal()
    {
        f.format("%-15s %5s %10.2f\n", "Tax", "", total*0.06);
        f.format("%-15s %5s %10s\n", "", "", "-----");
        f.format("%-15s %5s %10.2f\n", "Total", "", total*1.06);
    }

    public static void main(String[] args)
    {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears porridgw", 1, 14.29);
        receipt.printTotal();
    }
}

