package com.braze.ui.inappmessage.views;

import T5.h;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.models.inappmessage.MessageButton;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.utils.InAppMessageButtonViewUtils;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.support.ViewUtils;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.text.n;

/* JADX INFO: compiled from: InAppMessageImmersiveBaseView.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class InAppMessageImmersiveBaseView extends InAppMessageBaseView implements IInAppMessageImmersiveView {
    public InAppMessageImmersiveBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setLargerCloseButtonClickArea$lambda$5(View view, InAppMessageImmersiveBaseView this$0, ViewParent viewParent) {
        i.e(this$0, "this$0");
        Rect rect = new Rect();
        view.getHitRect(rect);
        int dimensionPixelSize = this$0.getContext().getResources().getDimensionPixelSize(R.dimen.com_braze_inappmessage_close_button_click_area_width);
        int dimensionPixelSize2 = this$0.getContext().getResources().getDimensionPixelSize(R.dimen.com_braze_inappmessage_close_button_click_area_height);
        int iWidth = (dimensionPixelSize - rect.width()) / 2;
        int iHeight = (dimensionPixelSize2 - rect.height()) / 2;
        rect.top -= iHeight;
        rect.bottom += iHeight;
        rect.left -= iWidth;
        rect.right += iWidth;
        ((View) viewParent).setTouchDelegate(new TouchDelegate(rect, view));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        i.e(event, "event");
        if (isInTouchMode() || event.getKeyCode() != 4 || !BrazeInAppMessageManager.Companion.getInstance().getDoesBackButtonDismissInAppMessageView()) {
            return super.dispatchKeyEvent(event);
        }
        InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
        return true;
    }

    public abstract View getFrameView();

    public abstract List<View> getMessageButtonViews(int i10);

    public abstract TextView getMessageHeaderTextView();

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public abstract TextView getMessageTextView();

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent event) {
        i.e(event, "event");
        if (i10 != 4 || !BrazeInAppMessageManager.Companion.getInstance().getDoesBackButtonDismissInAppMessageView()) {
            return super.onKeyDown(i10, event);
        }
        InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
        return true;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void resetMessageMargins(boolean z10) {
        super.resetMessageMargins(z10);
        TextView messageTextView = getMessageTextView();
        if (n.S(String.valueOf(messageTextView != null ? messageTextView.getText() : null))) {
            ViewUtils.removeViewFromParent(getMessageTextView());
        }
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (n.S(String.valueOf(messageHeaderTextView != null ? messageHeaderTextView.getText() : null))) {
            ViewUtils.removeViewFromParent(getMessageHeaderTextView());
        }
        InAppMessageViewUtils.resetMessageMarginsIfNecessary(getMessageTextView(), getMessageHeaderTextView());
    }

    public void setFrameColor(int i10) {
        View frameView = getFrameView();
        if (frameView != null) {
            InAppMessageViewUtils.setFrameColor(frameView, Integer.valueOf(i10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setLargerCloseButtonClickArea(final View view) {
        if (view == null || view.getParent() == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView.setLargerCloseButtonClickArea.1
                @Override // Ia.a
                public final String invoke() {
                    return "Cannot increase click area for view if view and/or parent are null.";
                }
            }, 2, (Object) null);
            return;
        }
        final ViewParent parent = view.getParent();
        if (parent instanceof View) {
            ((View) parent).post(new Runnable() { // from class: com.braze.ui.inappmessage.views.b
                @Override // java.lang.Runnable
                public final void run() {
                    InAppMessageImmersiveBaseView.setLargerCloseButtonClickArea$lambda$5(view, this, parent);
                }
            });
        }
    }

    public void setMessageButtons(List<? extends MessageButton> messageButtons) {
        i.e(messageButtons, "messageButtons");
        InAppMessageButtonViewUtils.setButtons(getMessageButtonViews(messageButtons.size()), messageButtons);
    }

    public void setMessageCloseButtonColor(int i10) {
        View messageCloseButtonView = getMessageCloseButtonView();
        if (messageCloseButtonView != null) {
            InAppMessageViewUtils.setViewBackgroundColorFilter(messageCloseButtonView, i10);
        }
    }

    public void setMessageHeaderText(String text) {
        i.e(text, "text");
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (messageHeaderTextView == null) {
            return;
        }
        messageHeaderTextView.setText(text);
    }

    public void setMessageHeaderTextAlignment(TextAlign textAlign) {
        i.e(textAlign, "textAlign");
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (messageHeaderTextView != null) {
            InAppMessageViewUtils.setTextAlignment(messageHeaderTextView, textAlign);
        }
    }

    public void setMessageHeaderTextColor(int i10) {
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (messageHeaderTextView != null) {
            InAppMessageViewUtils.setTextViewColor(messageHeaderTextView, i10);
        }
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImmersiveView
    public void setupDirectionalNavigation(final int i10) {
        List<View> messageButtonViews = getMessageButtonViews(i10);
        View messageCloseButtonView = getMessageCloseButtonView();
        Integer numValueOf = messageCloseButtonView != null ? Integer.valueOf(messageCloseButtonView.getId()) : null;
        if (numValueOf == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView.setupDirectionalNavigation.1
                @Override // Ia.a
                public final String invoke() {
                    return "closeButtonId is null. Cannot continue setting up navigation.";
                }
            }, 2, (Object) null);
            return;
        }
        if (i10 == 0) {
            messageCloseButtonView.setNextFocusUpId(numValueOf.intValue());
            messageCloseButtonView.setNextFocusDownId(numValueOf.intValue());
            messageCloseButtonView.setNextFocusRightId(numValueOf.intValue());
            messageCloseButtonView.setNextFocusLeftId(numValueOf.intValue());
        } else if (i10 == 1) {
            View view = messageButtonViews.get(0);
            int id = view.getId();
            Integer numValueOf2 = Integer.valueOf(id);
            view.setNextFocusLeftId(numValueOf.intValue());
            view.setNextFocusRightId(numValueOf.intValue());
            view.setNextFocusUpId(numValueOf.intValue());
            view.setNextFocusDownId(numValueOf.intValue());
            messageCloseButtonView.setNextFocusUpId(id);
            messageCloseButtonView.setNextFocusDownId(id);
            messageCloseButtonView.setNextFocusRightId(id);
            messageCloseButtonView.setNextFocusLeftId(id);
            messageCloseButtonView = view;
            numValueOf = numValueOf2;
        } else if (i10 != 2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView.setupDirectionalNavigation.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Cannot setup directional navigation. Got unsupported number of buttons: " + i10;
                }
            }, 2, (Object) null);
        } else {
            View view2 = messageButtonViews.get(1);
            View view3 = messageButtonViews.get(0);
            int id2 = view2.getId();
            Integer numValueOf3 = Integer.valueOf(id2);
            int id3 = view3.getId();
            view2.setNextFocusLeftId(id3);
            view2.setNextFocusRightId(id3);
            view2.setNextFocusUpId(numValueOf.intValue());
            view2.setNextFocusDownId(numValueOf.intValue());
            view3.setNextFocusLeftId(id2);
            view3.setNextFocusRightId(id2);
            view3.setNextFocusUpId(numValueOf.intValue());
            view3.setNextFocusDownId(numValueOf.intValue());
            messageCloseButtonView.setNextFocusUpId(id2);
            messageCloseButtonView.setNextFocusDownId(id2);
            messageCloseButtonView.setNextFocusRightId(id2);
            messageCloseButtonView.setNextFocusLeftId(id3);
            messageCloseButtonView = view2;
            numValueOf = numValueOf3;
        }
        setNextFocusUpId(numValueOf.intValue());
        setNextFocusDownId(numValueOf.intValue());
        setNextFocusRightId(numValueOf.intValue());
        setNextFocusLeftId(numValueOf.intValue());
        if (messageCloseButtonView != null) {
            messageCloseButtonView.setFocusedByDefault(true);
        }
        if (messageCloseButtonView != null) {
            messageCloseButtonView.post(new h(3, messageCloseButtonView));
        }
    }
}
