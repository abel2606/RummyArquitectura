/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.arquitectura.dominiorummy;

import java.util.List;

/**
 *
 * @author Equipo 4
 */
public interface IJugador {
    public void setNombre(String nombre);
    public void setAvatar(String avatar);
    public void setColores(List<Color> colores);
    public String getNombre();
    public String getAvatar();
}
