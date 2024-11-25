package com.erasmo.builder_exercise.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@ToString
public class Tour {
    private String nome;
    private Artist artist;
    private int numeroDate;

/*    @Override
    public String toString() {
        return  "Tour --> Nome: " + this.nome + ", " + "Artista: " + this.artist.getNome() + ", " + "numero date: " + this.numeroDate;
    }*/


}
