package com.erasmo.builder_exercise.model;

public class SingerSongwriter extends Artist {

    int canzoniScritte;
    String strumento;
    boolean isItaliano;

    private SingerSongwriter(SingerSongwriterBuilder builder) {
        super(builder);
        this.canzoniScritte = builder.canzoniScritte;
        this.strumento = builder.strumento;
        this.isItaliano = builder.isItaliano;
    }

    @Override
    public String toString() {
        return  "SingerSongwriter{" +
                " nome = " + super.getNome() +
                ", genere = " + super.getGenere() +
                ", canzoniScritte= " + canzoniScritte +
                ", strumento=' " + strumento + '\'' +
                ", isItaliano= " + isItaliano +
                '}';
    }

    public static class SingerSongwriterBuilder extends Artist.ArtistBuilderNew<SingerSongwriterBuilder> {
        int canzoniScritte;
        String strumento;
        boolean isItaliano;

        public SingerSongwriterBuilder setCanzoniScritte (int canzoniScritte) {
            this.canzoniScritte = canzoniScritte;
            return this;
        }

        public SingerSongwriterBuilder setStrumento (String strumento) {
            this.strumento = strumento;
            return this;
        }

        public SingerSongwriterBuilder setIsItaliano ( boolean isItaliano) {
            this.isItaliano = isItaliano;
            return this;
        }

        public SingerSongwriter build() {

            return new SingerSongwriter(this);
        }



    }
}
