package p252u6;

import android.os.Bundle;
import android.util.Log;
import java.util.Locale;
import java.util.Objects;
import p192p6.a;
import p276w6.c;
import p276w6.d;

/* JADX INFO: compiled from: CrashlyticsAnalyticsListener.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f47431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f47432b;

    @Override // p6.a.b
    public final void a(int i10, Bundle bundle) {
        Locale locale = Locale.US;
        Objects.toString(bundle);
        Log.isLoggable("FirebaseCrashlytics", 2);
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            p276w6.b bVar = "clx".equals(bundle2.getString("_o")) ? this.f47431a : this.f47432b;
            if (bVar == null) {
                return;
            }
            bVar.a(bundle2, string);
        }
    }
}
