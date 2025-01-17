/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.libro;

import core.megaferia.Editorial;
import core.person.Autor;
import core.person.Narrador;
import java.util.ArrayList;

/**
 *
 * @author tilan
 */
public class AudioLibro extends Libro {
    
    private int duracion;
    private Narrador narrador;

    public AudioLibro(String titulo, ArrayList<Autor> autores, String isbn, String genero, String formato, double valor, Editorial editorial, int duracion, Narrador narrador) {
        super(titulo, autores, isbn, genero, formato, valor, editorial);
        this.duracion = duracion;
        this.narrador = narrador;
    }
    
}
