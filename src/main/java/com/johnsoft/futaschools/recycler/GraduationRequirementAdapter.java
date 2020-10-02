package com.johnsoft.futaschools.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.johnsoft.futaschools.R;
import com.johnsoft.futaschools.model.GraduationRequirementDetails;

import java.util.List;

public class GraduationRequirementAdapter extends RecyclerView.Adapter<GraduationRequirementAdapter.GraduationRequirementVH> {
    private List<GraduationRequirementDetails> graduationRequirementDetailsList;

    public GraduationRequirementAdapter(List<GraduationRequirementDetails> graduationRequirementDetailsList) {
        this.graduationRequirementDetailsList = graduationRequirementDetailsList;
    }

    @NonNull
    @Override
    public GraduationRequirementVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.graduation_requirement_row, parent, false);
        return new GraduationRequirementVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GraduationRequirementVH holder, int position) {
        GraduationRequirementDetails graduationRequirementDetails = graduationRequirementDetailsList.get(position);
        holder.title.setText(graduationRequirementDetails.getTitleText());
        holder.gradRequirement.setText(graduationRequirementDetails.getGradRequirementText());

        boolean isExpanded = graduationRequirementDetailsList.get(position).isExpanded();
        holder.expandableLayout.setVisibility(isExpanded ? View.VISIBLE : View.GONE);
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    class GraduationRequirementVH extends RecyclerView.ViewHolder{
        TextView title;
        TextView gradRequirement;
        RelativeLayout expandableLayout;

        public GraduationRequirementVH(@NonNull View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.titleTextView);
            gradRequirement = (TextView) itemView.findViewById(R.id.grad_requirement_text);
            expandableLayout = (RelativeLayout) itemView.findViewById(R.id.expandableLayout);

            title.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    GraduationRequirementDetails graduationRequirementDetails = graduationRequirementDetailsList.get(getAdapterPosition());
                    graduationRequirementDetails.setExpanded(!graduationRequirementDetails.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });

        }
    }
}
