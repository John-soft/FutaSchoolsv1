package com.johnsoft.futaschools.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.johnsoft.futaschools.R;
import com.johnsoft.futaschools.model.AboutDepartmentDetails;

import java.util.List;

public class AboutDepartmentAdapter extends RecyclerView.Adapter<AboutDepartmentAdapter.AboutDepartmentVH> {
    private List<AboutDepartmentDetails> aboutDepartmentDetailsList;

    public AboutDepartmentAdapter(List<AboutDepartmentDetails> aboutDepartmentDetailsList) {
        this.aboutDepartmentDetailsList = aboutDepartmentDetailsList;
    }

    @NonNull
    @Override
    public AboutDepartmentVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.about_department_row, parent, false);
        return new AboutDepartmentVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AboutDepartmentVH holder, int position) {
        AboutDepartmentDetails aboutDepartmentDetails = aboutDepartmentDetailsList.get(position);
        holder.aboutTitle.setText(aboutDepartmentDetails.getTitleText());
        holder.welcomeText.setText(aboutDepartmentDetails.getWelcomeText());
        holder.aboutDeptText.setText(aboutDepartmentDetails.getAboutText());

        boolean isExpanded = aboutDepartmentDetailsList.get(position).isExpanded();
        holder.expandableRelativeLayout.setVisibility(isExpanded ? View.VISIBLE : View.GONE);
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    class AboutDepartmentVH extends RecyclerView.ViewHolder{
        private TextView aboutTitle;
        private TextView welcomeText;
        private TextView aboutDeptText;
        private RelativeLayout expandableRelativeLayout;
        public AboutDepartmentVH(@NonNull View itemView) {
            super(itemView);
            aboutTitle = (TextView) itemView.findViewById(R.id.titleTextView);
            welcomeText = (TextView) itemView.findViewById(R.id.welcome_text);
            aboutDeptText = (TextView) itemView.findViewById(R.id.about_text);
            expandableRelativeLayout = (RelativeLayout) itemView.findViewById(R.id.expandableLayout);

            aboutTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AboutDepartmentDetails aboutDepartmentDetails = aboutDepartmentDetailsList.get(getAdapterPosition());
                    aboutDepartmentDetails.setExpanded(!aboutDepartmentDetails.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });

        }
    }
}
