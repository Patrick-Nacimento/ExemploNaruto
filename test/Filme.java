
import java.time.LocalDate;



/**
 *
 * @author Alunos
 */
public class Filme {
    private String titulo, tituloOriginal, genero, diretor;
    private short anoLancamento;
    private double valorFaturamento, valorOrcamento;
    private long espectadores;
    private String classificacao;
    private double mediaPreco;
    private LocalDate dataLancamentoBrasil;
    private String idioma;
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTituloOriginal(String tituloOriginal){
        this.tituloOriginal = tituloOriginal;
    }
    
    public String getTituloOriginal(){
        return tituloOriginal;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
        
    }
    
    public String getGenero(){
        return genero;
    }
    
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }
    
    public String getDiretor(){
        return diretor;
    }
    
    public void setAnoLancamento(short anoLancamento){
        this.anoLancamento = anoLancamento;
    }
    
    public short getAnoLancamento(){
        return anoLancamento;
    }
    
    public void setValorFaturamento(double valorFaturamento){
        this.valorFaturamento = valorFaturamento;
    }
    
    public double getValorFaturamento(){
        return valorFaturamento;
    }
    
    public void setValorOrcamento(double valorOrcamento){
        this.valorOrcamento = valorOrcamento;
    }
    
    public double getValorOrcamento(){
        return valorOrcamento;
    }
    
    public void setEspectadores(long espectadores){
        this.espectadores = espectadores;
    }
    
    public long getEspectadores(){
        return espectadores;
    }
    
    public void setClassificacao(String classificacao){
        this.classificacao = classificacao;
    }
    
    public String getClassificacao(){
        return classificacao;
    }
    
    public void setMediaPreco(double mediaPreco){
        this.mediaPreco = mediaPreco;
    }
    
    public double getMediaPreco(){
        return mediaPreco;
    }
    
    public void setDataLancamentoBrasil(LocalDate dataLancamentoBrasil){
        this.dataLancamentoBrasil = dataLancamentoBrasil;
    }
    
    public LocalDate getDataLancamentoBrasil(){
        return dataLancamentoBrasil;
    }
    
    public void setIdioma(String idioma){
        this.idioma = idioma;
    }
    
    public String getIdioma(){
        return idioma;
    }
        
      
    
    
    
    
}
