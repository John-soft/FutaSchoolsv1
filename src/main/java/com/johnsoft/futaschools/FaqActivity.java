package com.johnsoft.futaschools;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.johnsoft.futaschools.model.FrequentQuestionDetails;
import com.johnsoft.futaschools.recycler.FrequentQuestionAdapter;

import java.util.ArrayList;
import java.util.List;

public class FaqActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    private List<FrequentQuestionDetails> frequentQuestionDetailsList = new ArrayList<>();
    private RecyclerView faqListView;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        mToolbar = (Toolbar) findViewById(R.id.main_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        faqListView = (RecyclerView) findViewById(R.id.faq_list);
        faqListView.setHasFixedSize(true);
        faqListView.setLayoutManager(new LinearLayoutManager(this));
//        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(faqListView.getContext(), DividerItemDecoration.VERTICAL);
//        dividerItemDecoration.setDrawable(ContextCompat.getDrawable(this, R.drawable.recycler_divider));
//        faqListView.addItemDecoration(dividerItemDecoration);
        FrequentQuestionAdapter frequentQuestionAdapter = new FrequentQuestionAdapter(frequentQuestionDetailsList);
        faqListView.setAdapter(frequentQuestionAdapter);

        frequentQuestionDetailsList.add(new FrequentQuestionDetails("How much is futa post-utme form ?", "" +
                "Futa post_utme is sold for the rate of #2000 every year,  but if you want to go and purchase the form" +
                "in cyber-cafe , you should get ready to spend more than that because they will still add their" +
                "own additional charges."));
        frequentQuestionDetailsList.add(new FrequentQuestionDetails("How does futa calculate her post-utme aggregate ?", "" +
                "Update coming shortly"));
        frequentQuestionDetailsList.add(new FrequentQuestionDetails("What is futa jamb cut off mark ?", "" +
                "The official futa cut off mark for jamb is 180"));
        frequentQuestionDetailsList.add(new FrequentQuestionDetails("Is there Medical Laboratory Science in futa ? ", "" +
                "NO"));
        frequentQuestionDetailsList.add(new FrequentQuestionDetails("How many questions and duration is the futa post-utme exam ?", "" +
                "Update Coming shortly..."));
        frequentQuestionDetailsList.add(new FrequentQuestionDetails("Does futa do screening or post-utme ? ", "" +
                "Post-Utme"));
        frequentQuestionDetailsList.add(new FrequentQuestionDetails("Can i be admitted with 49% in post-utme ?",
                "The post utme score for admission in futa is 50%."));
        frequentQuestionDetailsList.add(new FrequentQuestionDetails("Does futa accept awaiting result ? ", "" +
                "Yes"));
        frequentQuestionDetailsList.add(new FrequentQuestionDetails("Am i to upload my results on jamb portal or futa portal ?", "" +
                "Your O'level result is to be uploaded on the jamb website."));
        frequentQuestionDetailsList.add(new FrequentQuestionDetails("How long will it take before i see my post utme result ?", "" +
                "Not less than one hour after writing the exam."));



    }
}