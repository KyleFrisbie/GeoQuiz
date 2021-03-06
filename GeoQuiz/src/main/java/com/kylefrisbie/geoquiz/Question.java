package com.kylefrisbie.geoquiz;

/**
 * Created by Kyle on 9/9/2015.
 */
public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mCheater = false;

    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public boolean isCheater() {
        return mCheater;
    }

    public void setCheater(boolean isCheater) {
        mCheater = isCheater;
    }
}
