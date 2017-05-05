package laughingleviathon.recyclerview_inclass;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by User on 4/12/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.mVH> {
    private  String[] myData;

    public MyAdapter(String[] myData) {
        this.myData = myData;
    }

    // holder class
    public class mVH extends RecyclerView.ViewHolder {
        public TextView mText;
        public mVH(View itemView){
            super(itemView);
            mText = (TextView) itemView.findViewById(R.id.textView);
        }
    }


    @Override
    public mVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_v, parent, false);
        return new mVH(itemView);
    }

    @Override
    public void onBindViewHolder(mVH holder, int position) {
        holder.mText.setText(myData[position]);
    }

    @Override
    public int getItemCount() {
        return myData.length;
    }


}
