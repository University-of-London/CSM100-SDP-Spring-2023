package reactive;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public class SubmissionPublisherExample {
  public static void main(String[] args) throws InterruptedException {
    ExecutorService executor = Executors.newFixedThreadPool(1);
    SubmissionPublisher<String> sb = new SubmissionPublisher<>(executor, Flow.defaultBufferSize());
    sb.subscribe(new MySubscriber());
    sb.submit("item 1");
    sb.submit("item 2");
    sb.submit("item 3");

    executor.shutdown();
  }
}