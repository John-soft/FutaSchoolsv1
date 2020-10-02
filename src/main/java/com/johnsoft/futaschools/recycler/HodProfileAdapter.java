package com.johnsoft.futaschools.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.johnsoft.futaschools.R;
import com.johnsoft.futaschools.model.AdmissionRequirementDetails;
import com.johnsoft.futaschools.model.HodProfileDetails;
import com.johnsoft.futaschools.model.ProgramDurationDetails;

import java.util.List;

public class HodProfileAdapter extends RecyclerView.Adapter<HodProfileAdapter.HodProfileVH> {
    private List<HodProfileDetails> hodProfileDetailsList;

    public HodProfileAdapter(List<HodProfileDetails> hodProfileDetailsList) {
        this.hodProfileDetailsList = hodProfileDetailsList;
    }

    @NonNull
    @Override
    public HodProfileVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.hod_profile_row, parent, false);
        return new HodProfileVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HodProfileVH holder, int position) {
        HodProfileDetails hodProfileDetails = hodProfileDetailsList.get(position);
        holder.title.setText(hodProfileDetails.getTitleText());
        holder.hodProfileText.setText(hodProfileDetails.getHodProfileText());

        boolean isExpanded = hodProfileDetailsList.get(position).isExpanded();
        holder.expandableLayout.setVisibility(isExpanded ? View.VISIBLE : View.GONE);

    }

    @Override
    public int getItemCount() {
        return hodProfileDetailsList.size();
    }

    class HodProfileVH extends RecyclerView.ViewHolder{
        TextView title;
        TextView hodProfileText;
        RelativeLayout expandableLayout;
        public HodProfileVH(@NonNull View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.titleTextView);
            hodProfileText = (TextView) itemView.findViewById(R.id.hod_profile_text);
            expandableLayout = (RelativeLayout) itemView.findViewById(R.id.expandableLayout);

            title.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    HodProfileDetails hodProfileDetails = hodProfileDetailsList.get(getAdapterPosition());
                    hodProfileDetails.setExpanded(!hodProfileDetails.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }
}
