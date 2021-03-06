package de.hampager.dap4j.models;

public class News {

    private String text;
    private String rubricName;
    private Integer number;
    private String timestamp;
    private String ownerName;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getRubricName() {
        return rubricName;
    }

    public void setRubricName(String rubricName) {
        this.rubricName = rubricName;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public News(String text, String rubricName, Integer number, String timestamp, String ownerName) {
        this.text = text;
        this.rubricName = rubricName;
        this.number = number;
        this.timestamp = timestamp;
        this.ownerName = ownerName;
    }

    public News(String text, String rubricName, Integer number) {
        this.text = text;
        this.rubricName = rubricName;
        this.number = number;
    }
}
