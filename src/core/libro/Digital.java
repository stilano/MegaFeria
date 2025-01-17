/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.libro;

import core.megaferia.Editorial;
import core.person.Autor;
import java.util.ArrayList;

/**
 *
 * @author tilan
 */
public class Digital extends Libro {
    
    private boolean hasHipervinculo;
    private ArrayList<String> hipervinculos;

    public Digital(String titulo, ArrayList<Autor> autores, String isbn, String genero, String formato, double valor, Editorial editorial, boolean hasHipervinculo, ArrayList<String> hipervinculos) {
        super(titulo, autores, isbn, genero, formato, valor, editorial);
        this.hasHipervinculo = hasHipervinculo;
        this.hipervinculos = hipervinculos;
    }
}

