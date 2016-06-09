package android.lifeistech.com.flashcard2;

/**
 * Created by Gotty on 6/9/16.
 */
public class Card {
    public int imageId;
    public String title;
    public String content;
    public int likeNum = 0;

    public String meaning;

    public Card(int imageId, String title, String content, String meaning) {
        this.imageId = imageId;
        this.title = title;
        this.content = content;
        this.meaning = meaning;
    }
}
