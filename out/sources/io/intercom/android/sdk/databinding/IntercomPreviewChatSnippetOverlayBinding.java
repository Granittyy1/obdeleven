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
public final class IntercomPreviewChatSnippetOverlayBinding {
    public final FrameLayout chatAvatarContainer;
    public final FrameLayout chatFullBody;
    public final ComposeView chatSnippetComposeView;
    public final ImageView chatheadAvatar;
    public final ComposeView chatheadAvatarComposeView;
    public final FrameLayout chatheadRoot;
    public final TextView chatheadTextBody;
    public final LinearLayout chatheadTextContainer;
    public final TextView chatheadTextHeader;
    public final FrameLayout parentCard;
    private final FrameLayout rootView;
    public final ComposeView ticketHeaderComposeView;

    private IntercomPreviewChatSnippetOverlayBinding(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, ComposeView composeView, ImageView imageView, ComposeView composeView2, FrameLayout frameLayout4, TextView textView, LinearLayout linearLayout, TextView textView2, FrameLayout frameLayout5, ComposeView composeView3) {
        this.rootView = frameLayout;
        this.chatAvatarContainer = frameLayout2;
        this.chatFullBody = frameLayout3;
        this.chatSnippetComposeView = composeView;
        this.chatheadAvatar = imageView;
        this.chatheadAvatarComposeView = composeView2;
        this.chatheadRoot = frameLayout4;
        this.chatheadTextBody = textView;
        this.chatheadTextContainer = linearLayout;
        this.chatheadTextHeader = textView2;
        this.parentCard = frameLayout5;
        this.ticketHeaderComposeView = composeView3;
    }

    public static IntercomPreviewChatSnippetOverlayBinding bind(View view) {
        int i10 = R.id.chat_avatar_container;
        FrameLayout frameLayout = (FrameLayout) h.d(i10, view);
        if (frameLayout != null) {
            i10 = R.id.chat_full_body;
            FrameLayout frameLayout2 = (FrameLayout) h.d(i10, view);
            if (frameLayout2 != null) {
                i10 = R.id.chat_snippet_compose_view;
                ComposeView composeView = (ComposeView) h.d(i10, view);
                if (composeView != null) {
                    i10 = R.id.chathead_avatar;
                    ImageView imageView = (ImageView) h.d(i10, view);
                    if (imageView != null) {
                        i10 = R.id.chathead_avatar_compose_view;
                        ComposeView composeView2 = (ComposeView) h.d(i10, view);
                        if (composeView2 != null) {
                            FrameLayout frameLayout3 = (FrameLayout) view;
                            i10 = R.id.chathead_text_body;
                            TextView textView = (TextView) h.d(i10, view);
                            if (textView != null) {
                                i10 = R.id.chathead_text_container;
                                LinearLayout linearLayout = (LinearLayout) h.d(i10, view);
                                if (linearLayout != null) {
                                    i10 = R.id.chathead_text_header;
                                    TextView textView2 = (TextView) h.d(i10, view);
                                    if (textView2 != null) {
                                        i10 = R.id.parent_card;
                                        FrameLayout frameLayout4 = (FrameLayout) h.d(i10, view);
                                        if (frameLayout4 != null) {
                                            i10 = R.id.ticket_header_compose_view;
                                            ComposeView composeView3 = (ComposeView) h.d(i10, view);
                                            if (composeView3 != null) {
                                                return new IntercomPreviewChatSnippetOverlayBinding(frameLayout3, frameLayout, frameLayout2, composeView, imageView, composeView2, frameLayout3, textView, linearLayout, textView2, frameLayout4, composeView3);
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

    public static IntercomPreviewChatSnippetOverlayBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IntercomPreviewChatSnippetOverlayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_preview_chat_snippet_overlay, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}
