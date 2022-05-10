package engsoftware.cefetmg.pizzaria.models.enums;

public enum TamanhoPizzaEnum {

    GIGANTE("GG", 80),
    GRANDE("G", 70),
    MEDIA("M", 60),
    PEQUENA("P", 50);

    public String codigoTamanho;
    public int valor;
    
    TamanhoPizzaEnum(String codigo, int preco) {
        codigoTamanho = codigo;
        valor = preco;
    }
}
