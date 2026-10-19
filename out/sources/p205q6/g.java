package p205q6;

import android.os.Bundle;
import p118j5.a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements a.InterfaceC0469a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f46144a;

    public g(e eVar) {
        this.f46144a = eVar;
    }

    @Override // p131k5.H1
    public final void a(long j, Bundle bundle, String str, String str2) {
        if (str == null || d.f46136a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle("params", bundle);
        this.f46144a.f46142a.a(3, bundle2);
    }
}
