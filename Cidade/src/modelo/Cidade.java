
package modelo;
import java.time.LocalDate;

public class Cidade {
     
  private int codigo;
  private String nome;
  private String sigla;
  private int nrhabitantes;
  private LocalDate dataemancipacao;
  private Double areatotal;
  private int distanciacapial;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getNrhabitantes() {
        return nrhabitantes;
    }

    public void setNrhabitantes(int nrhabitantes) {
        this.nrhabitantes = nrhabitantes;
    }

    public LocalDate getDataemancipacao() {
        return dataemancipacao;
    }

    public void setDataemancipacao(LocalDate dataemancipacao) {
        this.dataemancipacao = dataemancipacao;
    }

    public Double getAreatotal() {
        return areatotal;
    }

    public void setAreatotal(Double areatotal) {
        this.areatotal = areatotal;
    }

    public int getDistanciacapial() {
        return distanciacapial;
    }

    public void setDistanciacapial(int distanciacapial) {
        this.distanciacapial = distanciacapial;
    }

    @Override
    public String toString() {
        return "Cidade{" + "nome=" + nome + '}';
    }

    public void setDataDataemancipacao(LocalDate parse) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getDistanciacapital() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setDistanciacapital(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
  
}
