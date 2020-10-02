package com.johnsoft.futaschools.books;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.johnsoft.futaschools.R;

public class Book1Activity extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book1);

        pdfView = (PDFView) findViewById(R.id.pdf_view);
        pdfView.fromAsset("AbhiAndroid.pdf").load();
    }
}