package com.example.anonymousgradingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class BarcodeAdapter extends RecyclerView.Adapter<BarcodeAdapter.BarcodeViewHolder> {

    private List<BarcodeItem> barcodeList;
    private Context context;

    public BarcodeAdapter(Context context, List<BarcodeItem> barcodeList) {
        this.context = context;
        this.barcodeList = barcodeList;
    }

    @NonNull
    @Override
    public BarcodeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.barcode_item, parent, false);
        return new BarcodeViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull BarcodeViewHolder holder, int position) {
        BarcodeItem item = barcodeList.get(position);
        holder.barcodeTextView.setText(item.getBarcode());
        holder.nameTextView.setText(item.getName());
    }

    @Override
    public int getItemCount() {
        return barcodeList.size();
    }

    public static class BarcodeViewHolder extends RecyclerView.ViewHolder {
        public TextView barcodeTextView;
        public TextView nameTextView;

        public BarcodeViewHolder(@NonNull View itemView) {
            super(itemView);
            barcodeTextView = itemView.findViewById(R.id.barcodeTextView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
        }
    }
}

