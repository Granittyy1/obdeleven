package com.braze.ui.inappmessage.utils;

import B0.l;
import Ia.a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.graphics.B;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: InAppMessageViewUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class InAppMessageViewUtils {
    public static final InAppMessageViewUtils INSTANCE = new InAppMessageViewUtils();

    private InAppMessageViewUtils() {
    }

    public static final void closeInAppMessageOnKeycodeBack() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.utils.InAppMessageViewUtils.closeInAppMessageOnKeycodeBack.1
            @Override // Ia.a
            public final String invoke() {
                return "Back button intercepted by in-app message view, closing in-app message.";
            }
        }, 3, (Object) null);
        BrazeInAppMessageManager.Companion.getInstance().hideCurrentlyDisplayingInAppMessage(true);
    }

    public static final void resetMessageMarginsIfNecessary(TextView textView, TextView textView2) {
        if (textView2 != null || textView == null) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(textView.getLayoutParams().width, textView.getLayoutParams().height);
        layoutParams.setMargins(0, 0, 0, 0);
        textView.setLayoutParams(layoutParams);
    }

    public static final void setDrawableColor(Drawable drawable, int i10) {
        i.e(drawable, "drawable");
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            if (layerDrawable.getNumberOfLayers() <= 0 || !(layerDrawable.getDrawable(0) instanceof GradientDrawable)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.utils.InAppMessageViewUtils.setDrawableColor.1
                    @Override // Ia.a
                    public final String invoke() {
                        return "LayerDrawable for button background did not have the expected number of layers or the 0th layer was not a GradientDrawable.";
                    }
                }, 3, (Object) null);
            } else {
                Drawable drawable2 = layerDrawable.getDrawable(0);
                i.d(drawable2, "drawable.getDrawable(0)");
                setDrawableColor(drawable2, i10);
            }
        }
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(i10);
        } else {
            INSTANCE.setDrawableColorFilter(drawable, i10);
        }
    }

    private final void setDrawableColorFilter(Drawable drawable, int i10) {
        if (Build.VERSION.SDK_INT < 29) {
            drawable.setColorFilter(i10, PorterDuff.Mode.SRC_ATOP);
        } else {
            l.c();
            drawable.setColorFilter(B.a(i10, BlendMode.SRC_ATOP));
        }
    }

    public static final void setFrameColor(View view, Integer num) {
        i.e(view, "view");
        if (num != null) {
            view.setBackgroundColor(num.intValue());
        }
    }

    public static final void setIcon(Context context, String str, int i10, int i11, TextView textView) {
        i.e(context, "context");
        i.e(textView, "textView");
        if (str != null) {
            try {
                textView.setTypeface(Typeface.createFromAsset(context.getAssets(), "fontawesome-webfont.ttf"));
                textView.setText(str);
                setTextViewColor(textView, i10);
                if (textView.getBackground() == null) {
                    setViewBackgroundColor(textView, i11);
                    return;
                }
                Drawable background = textView.getBackground();
                i.d(background, "textView.background");
                setDrawableColor(background, i11);
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.ui.inappmessage.utils.InAppMessageViewUtils.setIcon.1
                    @Override // Ia.a
                    public final String invoke() {
                        return "Caught exception setting icon typeface. Not rendering icon.";
                    }
                });
            }
        }
    }

    public static final void setImage(Bitmap bitmap, ImageView imageView) {
        i.e(imageView, "imageView");
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public static final void setTextAlignment(TextView textView, TextAlign textAlign) {
        i.e(textView, "textView");
        i.e(textAlign, "textAlign");
        if (textAlign == TextAlign.START) {
            textView.setGravity(8388611);
        } else if (textAlign == TextAlign.END) {
            textView.setGravity(8388613);
        } else if (textAlign == TextAlign.CENTER) {
            textView.setGravity(17);
        }
    }

    public static final void setTextViewColor(TextView textView, int i10) {
        i.e(textView, "textView");
        textView.setTextColor(i10);
    }

    public static final void setViewBackgroundColor(View view, int i10) {
        i.e(view, "view");
        view.setBackgroundColor(i10);
    }

    public static final void setViewBackgroundColorFilter(View view, int i10) {
        i.e(view, "view");
        InAppMessageViewUtils inAppMessageViewUtils = INSTANCE;
        Drawable background = view.getBackground();
        i.d(background, "view.background");
        inAppMessageViewUtils.setDrawableColorFilter(background, i10);
        view.getBackground().setAlpha(Color.alpha(i10));
    }
}
