package com.example.spring.prac;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Ser {

    @Autowired
    Dao dao;

    public List<Vo> getAllUsers(){
        return dao.getAllUsers();
    }

    public Vo getVoBypass(String pass) {
        return dao.getVoBypass(pass);
    }

    public Vo registerVo(Vo vo) {
        return dao.InsertVo(vo);
    }

    public void modifyVo(String pass, Vo vo) {
        dao.updateVo(pass, vo);
    }

    public void removeVo(String pass) {
        dao.deleteVo(pass);
    }

}