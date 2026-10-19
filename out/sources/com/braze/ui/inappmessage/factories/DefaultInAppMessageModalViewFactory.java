package com.braze.ui.inappmessage.factories;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.braze.Braze;
import com.braze.enums.BrazeViewBounds;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageModal;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.IInAppMessageViewFactory;
import com.braze.ui.inappmessage.views.InAppMessageBaseView;
import com.braze.ui.inappmessage.views.InAppMessageImageView;
import com.braze.ui.inappmessage.views.InAppMessageModalView;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: DefaultInAppMessageModalViewFactory.kt */
/* JADX INFO: loaded from: classes.dex */
public class DefaultInAppMessageModalViewFactory implements IInAppMessageViewFactory {
    public static final Companion Companion = new Companion(null);
    private static final float NON_GRAPHIC_ASPECT_RATIO = 2.9f;

    /* JADX INFO: compiled from: DefaultInAppMessageModalViewFactory.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createInAppMessageView$lambda$1(DefaultInAppMessageModalViewFactory this$0, View view) {
        i.e(this$0, "this$0");
        BrazeInAppMessageManager.Companion companion = BrazeInAppMessageManager.Companion;
        if (companion.getInstance().getDoesClickOutsideModalViewDismissInAppMessageView()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this$0, BrazeLogger.Priority.I, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.factories.DefaultInAppMessageModalViewFactory$createInAppMessageView$2$1
                @Override // Ia.a
                public final String invoke() {
                    return "Dismissing modal after frame click";
                }
            }, 2, (Object) null);
            companion.getInstance().hideCurrentlyDisplayingInAppMessage(true);
        }
    }

    private final InAppMessageModalView getAppropriateModalView(Activity activity, boolean z10) {
        if (z10) {
            View viewInflate = activity.getLayoutInflater().inflate(R.layout.com_braze_inappmessage_modal_graphic, (ViewGroup) null);
            i.c(viewInflate, "null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageModalView");
            return (InAppMessageModalView) viewInflate;
        }
        View viewInflate2 = activity.getLayoutInflater().inflate(R.layout.com_braze_inappmessage_modal, (ViewGroup) null);
        i.c(viewInflate2, "null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageModalView");
        return (InAppMessageModalView) viewInflate2;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewFactory
    public InAppMessageModalView createInAppMessageView(Activity activity, IInAppMessage inAppMessage) {
        i.e(activity, "activity");
        i.e(inAppMessage, "inAppMessage");
        Context applicationContext = activity.getApplicationContext();
        InAppMessageModal inAppMessageModal = (InAppMessageModal) inAppMessage;
        boolean z10 = inAppMessageModal.getImageStyle() == ImageStyle.GRAPHIC;
        InAppMessageModalView appropriateModalView = getAppropriateModalView(activity, z10);
        i.d(applicationContext, "applicationContext");
        appropriateModalView.applyInAppMessageParameters(applicationContext, inAppMessageModal);
        String appropriateImageUrl = InAppMessageBaseView.Companion.getAppropriateImageUrl(inAppMessageModal);
        if (appropriateImageUrl != null && appropriateImageUrl.length() != 0) {
            IBrazeImageLoader imageLoader = Braze.Companion.getInstance(applicationContext).getImageLoader();
            ImageView messageImageView = appropriateModalView.getMessageImageView();
            if (messageImageView != null) {
                imageLoader.renderUrlIntoInAppMessageView(applicationContext, inAppMessage, appropriateImageUrl, messageImageView, BrazeViewBounds.IN_APP_MESSAGE_MODAL);
            }
        }
        View frameView = appropriateModalView.getFrameView();
        if (frameView != null) {
            frameView.setOnClickListener(new b(0, this));
        }
        appropriateModalView.setMessageBackgroundColor(inAppMessage.getBackgroundColor());
        Integer frameColor = inAppMessageModal.getFrameColor();
        if (frameColor != null) {
            appropriateModalView.setFrameColor(frameColor.intValue());
        }
        appropriateModalView.setMessageButtons(inAppMessageModal.getMessageButtons());
        appropriateModalView.setMessageCloseButtonColor(inAppMessageModal.getCloseButtonColor());
        if (!z10) {
            String message = inAppMessage.getMessage();
            if (message != null) {
                appropriateModalView.setMessage(message);
            }
            appropriateModalView.setMessageTextColor(inAppMessage.getMessageTextColor());
            String header = inAppMessageModal.getHeader();
            if (header != null) {
                appropriateModalView.setMessageHeaderText(header);
            }
            appropriateModalView.setMessageHeaderTextColor(inAppMessageModal.getHeaderTextColor());
            String icon = inAppMessage.getIcon();
            if (icon != null) {
                appropriateModalView.setMessageIcon(icon, inAppMessage.getIconColor(), inAppMessage.getIconBackgroundColor());
            }
            appropriateModalView.setMessageHeaderTextAlignment(inAppMessageModal.getHeaderTextAlign());
            appropriateModalView.setMessageTextAlign(inAppMessageModal.getMessageTextAlign());
            appropriateModalView.resetMessageMargins(inAppMessageModal.getImageDownloadSuccessful());
            ImageView messageImageView2 = appropriateModalView.getMessageImageView();
            i.c(messageImageView2, "null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageImageView");
            ((InAppMessageImageView) messageImageView2).setAspectRatio(NON_GRAPHIC_ASPECT_RATIO);
        }
        appropriateModalView.setLargerCloseButtonClickArea(appropriateModalView.getMessageCloseButtonView());
        appropriateModalView.setupDirectionalNavigation(inAppMessageModal.getMessageButtons().size());
        return appropriateModalView;
    }
}
