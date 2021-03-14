package com.example.demo.model.ws;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.bean.Societe;
import com.example.demo.model.service.SocieteService;

import java.util.List;

@RestController
@RequestMapping("impot/Societe")
public class SocieteProvided {

    @Autowired
    private SocieteService societeService ;

    @PostMapping("/myice/{ice}")
    public int save(@PathVariable String ice) {
        return societeService.save(ice);
    }
    @GetMapping("/myice/{ice}")
    public Societe findByIce(@PathVariable String ice) {
        return societeService.findByIce(ice);
    }

    @DeleteMapping("/myice/{ice}")
    public int deleteByIce(@PathVariable String ice) {
        return societeService.deleteByIce(ice);
    }
    @GetMapping("/mycapital/{capital}")
    public List<Societe> findByCapitalGreaterThan(@PathVariable double capital) {
        return societeService.findByCapitalGreaterThan(capital);
    }
    @GetMapping("/")
    public List<Societe> findAll() {
        return societeService.findAll();
    }
    @GetMapping("/myid/{id}")
    public Societe getOne(@PathVariable Long id) {
        return societeService.getOne(id);
    }
}
