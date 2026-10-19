package B0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: AccessibilityClickableSpanCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f1408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1409c;

    public a(int i10, s sVar, int i11) {
        this.f1407a = i10;
        this.f1408b = sVar;
        this.f1409c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1407a);
        this.f1408b.f1411a.performAction(this.f1409c, bundle);
    }
}
