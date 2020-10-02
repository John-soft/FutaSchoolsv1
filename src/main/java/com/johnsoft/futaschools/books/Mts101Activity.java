package com.johnsoft.futaschools.books;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.johnsoft.futaschools.R;

public class Mts101Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mts101);
        PDFView pdfView = (PDFView) findViewById(R.id.mts101_pdf);
        pdfView.fromAsset("AhbiAndroid.pdf").load();
    }
}