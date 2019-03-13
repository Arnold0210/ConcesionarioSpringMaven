package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/")
public class ClienteController {

	@RequestMapping(method = RequestMethod.GET, value = "crearCliente.html")
	public String crearCliente(HttpServletRequest req, SessionStatus status, ModelMap map) {
		map.put("mensajeCliente", "Pasé por el controlaor de persona" + req.getParameter("nombre"));
		return "cliente_crear";
	}
}
