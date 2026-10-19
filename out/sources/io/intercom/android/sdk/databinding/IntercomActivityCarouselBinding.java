package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import io.intercom.android.sdk.R;
import kotlin.jvm.internal.h;

/* JADX INFO: loaded from: classes3.dex */
public final class IntercomActivityCarouselBinding {
    public final ConstraintLayout intercomCarouselCloseContainer;
    public final ConstraintLayout intercomCarouselRoot;
    public final ImageButton intercomClose;
    public final View intercomCloseBackground;
    public final LinearLayout intercomPageNavigationLayout;
    public final FrameLayout intercomStateContainer;
    public final ViewPager intercomViewPager;
    private final ConstraintLayout rootView;

    private IntercomActivityCarouselBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ImageButton imageButton, View view, LinearLayout linearLayout, FrameLayout frameLayout, ViewPager viewPager) {
        this.rootView = constraintLayout;
        this.intercomCarouselCloseContainer = constraintLayout2;
        this.intercomCarouselRoot = constraintLayout3;
        this.intercomClose = imageButton;
        this.intercomCloseBackground = view;
        this.intercomPageNavigationLayout = linearLayout;
        this.intercomStateContainer = frameLayout;
        this.intercomViewPager = viewPager;
    }

    public static IntercomActivityCarouselBinding bind(View view) {
        View viewD;
        int i10 = R.id.intercom_carousel_close_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) h.d(i10, view);
        if (constraintLayout != null) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
            i10 = R.id.intercom_close;
            ImageButton imageButton = (ImageButton) h.d(i10, view);
            if (imageButton != null && (viewD = h.d((i10 = R.id.intercom_close_background), view)) != null) {
                i10 = R.id.intercom_page_navigation_layout;
                LinearLayout linearLayout = (LinearLayout) h.d(i10, view);
                if (linearLayout != null) {
                    i10 = R.id.intercom_state_container;
                    FrameLayout frameLayout = (FrameLayout) h.d(i10, view);
                    if (frameLayout != null) {
                        i10 = R.id.intercom_view_pager;
                        ViewPager viewPager = (ViewPager) h.d(i10, view);
                        if (viewPager != null) {
                            return new IntercomActivityCarouselBinding(constraintLayout2, constraintLayout, constraintLayout2, imageButton, viewD, linearLayout, frameLayout, viewPager);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static IntercomActivityCarouselBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IntercomActivityCarouselBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_activity_carousel, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
