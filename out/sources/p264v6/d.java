package p264v6;

import G7.c;
import G7.f;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.collections.m;
import kotlin.jvm.internal.i;
import p033c7.Q;
import p313z6.b;
import p313z6.k;
import p313z6.n;

/* JADX INFO: compiled from: CrashlyticsRemoteConfigListener.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f47654a;

    public d(n nVar) {
        this.f47654a = nVar;
    }

    @Override // G7.f
    public final void a(c cVar) {
        n nVar = this.f47654a;
        HashSet<G7.d> hashSet = cVar.f3398a;
        i.d(hashSet, "rolloutsState.rolloutAssignments");
        ArrayList arrayList = new ArrayList(m.y(hashSet, 10));
        for (G7.d dVar : hashSet) {
            String strC = dVar.c();
            String strA = dVar.a();
            String strB = dVar.b();
            String strE = dVar.e();
            long jD = dVar.d();
            N6.d dVar2 = k.f48888a;
            arrayList.add(new b(strC, strA, strB.length() > 256 ? strB.substring(0, 256) : strB, strE, jD));
        }
        synchronized (nVar.f48897f) {
            try {
                if (nVar.f48897f.b(arrayList)) {
                    nVar.f48893b.a(new Q(nVar, 1, nVar.f48897f.a()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
    }
}
