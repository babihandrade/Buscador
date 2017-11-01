/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscador.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 31687059
 */
public class Produto {
    
 private String descricao;
 private Loja loja;
 private List<Categoria> categorias = new ArrayList();
 private String imagem;
 private BigDecimal preco;
 private String linkProduto;
 static int qtdProduto;

    public Produto(String descricao, Loja loja, BigDecimal preco, String linkProduto) {
        this.descricao = descricao;
        this.loja = loja;
        this.preco = preco;
        this.linkProduto = linkProduto;
        qtdProduto++;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getLinkProduto() {
        return linkProduto;
    }

    public void setLinkProduto(String linkProduto) {
        this.linkProduto = linkProduto;
    }

    public static int getQtdProduto() {
        return qtdProduto;
    }

    public static void setQtdProduto(int qtdProduto) {
        Produto.qtdProduto = qtdProduto;
    }
    
 
 
 
    
    
}
