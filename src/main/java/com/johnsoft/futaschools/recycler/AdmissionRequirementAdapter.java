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

import java.util.List;

public class AdmissionRequirementAdapter extends RecyclerView.Adapter<AdmissionRequirementAdapter.AdmissionRequirementVH> {
    private List<AdmissionRequirementDetails> admissionRequirementDetailsList;

    public AdmissionRequirementAdapter(List<AdmissionRequirementDetails> admissionRequirementDetailsList) {
        this.admissionRequirementDetailsList = admissionRequirementDetailsList;
    }

    @NonNull
    @Override
    public AdmissionRequirementVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.admission_requirement_row, parent, false);
        return new AdmissionRequirementVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdmissionRequirementVH holder, int position) {
        AdmissionRequirementDetails adminRequirementDetails = admissionRequirementDetailsList.get(position);
        holder.title.setText(adminRequirementDetails.getTitleText());
        holder.adminRequirement.setText(adminRequirementDetails.getAdminRequirementText());

        boolean isExpanded = admissionRequirementDetailsList.get(position).isExpanded();
        holder.expandableLayout.setVisibility(isExpanded ? View.VISIBLE : View.GONE);

    }

    @Override
    public int getItemCount() {
        return admissionRequirementDetailsList.size();
    }

    class AdmissionRequirementVH extends RecyclerView.ViewHolder{
        TextView title;
        TextView adminRequirement;
        RelativeLayout expandableLayout;
        public AdmissionRequirementVH(@NonNull View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.titleTextView);
            adminRequirement = (TextView) itemView.findViewById(R.id.admission_requirement_text);
            expandableLayout = (RelativeLayout) itemView.findViewById(R.id.expandableLayout);

            title.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AdmissionRequirementDetails admissionRequirementDetails = admissionRequirementDetailsList.get(getAdapterPosition());
                    admissionRequirementDetails.setExpanded(!admissionRequirementDetails.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });

        }
    }
}
