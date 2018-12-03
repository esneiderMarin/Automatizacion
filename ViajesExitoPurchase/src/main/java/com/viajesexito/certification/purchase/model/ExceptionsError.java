package com.viajesexito.certification.purchase.model;

import java.text.MessageFormat;

public class ExceptionsError {

	public static String mensajeDeErrorParaRespuestaNoNetwork(String mensaje) {
		return MessageFormat.format(
				"No se encuentra el objeto. La respuesta tipo {0} no coinciden. Fallo de Internet o caiga de pagina web",
				mensaje);
	}

	public static String mensajeDeErrorParaRespuesta(String mensaje) {
		return MessageFormat.format("No se encuentra el objeto. La respuesta tipo {0} no coinciden.", mensaje);
	}
}
