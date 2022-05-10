package engsoftware.cefetmg.pizzaria.models.enums;

public enum SaborBebidaEnum {

    GUARANA("Guaraná", 5),
    COCA_COLA("Coca-Cola", 6),
    AGUA("Água", 4);

    public String nome;
    public int valor;

    SaborBebidaEnum(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }
}
