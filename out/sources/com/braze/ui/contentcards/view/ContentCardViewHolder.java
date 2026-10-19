package com.braze.ui.contentcards.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.braze.ui.R;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ContentCardViewHolder.kt */
/* JADX INFO: loaded from: classes.dex */
public class ContentCardViewHolder extends RecyclerView.B {
    private final TextView actionHint;
    private final ImageView pinnedIcon;
    private final View unreadBar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentCardViewHolder(View view, boolean z10) {
        super(view);
        i.e(view, "view");
        View viewFindViewById = view.findViewById(R.id.com_braze_content_cards_unread_bar);
        this.unreadBar = viewFindViewById;
        this.pinnedIcon = (ImageView) view.findViewById(R.id.com_braze_content_cards_pinned_icon);
        this.actionHint = (TextView) view.findViewById(R.id.com_braze_content_cards_action_hint);
        if (!z10) {
            if (viewFindViewById == null) {
                return;
            }
            viewFindViewById.setVisibility(8);
        } else {
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
            if (viewFindViewById == null) {
                return;
            }
            viewFindViewById.setBackground(view.getContext().getResources().getDrawable(R.drawable.com_braze_content_cards_unread_bar_background));
        }
    }

    public final void setActionHintText(String text) {
        i.e(text, "text");
        TextView textView = this.actionHint;
        if (textView == null) {
            return;
        }
        textView.setText(text);
    }

    public final void setActionHintVisible(boolean z10) {
        TextView textView = this.actionHint;
        if (textView == null) {
            return;
        }
        textView.setVisibility(z10 ? 0 : 8);
    }

    public final void setPinnedIconVisible(boolean z10) {
        ImageView imageView = this.pinnedIcon;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(z10 ? 0 : 8);
    }

    public final void setUnreadBarVisible(boolean z10) {
        View view = this.unreadBar;
        if (view == null) {
            return;
        }
        view.setVisibility(z10 ? 0 : 8);
    }
}
