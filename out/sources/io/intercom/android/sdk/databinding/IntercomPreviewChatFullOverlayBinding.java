package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import io.intercom.android.sdk.R;
import kotlin.jvm.internal.h;

/* JADX INFO: loaded from: classes3.dex */
public final class IntercomPreviewChatFullOverlayBinding {
    public final FrameLayout chatAvatarContainer;
    public final FrameLayout chatFullBody;
    public final ComposeView chatFullComposeView;
    public final View chatOverlayOverflowFade;
    public final ImageView chatheadAvatar;
    public final ComposeView chatheadAvatarComposeView;
    public final FrameLayout chatheadRoot;
    public final LinearLayout chatheadTextContainer;
    public final TextView chatheadTextHeader;
    public final FrameLayout parentCard;
    private final FrameLayout rootView;

    private IntercomPreviewChatFullOverlayBinding(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, ComposeView composeView, View view, ImageView imageView, ComposeView composeView2, FrameLayout frameLayout4, LinearLayout linearLayout, TextView textView, FrameLayout frameLayout5) {
        this.rootView = frameLayout;
        this.chatAvatarContainer = frameLayout2;
        this.chatFullBody = frameLayout3;
        this.chatFullComposeView = composeView;
        this.chatOverlayOverflowFade = view;
        this.chatheadAvatar = imageView;
        this.chatheadAvatarComposeView = composeView2;
        this.chatheadRoot = frameLayout4;
        this.chatheadTextContainer = linearLayout;
        this.chatheadTextHeader = textView;
        this.parentCard = frameLayout5;
    }

    public static IntercomPreviewChatFullOverlayBinding bind(View view) {
        View viewD;
        int i10 = R.id.chat_avatar_container;
        FrameLayout frameLayout = (FrameLayout) h.d(i10, view);
        if (frameLayout != null) {
            i10 = R.id.chat_full_body;
            FrameLayout frameLayout2 = (FrameLayout) h.d(i10, view);
            if (frameLayout2 != null) {
                i10 = R.id.chat_full_compose_view;
                ComposeView composeView = (ComposeView) h.d(i10, view);
                if (composeView != null && (viewD = h.d((i10 = R.id.chat_overlay_overflow_fade), view)) != null) {
                    i10 = R.id.chathead_avatar;
                    ImageView imageView = (ImageView) h.d(i10, view);
                    if (imageView != null) {
                        i10 = R.id.chathead_avatar_compose_view;
                        ComposeView composeView2 = (ComposeView) h.d(i10, view);
                        if (composeView2 != null) {
                            FrameLayout frameLayout3 = (FrameLayout) view;
                            i10 = R.id.chathead_text_container;
                            LinearLayout linearLayout = (LinearLayout) h.d(i10, view);
                            if (linearLayout != null) {
                                i10 = R.id.chathead_text_header;
                                TextView textView = (TextView) h.d(i10, view);
                                if (textView != null) {
                                    i10 = R.id.parent_card;
                                    FrameLayout frameLayout4 = (FrameLayout) h.d(i10, view);
                                    if (frameLayout4 != null) {
                                        return new IntercomPreviewChatFullOverlayBinding(frameLayout3, frameLayout, frameLayout2, composeView, viewD, imageView, composeView2, frameLayout3, linearLayout, textView, frameLayout4);
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

    public static IntercomPreviewChatFullOverlayBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IntercomPreviewChatFullOverlayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_preview_chat_full_overlay, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}
