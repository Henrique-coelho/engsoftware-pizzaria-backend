package engsoftware.cefetmg.pizzaria.models.enums;

public enum ProdutoEnum {
    PIZZA("Pizza"),
    BEBIDA("Bebida");

    public String descricao;
    
    ProdutoEnum(String descricao){
        this.descricao = descricao;
    }
}
