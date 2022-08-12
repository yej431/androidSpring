package com.cookandroid.androidspring.Utils;

public class Apis {
    public static final String url="http://172.30.1.59:8080/";
    public static PersonaService getPersonaService(){
        return Cliente.getCliente(url).create(PersonaService.class);
    }
}