package fatec.com.product.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import fatec.com.product.models.Cliente;

@RestController
@RequestMapping("/clientes")
public class ProductController {
    @GetMapping
    public ArrayList<Cliente> getClientes() {

        Cliente c1 = new Cliente();
        c1.setId(1L);
        c1.setName("Murilinho");
        c1.setEmail("murilinho@gmail.com");
        c1.setDescription("Soviético");
        c1.setPassword("123456");

        Cliente c2 = new Cliente();
        c2.setId(2L);
        c2.setName("Siminho");
        c2.setEmail("siminho@gmail.com");
        c2.setDescription("Arabe");
        c2.setPassword("123456");

        Cliente c3 = new Cliente();
        c3.setId(3L);
        c3.setName("Toninho");
        c3.setEmail("toninho@gmail.com");
        c3.setDescription("Brasil");
        c3.setPassword("123456");

        Cliente c4 = new Cliente();
        c4.setId(4L);
        c4.setName("Paulinho");
        c4.setEmail("paulinho@gmail.com");
        c4.setDescription("Alemão");
        c4.setPassword("123456");

        Cliente c5 = new Cliente();
        c5.setId(5L);
        c5.setName("Mayquinho");
        c5.setEmail("mayquinho@gmail.com");
        c5.setDescription("Eden cajuru");
        c5.setPassword("123456");

        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        clientes.add(c4);
        clientes.add(c5);

        return clientes;
    }

}
