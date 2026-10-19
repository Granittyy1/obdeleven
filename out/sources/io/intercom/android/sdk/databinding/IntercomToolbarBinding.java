package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import io.intercom.android.sdk.R;
import kotlin.jvm.internal.h;

/* JADX INFO: loaded from: classes3.dex */
public final class IntercomToolbarBinding {
    public final FrameLayout intercomLeftItemLayout;
    public final ImageView intercomToolbarAvatar;
    public final View intercomToolbarAvatarActiveState;
    public final ImageButton intercomToolbarClose;
    public final View intercomToolbarDivider;
    public final ImageButton intercomToolbarInbox;
    public final TextView intercomToolbarSubtitle;
    public final TextView intercomToolbarTitle;
    public final LinearLayout intercomToolbarTitleContainer;
    private final FrameLayout rootView;
    public final RelativeLayout toolbarContentContainer;
    public final ProgressBar toolbarProgressBar;
    public final ImageView wallpaperImage;

    private IntercomToolbarBinding(FrameLayout frameLayout, FrameLayout frameLayout2, ImageView imageView, View view, ImageButton imageButton, View view2, ImageButton imageButton2, TextView textView, TextView textView2, LinearLayout linearLayout, RelativeLayout relativeLayout, ProgressBar progressBar, ImageView imageView2) {
        this.rootView = frameLayout;
        this.intercomLeftItemLayout = frameLayout2;
        this.intercomToolbarAvatar = imageView;
        this.intercomToolbarAvatarActiveState = view;
        this.intercomToolbarClose = imageButton;
        this.intercomToolbarDivider = view2;
        this.intercomToolbarInbox = imageButton2;
        this.intercomToolbarSubtitle = textView;
        this.intercomToolbarTitle = textView2;
        this.intercomToolbarTitleContainer = linearLayout;
        this.toolbarContentContainer = relativeLayout;
        this.toolbarProgressBar = progressBar;
        this.wallpaperImage = imageView2;
    }

    public static IntercomToolbarBinding bind(View view) {
        View viewD;
        View viewD2;
        int i10 = R.id.intercom_left_item_layout;
        FrameLayout frameLayout = (FrameLayout) h.d(i10, view);
        if (frameLayout != null) {
            i10 = R.id.intercom_toolbar_avatar;
            ImageView imageView = (ImageView) h.d(i10, view);
            if (imageView != null && (viewD = h.d((i10 = R.id.intercom_toolbar_avatar_active_state), view)) != null) {
                i10 = R.id.intercom_toolbar_close;
                ImageButton imageButton = (ImageButton) h.d(i10, view);
                if (imageButton != null && (viewD2 = h.d((i10 = R.id.intercom_toolbar_divider), view)) != null) {
                    i10 = R.id.intercom_toolbar_inbox;
                    ImageButton imageButton2 = (ImageButton) h.d(i10, view);
                    if (imageButton2 != null) {
                        i10 = R.id.intercom_toolbar_subtitle;
                        TextView textView = (TextView) h.d(i10, view);
                        if (textView != null) {
                            i10 = R.id.intercom_toolbar_title;
                            TextView textView2 = (TextView) h.d(i10, view);
                            if (textView2 != null) {
                                i10 = R.id.intercom_toolbar_title_container;
                                LinearLayout linearLayout = (LinearLayout) h.d(i10, view);
                                if (linearLayout != null) {
                                    i10 = R.id.toolbar_content_container;
                                    RelativeLayout relativeLayout = (RelativeLayout) h.d(i10, view);
                                    if (relativeLayout != null) {
                                        i10 = R.id.toolbar_progress_bar;
                                        ProgressBar progressBar = (ProgressBar) h.d(i10, view);
                                        if (progressBar != null) {
                                            i10 = R.id.wallpaper_image;
                                            ImageView imageView2 = (ImageView) h.d(i10, view);
                                            if (imageView2 != null) {
                                                return new IntercomToolbarBinding((FrameLayout) view, frameLayout, imageView, viewD, imageButton, viewD2, imageButton2, textView, textView2, linearLayout, relativeLayout, progressBar, imageView2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static IntercomToolbarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IntercomToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_toolbar, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}
