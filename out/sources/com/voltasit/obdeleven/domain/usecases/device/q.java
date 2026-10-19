package com.voltasit.obdeleven.domain.usecases.device;

/* JADX INFO: compiled from: SendRequestCommandUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends com.obdeleven.service.core.gen1.i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f30805h;

    @Override // com.obdeleven.service.core.gen1.i
    public final void i(byte[] data) {
        kotlin.jvm.internal.i.e(data, "data");
        if (data.length == 0) {
            h(this.f30805h);
        } else {
            this.f30805h = com.obdeleven.service.util.b.a(data);
        }
    }
}
