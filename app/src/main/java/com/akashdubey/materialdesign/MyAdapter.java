package com.akashdubey.materialdesign;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * TWe are making use of view Holder pattern here to create a Recyclable view
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.VHolder> {


    //here we inflate the view to be used by View Holder
    @Override
    public VHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // if we do not provide group as parent cardview will not take full screen width
        //https://stackoverflow.com/questions/24503760/cardview-layout-width-match-parent-does-not-match-parent-recyclerview-width
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view, parent, false);
        VHolder vHolder = new VHolder(view);
        return vHolder;
    }


    //setting value of view via a holder
    @Override
    public void onBindViewHolder(VHolder holder, int position) {
        holder.version.setText(MainActivity.androOs[position]);
    }

    @Override
    public int getItemCount() {
//        passing array length
        return MainActivity.androOs.length;
    }

    public class VHolder extends RecyclerView.ViewHolder {

        public TextView version;

        public VHolder(View itemView) {

            super(itemView);

            //binding object to view
            version = (TextView) itemView.findViewById(R.id.itemTV);


        }

    }
}
