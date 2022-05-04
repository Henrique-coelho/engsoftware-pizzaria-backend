package engsoftware.cefetmg.pizzaria.models.enums;

public enum ProdutoEnum {
    PIZZA("Pizza"),
    BEBIDA("Bebida");

    private String descricao;
    ProdutoEnum(String descricao){
        this.descricao = descricao;
    }
}
