package com.example.challenge4_1;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NamesViewHolder extends RecyclerView.ViewHolder {

    private final TextView firstName;
    private final TextView lastName;

    private final LinearLayout linearLayout;

    public NamesViewHolder(@NonNull View itemView){
        super(itemView);
        firstName = itemView.findViewById(R.id.firstNameView);
        lastName = itemView.findViewById(R.id.lastNameView);
        linearLayout = itemView.findViewById(R.id.linearLayoutItem);
    }

    public TextView getFirstName(){ return firstName;}

    public TextView getLastName(){return lastName; }

    public LinearLayout getLinearLayout(){ return linearLayout; }


}
