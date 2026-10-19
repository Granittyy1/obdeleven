package com.voltasit.obdeleven.presentation.controlunitlist;

import G8.B;
import G8.C0703e;
import G8.C0704f;
import Ia.l;
import androidx.lifecycle.C;
import androidx.lifecycle.K;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.m;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import p293xa.p;

/* JADX INFO: compiled from: ControlUnitListViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends com.voltasit.obdeleven.presentation.d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.controlUnit.c f32039o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final K.a f32040p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C<List<G8.C>> f32041q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C f32042r;

    public h(K k10, String vehicleId, com.voltasit.obdeleven.domain.usecases.controlUnit.c cVar) {
        i.e(vehicleId, "vehicleId");
        this.f32039o = cVar;
        this.f32040p = k10.a(vehicleId, "vehicleId");
        C<List<G8.C>> c10 = new C<>(EmptyList.f42983b);
        this.f32041q = c10;
        this.f32042r = c10;
    }

    public static List e(int i10, List list) {
        if (i10 != 0) {
            return i10 != 1 ? q.h0(list, new p317za.a(new l[]{new l<G8.C, Comparable<?>>() { // from class: com.voltasit.obdeleven.presentation.controlunitlist.ControlUnitListViewModel$sort$3
                @Override // Ia.l
                public final Comparable<?> invoke(G8.C c10) {
                    G8.C it = c10;
                    i.e(it, "it");
                    return it.f3409d;
                }
            }, new l<G8.C, Comparable<?>>() { // from class: com.voltasit.obdeleven.presentation.controlunitlist.ControlUnitListViewModel$sort$4
                @Override // Ia.l
                public final Comparable<?> invoke(G8.C c10) {
                    G8.C it = c10;
                    i.e(it, "it");
                    return new p(it.f3406a);
                }
            }})) : q.h0(list, new g());
        }
        return q.h0(list, new f());
    }

    public abstract void b(int i10);

    public abstract void c(int i10);

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.Map] */
    public final void d(int i10, ArrayList arrayList) {
        C<List<G8.C>> c10 = this.f32041q;
        com.voltasit.obdeleven.domain.usecases.controlUnit.c cVar = this.f32039o;
        cVar.getClass();
        ArrayList arrayList2 = new ArrayList(m.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0703e c0703e = (C0703e) it.next();
            C0704f c0704f = c0703e.f3462c;
            short s10 = c0704f != null ? c0704f.f3487c : (short) 0;
            String str = "";
            String str2 = c0704f != null ? c0704f.f3486b : "";
            B b10 = c0704f != null ? c0704f.f3494k : null;
            i.b(b10);
            String str3 = (String) b10.f3404a.get(cVar.f30671c.Q().b());
            if (str3 == null) {
                C0704f c0704f2 = c0703e.f3462c;
                String str4 = c0704f2 != null ? c0704f2.j : null;
                if (str4 != null) {
                    str = str4;
                }
            } else {
                str = str3;
            }
            arrayList2.add(new G8.C(s10, str2, str, c0703e.f3464e));
        }
        c10.j(e(i10, arrayList2));
    }
}
