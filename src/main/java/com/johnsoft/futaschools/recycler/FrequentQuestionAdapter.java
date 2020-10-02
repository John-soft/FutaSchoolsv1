package com.johnsoft.futaschools.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.johnsoft.futaschools.R;
import com.johnsoft.futaschools.model.FrequentQuestionDetails;
import com.johnsoft.futaschools.model.HodProfileDetails;

import java.util.List;

public class FrequentQuestionAdapter extends RecyclerView.Adapter<FrequentQuestionAdapter.FrequentQuestionVH> {
    private List<FrequentQuestionDetails> frequentQuestionDetailsList;

    public FrequentQuestionAdapter(List<FrequentQuestionDetails> frequentQuestionDetailsList) {
        this.frequentQuestionDetailsList = frequentQuestionDetailsList;
    }

    @NonNull
    @Override
    public FrequentQuestionVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.faq_list_row, parent , false);
        return new FrequentQuestionVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FrequentQuestionVH holder, int position) {
        FrequentQuestionDetails frequentQuestionDetails = frequentQuestionDetailsList.get(position);
        holder.faqTitle.setText(frequentQuestionDetails.getTitle());
        holder.faqQuestion.setText(frequentQuestionDetails.getFaqQuestion());

        boolean isExpanded = frequentQuestionDetailsList.get(position).isExpanded();
        holder.expandableLayout.setVisibility(isExpanded ? View.VISIBLE : View.GONE);
    }

    @Override
    public int getItemCount() {
        return frequentQuestionDetailsList.size();
    }

    class FrequentQuestionVH extends RecyclerView.ViewHolder{
        private TextView faqTitle;
        private TextView faqQuestion;
        private RelativeLayout expandableLayout;
          public FrequentQuestionVH(@NonNull View itemView) {
            super(itemView);
            faqTitle = (TextView) itemView.findViewById(R.id.titleTextView);
            faqQuestion = (TextView) itemView.findViewById(R.id.faq_questions);
            expandableLayout = (RelativeLayout) itemView.findViewById(R.id.expandableLayout);

              faqTitle.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      FrequentQuestionDetails frequentQuestionDetails = frequentQuestionDetailsList.get(getAdapterPosition());
                      frequentQuestionDetails.setExpanded((!frequentQuestionDetails.isExpanded()));
                      notifyItemChanged(getAdapterPosition());
                  }
              });
        }
    }
}
