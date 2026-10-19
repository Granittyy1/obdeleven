package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: renamed from: androidx.appcompat.widget.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AppCompatTextHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0870x implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f9042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Typeface f9043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9044d;

    public RunnableC0870x(TextView textView, Typeface typeface, int i10) {
        this.f9042b = textView;
        this.f9043c = typeface;
        this.f9044d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9042b.setTypeface(this.f9043c, this.f9044d);
    }
}
