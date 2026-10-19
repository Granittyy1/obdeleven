package io.intercom.android.sdk.survey.ui.components.icons;

import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.graphics.vector.c;
import androidx.compose.ui.graphics.vector.d;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.i;
import p282x.a;

/* JADX INFO: compiled from: Launch.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class LaunchKt {
    private static c _launch;

    public static final c getLaunch(a aVar) {
        i.e(aVar, "<this>");
        c cVar = _launch;
        if (cVar != null) {
            return cVar;
        }
        c.a aVar2 = new c.a("Filled.Launch", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        EmptyList emptyList = androidx.compose.ui.graphics.vector.i.f13970a;
        m0 m0Var = new m0(H.f13495b);
        d dVar = new d();
        dVar.h(19.0f, 19.0f);
        dVar.d(5.0f);
        dVar.k(5.0f);
        dVar.e(7.0f);
        dVar.k(3.0f);
        dVar.d(5.0f);
        dVar.c(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        dVar.l(14.0f);
        dVar.c(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        dVar.e(14.0f);
        dVar.c(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        dVar.l(-7.0f);
        dVar.e(-2.0f);
        dVar.l(7.0f);
        dVar.a();
        dVar.h(14.0f, 3.0f);
        dVar.l(2.0f);
        dVar.e(3.59f);
        dVar.g(-9.83f, 9.83f);
        dVar.g(1.41f, 1.41f);
        dVar.f(19.0f, 6.41f);
        dVar.k(10.0f);
        dVar.e(2.0f);
        dVar.k(3.0f);
        dVar.e(-7.0f);
        dVar.a();
        c.a.a(aVar2, dVar.f13897a, m0Var);
        c cVarB = aVar2.b();
        _launch = cVarB;
        return cVarB;
    }
}
