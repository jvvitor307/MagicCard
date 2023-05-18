public class PilhaMagica extends Pilha<Cards> {
    public void push(Cards card, PilhaMagica Pilhacards){
        if(card.getType() == Type.instantanea || card.getType() == Type.habilidade_ativada || card.getType() == Type.habilidade_disparada){
            lista.add(card);
        }
        else if(Pilhacards.isEmpty() && card.getType() == Type.terreno || card.getType() == Type.criatura || card.getType() == Type.encantamento || card.getType() == Type.artefato || card.getType() == Type.planeswalker || card.getType() == Type.feitico){
            lista.add(card);
        }

    }
    public String removerPorNome(Cards card, PilhaMagica Pilhacards, PilhaMagica PilhaRemover){
        for(int i = 0; Pilhacards.size()>= i;i++){
            if(Pilhacards.top().getName().equals(card.getName())){
                Pilhacards.pop();
                while(!PilhaRemover.isEmpty()){
                    Pilhacards.push(PilhaRemover.pop());
                }
                return "removi sua carta";
            }
            else{
                PilhaRemover.push(Pilhacards.pop());

            }
        }
        return "não há esta carta no meio do baralho";
    }
    public void mostrarCartas(PilhaMagica Pilhacards, PilhaMagica PilhaRemover){
        while(!Pilhacards.isEmpty()){
            System.out.println(Pilhacards.top().getName()); 
            PilhaRemover.push(Pilhacards.pop());
        }
        while(!PilhaRemover.isEmpty()){
            Pilhacards.push(PilhaRemover.pop());
        }

    }
}


