/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comercial.dominio;
import Comercial.datos.*;
import Comercial.dominio.Proveedor;
import Comercial.datos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author SipaqueRitaMaria
 */
public class OrdenCompra {
 
int PK_codigo_ordencompra;
String PK_codigo_bodega;
  String Codigo_proveedor; 
  String Fecha_emision; 
  String Fecha_vencimiento;
   String Codigo_pago; 
  String Estatus_ordecompra; 

    public int getPK_codigo_ordencompra() {
        return PK_codigo_ordencompra;
    }

    public void setPK_codigo_ordencompra(int PK_codigo_ordencompra) {
        this.PK_codigo_ordencompra = PK_codigo_ordencompra;
    }

    public String getPK_codigo_bodega() {
        return PK_codigo_bodega;
    }

    public void setPK_codigo_bodega(String PK_codigo_bodega) {
        this.PK_codigo_bodega = PK_codigo_bodega;
    }

    public String getCodigo_proveedor() {
        return Codigo_proveedor;
    }

    public void setCodigo_proveedor(String Codigo_proveedor) {
        this.Codigo_proveedor = Codigo_proveedor;
    }

    public String getFecha_emision() {
        return Fecha_emision;
    }

    public void setFecha_emision(String Fecha_emision) {
        this.Fecha_emision = Fecha_emision;
    }

    public String getFecha_vencimiento() {
        return Fecha_vencimiento;
    }

    public void setFecha_vencimiento(String Fecha_vencimiento) {
        this.Fecha_vencimiento = Fecha_vencimiento;
    }

    public String getCodigo_pago() {
        return Codigo_pago;
    }

    public void setCodigo_pago(String Codigo_pago) {
        this.Codigo_pago = Codigo_pago;
    }

    public String getEstatus_ordecompra() {
        return Estatus_ordecompra;
    }

    public void setEstatus_ordecompra(String Estatus_ordecompra) {
        this.Estatus_ordecompra = Estatus_ordecompra;
    }

    
  
  

   

    

  
    }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   

