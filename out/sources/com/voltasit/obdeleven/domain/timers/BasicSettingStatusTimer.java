package com.voltasit.obdeleven.domain.timers;

import Ia.l;
import J8.p;
import W7.c;
import W7.d;
import com.obdeleven.service.model.ControlUnit;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2673a0;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.z0;
import m8.o;
import p109i8.k;
import p293xa.r;

/* JADX INFO: compiled from: BasicSettingStatusTimer.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class BasicSettingStatusTimer implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f30606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z0 f30607c;

    public BasicSettingStatusTimer(p pVar) {
        this.f30606b = pVar;
        c.a(this);
    }

    @Override // W7.d
    public final String a() {
        return "BasicSettingStatusTimer";
    }

    public final void b(k requestProvider, ControlUnit controlUnit, l<? super o, r> lVar) {
        i.e(requestProvider, "requestProvider");
        i.e(controlUnit, "controlUnit");
        z0 z0Var = this.f30607c;
        if (z0Var != null) {
            z0Var.i(null);
        }
        this.f30607c = null;
        this.f30607c = C2680e.c(C2673a0.f43223b, null, null, new BasicSettingStatusTimer$startTimer$1(this, requestProvider, controlUnit, lVar, null), 3);
    }

    @Override // W7.d
    public final void e(int i10) {
        if (i10 == 0) {
            z0 z0Var = this.f30607c;
            if (z0Var != null) {
                z0Var.i(null);
            }
            this.f30607c = null;
        }
    }
}
