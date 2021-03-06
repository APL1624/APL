package com.apl.ticket.ui.home.adapter;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;

import com.apl.ticket.R;
import com.apl.ticket.been.HomePageBeen;
import com.apl.ticket.ui.selectseat.SelectSeat;
import com.squareup.picasso.Picasso;
import com.vittaw.mvplibrary.adapter.ListViewBaseAdapter;

import java.util.List;


public class MoviePreviewAdapter extends ListViewBaseAdapter<HomePageBeen.HPData> implements View.OnClickListener {
    private Context context;

    public MoviePreviewAdapter(Context context, List<HomePageBeen.HPData> data, int layoutResId) {
        super(context, data, layoutResId);
        this.context=context;
    }

    @Override
    protected void bindData(ViewHolder holder, List<HomePageBeen.HPData> data, int position) {


        View view = holder.findView(R.id.pre_head);
        if (position==0){
            view.setVisibility(View.VISIBLE);
        }
        else {
            if (TextUtils.equals(data.get(position).getReleaseDate().substring(5,7),data.get(position-1).getReleaseDate().substring(5,7))){
                view.setVisibility(View.GONE);
            }else{
                int sum=0;
                for (int i = 0; i <data.size() ; i++) {
                    if (data.get(position).getReleaseDate().substring(5,7).equals( data.get(i).getReleaseDate().substring(5,7))) {
                        sum++;
                    }else{

                    }
                }
                holder.setText(R.id.pre_head_text,data.get(position).getReleaseDate().substring(5,7)+"月上映 （"+sum+"）部");
                view.setVisibility(View.VISIBLE);
            }
        }
        ImageView image = (ImageView) holder.findView(R.id.pre_item_image);
        Picasso.with(context).load(data.get(position).getLogo()).into(image);
        holder.setText(R.id.pre_item_title,data.get(position).getName());
        holder.setText(R.id.pre_item_highlight,data.get(position).getHighlight());
        holder.setText(R.id.pre_item_screenings,data.get(position).getScreenings());
        holder.setText(R.id.pre_item_buy_ticket,"查看影讯");
        holder.setText(R.id.pre_item_grade,data.get(position).getNotifyCount());
        if (!data.get(position).getIsScheduleSupport().equals("0")) {
            holder.findView(R.id.pre_item_new_movie).setVisibility(View.VISIBLE);
        }
        holder.findView(R.id.pre_item_buy_ticket).setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
//        context.startActivity(new Intent(context, TheatreDetailActivity.class));
    }
}
