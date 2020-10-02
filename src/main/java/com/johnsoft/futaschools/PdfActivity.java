package com.johnsoft.futaschools;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.johnsoft.futaschools.books.Book1Activity;
import com.johnsoft.futaschools.books.Mts101Activity;

import java.util.List;

public class PdfActivity extends AppCompatActivity {
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);

        mToolbar = (Toolbar) findViewById(R.id.main_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mToolbar.setTitle("  100L PDFs");
        mToolbar.setLogo(R.drawable.ic_pdf_icon);

        String[] bookList = {"Operating Systems", "Android Development", "Introduction To Chemistry(CHE101)","Introduction To Biology (BIO101)",
        "Introduction To Mathematics (MTS101)"};

        ListView pdfList = (ListView) findViewById(R.id.pdf_list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.pdf_layout_list, R.id.pdf_text_view,bookList);
        pdfList.setAdapter(adapter);

        pdfList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = (String) parent.getItemAtPosition(position);
                Toast.makeText(PdfActivity.this, selectedItem, Toast.LENGTH_SHORT).show();

                if (selectedItem.equals("Operating Systems")){
                    Intent intent = new Intent(PdfActivity.this, Book1Activity.class);
                    startActivity(intent);
                }else if (selectedItem.equals("Android Development")){
                    Intent intent = new Intent(PdfActivity.this, Mts101Activity.class);
                    startActivity(intent);
                }else if (selectedItem.equals("Introduction To Chemistry(CHE101)")){
                    Intent intent = new Intent(PdfActivity.this, Mts101Activity.class);
                    startActivity(intent);
                }
            }
        });

    }
}