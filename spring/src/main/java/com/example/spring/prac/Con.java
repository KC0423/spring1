package com.example.spring.prac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")

public class Con {
    @Autowired
    private Ser ser;

    @GetMapping("")
    public List<Vo> getAllUsers(){
        return ser.getAllUsers();
    }

    @GetMapping("/{pass}")
    public Vo getVoBypass(@PathVariable String pass) {
        return ser.getVoBypass(pass);
    }

    @PostMapping("")
    @ResponseBody
    public Vo registerVo(@RequestBody Vo vo) {
        return ser.registerVo(vo);
    }

    @PutMapping("/{pass}")
    public void modifyVo(@PathVariable String pass, @RequestBody Vo vo) {
        ser.modifyVo(pass, vo);
    }

    @DeleteMapping("/{pass}")
    public void removeVo(@PathVariable String pass) {
        ser.removeVo(pass);
    }

}
