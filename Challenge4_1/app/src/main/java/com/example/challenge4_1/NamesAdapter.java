package com.example.challenge4_1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NamesAdapter extends RecyclerView.Adapter<NamesViewHolder> {

    private List<Names> names;

    public NamesAdapter(List<Names> namesList){ names = namesList; }

    @NonNull
    @Override
    public NamesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.names_views, parent, false);
        return new NamesViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull NamesViewHolder holder, int position) {
        Names currentName = names.get(position);
        holder.getFirstName().setText(currentName.getFirstName());
        holder.getLastName().setText(currentName.getLastName());

            if( position % 2 == 0)
                holder.getLinearLayout().setBackgroundResource(R.color.light_purple);
            else
                holder.getLinearLayout().setBackgroundResource(R.color.purple);

    }

    @Override
    public int getItemCount() {
        return names.size();
    }
}
