package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import io.intercom.android.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final class IntercomProgressBarBinding {
    public final ProgressBar progressBar;
    private final ProgressBar rootView;

    private IntercomProgressBarBinding(ProgressBar progressBar, ProgressBar progressBar2) {
        this.rootView = progressBar;
        this.progressBar = progressBar2;
    }

    public static IntercomProgressBarBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ProgressBar progressBar = (ProgressBar) view;
        return new IntercomProgressBarBinding(progressBar, progressBar);
    }

    public static IntercomProgressBarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IntercomProgressBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_progress_bar, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public ProgressBar getRoot() {
        return this.rootView;
    }
}
