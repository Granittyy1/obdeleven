package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import io.intercom.android.sdk.R;
import kotlin.jvm.internal.h;

/* JADX INFO: loaded from: classes3.dex */
public final class IntercomContainerLayoutBinding {
    public final LinearLayout cellLayout;
    public final ProgressBar progressBar;
    private final FrameLayout rootView;

    private IntercomContainerLayoutBinding(FrameLayout frameLayout, LinearLayout linearLayout, ProgressBar progressBar) {
        this.rootView = frameLayout;
        this.cellLayout = linearLayout;
        this.progressBar = progressBar;
    }

    public static IntercomContainerLayoutBinding bind(View view) {
        int i10 = R.id.cellLayout;
        LinearLayout linearLayout = (LinearLayout) h.d(i10, view);
        if (linearLayout != null) {
            i10 = R.id.progressBar;
            ProgressBar progressBar = (ProgressBar) h.d(i10, view);
            if (progressBar != null) {
                return new IntercomContainerLayoutBinding((FrameLayout) view, linearLayout, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static IntercomContainerLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IntercomContainerLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_container_layout, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}
