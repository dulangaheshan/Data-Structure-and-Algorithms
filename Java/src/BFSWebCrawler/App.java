package BFSWebCrawler;

public class App {

    public static void main(String[] args) {
        BFSWebCrawler webCrawler = new BFSWebCrawler();

        webCrawler.discoverWeb("https://bbc.com");
    }
}
