package Concurrency.concurrentcollections;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static java.lang.Thread.currentThread;

/**
 * class: ConcurrentSkipListMap is the analogue of TreeMap.
 *
 * <p>ConcurrentSkipListMap offers a snapshot of immutable Map.
 */
public class UsingConcurrentTreeMap {
  private static ExecutorService executorService = Executors.newFixedThreadPool(3);
  private static EventSortingStore eventSortingStore = new EventSortingStore();

  public static void main(String[] args) throws InterruptedException {
    IntStream.range(0, 100).forEach(UsingConcurrentTreeMap::commitTaskToPool);

    // testing if submitted tasks having been done
    if (!executorService.isTerminated()) {

      // blocking to wait the tasks having been done.
      executorService.awaitTermination(3, TimeUnit.SECONDS);
      executorService.shutdownNow();
    }

    System.out.println("current size: " + eventSortingStore.getLast60SecEvents());
    System.out.println("service is terminated");
  }

  private static void commitTaskToPool(int index) {
    executorService.submit(
        () -> {
          String content = currentThread().getName() + " is handling " + index + " event";
          Event e = new Event(ZonedDateTime.now().minusSeconds(index), content);
          eventSortingStore.addEvent(e);
        });
  }
}

class EventSortingStore {

  private ConcurrentNavigableMap<ZonedDateTime, String> timeEventMap;

  public EventSortingStore() {
    timeEventMap = new ConcurrentSkipListMap<>();
  }

  public void addEvent(Event event) {
    timeEventMap.put(event.getEventTime(), event.getContext());
  }

  public ConcurrentMap<ZonedDateTime, String> getLast60SecEvents() {
    return timeEventMap.tailMap(ZonedDateTime.now().minus(60, ChronoUnit.SECONDS));
  }

  public ConcurrentMap<ZonedDateTime, String> getBefore60SecEvents() {
    return timeEventMap.headMap(ZonedDateTime.now().minus(60, ChronoUnit.SECONDS));
  }

  public ConcurrentNavigableMap<ZonedDateTime, String> getTimeEventMap() {
    return timeEventMap;
  }
}

class Event {
  private ZonedDateTime eventTime;
  private String context;

  public Event() {}

  public Event(ZonedDateTime eventTime, String context) {
    this();
    this.eventTime = eventTime;
    this.context = context;
  }

  public ZonedDateTime getEventTime() {
    return eventTime;
  }

  public void setEventTime(ZonedDateTime eventTime) {
    this.eventTime = eventTime;
  }

  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }
}
