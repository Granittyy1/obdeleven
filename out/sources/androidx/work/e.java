package androidx.work;

import android.app.Notification;

/* JADX INFO: compiled from: ForegroundInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f20357c;

    public e(int i10, Notification notification, int i11) {
        this.f20355a = i10;
        this.f20357c = notification;
        this.f20356b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f20355a == eVar.f20355a && this.f20356b == eVar.f20356b) {
            return this.f20357c.equals(eVar.f20357c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20357c.hashCode() + (((this.f20355a * 31) + this.f20356b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f20355a + ", mForegroundServiceType=" + this.f20356b + ", mNotification=" + this.f20357c + '}';
    }
}
