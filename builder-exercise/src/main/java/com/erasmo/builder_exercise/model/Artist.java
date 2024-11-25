package com.erasmo.builder_exercise.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class Artist {

    private String nome;
    private String genere;
    private int numeroAlbum;
    private boolean inAttivita;

    protected Artist(ArtistBuilderNew<?> builder) {
        this.nome = builder.nome;
        this.genere = builder.genere;
        this.numeroAlbum = builder.numeroAlbum;
        this.inAttivita = builder.inAttivita;
    }


    @Override
    public String toString() {
        return "Artista --> Nome: " + this.nome + ", " + "genere: " + this.genere + ", " + "numero album: " + this.numeroAlbum;
    }

/*    public static class ArtistBuilder {
        private String nome;
        private String genere;
        private int numeroAlbum;
        private boolean inAttivita;

        public ArtistBuilder setNome (String nome) {
            this.nome = nome;
            return this;
        }

        public ArtistBuilder setGenere (String genere) {
            this.genere = genere;
            return this;
        }

        public ArtistBuilder setNumeroAlbum (int numeroAlbum) {
            this.numeroAlbum = numeroAlbum;
            return this;
        }

        public ArtistBuilder setInAttivita (boolean inAttivita) {
            this.inAttivita = inAttivita;
            return this;
        }

        public Artist build() {
            return new Artist(this);
        }

    }*/

    public static class ArtistBuilderNew <T extends ArtistBuilderNew<T>> {
        private String nome;
        private String genere;
        private int numeroAlbum;
        private boolean inAttivita;

        public T setNome (String nome) {
            this.nome = nome;
            return (T)this;
        }

        public T setGenere (String genere) {
            this.genere = genere;
            return (T)this;
        }

        public T setNumeroAlbum (int numeroAlbum) {
            this.numeroAlbum = numeroAlbum;
            return (T)this;
        }

        public T setInAttivita (boolean inAttivita) {
            this.inAttivita = inAttivita;
            return (T)this;
        }

        public Artist build() {
            return new Artist(this);
        }

    }


}
