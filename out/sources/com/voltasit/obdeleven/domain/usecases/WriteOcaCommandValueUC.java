package com.voltasit.obdeleven.domain.usecases;

/* JADX INFO: compiled from: WriteOcaCommandValueUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class WriteOcaCommandValueUC extends C.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J8.g f30631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J8.q f30632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J8.a f30633e;

    /* JADX INFO: compiled from: WriteOcaCommandValueUC.kt */
    public static final class DeviceVoltageException extends Exception {
        public DeviceVoltageException() {
            super("Device voltage is low");
        }
    }

    public WriteOcaCommandValueUC(J8.g gVar, J8.q qVar, J8.a aVar) {
        this.f30631c = gVar;
        this.f30632d = qVar;
        this.f30633e = aVar;
    }
}
