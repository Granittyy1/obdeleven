package p131k5;

import Q8.d;
import Y4.f;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class A0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f41591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f41592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f41593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f41594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f41595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ B0 f41596g;

    public A0(B0 b10, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f41591b = i10;
        this.f41592c = str;
        this.f41593d = obj;
        this.f41594e = obj2;
        this.f41595f = obj3;
        this.f41596g = b10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L0 l10 = ((C2523i1) this.f41596g.f3968a).f42219h;
        C2523i1.e(l10);
        if (!l10.f41749b) {
            Log.println(6, this.f41596g.E(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        B0 b10 = this.f41596g;
        if (b10.f41709c == 0) {
            C2501e c2501e = ((C2523i1) b10.f3968a).f42218g;
            if (c2501e.f42148e == null) {
                synchronized (c2501e) {
                    try {
                        if (c2501e.f42148e == null) {
                            ApplicationInfo applicationInfo = ((C2523i1) c2501e.f3968a).f42212a.getApplicationInfo();
                            String strA = f.a();
                            if (applicationInfo != null) {
                                String str = applicationInfo.processName;
                                c2501e.f42148e = Boolean.valueOf(str != null && str.equals(strA));
                            }
                            if (c2501e.f42148e == null) {
                                c2501e.f42148e = Boolean.TRUE;
                                c2501e.d().f41712f.c("My process not in the list of running processes");
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (c2501e.f42148e.booleanValue()) {
                this.f41596g.f41709c = 'C';
            } else {
                this.f41596g.f41709c = 'c';
            }
        }
        B0 b11 = this.f41596g;
        if (b11.f41710d < 0) {
            b11.f41710d = 87000L;
        }
        char cCharAt = "01VDIWEA?".charAt(this.f41591b);
        B0 b12 = this.f41596g;
        char c10 = b12.f41709c;
        long j = b12.f41710d;
        String strU = B0.u(true, this.f41592c, this.f41593d, this.f41594e, this.f41595f);
        StringBuilder sb2 = new StringBuilder("2");
        sb2.append(cCharAt);
        sb2.append(c10);
        sb2.append(j);
        String strA2 = d.a(sb2, ":", strU);
        if (strA2.length() > 1024) {
            strA2 = this.f41592c.substring(0, 1024);
        }
        O0 o10 = l10.f41864f;
        if (o10 != null) {
            L0 l11 = o10.f41935e;
            l11.p();
            if (o10.f41935e.y().getLong(o10.f41931a, 0L) == 0) {
                o10.a();
            }
            if (strA2 == null) {
                strA2 = "";
            }
            SharedPreferences sharedPreferencesY = l11.y();
            String str2 = o10.f41932b;
            long j10 = sharedPreferencesY.getLong(str2, 0L);
            String str3 = o10.f41933c;
            if (j10 <= 0) {
                SharedPreferences.Editor editorEdit = l11.y().edit();
                editorEdit.putString(str3, strA2);
                editorEdit.putLong(str2, 1L);
                editorEdit.apply();
                return;
            }
            long j11 = j10 + 1;
            boolean z10 = (l11.o().E0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j11;
            SharedPreferences.Editor editorEdit2 = l11.y().edit();
            if (z10) {
                editorEdit2.putString(str3, strA2);
            }
            editorEdit2.putLong(str2, j11);
            editorEdit2.apply();
        }
    }
}
