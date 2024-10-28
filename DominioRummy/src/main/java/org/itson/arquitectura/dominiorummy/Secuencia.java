package org.itson.arquitectura.dominiorummy;

/**
 * Representa un grupo de fichas en el que todas son del mismo color pero con
 * diferente número, y están ordenadas a manera de escalera ascendente.
 *
 * @author Equipo4
 */
public class Secuencia extends GrupoFichas {

    private int rangoFichas;

    /**
     * Constructor que recibe el rango de fichas que hay en la partida.
     *
     * @param rangoFichas El rango de fichas que hay en la partida
     */
    public Secuencia(int rangoFichas) {
        this.rangoFichas = rangoFichas;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean agregarFicha(Ficha ficha) {
        if (fichas.size() < rangoFichas) {
            if (ficha instanceof Comodin) {
                fichas.add(ficha);
            } else if (ficha instanceof Numerica) {
                for (Ficha fichaGrupo : fichas) {
                    if (!((Numerica) fichaGrupo).getColor().equals(((Numerica) ficha).getColor())) {
                        return false;
                    }
                    if (((Numerica) fichaGrupo).getNumero() == ((Numerica) ficha).getNumero()) {
                        return false;
                    }
                }
                fichas.add(ficha);
                return true;
            }
        }
        return false;
    }

}
