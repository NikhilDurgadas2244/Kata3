package kata3;

public class Kata3 {

    public static void main(String[] args) {
           Histogram<String> histogram = new Histogram<>();
           histogram.increment("gmail.com");
           histogram.increment("gmail.com");
           histogram.increment("gmail.com");
           histogram.increment("gmail.com");
           histogram.increment("gmail.com");
           histogram.increment("icloud.com");
           histogram.increment("icloud.com");
           histogram.increment("yahoo.com");
           histogram.increment("hotmail.com");
           histogram.increment("hotmail.com");
           histogram.increment("hotmail.com");
           histogram.increment("hotmail.com");
           histogram.increment("hotmail.com");
           new HistogramDisplay(histogram,"prueba").execute();
    }
    
}
