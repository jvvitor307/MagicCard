public class App {
    public static void main(String[] args){
        PilhaMagica cartas = new PilhaMagica();
        PilhaMagica PilhaRemover = new PilhaMagica();
        Type terreno = Type.terreno;
        Type criatura = Type.criatura;
        Type encantamento = Type.encantamento;
        Type instantanea = Type.instantanea;
        Type feitico = Type.feitico;
        Type planeswalker = Type.planeswalker;
        Type habilidade_ativada = Type.habilidade_ativada;
        Type habilidade_disparada = Type.habilidade_disparada;
        Cards card1 = new Cards("furacao", feitico, 10, "Destroi tudo e todos");
        Cards card2 = new Cards("bola de luz", instantanea, 1, "deixa todos cegos");
        Cards card3 = new Cards("bola de fogo", habilidade_disparada, 3, "Destroi tudo e todos");
        Cards card4 = new Cards("campo de futebol", terreno, 1, "todos os humanos ganham 1 de sorte");
        cartas.push(card1,cartas);
        cartas.push(card2,cartas);
        cartas.push(card3,cartas);
        cartas.push(card4,cartas);
        cartas.mostrarCartas(cartas,PilhaRemover);
    }
}
