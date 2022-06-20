package com.tiendaVideoJuegos.Controller;

import com.tiendaVideoJuegos.Dao.ClienteDao;
import com.tiendaVideoJuegos.domain.Cliente;
import com.tiendaVideoJuegos.service.clienteService;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class indexController {

    @Autowired
    private clienteService clienteService;

    @GetMapping("/")
    public String inicio(Model model) {

        //log.info("Estamos usando un video juego");//Aparece en el log del servidor
        //cliente Cliente1 = new cliente("Alonso", "Bansbach","stivenbans478@gmail.com", "8975647");
        //cliente Cliente2 = new cliente("KRIS", "gutueres", "gutierre@g,ail.com", "8975648897");
        var clientes = clienteService.getClientes();
        model.addAttribute("clientes", clientes);// Envia la vista Cliente importante la escritura
        return "index";

    }

    @GetMapping("/nuevoCliente")
    public String nuevoCliente(Cliente cliente) {
        return "modificarCliente";

    }

    @PostMapping("/guardarCliente")
    public String guardarCliente(Cliente cliente) {
        clienteService.save(cliente);
        return "redirect:/";
    }

    @GetMapping("/modificarCliente/{idCliente}")
    public String modificarCliente(Cliente cliente, Model model) {
        cliente = clienteService.getCliente(cliente);
        model.addAttribute("cliente", cliente);
        return "modificarCliente";

    }

    @GetMapping("/eliminarCliente/{idCliente}")
    public String eliminarCliente(Cliente cliente) {
        clienteService.delete(cliente);
        return "redirect:/";

    }
}
