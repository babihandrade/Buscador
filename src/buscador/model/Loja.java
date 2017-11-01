/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscador.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 31687059
 */
public class Loja {
    private String nome;
    private String link;
    private static int qtdLojas = 0;
    private List<Produto> produtos = new ArrayList();

    public Loja(String nome, String link) {
        this.nome = nome;
        this.link = link;
        qtdLojas++ ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public static int getQtdLojas() {
        return qtdLojas;
    }

    public static void setQtdLojas(int qtdLojas) {
        Loja.qtdLojas = qtdLojas;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    
    public void adicionaProdutos(Produto produto){
    
        
    }
    
    public void alteraNome(String nome){
    
    }
    
    public void alteraLink(String link){
    
    
    }

}

