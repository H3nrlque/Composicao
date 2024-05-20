package entities;
public class Musicas {
        private String titulo;
        private String artista;
        private String duracao;

        public Musicas(String titulo, String artista, String duracao) {
            this.titulo = titulo;
            this.artista = artista;
            this.duracao = duracao;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getArtista() {
            return artista;
        }

        public void setArtista(String artista) {
            this.artista = artista;
        }

        public String getDuracao() {
            return duracao;
        }

        public void setDuracao(String duracao) {
            this.duracao = duracao;
        }

        @Override
        public String toString() {
            return "Título: "
                    +titulo+"\n"
                    +"Artista: "
                    +artista+"\n"
                    +"Duração: "
                    +duracao;
        }
    }
