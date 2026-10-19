package com.google.android.gms.common.internal;

import S4.C0760b;
import U4.C0804l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaf extends Exception {
    public final C0760b zza;

    public zzaf(C0760b c0760b) {
        C0804l.a("ResolvableConnectionException can only be created with a connection result containing a resolution.", c0760b.e());
        this.zza = c0760b;
    }
}
