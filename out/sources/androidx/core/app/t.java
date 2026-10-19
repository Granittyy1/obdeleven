package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;

/* JADX INFO: compiled from: NotificationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class t extends B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f16786a;

    public final void a(CharSequence charSequence) {
        this.mBigContentTitle = v.b(charSequence);
    }

    @Override // androidx.core.app.B
    public final void apply(o oVar) {
        Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(((C) oVar).f16678b).setBigContentTitle(this.mBigContentTitle).bigText(this.f16786a);
        if (this.mSummaryTextSet) {
            bigTextStyleBigText.setSummaryText(this.mSummaryText);
        }
    }

    public final void b(CharSequence charSequence) {
        this.mSummaryText = v.b(charSequence);
        this.mSummaryTextSet = true;
    }

    @Override // androidx.core.app.B
    public final void clearCompatExtraKeys(Bundle bundle) {
        super.clearCompatExtraKeys(bundle);
        bundle.remove("android.bigText");
    }

    @Override // androidx.core.app.B
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    @Override // androidx.core.app.B
    public final void restoreFromCompatExtras(Bundle bundle) {
        super.restoreFromCompatExtras(bundle);
        this.f16786a = bundle.getCharSequence("android.bigText");
    }
}
