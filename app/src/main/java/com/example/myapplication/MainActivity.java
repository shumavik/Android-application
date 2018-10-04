package com.example.myapplication;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;
import java.io.FileInputStream;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.FileInputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity  {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AssetManager am = getApplicationContext().getAssets();

        XWPFDocument docx = null;
        try {
            docx = new XWPFDocument(new FileInputStream("LR№2.docx"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        XWPFWordExtractor we = new XWPFWordExtractor(docx);
        System.out.println(we.getText());



      //  PDFView pdfView = (PDFView) findViewById(R.id.pdfView);

       // pdfView.fromAsset("LR_DECODER.pdf").defaultPage(3).load();

    }
}
