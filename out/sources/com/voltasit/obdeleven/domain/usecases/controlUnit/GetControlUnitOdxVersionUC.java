package com.voltasit.obdeleven.domain.usecases.controlUnit;

import J8.p;
import K8.k;

/* JADX INFO: compiled from: GetControlUnitOdxVersionUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class GetControlUnitOdxVersionUC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f30642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f30643b;

    /* JADX INFO: compiled from: GetControlUnitOdxVersionUC.kt */
    public static final class OdxVersionNotSelectedException extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final OdxVersionNotSelectedException f30644b = new OdxVersionNotSelectedException();

        private OdxVersionNotSelectedException() {
            super("ODX version not selected for control unit");
        }
    }

    public GetControlUnitOdxVersionUC(k kVar, p pVar) {
        this.f30642a = kVar;
        this.f30643b = pVar;
    }
}
