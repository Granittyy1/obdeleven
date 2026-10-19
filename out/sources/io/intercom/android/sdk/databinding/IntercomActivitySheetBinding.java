package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.views.IntercomToolbar;
import kotlin.jvm.internal.h;

/* JADX INFO: loaded from: classes3.dex */
public final class IntercomActivitySheetBinding {
    public final IntercomToolbar intercomToolbar;
    private final LinearLayout rootView;
    public final LinearLayout sheetRoot;
    public final FrameLayout sheetView;

    private IntercomActivitySheetBinding(LinearLayout linearLayout, IntercomToolbar intercomToolbar, LinearLayout linearLayout2, FrameLayout frameLayout) {
        this.rootView = linearLayout;
        this.intercomToolbar = intercomToolbar;
        this.sheetRoot = linearLayout2;
        this.sheetView = frameLayout;
    }

    public static IntercomActivitySheetBinding bind(View view) {
        int i10 = R.id.intercom_toolbar;
        IntercomToolbar intercomToolbar = (IntercomToolbar) h.d(i10, view);
        if (intercomToolbar != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i11 = R.id.sheet_view;
            FrameLayout frameLayout = (FrameLayout) h.d(i11, view);
            if (frameLayout != null) {
                return new IntercomActivitySheetBinding(linearLayout, intercomToolbar, linearLayout, frameLayout);
            }
            i10 = i11;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static IntercomActivitySheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IntercomActivitySheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_activity_sheet, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
