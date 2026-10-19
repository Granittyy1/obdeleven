package com.braze.ui.feed;

import Ia.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageSwitcher;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: BrazeImageSwitcher.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BrazeImageSwitcher extends ImageSwitcher {
    private Drawable readIcon;
    private Drawable unReadIcon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeImageSwitcher(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(context, attributeSet);
        i.e(context, "context");
        try {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.com_braze_ui_feed_BrazeImageSwitcher);
            i.d(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…_feed_BrazeImageSwitcher)");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.com_braze_ui_feed_BrazeImageSwitcher_brazeFeedCustomReadIcon) {
                    Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(index);
                    if (drawable2 != null) {
                        this.readIcon = drawable2;
                    }
                } else if (typedArrayObtainStyledAttributes.getIndex(i10) == R.styleable.com_braze_ui_feed_BrazeImageSwitcher_brazeFeedCustomUnReadIcon && (drawable = typedArrayObtainStyledAttributes.getDrawable(index)) != null) {
                    this.unReadIcon = drawable;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new a<String>() { // from class: com.braze.ui.feed.BrazeImageSwitcher.1
                @Override // Ia.a
                public final String invoke() {
                    return "Error while checking for custom drawable.";
                }
            });
        }
    }

    public final Drawable getReadIcon() {
        return this.readIcon;
    }

    public final Drawable getUnReadIcon() {
        return this.unReadIcon;
    }

    public final void setReadIcon(Drawable drawable) {
        this.readIcon = drawable;
    }

    public final void setUnReadIcon(Drawable drawable) {
        this.unReadIcon = drawable;
    }
}
