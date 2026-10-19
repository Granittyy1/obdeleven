package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.n0;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.models.inappmessage.IInAppMessageWithImage;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.support.ViewUtils;
import java.io.File;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.text.n;

/* JADX INFO: compiled from: InAppMessageBaseView.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class InAppMessageBaseView extends RelativeLayout implements IInAppMessageView {
    public static final Companion Companion = new Companion(null);
    private boolean hasAppliedWindowInsets;

    /* JADX INFO: compiled from: InAppMessageBaseView.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final String getAppropriateImageUrl(IInAppMessageWithImage inAppMessage) {
            i.e(inAppMessage, "inAppMessage");
            final String localImageUrl = inAppMessage.getLocalImageUrl();
            if (localImageUrl != null && !n.S(localImageUrl)) {
                if (new File(localImageUrl).exists()) {
                    return localImageUrl;
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.D, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageBaseView$Companion$getAppropriateImageUrl$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return "Local bitmap file does not exist. Using remote url instead. Local path: " + localImageUrl;
                    }
                }, 2, (Object) null);
            }
            return inAppMessage.getRemoteImageUrl();
        }

        private Companion() {
        }
    }

    public InAppMessageBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static final String getAppropriateImageUrl(IInAppMessageWithImage iInAppMessageWithImage) {
        return Companion.getAppropriateImageUrl(iInAppMessageWithImage);
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public void applyWindowInsets(n0 insets) {
        i.e(insets, "insets");
        setHasAppliedWindowInsets(true);
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public boolean getHasAppliedWindowInsets() {
        return this.hasAppliedWindowInsets;
    }

    public abstract Object getMessageBackgroundObject();

    public abstract TextView getMessageIconView();

    public abstract ImageView getMessageImageView();

    public abstract TextView getMessageTextView();

    public void resetMessageMargins(boolean z10) {
        CharSequence text;
        String string;
        ImageView messageImageView = getMessageImageView();
        if (messageImageView != null) {
            if (z10) {
                ViewUtils.removeViewFromParent(getMessageIconView());
            } else {
                ViewUtils.removeViewFromParent(messageImageView);
            }
        }
        TextView messageIconView = getMessageIconView();
        if (messageIconView == null || (text = messageIconView.getText()) == null || (string = text.toString()) == null || !n.S(string)) {
            return;
        }
        ViewUtils.removeViewFromParent(getMessageIconView());
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public void setHasAppliedWindowInsets(boolean z10) {
        this.hasAppliedWindowInsets = z10;
    }

    public void setMessage(String text) {
        i.e(text, "text");
        TextView messageTextView = getMessageTextView();
        if (messageTextView == null) {
            return;
        }
        messageTextView.setText(text);
    }

    public void setMessageBackgroundColor(int i10) {
        Object messageBackgroundObject = getMessageBackgroundObject();
        i.c(messageBackgroundObject, "null cannot be cast to non-null type android.view.View");
        InAppMessageViewUtils.setViewBackgroundColor((View) messageBackgroundObject, i10);
    }

    public void setMessageIcon(String icon, int i10, int i11) {
        i.e(icon, "icon");
        TextView messageIconView = getMessageIconView();
        if (messageIconView != null) {
            Context context = getContext();
            i.d(context, "context");
            InAppMessageViewUtils.setIcon(context, icon, i10, i11, messageIconView);
        }
    }

    public void setMessageImageView(Bitmap bitmap) {
        i.e(bitmap, "bitmap");
        ImageView messageImageView = getMessageImageView();
        if (messageImageView != null) {
            InAppMessageViewUtils.setImage(bitmap, messageImageView);
        }
    }

    public void setMessageTextAlign(TextAlign textAlign) {
        i.e(textAlign, "textAlign");
        TextView messageTextView = getMessageTextView();
        if (messageTextView != null) {
            InAppMessageViewUtils.setTextAlignment(messageTextView, textAlign);
        }
    }

    public void setMessageTextColor(int i10) {
        TextView messageTextView = getMessageTextView();
        if (messageTextView != null) {
            InAppMessageViewUtils.setTextViewColor(messageTextView, i10);
        }
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public View getMessageClickableView() {
        return this;
    }
}
