package org.itson.arquitectura.dominiorummy;

/**
 * Representa un grupo de fichas en el que todas las fichas son del mismo número
 * pero de diferente color.
 *
 * @author Equipo4
 */
public class Numero extends GrupoFichas {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean agregarFicha(Ficha ficha) {
        if (fichas.size() < 4) {
            if (ficha instanceof Comodin) {
                fichas.add(ficha);
            } else if (ficha instanceof Numerica) {
                for (Ficha fichaGrupo : fichas) {
                    if (((Numerica) fichaGrupo).getColor().equals(((Numerica) ficha).getColor())) {
                        return false;
                    }
                    if (((Numerica) ficha).getNumero() != ((Numerica) fichaGrupo).getNumero()) {
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
