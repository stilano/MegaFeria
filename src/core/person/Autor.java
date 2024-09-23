/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.libro.Libro;
import java.util.ArrayList;

/**
 *
 * @author tilan
 */
public class Autor extends Persona {

    private ArrayList<Libro> libros;

    public Autor(String nombre, int cedula) {
        super(nombre, cedula);
        this.libros = new ArrayList<>();
    }
}