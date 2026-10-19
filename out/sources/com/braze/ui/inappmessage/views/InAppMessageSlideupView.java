package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.n0;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.support.ViewUtils;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: InAppMessageSlideupView.kt */
/* JADX INFO: loaded from: classes.dex */
public class InAppMessageSlideupView extends InAppMessageBaseView {
    private InAppMessageImageView inAppMessageImageView;

    public InAppMessageSlideupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final View getMessageChevronView() {
        return findViewById(R.id.com_braze_inappmessage_slideup_chevron);
    }

    public final void applyInAppMessageParameters(IInAppMessage inAppMessage) {
        i.e(inAppMessage, "inAppMessage");
        InAppMessageImageView inAppMessageImageView = (InAppMessageImageView) findViewById(R.id.com_braze_inappmessage_slideup_imageview);
        this.inAppMessageImageView = inAppMessageImageView;
        if (inAppMessageImageView != null) {
            inAppMessageImageView.setInAppMessageImageCropType(inAppMessage.getCropType());
        }
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView, com.braze.ui.inappmessage.views.IInAppMessageView
    public void applyWindowInsets(n0 insets) {
        i.e(insets, "insets");
        super.applyWindowInsets(insets);
        if (getLayoutParams() == null || !(getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageSlideupView.applyWindowInsets.1
                @Override // Ia.a
                public final String invoke() {
                    return "Close button view is null or not of the expected class. Not applying window insets.";
                }
            }, 3, (Object) null);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        i.c(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(ViewUtils.getMaxSafeLeftInset(insets) + marginLayoutParams.leftMargin, ViewUtils.getMaxSafeTopInset(insets) + marginLayoutParams.topMargin, ViewUtils.getMaxSafeRightInset(insets) + marginLayoutParams.rightMargin, ViewUtils.getMaxSafeBottomInset(insets) + marginLayoutParams.bottomMargin);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageIconView() {
        return (TextView) findViewById(R.id.com_braze_inappmessage_slideup_icon);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public ImageView getMessageImageView() {
        return this.inAppMessageImageView;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageTextView() {
        return (TextView) findViewById(R.id.com_braze_inappmessage_slideup_message);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void resetMessageMargins(boolean z10) {
        CharSequence text;
        super.resetMessageMargins(z10);
        TextView messageIconView = getMessageIconView();
        boolean z11 = false;
        if (messageIconView != null && (text = messageIconView.getText()) != null && text.length() != 0) {
            z11 = true;
        }
        if (z10 || z11) {
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.com_braze_inappmessage_slideup_image_layout);
        if (relativeLayout != null) {
            ViewUtils.removeViewFromParent(relativeLayout);
        }
        TextView textView = (TextView) findViewById(R.id.com_braze_inappmessage_slideup_message);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) (textView != null ? textView.getLayoutParams() : null);
        if (layoutParams != null) {
            layoutParams.leftMargin = getContext().getResources().getDimensionPixelSize(R.dimen.com_braze_inappmessage_slideup_left_message_margin_no_image);
        }
        textView.setLayoutParams(layoutParams);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void setMessageBackgroundColor(int i10) {
        View messageBackgroundObject = getMessageBackgroundObject();
        if (!((messageBackgroundObject != null ? messageBackgroundObject.getBackground() : null) instanceof GradientDrawable)) {
            super.setMessageBackgroundColor(i10);
            return;
        }
        View messageBackgroundObject2 = getMessageBackgroundObject();
        if (messageBackgroundObject2 != null) {
            InAppMessageViewUtils.setViewBackgroundColorFilter(messageBackgroundObject2, i10);
        }
    }

    public final void setMessageChevron(int i10, ClickAction clickAction) {
        i.e(clickAction, "clickAction");
        if (clickAction == ClickAction.NONE) {
            View messageChevronView = getMessageChevronView();
            if (messageChevronView == null) {
                return;
            }
            messageChevronView.setVisibility(8);
            return;
        }
        View messageChevronView2 = getMessageChevronView();
        if (messageChevronView2 != null) {
            InAppMessageViewUtils.setViewBackgroundColorFilter(messageChevronView2, i10);
        }
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public View getMessageBackgroundObject() {
        return findViewById(R.id.com_braze_inappmessage_slideup_container);
    }
}
