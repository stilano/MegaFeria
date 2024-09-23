/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.libro.AudioLibro;
import java.util.ArrayList;

/**
 *
 * @author tilan
 */
public class Gerente extends Persona {
    
    private ArrayList<AudioLibro> libros;

    public Gerente(String nombre, int cedula) {
        super(nombre, cedula);
        this.libros = new ArrayList<>();
    }
    
}
