package com.voltasit.obdeleven.domain.usecases;

/* JADX INFO: compiled from: LoadVehicleIntoCacheUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class LoadVehicleIntoCacheUseCase extends C.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K8.o f30617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final K8.b f30618d;

    /* JADX INFO: compiled from: LoadVehicleIntoCacheUseCase.kt */
    public static final class NoCarForStartViewException extends Exception {
        public NoCarForStartViewException() {
            super("No car found for start view cover");
        }
    }

    public LoadVehicleIntoCacheUseCase(K8.o oVar, K8.b bVar) {
        this.f30617c = oVar;
        this.f30618d = bVar;
    }
}
