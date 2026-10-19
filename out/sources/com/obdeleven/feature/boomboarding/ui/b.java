package com.obdeleven.feature.boomboarding.ui;

import kotlin.jvm.internal.i;
import p078g1.v;

/* JADX INFO: compiled from: BoomboardingVideoPlayerState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f29234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f29235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f29236c;

    public b() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return i.a(this.f29234a, bVar.f29234a) && i.a(this.f29235b, bVar.f29235b) && i.a(this.f29236c, bVar.f29236c);
    }

    public final int hashCode() {
        v vVar = this.f29234a;
        int iHashCode = (vVar == null ? 0 : vVar.hashCode()) * 31;
        v vVar2 = this.f29235b;
        int iHashCode2 = (iHashCode + (vVar2 == null ? 0 : vVar2.hashCode())) * 31;
        v vVar3 = this.f29236c;
        return iHashCode2 + (vVar3 != null ? vVar3.hashCode() : 0);
    }

    public final String toString() {
        return "BoomboardingVideoPlayerState(introPlayer=" + this.f29234a + ", ocaPlayer=" + this.f29235b + ", diagnosticPlayer=" + this.f29236c + ")";
    }

    public b(v vVar, v vVar2, v vVar3) {
        this.f29234a = vVar;
        this.f29235b = vVar2;
        this.f29236c = vVar3;
    }
}
