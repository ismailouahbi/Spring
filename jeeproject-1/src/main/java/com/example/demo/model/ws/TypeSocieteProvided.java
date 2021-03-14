package com.example.demo.model.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.bean.TypeSociete;
import com.example.demo.model.service.TypeSocieteService;

import java.util.List;

@RestController
@RequestMapping("societe/tyeSociete")
public class TypeSocieteProvided {

    @Autowired
    private TypeSocieteService typeSocieteService ;

    @PostMapping("/typesociete")
    public int save(@RequestBody TypeSociete typeSociete) {

        return typeSocieteService.save(typeSociete);
    }
    @PutMapping("/update")
    public int update(@RequestBody TypeSociete typeSociete) {
        return typeSocieteService.update(typeSociete);
    }

    @GetMapping("/code/{code}")
    public TypeSociete findByCode(@PathVariable String code) {

        return typeSocieteService.findByCode(code);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {

        return typeSocieteService.deleteByCode(code);
    }

    @GetMapping("/")
    public List<TypeSociete> findAll() {

        return typeSocieteService.findAll();
    }
    @GetMapping("myid/{id}")
    public TypeSociete getOne(@PathVariable Long id) {
        return typeSocieteService.getOne(id);
    }

}
