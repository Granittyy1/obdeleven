package com.voltasit.obdeleven.domain.usecases.controlUnit;

import J8.p;
import com.obdeleven.service.model.ControlUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import p293xa.r;

/* JADX INFO: compiled from: WriteWorkshopInfoUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class WriteWorkshopInfoUC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f30649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J8.f f30650b;

    public WriteWorkshopInfoUC(p pVar, J8.f fVar) {
        this.f30649a = pVar;
        this.f30650b = fVar;
    }

    public final Object a(ControlUnit controlUnit, kotlin.coroutines.c<? super r> cVar) throws Throwable {
        Object objF = C2680e.f(N.f43200c, new WriteWorkshopInfoUC$invoke$2(this, controlUnit, null), cVar);
        return objF == CoroutineSingletons.f43038b ? objF : r.f47939a;
    }
}
