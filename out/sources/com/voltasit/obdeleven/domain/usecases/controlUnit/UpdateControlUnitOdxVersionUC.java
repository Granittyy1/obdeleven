package com.voltasit.obdeleven.domain.usecases.controlUnit;

import J8.p;
import K8.k;
import androidx.compose.foundation.C0936h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import p293xa.r;

/* JADX INFO: compiled from: UpdateControlUnitOdxVersionUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class UpdateControlUnitOdxVersionUC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f30647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f30648b;

    public UpdateControlUnitOdxVersionUC(k kVar, p pVar) {
        this.f30647a = kVar;
        this.f30648b = pVar;
    }

    public final Object a(p109i8.e eVar, String str, kotlin.coroutines.c<? super r> cVar) throws Throwable {
        String strD = C0936h.d("UpdateControlUnitOdxVersion(controlUnit=", eVar.t(), ", odxVersion=", str, ")");
        p pVar = this.f30648b;
        pVar.f("UpdateControlUnitOdxVersion", strD);
        short sShortValue = eVar.n().shortValue();
        k kVar = this.f30647a;
        if (kVar.a(sShortValue).equals(str)) {
            pVar.e("UpdateControlUnitOdxVersion", "Ignoring odx reset, because new and old versions match");
            return r.f47939a;
        }
        kVar.d(str, eVar.n().shortValue());
        Object objF = C2680e.f(N.f43200c, new UpdateControlUnitOdxVersionUC$invoke$2(eVar, null), cVar);
        return objF == CoroutineSingletons.f43038b ? objF : r.f47939a;
    }
}
