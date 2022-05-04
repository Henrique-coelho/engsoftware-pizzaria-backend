package engsoftware.cefetmg.pizzaria.models.enums;

public enum SaborPizzaEnum {
    PORTUGUESA("Portuguesa"),
    CALABRESA("Calabresa"),
    ITALIANA("Italiana"),
    QUATRO_QUEIJOS("Quatro Queijos"),
    FRANGO_COM_CATUPIRY("Frango com Catupiry"),
    PAO_DE_ALHO("Pão de alho"),
    MARGUERITA("Marguerita"),
    A_MODA("À moda"),
    CARNE_SECA("Carne seca"),
    MILHO_E_BACON("Milho e bacon");

    public String nome;

    SaborPizzaEnum(String nome) {
        this.nome = nome;
    }
}