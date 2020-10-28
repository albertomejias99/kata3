package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram <String> histogram = new Histogram();
        
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        histogram.increment("google.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("google.es");
        histogram.increment("marca.es");
        histogram.increment("ull.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("google.es");
        histogram.increment("youtube.es");
        histogram.increment("google.es");
        histogram.increment("youtube.es");
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM", histogram);
        histogramDisplay.execute();
    }
    
}
