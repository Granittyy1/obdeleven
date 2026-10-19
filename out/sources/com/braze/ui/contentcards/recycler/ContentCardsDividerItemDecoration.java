package com.braze.ui.contentcards.recycler;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.braze.ui.R;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ContentCardsDividerItemDecoration.kt */
/* JADX INFO: loaded from: classes.dex */
public class ContentCardsDividerItemDecoration extends RecyclerView.k {
    private final Context appContext;
    private final int contentCardsItemMaxWidth;
    private final int itemDividerHeight;

    public ContentCardsDividerItemDecoration(Context context) {
        i.e(context, "context");
        Context applicationContext = context.getApplicationContext();
        i.d(applicationContext, "context.applicationContext");
        this.appContext = applicationContext;
        this.itemDividerHeight = applicationContext.getResources().getDimensionPixelSize(R.dimen.com_braze_content_cards_divider_height);
        this.contentCardsItemMaxWidth = applicationContext.getResources().getDimensionPixelSize(R.dimen.com_braze_content_cards_max_width);
    }

    private final int getSidePaddingValue(int i10) {
        int i11 = (i10 - this.contentCardsItemMaxWidth) / 2;
        if (i11 < 0) {
            return 0;
        }
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public void getItemOffsets(Rect itemViewOutputRect, View view, RecyclerView parent, RecyclerView.x state) {
        boolean zIsControlCardAtPosition;
        i.e(itemViewOutputRect, "itemViewOutputRect");
        i.e(view, "view");
        i.e(parent, "parent");
        i.e(state, "state");
        super.getItemOffsets(itemViewOutputRect, view, parent, state);
        RecyclerView.B bN = RecyclerView.N(view);
        int absoluteAdapterPosition = bN != null ? bN.getAbsoluteAdapterPosition() : -1;
        if (parent.getAdapter() instanceof ContentCardAdapter) {
            RecyclerView.Adapter adapter = parent.getAdapter();
            i.c(adapter, "null cannot be cast to non-null type com.braze.ui.contentcards.adapters.ContentCardAdapter");
            zIsControlCardAtPosition = ((ContentCardAdapter) adapter).isControlCardAtPosition(absoluteAdapterPosition);
        } else {
            zIsControlCardAtPosition = false;
        }
        itemViewOutputRect.top = absoluteAdapterPosition == 0 ? this.itemDividerHeight : 0;
        itemViewOutputRect.bottom = zIsControlCardAtPosition ? 0 : this.itemDividerHeight;
        int sidePaddingValue = getSidePaddingValue(parent.getWidth());
        itemViewOutputRect.left = sidePaddingValue;
        itemViewOutputRect.right = sidePaddingValue;
    }
}
