package io.github.iamyours.wandroid.vo.xxmh;

public class XPicture {
    public long id;
    public String url;
    public int sequence;
    public long chapterId;
    public int chapterSequence;

    public String getSequenceText() {
        return "" + sequence;
    }
}
