package p037cb;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.i;
import p011ab.e;

/* JADX INFO: renamed from: cb.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Platform.common.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C1528h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e[] f22614a = new e[0];

    public static final Set<String> a(e eVar) {
        i.e(eVar, "<this>");
        if (eVar instanceof InterfaceC1535l) {
            return ((InterfaceC1535l) eVar).b();
        }
        HashSet hashSet = new HashSet(eVar.f());
        int iF = eVar.f();
        for (int i10 = 0; i10 < iF; i10++) {
            hashSet.add(eVar.g(i10));
        }
        return hashSet;
    }

    public static final e[] b(List<? extends e> list) {
        e[] eVarArr;
        List<? extends e> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (eVarArr = (e[]) list.toArray(new e[0])) == null) ? f22614a : eVarArr;
    }
}
