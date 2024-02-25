package com.example.anonymousgradingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class BarcodeActivity extends AppCompatActivity {

    private RecyclerView barcodeMapRecyclerView;
    private BarcodeAdapter adapter;
    private List<BarcodeItem> barcodeItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcode);

        barcodeMapRecyclerView = findViewById(R.id.barcodeMapRecyclerView);
        barcodeMapRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize with dummy data
        barcodeItemList = new ArrayList<>();
        barcodeItemList.add(new BarcodeItem("123456789", "John Doe"));
        barcodeItemList.add(new BarcodeItem("987654321", "Jane Doe"));
        barcodeItemList.add(new BarcodeItem("123123123", "John Smith"));
        barcodeItemList.add(new BarcodeItem("456456456", "Jane Smith"));
        barcodeItemList.add(new BarcodeItem("789789789", "John Johnson"));

        adapter = new BarcodeAdapter(this, barcodeItemList);
        barcodeMapRecyclerView.setAdapter(adapter);
    }
}
