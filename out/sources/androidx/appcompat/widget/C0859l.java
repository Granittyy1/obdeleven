package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: renamed from: androidx.appcompat.widget.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AppCompatEmojiTextHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0859l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f9002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T0.f f9003b;

    public C0859l(TextView textView) {
        this.f9002a = textView;
        this.f9003b = new T0.f(textView);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f9002a.getContext().obtainStyledAttributes(attributeSet, p088h.a.f35697i, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            c(z10);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z10) {
        this.f9003b.f5745a.c(z10);
    }

    public final void c(boolean z10) {
        this.f9003b.f5745a.d(z10);
    }
}
