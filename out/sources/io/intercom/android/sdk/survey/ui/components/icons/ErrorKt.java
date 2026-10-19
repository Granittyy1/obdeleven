package io.intercom.android.sdk.survey.ui.components.icons;

import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.graphics.vector.c;
import androidx.compose.ui.graphics.vector.d;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.i;
import p282x.a;

/* JADX INFO: compiled from: Error.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ErrorKt {
    private static c _error;

    public static final c getError(a aVar) {
        i.e(aVar, "<this>");
        c cVar = _error;
        if (cVar != null) {
            return cVar;
        }
        c.a aVar2 = new c.a("Filled.Error", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        EmptyList emptyList = androidx.compose.ui.graphics.vector.i.f13970a;
        m0 m0Var = new m0(H.f13495b);
        d dVar = new d();
        dVar.h(12.0f, 2.0f);
        dVar.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        dVar.j(4.48f, 10.0f, 10.0f, 10.0f);
        dVar.j(10.0f, -4.48f, 10.0f, -10.0f);
        dVar.i(17.52f, 2.0f, 12.0f, 2.0f);
        dVar.a();
        dVar.h(13.0f, 17.0f);
        dVar.e(-2.0f);
        dVar.l(-2.0f);
        dVar.e(2.0f);
        dVar.l(2.0f);
        dVar.a();
        dVar.h(13.0f, 13.0f);
        dVar.e(-2.0f);
        dVar.f(11.0f, 7.0f);
        dVar.e(2.0f);
        dVar.l(6.0f);
        dVar.a();
        c.a.a(aVar2, dVar.f13897a, m0Var);
        c cVarB = aVar2.b();
        _error = cVarB;
        return cVarB;
    }
}
