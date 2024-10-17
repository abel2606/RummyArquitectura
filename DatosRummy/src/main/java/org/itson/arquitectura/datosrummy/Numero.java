package org.itson.arquitectura.datosrummy;

/**
 *
 * @author Equipo4
 */
public class Numero extends GrupoFichas{

    @Override
    public boolean agregarFicha(Ficha ficha) {
        if (fichas.size() < 4) {
            if (ficha instanceof Comodin) {
                fichas.add(ficha);
            } else if (ficha instanceof Numerica) {
                for (Ficha ficha1 : fichas) {
                    if (((Numerica)ficha1).getColor().getCodigoHex() == ((Numerica) ficha).getColor().getCodigoHex()) {
                        return false;
                    }
                    if (((Numerica) ficha1).getNumero() != ((Numerica) ficha).getNumero()) {
                        return false;
                    }
                }
                fichas.add(ficha);
                return true;
            }
        } else {
            return false;
        }
        return false;
    }
    
    
    
}
