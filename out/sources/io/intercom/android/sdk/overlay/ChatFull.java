package io.intercom.android.sdk.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.ButtonClickListener;
import io.intercom.android.sdk.blocks.ImageClickListener;
import io.intercom.android.sdk.blocks.UploadingImageCache;
import io.intercom.android.sdk.blocks.ViewHolderGenerator;
import io.intercom.android.sdk.blocks.lib.Blocks;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.notification.ChatFullNotificationKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;

/* JADX INFO: loaded from: classes3.dex */
class ChatFull extends ChatNotification {
    private final Activity activity;
    private final MetricTracker metricTracker;

    public ChatFull(Context context, Conversation conversation, int i10, int i11, InAppNotification.Listener listener, MetricTracker metricTracker, Provider<AppConfig> provider, Activity activity) {
        super(context, conversation, i10, i11, listener, provider);
        this.metricTracker = metricTracker;
        this.activity = activity;
    }

    @Override // io.intercom.android.sdk.overlay.ChatNotification
    public View getContentContainer() {
        ComposeView composeView = (ComposeView) this.overlayRoot.findViewById(R.id.chat_full_compose_view);
        return (composeView == null || composeView.getVisibility() != 0) ? ((ViewGroup) this.overlayRoot.findViewById(R.id.chathead_text_container)).getChildAt(0) : composeView;
    }

    @Override // io.intercom.android.sdk.overlay.ChatNotification
    public ViewGroup inflateChatRootView(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        final ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.intercom_preview_chat_full_overlay, viewGroup, false);
        ComposeView composeView = (ComposeView) viewGroup2.findViewById(R.id.chat_full_compose_view);
        if (ComposeCompatibilityUtilKt.isLegacyActivity(composeView)) {
            Blocks blocks = new Blocks(this.localisedContext, LumberMill.getBlocksTwig());
            Injector injector = Injector.get();
            Api api = injector.getApi();
            LinearLayout linearLayoutCreateBlocks = blocks.createBlocks(this.conversation.lastPart().getBlocks(), new ViewHolderGenerator(new UploadingImageCache(), api, this.appConfigProvider, this.conversation.getId(), new ChatFullImageClickListener(), new ChatFullButtonClickListener(), injector.getGson(), this.metricTracker).getChatFullHolder());
            final ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.chathead_text_container);
            viewGroup3.addView(linearLayoutCreateBlocks);
            viewGroup3.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: io.intercom.android.sdk.overlay.ChatFull.1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    viewGroup3.getViewTreeObserver().removeOnPreDrawListener(this);
                    int measuredHeight = viewGroup3.getMeasuredHeight();
                    int i10 = ((ViewGroup.MarginLayoutParams) viewGroup3.getLayoutParams()).bottomMargin;
                    Resources resources = ChatFull.this.localisedContext.getResources();
                    int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.intercom_chat_full_top_margin);
                    if (measuredHeight < ((ChatFull.this.screenHeight - dimensionPixelSize) - i10) - resources.getDimensionPixelSize(R.dimen.intercom_bottom_padding)) {
                        return true;
                    }
                    viewGroup2.findViewById(R.id.chat_overlay_overflow_fade).setVisibility(0);
                    return false;
                }
            });
            api.markConversationAsRead(this.conversation.getId());
        } else {
            ChatFullNotificationKt.addChatFullNotificationToView(composeView, this.conversation, this.appConfigProvider.get());
        }
        this.metricTracker.viewedInApp(this.conversation.getId(), this.conversation.lastPart().getId(), 1);
        return viewGroup2;
    }

    @Override // io.intercom.android.sdk.overlay.ChatNotification
    public void populateViewsWithData() {
        ComposeView composeView = (ComposeView) this.overlayRoot.findViewById(R.id.chat_full_compose_view);
        if (composeView == null || ComposeCompatibilityUtilKt.isLegacyActivity(composeView)) {
            return;
        }
        ChatFullNotificationKt.addChatFullNotificationToView(composeView, this.conversation, this.appConfigProvider.get());
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotification
    public void update(Conversation conversation, Runnable runnable) {
        this.conversation = conversation;
        runnable.run();
    }

    @Override // io.intercom.android.sdk.overlay.ChatNotification
    public void updateContentContainer(Part part) {
    }

    @Override // io.intercom.android.sdk.overlay.ChatNotification, io.intercom.android.sdk.overlay.InAppNotification
    public void updateViewDataDuringReplyPulse(int i10) {
    }

    public static class ChatFullButtonClickListener implements ButtonClickListener {
        private ChatFullButtonClickListener() {
        }

        @Override // io.intercom.android.sdk.blocks.ButtonClickListener
        public boolean shouldHandleClicks() {
            return false;
        }

        @Override // io.intercom.android.sdk.blocks.ButtonClickListener
        public void onButtonClicked(View view, String str) {
        }
    }

    public static class ChatFullImageClickListener implements ImageClickListener {
        private ChatFullImageClickListener() {
        }

        @Override // io.intercom.android.sdk.blocks.ImageClickListener
        public void onImageClicked(String str, String str2, View view, int i10, int i11) {
        }
    }
}
