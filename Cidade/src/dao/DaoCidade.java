/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import modelo.Cidade;
import java.sql.Date;
import java.time.format.DateTimeFormatter 
import modelo.Cidade;e java.time.LocalDate;

public class DaoCidade {
  public static boolean inserir(Cidade objeto) {
        String sql = "INSERT INTO cidade (nome, sigla, nrhabitantes, dataemancipacao, areatotal, distanciacapital) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getNome());
            ps.setString(2, objeto.getSigla());
            ps.setInt(3, objeto.getNrhabitantes());
            ps.setDate(4, Date.valueOf(objeto.getDataemancipacao())); 
            ps.setDouble(5, objeto.getAreatotal());
            ps.setInt(6, objeto.getDistanciacapital());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }  
  public static void main(String[] args) {
        Cidade objeto = new Cidade();
        objeto.setNome("Ibiruba");
        objeto.setSigla("RS");
        objeto.setNrhabitantes(19310);
        objeto.setDataDataemancipacao(LocalDate.parse("28/10/2019", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        objeto.setDistanciacapital(296);
        boolean resultado = inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
}
