package p208q9;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: ContentDividerDecoration.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends RecyclerView.k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f46179f = {R.attr.listDivider};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f46180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f46183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f46184e = new Rect();

    public a(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f46179f);
        this.f46180a = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f46183d = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.x xVar) {
        if (this.f46183d == 1) {
            rect.set(0, 0, 0, this.f46180a.getIntrinsicHeight());
        } else {
            rect.set(0, 0, this.f46180a.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.x xVar) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        int i10 = this.f46183d;
        Rect rect = this.f46184e;
        if (i10 == 1) {
            canvas.save();
            int i11 = this.f46181b;
            int width = recyclerView.getWidth() - this.f46182c;
            canvas.clipRect(i11, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            int childCount = recyclerView.getChildCount();
            for (int i12 = 0; i12 < childCount - 1; i12++) {
                View childAt = recyclerView.getChildAt(i12);
                RecyclerView.O(rect, childAt);
                int i13 = rect.bottom;
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                int iRound = Math.round(childAt.getTranslationY()) + i13;
                this.f46180a.setBounds(i11, iRound - this.f46180a.getIntrinsicHeight(), width, iRound);
                this.f46180a.draw(canvas);
            }
            canvas.restore();
            return;
        }
        canvas.save();
        int height = recyclerView.getHeight();
        canvas.clipRect(recyclerView.getPaddingLeft(), 0, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        int childCount2 = recyclerView.getChildCount();
        for (int i14 = 0; i14 < childCount2 - 1; i14++) {
            View childAt2 = recyclerView.getChildAt(i14);
            recyclerView.getLayoutManager().B(rect, childAt2);
            int i15 = rect.right;
            WeakHashMap<View, Z> weakHashMap2 = O.f16859a;
            int iRound2 = Math.round(childAt2.getTranslationX()) + i15;
            this.f46180a.setBounds(iRound2 - this.f46180a.getIntrinsicWidth(), 0, iRound2, height);
            this.f46180a.draw(canvas);
        }
        canvas.restore();
    }
}
