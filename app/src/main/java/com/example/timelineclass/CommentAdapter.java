package com.example.timelineclass;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.ViewHolder>{
    ArrayList<Comment> commentList;
    Context context;

    public interface OnItemClickListener{
        void onItemClicked(int position, String data);
    }

    private OnItemClickListener itemClickListener;

    public void setOnItemClickListener(OnItemClickListener listener){
        itemClickListener = listener;
    }

    public CommentAdapter(ArrayList<Comment> commentList, Context context){
        this.commentList = commentList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.comment_layout, viewGroup, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Comment item = commentList.get(position);
        viewHolder.setItem(item);

        viewHolder.itemView.setTag(position);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = "";
                int position = viewHolder.getAdapterPosition();
                if (position != RecyclerView.NO_POSITION){
                    data = viewHolder.tvVideoTime.getText().toString();
                }
                itemClickListener.onItemClicked(position,data);
            }
        });

    }

    @Override
    public int getItemCount() {
        return commentList.size();
    }

    public void addItem(Comment item){
        commentList.add(item);
    }
    public void setItems(ArrayList<Comment> items){
        this.commentList = items;
    }

    public Comment getItem(int position){
        return commentList.get(position);
    }

    public void setItem(int position, Comment item){
        commentList.set(position, item);
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvName;
        TextView tvVideoTime;
        TextView tvComment;

        public ViewHolder(View itemView){
            super(itemView);

            tvName = itemView.findViewById(R.id.studentName);
            tvVideoTime = itemView.findViewById(R.id.videoTime);
            tvComment = itemView.findViewById(R.id.commentContent);

        }

        public void setItem(Comment item){
            tvName.setText(item.getName());
            tvVideoTime.setText(item.getVideoTime());
            tvComment.setText(item.getContent());
        }

    }


}