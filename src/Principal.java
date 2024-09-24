import br.com.praticando.screenmatch.calculos.CalculadoraDeTempo;
import br.com.praticando.screenmatch.calculos.FiltroRecomendacao;
import br.com.praticando.scrreenmatch.modelos.Episodio;
import br.com.praticando.scrreenmatch.modelos.Filme;
import br.com.praticando.scrreenmatch.modelos.Pessoa;
import br.com.praticando.scrreenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("The Close");
        meuFilme.setAnoDeLancamento(2021);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do Filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        meuFilme.avalia(8);


        System.out.println("Total de avaliações " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Christian";
        pessoa1.idade = 31;

        pessoa1.saudacao();


        Serie minhaSerie = new Serie();
        minhaSerie.setNome("LOst");
        minhaSerie.setAnoDeLancamento(2025);
        minhaSerie.exibeFichaTecnica();
        minhaSerie.setTemporada(10);
        minhaSerie.setEpsodiosPorTemporada(10);
        minhaSerie.setIncluidoNoPlano(true);
        minhaSerie.setMinutosPorEpsodio(50);


        System.out.println("Duração total da temporada de: " + minhaSerie.getNome()+ "\nTempo em minutos: "+minhaSerie.getDuracaoEmMinutos());



        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2024);
        outroFilme.setDuracaoEmMinutos(200);
        System.out.println("Duração do Filme: " + outroFilme.getDuracaoEmMinutos());


        CalculadoraDeTempo calculadora= new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());


        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);


        Episodio episodio =new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);


        Filme filmeDoChristian = new Filme();
        filmeDoChristian.setNome("O ultimo dia");
        filmeDoChristian.setDuracaoEmMinutos(200);
        filmeDoChristian.setAnoDeLancamento(2021);
        filmeDoChristian.avalia(10);


        ArrayList<Filme> listaDeFilmes = new ArrayList();
        listaDeFilmes.add(filmeDoChristian);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(meuFilme);
        System.out.println("Tamanho de lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("ToString do filme " + listaDeFilmes.get(0).toString());



    }
}