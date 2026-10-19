package com.google.android.gms.internal.measurement;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzcl f26004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ zzcl[] f26005c;

    static {
        zzcl zzclVar = new zzcl("READ_AND_WRITE", 0);
        f26004b = zzclVar;
        f26005c = new zzcl[]{zzclVar, new zzcl("READ_ONLY", 1), new zzcl("WRITE_ONLY", 2)};
    }

    public zzcl() {
        throw null;
    }

    public static zzcl[] values() {
        return (zzcl[]) f26005c.clone();
    }
}
