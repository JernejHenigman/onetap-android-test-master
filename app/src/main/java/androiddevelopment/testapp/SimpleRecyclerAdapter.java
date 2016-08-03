package androiddevelopment.testapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Nejc on 20.2.2016.
 */
public class SimpleRecyclerAdapter extends RecyclerView.Adapter<SimpleRecyclerAdapter.VersionViewHolder> {
    List<String> quotes;

    public SimpleRecyclerAdapter(List<String> versionModels) {
        this.quotes = versionModels;
    }

    @Override
    public VersionViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyclerlist_item, viewGroup, false);
        VersionViewHolder viewHolder = new VersionViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(VersionViewHolder versionViewHolder, int i) {
        versionViewHolder.quoteText.setText(quotes.get(i));
    }

    @Override
    public int getItemCount() {
        return quotes == null ? 0 : quotes.size();
    }

    class VersionViewHolder extends RecyclerView.ViewHolder {
        TextView quoteText;

        public VersionViewHolder(View itemView) {
            super(itemView);
            quoteText = (TextView) itemView.findViewById(R.id.quote_text);

        }
    }
}
