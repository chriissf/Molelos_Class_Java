package br.com.praticando.scrreenmatch.modelos;

import org.w3c.dom.CDATASection;

public class Pessoa {

    public String nome;
    public int idade;
    String Sexo;


    public void saudacao(){

        System.out.println("Olá " + nome + " fico feliz por está visitando nosso site,Agora Confirme sua idade: " + idade);
    }
}
