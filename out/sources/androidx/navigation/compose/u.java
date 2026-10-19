package androidx.navigation.compose;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import java.util.List;
import kotlin.collections.EmptyList;
import p141l2.C2746p;

/* JADX INFO: compiled from: NavGraphBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    public static void a(p141l2.F f10, String str, List list, Ia.l lVar, Ia.l lVar2, Ia.l lVar3, Ia.l lVar4, ComposableLambdaImpl composableLambdaImpl, int i10) {
        if ((i10 & 2) != 0) {
            list = EmptyList.f42983b;
        }
        EmptyList<p141l2.z> emptyList = EmptyList.f42983b;
        if ((i10 & 8) != 0) {
            lVar = null;
        }
        if ((i10 & 16) != 0) {
            lVar2 = null;
        }
        if ((i10 & 32) != 0) {
            lVar3 = lVar;
        }
        if ((i10 & 64) != 0) {
            lVar4 = lVar2;
        }
        p141l2.Q q10 = f10.f44236g;
        q10.getClass();
        C1413f c1413f = new C1413f((C1412e) q10.b(l2.Q.a.a(C1412e.class)), str, composableLambdaImpl);
        for (C2746p c2746p : list) {
            c1413f.f44231d.put(c2746p.f44286a, c2746p.f44287b);
        }
        for (p141l2.z navDeepLink : emptyList) {
            kotlin.jvm.internal.i.e(navDeepLink, "navDeepLink");
            c1413f.f44232e.add(navDeepLink);
        }
        c1413f.f19162i = lVar;
        c1413f.j = lVar2;
        c1413f.f19163k = lVar3;
        c1413f.f19164l = lVar4;
        c1413f.f19165m = null;
        f10.f44238i.add(c1413f.a());
    }
}
