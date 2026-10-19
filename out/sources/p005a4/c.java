package p005a4;

import D2.V;
import Z3.q;
import android.content.Context;
import android.os.Bundle;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.google.android.gms.internal.measurement.zzs;
import com.google.android.gms.measurement.internal.d;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.i;
import p131k5.C2483a1;
import p131k5.D0;
import p276w6.a;

/* JADX INFO: compiled from: AppEventCollection.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8018b;

    public /* synthetic */ c(Object obj) {
        this.f8018b = obj;
    }

    public synchronized u a(AccessTokenAppIdPair accessTokenAppIdPair) {
        i.e(accessTokenAppIdPair, "accessTokenAppIdPair");
        return (u) ((HashMap) this.f8018b).get(accessTokenAppIdPair);
    }

    public synchronized u b(AccessTokenAppIdPair accessTokenAppIdPair) {
        Context contextA;
        p165n4.a aVarA;
        u uVar = (u) ((HashMap) this.f8018b).get(accessTokenAppIdPair);
        if (uVar == null && (aVarA = p165n4.a.C0509a.a((contextA = q.a()))) != null) {
            uVar = new u(aVarA, V.k(contextA));
        }
        if (uVar == null) {
            return null;
        }
        ((HashMap) this.f8018b).put(accessTokenAppIdPair, uVar);
        return uVar;
    }

    @Override // p276w6.a
    public void c(Bundle bundle) {
        ((p192p6.a) this.f8018b).c(bundle, "clx", "_ae");
    }

    public synchronized Set d() {
        Set setKeySet;
        setKeySet = ((HashMap) this.f8018b).keySet();
        i.d(setKeySet, "stateMap.keys");
        return setKeySet;
    }

    public void e(zzs zzsVar, String str, List list, boolean z10, boolean z11) {
        D0 d10;
        int i10 = C2483a1.f42078a[zzsVar.ordinal()];
        d dVar = (d) this.f8018b;
        if (i10 == 1) {
            d10 = dVar.d().f41718m;
        } else if (i10 != 2) {
            if (i10 != 3) {
                d10 = i10 != 4 ? dVar.d().f41717l : dVar.d().f41719n;
            } else if (z10) {
                d10 = dVar.d().j;
            } else {
                d10 = !z11 ? dVar.d().f41716k : dVar.d().f41715i;
            }
        } else if (z10) {
            d10 = dVar.d().f41713g;
        } else {
            d10 = !z11 ? dVar.d().f41714h : dVar.d().f41712f;
        }
        int size = list.size();
        if (size == 1) {
            d10.b(list.get(0), str);
            return;
        }
        if (size == 2) {
            d10.a(list.get(0), list.get(1), str);
        } else if (size != 3) {
            d10.c(str);
        } else {
            d10.d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    public c() {
        this.f8018b = new HashMap();
    }
}
