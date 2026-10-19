package com.voltasit.obdeleven.data.repositories;

import com.voltasit.obdeleven.domain.exceptions.AppException;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: OcaRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
final class OcaRepositoryImpl$saveOriginalAppValue$3 extends Lambda implements Ia.l<Throwable, Throwable> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final OcaRepositoryImpl$saveOriginalAppValue$3 f30300h = new OcaRepositoryImpl$saveOriginalAppValue$3();

    public OcaRepositoryImpl$saveOriginalAppValue$3() {
        super(1);
    }

    @Override // Ia.l
    public final Throwable invoke(Throwable th) {
        Throwable it = th;
        kotlin.jvm.internal.i.e(it, "it");
        return new AppException(-5);
    }
}
