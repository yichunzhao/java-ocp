package models;

import java.util.Objects;

public class Meeting {
  private String title;
  private String location;

  public Meeting(String title, String location) {
    this.title = title;
    this.location = location;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Meeting)) return false;
    Meeting meeting = (Meeting) o;
    return Objects.equals(title, meeting.title) && Objects.equals(location, meeting.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, location);
  }

  @Override
  public String toString() {
    return "Meeting{" + "title='" + title + '\'' + ", location='" + location + '\'' + '}';
  }
}
