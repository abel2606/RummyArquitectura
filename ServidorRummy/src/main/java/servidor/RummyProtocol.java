package servidor;

import org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente.CrearPartida;
import org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente.EvaluarSolicitud;
import org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente.IniciarPartida;
import org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente.PeticionCliente;
import org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente.SolicitarIniciarPartida;
import org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente.SolicitarUnirsePartida;
import org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente.TerminarPartida;
import org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente.TerminarTurno;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.PartidaIniciada;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.PartidaTerminada;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.SolicitudIniciarPartida;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.SolicitudUnirsePartida;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.TurnoTerminado;

/**
 * Clase que representa el protocolo de comunicación entre los clientes y el
 * servidor.
 *
 * @author Diego Valenzuela Parra
 */
public class RummyProtocol {
//    private static int WAITING;
//    private static String CREAR_PARTIDA;
//    private static String INICIAR_PARTIDA;
//    private static String SOLICITAR_UNIRSE_PARTIDA;
//    private static String SOLICITAR_INICIO_PARTIDA;
//    private static String SOLICITUD_UNIRSE_EVALUADA;
//    private static String SOLICITUD_INICIO_EVALUADA;
//    private static String TURNO_TERMINADO;
//    private static String PARTIDA_TERMINADA;

    /**
     * Método que procesa las peticiones de los clientes.
     *
     * @param peticion La petición que hace un cliente.
     * @return La respuesta del servidor.
     */
    public Object procesarPeticion(PeticionCliente peticion) {
        String tipoPeticion = peticion.getTipoPeticion(); // Se obtiene el tipo de petición.
        Object respuesta = null; // Se declara la variable de respuesta.
        switch (tipoPeticion) {
            case "CREAR_PARTIDA": // Si se quiere crear una partida.
                CrearPartida cp = (CrearPartida) peticion;
                respuesta = new PartidaIniciada(cp.getPartida());
                break;
            case "INICIAR_PARTIDA": // Cuando se inicia una partida.
                IniciarPartida ip = (IniciarPartida) peticion;
                respuesta = new PartidaIniciada(ip.getPartida());
                break;
            case "SOLICITAR_UNIRSE_PARTIDA": // Si alguien solicita unirse a una partida.
                SolicitarUnirsePartida sup = (SolicitarUnirsePartida) peticion;
                respuesta = new SolicitudUnirsePartida(sup.getJugador());
                break;
            case "SOLICITAR_INICIAR_PARTIDA": // Si alguien solicita que inicie la partida.
                SolicitarIniciarPartida sip = (SolicitarIniciarPartida) peticion;
                respuesta = new SolicitudIniciarPartida(sip.getJugador());
                break;
            case "EVALUAR_SOLICITUD": // Cuando el host acepta o rechaza a alguien.
                EvaluarSolicitud es = (EvaluarSolicitud) peticion;
                respuesta = new EvaluarSolicitud(es.isAceptado());
                break;
            case "TERMINAR_TURNO": // Cuando un jugador termina su turno.
                TerminarTurno tt = (TerminarTurno) peticion;
                respuesta = new TurnoTerminado(tt.getPartida());
                break;
            case "TERMINAR_PARTIDA": // Cuando se acaba la partida.
                TerminarPartida tp = (TerminarPartida) peticion;
                respuesta = new PartidaTerminada(tp.getPartida());
                break;
            default:
                // Si ocurre algo que no debería. >:|
                throw new AssertionError("RummyProtocol: SE DESCONOCE LA ACCIÓN QUE SE QUIERE REALIZAR.");
        }
        // Se devuelve la respuesta.
        return respuesta;
    }
}
