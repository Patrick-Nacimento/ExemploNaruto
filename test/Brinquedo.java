
/**
 *
 * @author Patrick
 */
public class Brinquedo {
    
    private String nome, marca, modelo, descricao;
    private long codigo, codigoDeBarra;
    private double preco;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setCodigo(long codigo){
        this.codigo = codigo;
    }
    
    public long getCodigo(){
        return codigo;
    }
    
    public void setCodigoDeBarra(long codigoDeBarra){
        this.codigoDeBarra = codigoDeBarra;
    }
    
    public long getCodigoDeBarra(){
        return codigoDeBarra;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double getPreco(){
        return preco;
    }
    
    
    
}
