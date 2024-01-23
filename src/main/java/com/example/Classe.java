package com.example;

import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Classe {
    private ArrayList<Alunno> alunni;
    private String classe;
    private String aula;

    public Classe(String classe, String aula){
        alunni = new ArrayList();
        this.classe = classe;
        this.aula = aula;
    }
    public Classe (){}


    public void add(Alunno a){
         alunni.add(a);
    }

    public boolean remove(Alunno a){
        return alunni.remove(a);
    }

    public String toString(){
        String s = classe + "\n";
        for (Alunno alunno : alunni) {
            s += alunno.toString() + "\n";
        }
        return s;
    }

    public ArrayList<Alunno> getAlunni() {
        return alunni;
    }


    public void setAlunni(ArrayList<Alunno> alunni) {
        this.alunni = alunni;
    }


    public String getClasse() {
        return classe;
    }


    public void setClasse(String classe) {
        this.classe = classe;
    }


    public String getAula() {
        return aula;
    }


    public void setAula(String aula) {
        this.aula = aula;
    }

    public String xml(){
        String s = "";

        XmlMapper xmlMapper = new XmlMapper();

        for (Alunno alunno : alunni) {
            try {
                s += xmlMapper.writeValueAsString(alunno);
            } catch (JsonProcessingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return s;
    }
    public String json(){
        String s = "";

        ObjectMapper objectMapper = new ObjectMapper();
        
        try {
            s = objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return s;
    }
}

