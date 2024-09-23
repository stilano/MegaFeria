/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.megaferia;

import java.util.ArrayList;

/**
 *
 * @author tilan
 */
public class Stand {
    
    private int id;
    private double precio;
    private ArrayList<Editorial> editoriales;

    public Stand(int id, double precio) {
        this.id = id;
        this.precio = precio;
        this.editoriales = new ArrayList<>();
    }
}
