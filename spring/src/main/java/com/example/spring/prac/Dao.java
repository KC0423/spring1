package com.example.spring.prac;

import java.util.ArrayList;
import java.util.List;

public class Dao {

    public static List<Vo> users;

    static {
        users = new ArrayList();
        users.add(new Vo(11,"test1","testname1","1234","안녕하세요"));
        users.add(new Vo(12,"test2","testname2","1234","반갑습니다."));
        users.add(new Vo(3,"test3","testname3","1234","저는.."));
        users.add(new Vo(4,"test4","testname4","1234","음..."));
        users.add(new Vo(5,"test5","testname5","1234","어..."));
    }

    public List<Vo> getAllUsers(){
        return users;
    }

    public Vo getVoBypass(String pass) {
        return users
                .stream()
                .filter(vo -> vo.getpass().equals(pass))
                .findAny()
                .orElse(new Vo(-1,"","","",""));
    }

    public Vo InsertVo(Vo vo) {
        users.add(vo);

        return vo;
    }

    public void updateVo(String pass, Vo vo) {
        users.stream()
                .filter(curVo -> curVo.getpass().equals(pass))
                .findAny()
                .orElse(new Vo(-1,"","","",""))
                .settitle(vo.gettitle());
    }

    public void deleteVo(String pass) {
        users.removeIf(vo->vo.getpass().equals(pass));
    }
    public void postingVo(String gesi) {

    }

}
