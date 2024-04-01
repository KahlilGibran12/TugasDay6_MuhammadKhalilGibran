package com.example.tugasday6;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterItem extends RecyclerView.Adapter<AdapterItem.ViewHolder> {

    private final ArrayList<NamaItem> NamaItems;
    private final Context context;

    public AdapterItem(ArrayList<NamaItem> namaItems, Context context) {
        NamaItems = namaItems;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterItem.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterItem.ViewHolder holder, int position) {
        final NamaItem namaItem = NamaItems.get(position);
        holder.tvName.setText(namaItem.getName());
        holder.tvDeskripsi.setText(namaItem.getDeskripsi());
        holder.tvHarga.setText(namaItem.getHarga());
        holder.ivFotoItem.setImageResource(namaItem.getFotoItem());

        // Set click listener
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle item click, for example, start detail activity
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("itemId", namaItem.getId()); // Pass item ID to detail activity
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return NamaItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvName, tvDeskripsi, tvHarga;
        ImageView ivFotoItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.tvName);
            tvDeskripsi = itemView.findViewById(R.id.tvDeskripsi);
            tvHarga = itemView.findViewById(R.id.tvHarga);
            ivFotoItem = itemView.findViewById(R.id.ivFotoItem);
        }
    }
}
