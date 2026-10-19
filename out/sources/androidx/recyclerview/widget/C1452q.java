package androidx.recyclerview.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DividerItemDecoration.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1452q extends RecyclerView.k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f19935d = {R.attr.listDivider};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f19936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f19938c = new Rect();

    public C1452q(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f19935d);
        this.f19936a = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f19937b = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.x xVar) {
        Drawable drawable = this.f19936a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f19937b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.x xVar) {
        int height;
        int paddingTop;
        int width;
        int paddingLeft;
        if (recyclerView.getLayoutManager() == null || this.f19936a == null) {
            return;
        }
        int i10 = this.f19937b;
        Rect rect = this.f19938c;
        int i11 = 0;
        if (i10 == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                paddingLeft = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                paddingLeft = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i11 < childCount) {
                View childAt = recyclerView.getChildAt(i11);
                RecyclerView.O(rect, childAt);
                int iRound = Math.round(childAt.getTranslationY()) + rect.bottom;
                this.f19936a.setBounds(paddingLeft, iRound - this.f19936a.getIntrinsicHeight(), width, iRound);
                this.f19936a.draw(canvas);
                i11++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i11 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i11);
            recyclerView.getLayoutManager().B(rect, childAt2);
            int iRound2 = Math.round(childAt2.getTranslationX()) + rect.right;
            this.f19936a.setBounds(iRound2 - this.f19936a.getIntrinsicWidth(), paddingTop, iRound2, height);
            this.f19936a.draw(canvas);
            i11++;
        }
        canvas.restore();
    }
}
