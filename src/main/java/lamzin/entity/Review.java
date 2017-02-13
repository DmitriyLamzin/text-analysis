package lamzin.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Review {
  private String UID;
  private LocalDateTime changeDate;
  private LocalDateTime confirmationDate;
  private LocalDateTime creationDate;
  private String comment;

  private List<Mark> creteria;
  private String mark;
  private String markDescription;


  public Review() {
  }

  public String getUID() {
    return UID;
  }

  public void setUID(String UID) {
    this.UID = UID;
  }

  public LocalDateTime getChangeDate() {
    return changeDate;
  }

  public void setChangeDate(String changeDate) {
    this.changeDate = LocalDateTime.parse(changeDate, DateTimeFormatter.ISO_DATE_TIME);
  }

  public LocalDateTime getConfirmationDate() {
    return confirmationDate;
  }

  public void setConfirmationDate(String confirmationDate) {
    this.changeDate = LocalDateTime.parse(confirmationDate, DateTimeFormatter.ISO_DATE_TIME);

  }

  public LocalDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.changeDate = LocalDateTime.parse(creationDate, DateTimeFormatter.ISO_DATE_TIME);
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public List<Mark> getCreteria() {
    return creteria;
  }

  public void setCreteria(List<Mark> creteria) {
    this.creteria = creteria;
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

  @Override
  public String toString() {
    return "Review{" +
            "UID='" + UID + '\'' +
            ", changeDate=" + changeDate +
            ", confirmationDate=" + confirmationDate +
            ", creationDate=" + creationDate +
            ", comment='" + comment + '\'' +
            ", creteria=" + creteria +
            ", mark='" + mark + '\'' +
            ", markDescription='" + markDescription + '\'' +
            '}';
  }
}
