/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Controllers.VendaController;
import java.sql.Date;
import java.util.Calendar;
import java.util.UUID;

/**
 *
 * @author Felipe
 */
public class Venda {
    
    private int id;
    private int cliente_id;
    private String cliente_nome;
    private int vendedor_id;
    private String vendedor_nome;
    private String dataCriacao;
    private String status;
    private String data_criacao;    
    private String tipo_pagamento;
    private double total;
    private String uuid;

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    

    public String getCliente_nome() {
        return cliente_nome;
    }

    public void setCliente_nome(String cliente_nome) {
        this.cliente_nome = cliente_nome;
    }

    public String getVendedor_nome() {
        return vendedor_nome;
    }

    public void setVendedor_nome(String vendedor_nome) {
        this.vendedor_nome = vendedor_nome;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public int getVendedor_id() {
        return vendedor_id;
    }

    public void setVendedor_id(int vendedor_id) {
        this.vendedor_id = vendedor_id;
    }

    public String getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(String data_criacao) {
        this.data_criacao = data_criacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTipo_pagamento() {
        return tipo_pagamento;
    }

    public void setTipo_pagamento(String tipo_pagamento) {
        this.tipo_pagamento = tipo_pagamento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public String valorTotal(){
        
        VendaController v = new VendaController();
        
        String valorFormatado = v.totalProducts(this.id);
        
        return valorFormatado;
    }
    
    
    
    
}
