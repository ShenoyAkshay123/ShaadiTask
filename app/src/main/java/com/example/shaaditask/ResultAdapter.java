package com.example.shaaditask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shaaditask.Model.Result;
import com.google.android.material.button.MaterialButton;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ResultAdapter extends RecyclerView.Adapter<ResultAdapter.ResultViewHolder> {
    Context context;
    List<Result> result;

    public ResultAdapter(List<Result> result, Context context) {
        this.result = result;
        this.context = context;
    }

    @NonNull
    @Override
    public ResultViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView=LayoutInflater.from(parent.getContext()).inflate(R.layout.card_custom_view,parent,false);
        return new ResultViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull ResultViewHolder holder, int position) {
            holder.textView1.setText("Name : " + result.get(position).getName().getFirst() + " " + result.get(position).getName().getLast());
            holder.textView2.setText( "Email : " +result.get(position).getEmail());
            holder.textView3.setText("Gender : " + result.get(position).getGender());
            holder.textView4.setText("Call me at : " + result.get(position).getPhone());

        Picasso.with(context).load(result.get(position).getPicture().getLarge()).into(holder.imageView);

        holder.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.btn1.setVisibility(View.GONE);
                holder.btn2.setVisibility(View.GONE);
                holder.text1.setVisibility(View.VISIBLE);
                holder.text1.setText("This person has been selected");

            }
        });


        holder.btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.btn1.setVisibility(View.GONE);
                holder.btn2.setVisibility(View.GONE);
                holder.text1.setVisibility(View.VISIBLE);
                holder.text1.setText("This person has been rejected");

            }
        });


    }

    @Override
    public int getItemCount() {
        return result.size();
    }


    class ResultViewHolder extends RecyclerView.ViewHolder {
        TextView textView1;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView text1;
        ImageView imageView;
        MaterialButton btn1;
        MaterialButton btn2;

        public ResultViewHolder(@NonNull View itemView) {
            super(itemView);
             textView1 = itemView.findViewById(R.id.textView1);
             textView2 = itemView.findViewById(R.id.textView2);
             textView3 = itemView.findViewById(R.id.textView4);
             textView4 = itemView.findViewById(R.id.textView5);
             text1 = itemView.findViewById(R.id.text1);
             imageView = itemView.findViewById(R.id.img1);
             btn1 = itemView.findViewById(R.id.button1);
             btn2 = itemView.findViewById(R.id.button2);

        }
    }
}
