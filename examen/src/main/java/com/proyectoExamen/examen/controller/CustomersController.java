package com.proyectoExamen.examen.controller;

import com.proyectoExamen.examen.entity.Afp;
import com.proyectoExamen.examen.entity.Customer;
import com.proyectoExamen.examen.repository.IAfp;
import com.proyectoExamen.examen.repository.ICustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.invoke.MethodHandles;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/customer")

public class CustomersController {

    @Autowired
    private ICustomerRepository customerRepository;

    @Autowired
    private IAfp afp;



    //Instancia de Slf4j
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @PostMapping("/nuevo")
    @ResponseStatus(HttpStatus.OK)
    public void createCustomer(@RequestBody Customer customer){
        LOGGER.info("Realizo un nuevo registro");
        customerRepository.save(customer);
    }

    @GetMapping("/listar")
    @ResponseStatus(HttpStatus.OK)
    public List <Customer> listaClientes(){
        LOGGER.info("Realizo la peticion de listado");
        return customerRepository.findAll();
    }

    @PutMapping("/actualizar/{dni}")
    public Customer updateCustomers(@RequestBody Customer customer, @PathVariable(value = "dni") String dni){
        LOGGER.info("Realizo la peticion de actualizar");
        customer.setDni(dni);
        customerRepository.save(customer);
        return customer;
    }
    @DeleteMapping("/eliminar/{dni}")
    public String deleteCustomers(@PathVariable(value = "dni")String dni){
        LOGGER.info("Realizo la peticion de eliminar");
        customerRepository.deleteById(dni);
        return "se elimino el cliente correctamente";
    }



}
