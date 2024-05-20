package application;

import entities.Musicas;
import entities.Playlist;
import enums.StatusMusica;

import java.util.Scanner;

public class PlaylistDeMusica {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("CRIANDO PLAYLIST");
        System.out.print("Nome: ");
        String nomePlaylist = tc.nextLine();
        Playlist playlist = new Playlist(nomePlaylist);
        System.out.println(StatusMusica.Playlist_Criada);
        System.out.println();
        int opcao;
        do {
            System.out.println(Escolha());
            opcao = tc.nextInt();
            if (opcao == 1) {
                tc.nextLine();
                System.out.print("Título: ");
                String titulo = tc.nextLine();
                System.out.print("Artista: ");
                String artista = tc.nextLine();
                System.out.print("Duração: ");
                String duracao = tc.next();
                Musicas musica = new Musicas(titulo, artista, duracao);
                String verif = playlist.addMusicas(musica);
                System.out.println(StatusMusica.valueOf(verif));
                System.out.println();
            } else if (opcao == 2) {
                tc.nextLine();
                System.out.print("Digite o título da musica que quer remover: ");
                String titulo = tc.nextLine();
                System.out.print("E o artista: ");
                String artista = tc.nextLine();
                String verif = playlist.removeMusicas(titulo, artista);
                System.out.println(StatusMusica.valueOf(verif));
                System.out.println();
            } else if (opcao == 3) {
                tc.nextLine();
                System.out.print("Digite o título da música: ");
                String titulo = tc.nextLine();
                System.out.print("E o artista: ");
                String artista = tc.nextLine();
                String verif = playlist.PesquisarMusica(titulo, artista);
                System.out.println(StatusMusica.valueOf(verif));
                System.out.println();
            } else if (opcao == 4) {
                System.out.println(playlist);
            } else if (opcao == 5) {
                System.out.println("Saindo...");
            }
        } while (opcao != 5);
    }

    public static String Escolha() {
        StringBuilder sb = new StringBuilder();
        sb.append("Escolha uma opção: \n");
        sb.append("[1] Adicionar Música a playlist\n");
        sb.append("[2] Remover música da playlist\n");
        sb.append("[3] Procurar música na playlist\n");
        sb.append("[4] Ver playlist\n");
        sb.append("[5] Sair\n");
        return sb.toString();
    }
}
