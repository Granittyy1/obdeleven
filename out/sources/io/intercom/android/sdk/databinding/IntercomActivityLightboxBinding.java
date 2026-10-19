package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.lightbox.LightBoxImageView;
import kotlin.jvm.internal.h;

/* JADX INFO: loaded from: classes3.dex */
public final class IntercomActivityLightboxBinding {
    public final LightBoxImageView fullImage;
    public final RelativeLayout rootView;
    private final RelativeLayout rootView_;

    private IntercomActivityLightboxBinding(RelativeLayout relativeLayout, LightBoxImageView lightBoxImageView, RelativeLayout relativeLayout2) {
        this.rootView_ = relativeLayout;
        this.fullImage = lightBoxImageView;
        this.rootView = relativeLayout2;
    }

    public static IntercomActivityLightboxBinding bind(View view) {
        int i10 = R.id.full_image;
        LightBoxImageView lightBoxImageView = (LightBoxImageView) h.d(i10, view);
        if (lightBoxImageView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
        RelativeLayout relativeLayout = (RelativeLayout) view;
        return new IntercomActivityLightboxBinding(relativeLayout, lightBoxImageView, relativeLayout);
    }

    public static IntercomActivityLightboxBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IntercomActivityLightboxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_activity_lightbox, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public RelativeLayout getRoot() {
        return this.rootView_;
    }
}
