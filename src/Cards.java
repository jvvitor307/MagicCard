public class Cards {
    //o nome da mágica ou habilidade
    private String name;
    //o tipo da mágica ou habilidade (terreno, criatura, encantamento,
    //artefato, instantânea, feitiço, planeswalker, habilidade ativada, habilidade
    //disparada)
    private Type type; 
    //o custo para jogar a mágica ou habilidade (em mana)
    private Integer cost; 
    //o efeito da mágica ou habilidade
    private String effect;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }
    public Integer getCost() {
        return cost;
    }
    public void setCost(Integer cost) {
        this.cost = cost;
    }
    public String getEffect() {
        return effect;
    }
    public void setEffect(String effect) {
        this.effect = effect;
    }
    
    public Cards(String name, Type type, Integer cost, String effect) {
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.effect = effect;
    }
    @Override
    public String toString() {
        return "Cards [name=" + name + ", type=" + type + ", cost=" + cost + ", effect=" + effect + "]";
    }
    
}
