package com.polimorfirmo;

/**
 *
 * @author sebas
 */
public class Principal{
    public static void main(String[] args) {
        Series[] serie={new NarcoSeries(), new Caricaturas(), new Anime(), new Telenovelas()};
        
        for(Series series:serie){
            series.Series();
        }
    }
}
