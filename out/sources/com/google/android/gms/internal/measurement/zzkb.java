package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public class zzkb extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f26066b = 0;
    private InterfaceC1894r3 zza;

    public zzkb(String str) {
        super(str);
        this.zza = null;
    }

    public static zzkb a() {
        return new zzkb("Protocol message had invalid UTF-8.");
    }

    public static zzkb b() {
        return new zzkb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzkb c() {
        return new zzkb("Failed to parse the message.");
    }

    public static zzkb d() {
        return new zzkb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
