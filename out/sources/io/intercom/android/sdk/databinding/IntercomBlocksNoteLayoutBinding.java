package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import io.intercom.android.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final class IntercomBlocksNoteLayoutBinding {
    private final LinearLayout rootView;

    private IntercomBlocksNoteLayoutBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static IntercomBlocksNoteLayoutBinding bind(View view) {
        if (view != null) {
            return new IntercomBlocksNoteLayoutBinding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    public static IntercomBlocksNoteLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IntercomBlocksNoteLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_blocks_note_layout, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
