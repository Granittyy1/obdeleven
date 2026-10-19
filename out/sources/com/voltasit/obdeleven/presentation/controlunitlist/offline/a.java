package com.voltasit.obdeleven.presentation.controlunitlist.offline;

import A8.e;
import G8.C;
import K8.o;
import K8.x;
import androidx.lifecycle.K;
import androidx.lifecycle.Z;
import com.parse.ControlUnitDB;
import com.voltasit.obdeleven.domain.usecases.controlUnit.b;
import com.voltasit.obdeleven.domain.usecases.controlUnit.c;
import com.voltasit.obdeleven.presentation.controlunitlist.h;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2680e;
import p005a4.q;
import p255u9.E;
import p293xa.p;
import p293xa.r;

/* JADX INFO: compiled from: OfflineControlUnitListViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final U7.a<C0336a> f32044A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final U7.a f32045B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public List<? extends ControlUnitDB> f32046C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public E f32047D;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o f32048s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f32049t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final x f32050u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final e f32051v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final U7.a<r> f32052w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final U7.a f32053x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final U7.a<r> f32054y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final U7.a f32055z;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.controlunitlist.offline.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: OfflineControlUnitListViewModel.kt */
    public static final class C0336a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ControlUnitDB f32056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final E f32057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f32058c;

        public C0336a(ControlUnitDB controlUnitDB, E vehicleDB, int i10) {
            i.e(vehicleDB, "vehicleDB");
            this.f32056a = controlUnitDB;
            this.f32057b = vehicleDB;
            this.f32058c = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0336a)) {
                return false;
            }
            C0336a c0336a = (C0336a) obj;
            return i.a(this.f32056a, c0336a.f32056a) && i.a(this.f32057b, c0336a.f32057b) && this.f32058c == c0336a.f32058c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f32058c) + ((this.f32057b.hashCode() + (this.f32056a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ControlUnitNavigationParams(controlUnitDB=");
            sb2.append(this.f32056a);
            sb2.append(", vehicleDB=");
            sb2.append(this.f32057b);
            sb2.append(", position=");
            return q.c(sb2, this.f32058c, ")");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(K k10, String vehicleId, o oVar, b bVar, x xVar, e eVar, c cVar) {
        super(k10, vehicleId, cVar);
        i.e(vehicleId, "vehicleId");
        this.f32048s = oVar;
        this.f32049t = bVar;
        this.f32050u = xVar;
        this.f32051v = eVar;
        U7.a<r> aVar = new U7.a<>();
        this.f32052w = aVar;
        this.f32053x = aVar;
        U7.a<r> aVar2 = new U7.a<>();
        this.f32054y = aVar2;
        this.f32055z = aVar2;
        U7.a<C0336a> aVar3 = new U7.a<>();
        this.f32044A = aVar3;
        this.f32045B = aVar3;
        C2680e.c(Z.a(this), this.f32112a, null, new OfflineControlUnitListViewModel$loadVehicle$1(this, null), 2);
        C2680e.c(Z.a(this), this.f32112a, null, new OfflineControlUnitListViewModel$requestControlUnits$1(this, null), 2);
    }

    @Override // com.voltasit.obdeleven.presentation.controlunitlist.h
    public final void b(int i10) {
        E e10;
        C c10;
        List<? extends ControlUnitDB> list = this.f32046C;
        Object obj = null;
        if (list == null) {
            i.m("controlUnits");
            throw null;
        }
        for (Object obj2 : list) {
            ControlUnitDB controlUnitDB = (ControlUnitDB) obj2;
            List list2 = (List) this.f32042r.d();
            p pVar = (list2 == null || (c10 = (C) list2.get(i10)) == null) ? null : new p(c10.f3406a);
            short sShortValue = controlUnitDB.getControlUnitBase().a().shortValue();
            if (pVar != null && pVar.f47935b == sShortValue) {
                obj = obj2;
                break;
            }
        }
        ControlUnitDB controlUnitDB2 = (ControlUnitDB) obj;
        if (controlUnitDB2 == null || (e10 = this.f32047D) == null) {
            return;
        }
        this.f32044A.j(new C0336a(controlUnitDB2, e10, i10));
    }

    @Override // com.voltasit.obdeleven.presentation.controlunitlist.h
    public final void c(int i10) {
        this.f32048s.f(i10, true);
        androidx.lifecycle.C<List<C>> c10 = this.f32041q;
        List list = (List) this.f32042r.d();
        if (list == null) {
            list = EmptyList.f42983b;
        }
        c10.j(h.e(i10, list));
    }
}
