package K5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.InterfaceC1309y;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.core.view.n0;
import com.voltasit.obdeleven.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: ScrimInsetsFrameLayout.java */
/* JADX INFO: loaded from: classes3.dex */
public class k extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f4336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f4337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f4338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4342h;

    /* JADX INFO: compiled from: ScrimInsetsFrameLayout.java */
    public class a implements InterfaceC1309y {
        public a() {
        }

        @Override // androidx.core.view.InterfaceC1309y
        public final n0 g(View view, n0 n0Var) {
            k kVar = k.this;
            if (kVar.f4337c == null) {
                kVar.f4337c = new Rect();
            }
            kVar.f4337c.set(n0Var.b(), n0Var.d(), n0Var.c(), n0Var.a());
            kVar.e(n0Var);
            n0.k kVar2 = n0Var.f16948a;
            kVar.setWillNotDraw(kVar2.l().equals(p222s0.b.f46850e) || kVar.f4336b == null);
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            kVar.postInvalidateOnAnimation();
            return kVar2.c();
        }
    }

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f4337c == null || this.f4336b == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        boolean z10 = this.f4339e;
        Rect rect = this.f4338d;
        if (z10) {
            rect.set(0, 0, width, this.f4337c.top);
            this.f4336b.setBounds(rect);
            this.f4336b.draw(canvas);
        }
        if (this.f4340f) {
            rect.set(0, height - this.f4337c.bottom, width, height);
            this.f4336b.setBounds(rect);
            this.f4336b.draw(canvas);
        }
        if (this.f4341g) {
            Rect rect2 = this.f4337c;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f4336b.setBounds(rect);
            this.f4336b.draw(canvas);
        }
        if (this.f4342h) {
            Rect rect3 = this.f4337c;
            rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
            this.f4336b.setBounds(rect);
            this.f4336b.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f4336b;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f4336b;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z10) {
        this.f4340f = z10;
    }

    public void setDrawLeftInsetForeground(boolean z10) {
        this.f4341g = z10;
    }

    public void setDrawRightInsetForeground(boolean z10) {
        this.f4342h = z10;
    }

    public void setDrawTopInsetForeground(boolean z10) {
        this.f4339e = z10;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f4336b = drawable;
    }

    public k(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f4338d = new Rect();
        this.f4339e = true;
        this.f4340f = true;
        this.f4341g = true;
        this.f4342h = true;
        TypedArray typedArrayD = o.d(context, attributeSet, p204q5.a.f46097A, i10, R.style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f4336b = typedArrayD.getDrawable(0);
        typedArrayD.recycle();
        setWillNotDraw(true);
        a aVar = new a();
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        O.d.u(this, aVar);
    }

    public void e(n0 n0Var) {
    }
}
