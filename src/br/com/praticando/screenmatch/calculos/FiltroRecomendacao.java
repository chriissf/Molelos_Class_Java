package br.com.praticando.screenmatch.calculos;

public class FiltroRecomendacao {

    private  String recomendacao;

    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferido do momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito  bem avaliado no momemnto!");

        }else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
