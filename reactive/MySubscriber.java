package reactive;

import java.util.concurrent.Flow;

public class MySubscriber implements Flow.Subscriber<String> {
  private Flow.Subscription subscription;

  @Override
  public void onSubscribe(Flow.Subscription subscription) {
    System.out.println("onSubscribe: " + subscription);
    this.subscription = subscription;
    subscription.request(2);
  }

  @Override
  public void onNext(String item) {
    System.out.println("item: " + item);
    // conditionally use subscription.request(n);
  }

  @Override
  public void onError(Throwable throwable) {
    System.out.println("error: " + throwable);
  }

  @Override
  public void onComplete() {
    System.out.println("onComplete");
  }
}
