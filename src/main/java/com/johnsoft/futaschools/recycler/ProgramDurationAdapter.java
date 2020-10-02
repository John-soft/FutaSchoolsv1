package com.johnsoft.futaschools.recycler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.johnsoft.futaschools.R;

import com.johnsoft.futaschools.model.ProgramDurationDetails;

import java.util.List;

public class ProgramDurationAdapter extends RecyclerView.Adapter<ProgramDurationAdapter.ProgramDurationTextVH>{
    private List<ProgramDurationDetails> programDurationDetailsList;

    public ProgramDurationAdapter(List<ProgramDurationDetails> programDurationDetailsList) {
        this.programDurationDetailsList = programDurationDetailsList;
    }

    @NonNull
    @Override
    public ProgramDurationTextVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.program_duration_row, parent, false);
        return new ProgramDurationTextVH(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ProgramDurationTextVH holder, int position) {
        ProgramDurationDetails programDurationDetails = programDurationDetailsList.get(position);
        holder.title.setText(programDurationDetails.getTitleText());
        holder.programDurationText.setText(programDurationDetails.getProgramDurationText());

        boolean isExpanded = programDurationDetailsList.get(position).isExpanded();
        holder.expandableLayout.setVisibility(isExpanded ? View.VISIBLE : View.GONE);
    }

    @Override
    public int getItemCount() {
        return programDurationDetailsList.size();

    }

    class ProgramDurationTextVH extends RecyclerView.ViewHolder{
        TextView title;
        TextView programDurationText;
        RelativeLayout expandableLayout;
        public ProgramDurationTextVH(@NonNull View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.titleTextView);
            programDurationText = (TextView) itemView.findViewById(R.id.program_duration_text);
            expandableLayout = (RelativeLayout) itemView.findViewById(R.id.expandableLayout);

            title.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ProgramDurationDetails programDurationDetails = programDurationDetailsList.get(getAdapterPosition());
                    programDurationDetails.setExpanded(!programDurationDetails.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });

        }
    }
}
