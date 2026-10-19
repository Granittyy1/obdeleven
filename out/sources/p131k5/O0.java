package p131k5;

import U4.C0804l;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class O0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f41933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f41934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L0 f41935e;

    public O0(L0 l10, long j) {
        this.f41935e = l10;
        C0804l.e("health_monitor");
        C0804l.b(j > 0);
        this.f41931a = "health_monitor:start";
        this.f41932b = "health_monitor:count";
        this.f41933c = "health_monitor:value";
        this.f41934d = j;
    }

    public final void a() {
        L0 l10 = this.f41935e;
        l10.p();
        ((C2523i1) l10.f3968a).f42224n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = l10.y().edit();
        editorEdit.remove(this.f41932b);
        editorEdit.remove(this.f41933c);
        editorEdit.putLong(this.f41931a, jCurrentTimeMillis);
        editorEdit.apply();
    }
}
