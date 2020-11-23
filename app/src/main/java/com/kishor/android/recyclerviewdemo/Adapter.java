package com.kishor.android.recyclerviewdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.viewholder> {

    private List<ModelClass> modelClassList;

    public Adapter(List<ModelClass> modelClassList) {
        this.modelClassList = modelClassList;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout,viewGroup,false);
       return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder viewholder, int position) {
        int resource=modelClassList.get(position).getImageResource();
        String title=modelClassList.get(position).getTitle();
        String body=modelClassList.get(position).getBody();

        viewholder.setData(resource,title,body);


    }

    @Override
    public int getItemCount() {
        return modelClassList.size();
    }

       class viewholder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView title;
        private TextView body;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image_view);
            title=itemView.findViewById(R.id.id_title);
            body=itemView.findViewById(R.id.id_body);
        }
        private void setData(int resource, String titleText, String bodyText){
            imageView.setImageResource(resource);
            title.setText(titleText);
            body.setText(bodyText);
        }
    }

}
