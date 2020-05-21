package pe.isil.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pe.isil.model.Vendedor;
import pe.isil.service.VendedorService;

import java.util.List;

@Controller
public class VendedorController {

    @Autowired
    VendedorService vendedorService;

    @GetMapping("/vendedores")
    public String getVendedores(Model model) {
        List<Vendedor> vendedores = vendedorService.findAll();
        model.addAttribute("vendedores", vendedores);
        return "vendedores";
    }

    @GetMapping("/vendedores/add")
    public String AddVendedores(Model model) {
        model.addAttribute("vendedor", new Vendedor());
        return "vendedores-add";
    }
    @PostMapping("/vendedores/create")
    public String createVendedor(Model model, Vendedor vendedor){
        //save
        vendedorService.create(vendedor);
        return "redirect:/vendedores";
    }
    @GetMapping("/vendedores/edit/{id}")
    public
    String vendedorForUpdate(@PathVariable Long id, Model model){
        Vendedor currentVendedor = vendedorService.findById(id);
        model.addAttribute("vendedor", currentVendedor);
        return "vendedor-edit";
    }
    @PostMapping("/vendedores/update/{id}")
    public String updateVendedor(@PathVariable Long id, Vendedor vendedor){
        //Update
        vendedorService.update(vendedor);
        return "redirect:/vendedores";
    }

    @GetMapping("/vendedores/delete/{id}")
    public String deleteVendedor(@PathVariable Long id){
        Vendedor currentVendedor = vendedorService.findById(id);
        if(currentVendedor != null){
            vendedorService.delete(currentVendedor);
        }
        return "redirect:/vendedores";
    }
}