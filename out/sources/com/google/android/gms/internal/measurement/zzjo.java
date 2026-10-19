package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
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
public final class zzjo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzjo f26057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzjo f26058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzjo[] f26059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ zzjo[] f26060e;
    private final zzkd zzbc;
    private final int zzbd;
    private final zzjq zzbe;
    private final Class<?> zzbf;
    private final boolean zzbg;

    /* JADX INFO: Fake field, exist only in values array */
    zzjo EF0;

    static {
        zzjq zzjqVar = zzjq.f26061b;
        zzkd zzkdVar = zzkd.f26071f;
        zzjo zzjoVar = new zzjo("DOUBLE", 0, 0, zzjqVar, zzkdVar);
        zzkd zzkdVar2 = zzkd.f26070e;
        zzjo zzjoVar2 = new zzjo("FLOAT", 1, 1, zzjqVar, zzkdVar2);
        zzkd zzkdVar3 = zzkd.f26069d;
        zzjo zzjoVar3 = new zzjo("INT64", 2, 2, zzjqVar, zzkdVar3);
        zzjo zzjoVar4 = new zzjo("UINT64", 3, 3, zzjqVar, zzkdVar3);
        zzkd zzkdVar4 = zzkd.f26068c;
        zzjo zzjoVar5 = new zzjo("INT32", 4, 4, zzjqVar, zzkdVar4);
        zzjo zzjoVar6 = new zzjo("FIXED64", 5, 5, zzjqVar, zzkdVar3);
        zzjo zzjoVar7 = new zzjo("FIXED32", 6, 6, zzjqVar, zzkdVar4);
        zzkd zzkdVar5 = zzkd.f26072g;
        zzjo zzjoVar8 = new zzjo("BOOL", 7, 7, zzjqVar, zzkdVar5);
        zzkd zzkdVar6 = zzkd.f26073h;
        zzjo zzjoVar9 = new zzjo("STRING", 8, 8, zzjqVar, zzkdVar6);
        zzkd zzkdVar7 = zzkd.f26075k;
        zzjo zzjoVar10 = new zzjo("MESSAGE", 9, 9, zzjqVar, zzkdVar7);
        zzkd zzkdVar8 = zzkd.f26074i;
        zzjo zzjoVar11 = new zzjo("BYTES", 10, 10, zzjqVar, zzkdVar8);
        zzjo zzjoVar12 = new zzjo("UINT32", 11, 11, zzjqVar, zzkdVar4);
        zzkd zzkdVar9 = zzkd.j;
        zzjo zzjoVar13 = new zzjo("ENUM", 12, 12, zzjqVar, zzkdVar9);
        zzjo zzjoVar14 = new zzjo("SFIXED32", 13, 13, zzjqVar, zzkdVar4);
        zzjo zzjoVar15 = new zzjo("SFIXED64", 14, 14, zzjqVar, zzkdVar3);
        zzjo zzjoVar16 = new zzjo("SINT32", 15, 15, zzjqVar, zzkdVar4);
        zzjo zzjoVar17 = new zzjo("SINT64", 16, 16, zzjqVar, zzkdVar3);
        zzjo zzjoVar18 = new zzjo("GROUP", 17, 17, zzjqVar, zzkdVar7);
        zzjq zzjqVar2 = zzjq.f26062c;
        zzjo zzjoVar19 = new zzjo("DOUBLE_LIST", 18, 18, zzjqVar2, zzkdVar);
        zzjo zzjoVar20 = new zzjo("FLOAT_LIST", 19, 19, zzjqVar2, zzkdVar2);
        zzjo zzjoVar21 = new zzjo("INT64_LIST", 20, 20, zzjqVar2, zzkdVar3);
        zzjo zzjoVar22 = new zzjo("UINT64_LIST", 21, 21, zzjqVar2, zzkdVar3);
        zzjo zzjoVar23 = new zzjo("INT32_LIST", 22, 22, zzjqVar2, zzkdVar4);
        zzjo zzjoVar24 = new zzjo("FIXED64_LIST", 23, 23, zzjqVar2, zzkdVar3);
        zzjo zzjoVar25 = new zzjo("FIXED32_LIST", 24, 24, zzjqVar2, zzkdVar4);
        zzjo zzjoVar26 = new zzjo("BOOL_LIST", 25, 25, zzjqVar2, zzkdVar5);
        zzjo zzjoVar27 = new zzjo("STRING_LIST", 26, 26, zzjqVar2, zzkdVar6);
        zzjo zzjoVar28 = new zzjo("MESSAGE_LIST", 27, 27, zzjqVar2, zzkdVar7);
        zzjo zzjoVar29 = new zzjo("BYTES_LIST", 28, 28, zzjqVar2, zzkdVar8);
        zzjo zzjoVar30 = new zzjo("UINT32_LIST", 29, 29, zzjqVar2, zzkdVar4);
        zzjo zzjoVar31 = new zzjo("ENUM_LIST", 30, 30, zzjqVar2, zzkdVar9);
        zzjo zzjoVar32 = new zzjo("SFIXED32_LIST", 31, 31, zzjqVar2, zzkdVar4);
        zzjo zzjoVar33 = new zzjo("SFIXED64_LIST", 32, 32, zzjqVar2, zzkdVar3);
        zzjo zzjoVar34 = new zzjo("SINT32_LIST", 33, 33, zzjqVar2, zzkdVar4);
        zzjo zzjoVar35 = new zzjo("SINT64_LIST", 34, 34, zzjqVar2, zzkdVar3);
        zzjq zzjqVar3 = zzjq.f26063d;
        zzjo zzjoVar36 = new zzjo("DOUBLE_LIST_PACKED", 35, 35, zzjqVar3, zzkdVar);
        f26057b = zzjoVar36;
        zzjo zzjoVar37 = new zzjo("FLOAT_LIST_PACKED", 36, 36, zzjqVar3, zzkdVar2);
        zzjo zzjoVar38 = new zzjo("INT64_LIST_PACKED", 37, 37, zzjqVar3, zzkdVar3);
        zzjo zzjoVar39 = new zzjo("UINT64_LIST_PACKED", 38, 38, zzjqVar3, zzkdVar3);
        zzjo zzjoVar40 = new zzjo("INT32_LIST_PACKED", 39, 39, zzjqVar3, zzkdVar4);
        zzjo zzjoVar41 = new zzjo("FIXED64_LIST_PACKED", 40, 40, zzjqVar3, zzkdVar3);
        zzjo zzjoVar42 = new zzjo("FIXED32_LIST_PACKED", 41, 41, zzjqVar3, zzkdVar4);
        zzjo zzjoVar43 = new zzjo("BOOL_LIST_PACKED", 42, 42, zzjqVar3, zzkdVar5);
        zzjo zzjoVar44 = new zzjo("UINT32_LIST_PACKED", 43, 43, zzjqVar3, zzkdVar4);
        zzjo zzjoVar45 = new zzjo("ENUM_LIST_PACKED", 44, 44, zzjqVar3, zzkdVar9);
        zzjo zzjoVar46 = new zzjo("SFIXED32_LIST_PACKED", 45, 45, zzjqVar3, zzkdVar4);
        zzjo zzjoVar47 = new zzjo("SFIXED64_LIST_PACKED", 46, 46, zzjqVar3, zzkdVar3);
        zzjo zzjoVar48 = new zzjo("SINT32_LIST_PACKED", 47, 47, zzjqVar3, zzkdVar4);
        zzjo zzjoVar49 = new zzjo("SINT64_LIST_PACKED", 48, 48, zzjqVar3, zzkdVar3);
        f26058c = zzjoVar49;
        f26060e = new zzjo[]{zzjoVar, zzjoVar2, zzjoVar3, zzjoVar4, zzjoVar5, zzjoVar6, zzjoVar7, zzjoVar8, zzjoVar9, zzjoVar10, zzjoVar11, zzjoVar12, zzjoVar13, zzjoVar14, zzjoVar15, zzjoVar16, zzjoVar17, zzjoVar18, zzjoVar19, zzjoVar20, zzjoVar21, zzjoVar22, zzjoVar23, zzjoVar24, zzjoVar25, zzjoVar26, zzjoVar27, zzjoVar28, zzjoVar29, zzjoVar30, zzjoVar31, zzjoVar32, zzjoVar33, zzjoVar34, zzjoVar35, zzjoVar36, zzjoVar37, zzjoVar38, zzjoVar39, zzjoVar40, zzjoVar41, zzjoVar42, zzjoVar43, zzjoVar44, zzjoVar45, zzjoVar46, zzjoVar47, zzjoVar48, zzjoVar49, new zzjo("GROUP_LIST", 49, 49, zzjqVar2, zzkdVar7), new zzjo("MAP", 50, 50, zzjq.f26064e, zzkd.f26067b)};
        zzjo[] zzjoVarArrValues = values();
        f26059d = new zzjo[zzjoVarArrValues.length];
        for (zzjo zzjoVar50 : zzjoVarArrValues) {
            f26059d[zzjoVar50.zzbd] = zzjoVar50;
        }
    }

    public zzjo(String str, int i10, int i11, zzjq zzjqVar, zzkd zzkdVar) {
        int i12;
        super(str, i10);
        this.zzbd = i11;
        this.zzbe = zzjqVar;
        this.zzbc = zzkdVar;
        int iOrdinal = zzjqVar.ordinal();
        if (iOrdinal == 1 || iOrdinal == 3) {
            this.zzbf = zzkdVar.a();
        } else {
            this.zzbf = null;
        }
        this.zzbg = (zzjqVar != zzjq.f26061b || (i12 = J2.f25486a[zzkdVar.ordinal()]) == 1 || i12 == 2 || i12 == 3) ? false : true;
    }

    public static zzjo[] values() {
        return (zzjo[]) f26060e.clone();
    }

    public final int a() {
        return this.zzbd;
    }
}
