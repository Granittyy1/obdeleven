package io.intercom.android.sdk.helpcenter.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.R;
import kotlin.jvm.internal.i;
import p186p0.a;

/* JADX INFO: compiled from: PaddedDividerItemDecoration.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class PaddedDividerItemDecoration extends RecyclerView.k {
    public static final int $stable = 8;
    private final Context context;
    private Drawable dividerDrawable;
    private final int padding;

    public PaddedDividerItemDecoration(Context context) {
        i.e(context, "context");
        this.context = context;
        this.padding = (int) TypedValue.applyDimension(1, 16.0f, context.getResources().getDisplayMetrics());
        this.dividerDrawable = a.C0517a.b(context, R.drawable.intercom_list_divider);
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public void onDraw(Canvas canvas, RecyclerView parent, RecyclerView.x state) {
        i.e(canvas, "canvas");
        i.e(parent, "parent");
        i.e(state, "state");
        int paddingLeft = parent.getPaddingLeft() + this.padding;
        int width = (parent.getWidth() - parent.getPaddingRight()) - this.padding;
        if (parent.getAdapter() != null) {
            int childCount = parent.getChildCount() - 1;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = parent.getChildAt(i10);
                RecyclerView.B bN = RecyclerView.N(childAt);
                if ((bN != null ? bN.getAbsoluteAdapterPosition() : -1) == -1) {
                    return;
                }
                int bottom = childAt.getBottom();
                Drawable drawable = this.dividerDrawable;
                int intrinsicHeight = (drawable != null ? drawable.getIntrinsicHeight() : 0) + bottom;
                Drawable drawable2 = this.dividerDrawable;
                if (drawable2 != null) {
                    drawable2.setBounds(paddingLeft, bottom, width, intrinsicHeight);
                }
                Drawable drawable3 = this.dividerDrawable;
                if (drawable3 != null) {
                    drawable3.draw(canvas);
                }
            }
        }
    }
}
