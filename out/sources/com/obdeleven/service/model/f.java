package com.obdeleven.service.model;

import androidx.collection.Y;
import com.obdeleven.service.enums.GatewayType;
import com.parse.ControlUnitDB;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.core.app.C2086b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p109i8.g;
import p109i8.h;
import p134k8.C2598c;
import p134k8.S0;
import p134k8.T0;
import p134k8.V0;
import p134k8.a2;

/* JADX INFO: compiled from: GatewayControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends ControlUnit implements h {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public HashMap f29424B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public HashMap f29425C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Y<S0> f29426D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public V0 f29427E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public GatewayType f29428F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final g f29429G;

    public f(ControlUnitDB controlUnitDB, a2 a2Var, C2598c c2598c, com.obdeleven.service.core.c cVar, g gVar) {
        super(controlUnitDB, a2Var, c2598c, cVar);
        this.f29428F = GatewayType.f29268b;
        this.f29424B = new HashMap();
        this.f29425C = new HashMap();
        this.f29426D = new Y<>();
        if (!a2Var.h()) {
            this.f29428F = GatewayType.f29269c;
        }
        this.f29429G = gVar;
    }

    public final void N0() {
        for (int i10 = 0; i10 < this.f29426D.f(); i10++) {
            S0 s0G = this.f29426D.g(i10);
            if (s0G != null && s0G.f42670b != s0G.f42671c && this.f29426D.d(i10) >= 0) {
                this.f29427E.a(this.f29426D.d(i10), s0G.f42670b);
                s0G.f42671c = s0G.f42670b;
            }
        }
    }

    public final boolean O0() {
        for (int i10 = 0; i10 < this.f29426D.f(); i10++) {
            S0 s0G = this.f29426D.g(i10);
            if (s0G != null && s0G.f42670b != s0G.f42671c) {
                return true;
            }
        }
        return false;
    }

    public final void P0(int i10, ControlUnit controlUnit) {
        List arrayList = (List) this.f29425C.get(controlUnit.n());
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        arrayList.add(Integer.valueOf(i10));
        this.f29425C.put(controlUnit.n(), arrayList);
    }

    public final Task<Integer> Q0(String str) {
        O.e.j(t() + "_" + getName(), "writeGatewayCoding(" + str + ")");
        return this.f29428F == GatewayType.f29269c ? Task.forResult(-1) : D(false).continueWithTask(new C2086b(this, 3, str));
    }

    @Override // p109i8.h
    public final long j() {
        int iOrdinal = this.f29327i.ordinal();
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? 0L : 1000L;
        }
        return 10000L;
    }

    @Override // p109i8.h
    public final T0 w() {
        O.e.j(t() + "_" + getName(), "autocodeJob()");
        T0 t8 = new T0(com.google.android.gms.internal.measurement.Y.e(this.f29426D));
        try {
            N0();
            t8.f42676b = com.google.android.gms.internal.measurement.Y.e(this.f29426D);
            Task<Integer> taskQ0 = Q0(com.obdeleven.service.util.b.a(this.f29427E.f42685a));
            taskQ0.waitForCompletion();
            taskQ0.getResult().getClass();
            t8.f42677c = taskQ0.getResult().intValue();
            return t8;
        } catch (InterruptedException e10) {
            O.e.m(e10);
            t8.f42677c = -1;
            return t8;
        }
    }
}
