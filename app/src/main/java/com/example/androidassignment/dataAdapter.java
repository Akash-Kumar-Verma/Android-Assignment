package com.example.androidassignment;

import static com.example.androidassignment.R.id.fill;
import static com.example.androidassignment.R.id.image;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class dataAdapter extends RecyclerView.Adapter<dataAdapter.viewHolder> {

    List<data> datalist;
    Context context;

    public dataAdapter(Context context, List<data> list) {
        this.context = context;
        datalist = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_data , parent , false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        data post = datalist.get(position);
        holder.name.setText(post.getName());
        holder.subjects.setText(post.getSubjects().get(0));
        String ans="";
        for(int i=0;i<post.getQualification().size();++i) ans+=post.getQualification().get(i)+"\n";
        holder.qualification.setText(ans);
         Picasso.with(context).load(post.getProfileImage()).resize(100,100).into(holder.profileImage);
        //Glide.with(context).load(post.getProfileImage()).into(holder.profileimage);
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        private TextView name,subjects,qualification;
        private ImageView profileImage;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            profileImage = itemView.findViewById(R.id.ProfileImage);
            subjects=itemView.findViewById(R.id.subject);
            qualification=itemView.findViewById(R.id.qualification);
        }
    }
}
