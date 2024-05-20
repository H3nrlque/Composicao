package entities;

import enums.StatusMusica;

import java.util.ArrayList;
import java.util.List;

    public class Playlist {
        private String nomePlaylist;

        private StatusMusica statusMusica;

        private List<Musicas> musicas = new ArrayList<>();

        public Playlist(String nomePlaylist) {
            this.nomePlaylist = nomePlaylist;
        }

        public String getNomePlaylist() {
            return nomePlaylist;
        }

        public void setNomePlaylist(String nomePlaylist) {
            this.nomePlaylist = nomePlaylist;
        }

        public StatusMusica getStatusMusica() {
            return statusMusica;
        }

        public void setStatus(StatusMusica statusMusica) {
            this.statusMusica = statusMusica;
        }

        public List<Musicas> getMusicas() {
            return musicas;
        }

        public String addMusicas(Musicas musica) {
            String verif = null;
            if (musicas.isEmpty()) {
                musicas.add(musica);
                verif = ("Musica_Adicionada");

            } else  {
                for (int i = 0; i < musicas.size(); i++) {
                    if (musica.getTitulo().equals(musicas.get(i).getTitulo()) && musica.getArtista().equals(musicas.get(i).getArtista())) {
                        verif = ("Musica_Ja_Adicionada_Anteriormente");
                    } else {
                        musicas.add(musica);
                        verif = ("Musica_Adicionada");
                    }
                }
            }
                return verif;
        }

        public String removeMusicas(String titulo, String artista) {
            String verif = null;
            for (int i = 0; i < musicas.size(); i++) {
                if (musicas.get(i).getTitulo().equals(titulo)) {
                    musicas.remove(musicas.get(i));
                    verif = ("Musica_Removida");
                } else {
                    verif = ("Musica_Nao_Encontrada");
                }
            }
            return verif;
        }

        public String PesquisarMusica(String titulo, String artista) {
            String verif = null;
            for (int i = 0; i < musicas.size(); i++) {
                if (musicas.get(i).getTitulo().equals(titulo) && musicas.get(i).getArtista().equals(artista)) {
                    verif = "Música prsente nesta playlist";
                } else {
                    verif = ("Música não encontrada");
                }
            }
            return verif;
        }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Playlist: ");
            sb.append(nomePlaylist+"\n");
            sb.append("Número de músicas: ");
            sb.append(musicas.size()+"\n");
            for (Musicas m : musicas) {
                sb.append(m+"\n");
            }
            return sb.toString();

        }
    }
