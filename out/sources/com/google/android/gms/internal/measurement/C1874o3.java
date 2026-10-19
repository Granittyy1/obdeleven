package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1874o3 implements InterfaceC1853l3 {
    @Override // com.google.android.gms.internal.measurement.InterfaceC1853l3
    /* JADX INFO: renamed from: a */
    public final void mo8a(Object obj, Object obj2) {
        zzla zzlaVar = (zzla) obj;
        if (zzlaVar.isEmpty()) {
            return;
        }
        Iterator it = zzlaVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw new NoSuchMethodError();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1853l3
    public final boolean b(Object obj) {
        return !((zzla) obj).e();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1853l3
    public final zzla c(Object obj) {
        return (zzla) obj;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1853l3
    public final Object d(Object obj) {
        ((zzla) obj).c();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1853l3
    public final void e(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1853l3
    public final zzla f(Object obj) {
        return (zzla) obj;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1853l3
    public final zzla x() {
        return zzla.f26077b.b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1853l3
    public final zzla a(Object obj, Object obj2) {
        zzla zzlaVarB = (zzla) obj;
        zzla zzlaVar = (zzla) obj2;
        if (!zzlaVar.isEmpty()) {
            if (!zzlaVarB.e()) {
                zzlaVarB = zzlaVarB.b();
            }
            zzlaVarB.f();
            if (!zzlaVar.isEmpty()) {
                zzlaVarB.putAll(zzlaVar);
            }
        }
        return zzlaVarB;
    }
}
