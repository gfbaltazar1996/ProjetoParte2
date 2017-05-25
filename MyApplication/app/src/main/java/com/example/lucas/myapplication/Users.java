package com.example.lucas.myapplication;

/**
 * Created by Lucas on 29/03/2017.
 */

public class Users {
    private String email="",senha="",nome="";
    private double lat=0.0f,log=0.0f;
    public void setEmail(String email){
        this.email=email;
    }
    public void setSenha(String senha){
        this.senha=senha ;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setLat(double lat){
        this.lat=lat;
    }
    public void setLog(double log){
        this.log=log;
    }
    public String getEmail(){
        return this.email;
    }
    public String getSenha(){
        return this.senha;
    }
    public String getNome(){
        return this.nome;
    }
    public double getLat(){
        return this.lat;
    }
    public double getLog(){
        return this.log;
    }

}
