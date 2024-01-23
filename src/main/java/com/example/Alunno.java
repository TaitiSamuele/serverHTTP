package com.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Alunno {
    private String nome;
    private String cognome;
    private String dataNascita;
    
    public Alunno(String nome, String cognome, String dataNascita){
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
    }
    public Alunno(){}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public String getDataNascita() {
        return dataNascita;
    }
    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
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
