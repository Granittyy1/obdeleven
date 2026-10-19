package com.obdeleven.feature.boomboarding.ui;

import android.net.Uri;
import androidx.lifecycle.Y;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.flow.B;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.s;
import p078g1.p;
import p078g1.r;
import p078g1.v;

/* JADX INFO: compiled from: BoomboardingPlayerViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StateFlowImpl f29232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f29233b;

    public a() {
        StateFlowImpl stateFlowImplA = B.a(new b(null, null, null));
        this.f29232a = stateFlowImplA;
        this.f29233b = C2688e.b(stateFlowImplA);
    }

    public static p b(int i10, String str) {
        String str2 = "android.resource://" + str + "/" + i10;
        p.b.a aVar = new p.b.a();
        new p.d.a();
        List listEmptyList = Collections.emptyList();
        ImmutableList immutableListK = ImmutableList.K();
        p.e.a aVar2 = new p.e.a();
        p.g gVar = p.g.f35390a;
        Uri uri = str2 == null ? null : Uri.parse(str2);
        return new p("", new p.c(aVar), uri != null ? new p.f(uri, null, null, listEmptyList, immutableListK, null, -9223372036854775807L) : null, new p.e(aVar2), r.f35393B, gVar);
    }

    public final void c(c pagerDetails) {
        v vVar;
        i.e(pagerDetails, "pagerDetails");
        boolean z10 = pagerDetails instanceof c.b;
        StateFlowImpl stateFlowImpl = this.f29232a;
        if (z10) {
            vVar = ((b) stateFlowImpl.getValue()).f29234a;
        } else if (pagerDetails instanceof c.C0293c) {
            vVar = ((b) stateFlowImpl.getValue()).f29235b;
        } else {
            if (!(pagerDetails instanceof c.a)) {
                if (!(pagerDetails instanceof c.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            vVar = ((b) stateFlowImpl.getValue()).f29236c;
        }
        if (vVar != null) {
            vVar.c();
        }
    }

    public final void d(c pagerDetails) {
        v vVar;
        int iOrdinal;
        i.e(pagerDetails, "pagerDetails");
        boolean z10 = pagerDetails instanceof c.C0293c;
        int i10 = 0;
        if (z10 && (iOrdinal = ((c.C0293c) pagerDetails).f29237a.ordinal()) != 0) {
            i10 = 1;
            if (iOrdinal != 1) {
                i10 = 2;
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        boolean z11 = pagerDetails instanceof c.b;
        StateFlowImpl stateFlowImpl = this.f29232a;
        if (z11) {
            vVar = ((b) stateFlowImpl.getValue()).f29234a;
        } else if (z10) {
            vVar = ((b) stateFlowImpl.getValue()).f29235b;
        } else {
            if (!(pagerDetails instanceof c.a)) {
                if (!(pagerDetails instanceof c.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            vVar = ((b) stateFlowImpl.getValue()).f29236c;
        }
        if (vVar == null) {
            return;
        }
        if (vVar.K() == i10 && vVar.F()) {
            return;
        }
        if (z10) {
            vVar.x(i10);
        }
        vVar.I();
    }
}
