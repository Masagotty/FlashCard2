package android.lifeistech.com.flashcard2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Card> mCards;
    CardAdapter mCardAdapter;
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.listView);
        mCards = new ArrayList<Card>();

        mCards.add(new Card(R.drawable.ketsu, getString(R.string.ketsu_title), getString(R.string.ketsu_content), getString(R.string.ketsu_meaning)));
        mCards.add(new Card(R.drawable.chabu, getString(R.string.chabu_title), getString(R.string.chabu_content), getString(R.string.chabu_meaning)));
        mCards.add(new Card(R.drawable.sm, getString(R.string.sm_title), getString(R.string.sm_content), getString(R.string.sm_meaning)));
        mCards.add(new Card(R.drawable.segway, getString(R.string.segway_title), getString(R.string.segway_content), getString(R.string.segway_meaning)));
        mCards.add(new Card(R.drawable.fxxk, getString(R.string.fxxk_title), getString(R.string.fxxk_content), getString(R.string.fxxk_meaning)));
        mCards.add(new Card(R.drawable.memo, getString(R.string.memo_title), getString(R.string.memo_content), getString(R.string.memo_meaning)));

        mCardAdapter = new CardAdapter(this, R.layout.card, mCards);
        mListView.setAdapter(mCardAdapter);
    }
}