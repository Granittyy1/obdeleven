package com.voltasit.obdeleven.domain.usecases.user;

import com.google.android.gms.internal.measurement.C1787c0;
import java.time.Instant;
import kotlin.time.DurationUnit;

/* JADX INFO: compiled from: IsNumberConfirmationNeededUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.f f31002a;

    public n(J8.f fVar) {
        this.f31002a = fVar;
    }

    public final boolean a(G8.G personalInfo) {
        kotlin.jvm.internal.i.e(personalInfo, "personalInfo");
        if (!personalInfo.j) {
            return true;
        }
        Ua.d.Companion.getClass();
        Instant instantOfEpochMilli = Instant.ofEpochMilli(personalInfo.f3426k);
        kotlin.jvm.internal.i.d(instantOfEpochMilli, "ofEpochMilli(...)");
        new Ua.d(instantOfEpochMilli);
        Ua.d dVarC = this.f31002a.c();
        int i10 = Pa.b.f4973e;
        Instant instant = dVarC.f6577b;
        return Pa.b.c(Pa.b.g(C1787c0.u(instant.getEpochSecond() - instantOfEpochMilli.getEpochSecond(), DurationUnit.SECONDS), C1787c0.t(instant.getNano() - instantOfEpochMilli.getNano(), DurationUnit.NANOSECONDS)), C1787c0.t(365, DurationUnit.DAYS)) > 0;
    }
}
