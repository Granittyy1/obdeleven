package p205q6;

import android.os.Bundle;
import com.google.common.collect.ImmutableSet;
import p118j5.a;
import p131k5.P;
import p131k5.Y;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements a.InterfaceC0469a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f46143a;

    public f(c cVar) {
        this.f46143a = cVar;
    }

    @Override // p131k5.H1
    public final void a(long j, Bundle bundle, String str, String str2) {
        c cVar = this.f46143a;
        if (cVar.f46134a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            ImmutableSet<String> immutableSet = d.f46136a;
            String strB = Y.b(str2, P.f41947g, P.f41945e);
            if (strB != null) {
                str2 = strB;
            }
            bundle2.putString("events", str2);
            cVar.f46135b.a(2, bundle2);
        }
    }
}
