package com.braze.ui.contentcards.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.braze.ui.R;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: EmptyContentCardsAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
public class EmptyContentCardsAdapter extends RecyclerView.Adapter<RecyclerView.B> {

    /* JADX INFO: compiled from: EmptyContentCardsAdapter.kt */
    public static final class NetworkUnavailableViewHolder extends RecyclerView.B {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkUnavailableViewHolder(View view) {
            super(view);
            i.e(view, "view");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.B viewHolder, int i10) {
        i.e(viewHolder, "viewHolder");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
        i.e(viewGroup, "viewGroup");
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.com_braze_content_cards_empty, viewGroup, false);
        i.d(view, "view");
        return new NetworkUnavailableViewHolder(view);
    }
}
