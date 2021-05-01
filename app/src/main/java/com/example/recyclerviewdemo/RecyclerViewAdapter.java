package com.example.recyclerviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.recyclerViewHolder> {
    private List<com.example.recyclerviewdemo.Staff> staffList;
    private Context context;

    public RecyclerViewAdapter(List<com.example.recyclerviewdemo.Staff> staffList, Context context) {
        this.staffList = staffList;
        this.context = context;
    }

    @NonNull
    @Override
    public recyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context)
                .inflate(R.layout.staff_row, parent, false);
        return new recyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.recyclerViewHolder holder, int position) {
        holder.rowNameTextView.setText(staffList.get(position).getName());
        holder.rowPositionTextView.setText(staffList.get(position).getPosition());
    }

    @Override
    public int getItemCount() {
        return staffList.size();
    }

    public class recyclerViewHolder extends RecyclerView.ViewHolder {
        public TextView rowNameTextView;
        public TextView rowPositionTextView;

        public recyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            rowNameTextView = itemView.findViewById(R.id.rowNameTextView);
            rowPositionTextView = itemView.findViewById(R.id.rowPositionTextView);
        }
    }
}
