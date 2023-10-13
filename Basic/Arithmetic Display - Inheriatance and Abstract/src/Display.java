/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adrayan
 */
public class Display implements Arithmetic{
    
     @Override
    public void add(int x, int y) {
        x = 1;
        y = 3;
        System.out.println("add(" + x + "," + y + ")");
    }

    @Override
    public void add(int x, int y, int z, int p) {
        x = 1;
        y = 3;
        z = 4;
        p = 5;
        System.out.println("add(" + x + "," + y + "," + z + ")");
    }

    @Override
    public void subtract(int x, int y) {
        x = 3;
        y = 1;
        System.out.println("subtract(" + x + "," + y + ")");
    }

    @Override
    public void multiply(int x, int y) {
        x = 1;
        y = 1;
        System.out.println("multiply(" + x + "," + y + ")");
    }

    @Override
    public void multiply(int x, int y, int z) {
        x = 2;
        y = 3;
        z = 4;
        System.out.println("multiply(" + x + "," + y + "," + z + ")");
    }

    @Override
    public void divide(int x, int y) {
        x = 5;
        y = 2;
        System.out.println("divide(" + x + "," + y + ")");
    }
  
    
    
}
