package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzkd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzkd f26067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzkd f26068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzkd f26069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zzkd f26070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final zzkd f26071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final zzkd f26072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final zzkd f26073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final zzkd f26074i;
    public static final zzkd j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final zzkd f26075k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ zzkd[] f26076l;
    private final Class<?> zzl;
    private final Class<?> zzm;
    private final Object zzn;

    static {
        zzkd zzkdVar = new zzkd("VOID", 0, Void.class, Void.class, null);
        f26067b = zzkdVar;
        Class cls = Integer.TYPE;
        zzkd zzkdVar2 = new zzkd("INT", 1, cls, Integer.class, 0);
        f26068c = zzkdVar2;
        zzkd zzkdVar3 = new zzkd("LONG", 2, Long.TYPE, Long.class, 0L);
        f26069d = zzkdVar3;
        zzkd zzkdVar4 = new zzkd("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f26070e = zzkdVar4;
        zzkd zzkdVar5 = new zzkd("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f26071f = zzkdVar5;
        zzkd zzkdVar6 = new zzkd("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f26072g = zzkdVar6;
        zzkd zzkdVar7 = new zzkd("STRING", 6, String.class, String.class, "");
        f26073h = zzkdVar7;
        zzkd zzkdVar8 = new zzkd("BYTE_STRING", 7, zzij.class, zzij.class, zzij.f26049b);
        f26074i = zzkdVar8;
        zzkd zzkdVar9 = new zzkd("ENUM", 8, cls, Integer.class, null);
        j = zzkdVar9;
        zzkd zzkdVar10 = new zzkd("MESSAGE", 9, Object.class, Object.class, null);
        f26075k = zzkdVar10;
        f26076l = new zzkd[]{zzkdVar, zzkdVar2, zzkdVar3, zzkdVar4, zzkdVar5, zzkdVar6, zzkdVar7, zzkdVar8, zzkdVar9, zzkdVar10};
    }

    public zzkd(String str, int i10, Class cls, Class cls2, Serializable serializable) {
        super(str, i10);
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = serializable;
    }

    public static zzkd[] values() {
        return (zzkd[]) f26076l.clone();
    }

    public final Class<?> a() {
        return this.zzm;
    }
}
