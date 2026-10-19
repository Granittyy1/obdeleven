package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import io.intercom.android.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final class IntercomNotificationPillBinding {
    public final TextView notificationPill;
    private final TextView rootView;

    private IntercomNotificationPillBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.notificationPill = textView2;
    }

    public static IntercomNotificationPillBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new IntercomNotificationPillBinding(textView, textView);
    }

    public static IntercomNotificationPillBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IntercomNotificationPillBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_notification_pill, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}
