package com.vuthithom.tienganhchobe.model;

public class TestLesson {
    private int[] idImg = new int[4];
    private String answer;
    private String text[] = new String[4];

    public int[] getIdImg() {
        return idImg;
    }

    public void setIdImg(int[] idImg) {
        this.idImg = idImg;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String[] getText() {
        return text;
    }

    public void setText(String[] text) {
        this.text = text;
    }

    public TestLesson(int[] idImg, String answer, String[] text) {

        this.idImg = idImg;
        this.answer = answer;
        this.text = text;
    }

    public TestLesson() {

    }
}
