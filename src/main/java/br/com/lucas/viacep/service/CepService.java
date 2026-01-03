package br.com.lucas.viacep.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CepService {

    public boolean isValidCep(String cep) {

        if (cep == null) {
            return false;
        }

        return cep.matches("^\\d{8}$");
    }

}
