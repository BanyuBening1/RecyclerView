package com.example.recyclerview;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.ViewHolder>{
    private ArrayList<ModelMakanan> listMakanan;
    private final OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(ModelMakanan makanan);
    }

    public MakananAdapter(ArrayList<ModelMakanan> listMakanan, OnItemClickListener listener){
        this.listMakanan = listMakanan;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ModelMakanan makanan = listMakanan.get(position);
        holder.tvNamaMakanan.setText(makanan.getNamaMakanan());
        holder.tvDeskripsi.setText(makanan.getDeskripsiMakanan());
        holder.tvHarga.setText(makanan.getHargaMakanan());
        holder.imgMakanan.setImageResource(makanan.getImageMakanan());
        holder.itemView.setOnClickListener(v -> listener.onItemClick(makanan));
    }

    @Override
    public int getItemCount() {
        return listMakanan.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView tvNamaMakanan,tvHarga ,tvDeskripsi;
        ImageView imgMakanan;

        public ViewHolder(View itemView) {
            super(itemView);
            tvNamaMakanan = itemView.findViewById(R.id.tvNamaMakanan);
            tvDeskripsi = itemView.findViewById(R.id.tvDeskripsi);
            tvHarga = itemView.findViewById(R.id.tvHarga);
            imgMakanan = itemView.findViewById(R.id.imgMakanan);
        }
    }

}