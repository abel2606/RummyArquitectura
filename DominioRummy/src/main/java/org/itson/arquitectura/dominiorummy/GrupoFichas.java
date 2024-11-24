package org.itson.arquitectura.dominiorummy;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un grupo de fichas de al menos 3 fichas.
 *
 * @author Equipo4
 */
public abstract class GrupoFichas {

    /**
     * Las fichas del grupo.
     */
    protected List<Ficha> fichas;

    /**
     * Constructor.
     */
    public GrupoFichas() {
        this.fichas = new ArrayList<>();
    }

    /**
     * Permite obtener las fichas del grupo.
     *
     * @return Las fichas del grupo
     */
    public List<Ficha> getFichas() {
        return fichas;
    }

    /**
     * Permite establecer las fichas del grupo.
     *
     * @param fichas Las fichas del grupo
     */
    public void setFichas(List<Ficha> fichas) {
        this.fichas = fichas;
    }

    /**
     * Permite agregar una ficha al grupo.
     *
     * @param ficha La ficha a agregar
     * @return true si se agregó la ficha, false en caso contrario.
     */
    public boolean agregarFicha(Ficha ficha) {
        fichas.add(ficha);
        return true;
    }

    /**
     * Permite remover una ficha del grupo
     *
     * @param ficha ficha a remover
     * @return si se removión la ficha, false en caso contrario.
     */
    public boolean quitarFicha(Ficha ficha) {
        fichas.remove(ficha);
        return true;
    }

    /**
     * Método factory que determina y crea el tipo correcto de grupo basado en
     * las fichas.
     *
     * @param fichas Las fichas a validar
     * @param rangoFichas El rango máximo de fichas para secuencias
     * @return Un Numero o Secuencia si las fichas forman un grupo válido, null
     * en caso contrario
     */
    public static GrupoFichas crearGrupo(List<Ficha> fichas, int rangoFichas) {
        Secuencia secuencia = new Secuencia(rangoFichas);
        secuencia.setFichas(new ArrayList<>(fichas));
        if (esSecuenciaValida(fichas, rangoFichas)) {
            return secuencia;
        }

        Numero numero = new Numero();
        numero.setFichas(new ArrayList<>(fichas));
        if (esNumeroValido(fichas)) {
            return numero;
        }

        return null;
    }

    private static boolean esSecuenciaValida(List<Ficha> fichas, int rangoFichas) {
        if (fichas.size() < 3 || fichas.size() > rangoFichas) {
            return false;
        }

        List<Numerica> fichasNumericas = new ArrayList<>();
        int comodines = 0;

        for (Ficha ficha : fichas) {
            if (ficha instanceof Comodin) {
                comodines++;
            } else if (ficha instanceof Numerica) {
                fichasNumericas.add((Numerica) ficha);
            }
        }

        if (fichasNumericas.isEmpty()) {
            return false;
        }

        Color colorBase = fichasNumericas.get(0).getColor();
        for (Numerica ficha : fichasNumericas) {
            if (!ficha.getColor().equals(colorBase)) {
                return false;
            }
        }

        fichasNumericas.sort((f1, f2) -> Integer.compare(f1.getNumero(), f2.getNumero()));

        int espaciosVacios = 0;
        for (int i = 0; i < fichasNumericas.size() - 1; i++) {
            int diferencia = fichasNumericas.get(i + 1).getNumero()
                    - fichasNumericas.get(i).getNumero() - 1;
            if (diferencia > 0) {
                espaciosVacios += diferencia;
            }
        }

        return espaciosVacios <= comodines;
    }

    private static boolean esNumeroValido(List<Ficha> fichas) {
        if (fichas.size() < 3 || fichas.size() > 4) {
            return false;
        }

        List<Numerica> fichasNumericas = new ArrayList<>();
        int comodines = 0;

        for (Ficha ficha : fichas) {
            if (ficha instanceof Comodin) {
                comodines++;
            } else if (ficha instanceof Numerica) {
                fichasNumericas.add((Numerica) ficha);
            }
        }

        if (fichasNumericas.isEmpty()) {
            return false;
        }

        int numeroBase = fichasNumericas.get(0).getNumero();
        List<Color> coloresUsados = new ArrayList<>();

        for (Numerica ficha : fichasNumericas) {
            if (ficha.getNumero() != numeroBase) {
                return false;
            }
            if (coloresUsados.contains(ficha.getColor())) {
                return false;
            }
            coloresUsados.add(ficha.getColor());
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GrupoFichas: ");
        for (Ficha ficha : fichas) {
            sb.append(ficha).append(", ");
        }
        return sb.toString();
    }

}
