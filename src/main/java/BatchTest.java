import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class BatchTest {

//    final String MAIN_DIR = "/Users/mac/Desktop/logfile.txt";
//
//    private void fileWriter(File file, String text) {
//        try {BufferedWriter bf = new BufferedWriter(new FileWriter(file, true));
//            bf.append(text);
//            bf.newLine();
//            bf.close();
//            //TODO: print success of transacton to log file
//        } catch (IOException e) {
//            e.getCause();
//        }
//    }

//    @GetMapping(value = "/tweets-non-blocking",
//            produces = MediaType.TEXT_EVENT_STREAM_VALUE)
//    public Flux<Tweet> getTweetsNonBlocking() {
//        log.info("Starting NON-BLOCKING Controller!");
//        Flux<Tweet> tweetFlux = WebClient.create()
//                .get()
//                .uri(getSlowServiceUri())
//                .retrieve()
//                .bodyToFlux(Tweet.class);
//
//        tweetFlux.subscribe(tweet -> log.info(tweet.toString()));
//        log.info("Exiting NON-BLOCKING Controller!");
//        return tweetFlux;
//    }

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;
        int num = 450000;

        try {

            // This block configure the logger with handler and formatter
          //  fh = new FileHandler("C:/temp/test/MyLogFile.log");
            fh = new FileHandler("/Users/mac/Desktop/logfile.txt");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            while (num > 1) {
                // the following statement is used to log any messages
                logger.info("My first log");
                num--;
            }

        } catch (SecurityException | IOException e) {
            e.getCause();
            logger.info(String.valueOf(e.getCause()));
        }
    }
}
