package R0;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: compiled from: UnprecomputeTextOnModificationSpannable.java */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Spannable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5188b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Spannable f5189c;

    /* JADX INFO: compiled from: UnprecomputeTextOnModificationSpannable.java */
    public static class a {
        public boolean a(CharSequence charSequence) {
            return charSequence instanceof p307z0.d;
        }
    }

    /* JADX INFO: compiled from: UnprecomputeTextOnModificationSpannable.java */
    public static class b extends a {
        @Override // R0.p.a
        public final boolean a(CharSequence charSequence) {
            return B0.d.e(charSequence) || (charSequence instanceof p307z0.d);
        }
    }

    public p(Spannable spannable) {
        this.f5189c = spannable;
    }

    public final void a() {
        Spannable spannable = this.f5189c;
        if (!this.f5188b) {
            if ((Build.VERSION.SDK_INT < 28 ? new a() : new b()).a(spannable)) {
                this.f5189c = new SpannableString(spannable);
            }
        }
        this.f5188b = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f5189c.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f5189c.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f5189c.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f5189c.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f5189c.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f5189c.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return (T[]) this.f5189c.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f5189c.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f5189c.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f5189c.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f5189c.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return this.f5189c.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f5189c.toString();
    }
}
