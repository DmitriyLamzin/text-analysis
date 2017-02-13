package lamzin.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Mark {
  private String mark;

  private String markDescription;

  private String type;

  public Mark() {
  }

  public String getMark() {
    return mark;
  }

  public void setMark(String mark) {
    this.mark = mark;
  }

  public String getMarkDescription() {
    return markDescription;
  }

  public void setMarkDescription(String markDescription) {
    this.markDescription = markDescription;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "Mark{" +
            "mark='" + mark + '\'' +
            ", markDescription='" + markDescription + '\'' +
            ", type='" + type + '\'' +
            '}';
  }
}
