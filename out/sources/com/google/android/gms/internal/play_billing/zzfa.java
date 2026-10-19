package com.google.android.gms.internal.play_billing;

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
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfa {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzfa f26346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzfa f26347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzfa[] f26348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ zzfa[] f26349e;
    private final int zzab;

    /* JADX INFO: Fake field, exist only in values array */
    zzfa EF0;

    static {
        zzfr zzfrVar = zzfr.DOUBLE;
        zzfa zzfaVar = new zzfa("DOUBLE", 0, 0, 1, zzfrVar);
        zzfr zzfrVar2 = zzfr.FLOAT;
        zzfa zzfaVar2 = new zzfa("FLOAT", 1, 1, 1, zzfrVar2);
        zzfr zzfrVar3 = zzfr.LONG;
        zzfa zzfaVar3 = new zzfa("INT64", 2, 2, 1, zzfrVar3);
        zzfa zzfaVar4 = new zzfa("UINT64", 3, 3, 1, zzfrVar3);
        zzfr zzfrVar4 = zzfr.INT;
        zzfa zzfaVar5 = new zzfa("INT32", 4, 4, 1, zzfrVar4);
        zzfa zzfaVar6 = new zzfa("FIXED64", 5, 5, 1, zzfrVar3);
        zzfa zzfaVar7 = new zzfa("FIXED32", 6, 6, 1, zzfrVar4);
        zzfr zzfrVar5 = zzfr.BOOLEAN;
        zzfa zzfaVar8 = new zzfa("BOOL", 7, 7, 1, zzfrVar5);
        zzfr zzfrVar6 = zzfr.STRING;
        zzfa zzfaVar9 = new zzfa("STRING", 8, 8, 1, zzfrVar6);
        zzfr zzfrVar7 = zzfr.MESSAGE;
        zzfa zzfaVar10 = new zzfa("MESSAGE", 9, 9, 1, zzfrVar7);
        zzfr zzfrVar8 = zzfr.BYTE_STRING;
        zzfa zzfaVar11 = new zzfa("BYTES", 10, 10, 1, zzfrVar8);
        zzfa zzfaVar12 = new zzfa("UINT32", 11, 11, 1, zzfrVar4);
        zzfr zzfrVar9 = zzfr.ENUM;
        zzfa zzfaVar13 = new zzfa("ENUM", 12, 12, 1, zzfrVar9);
        zzfa zzfaVar14 = new zzfa("SFIXED32", 13, 13, 1, zzfrVar4);
        zzfa zzfaVar15 = new zzfa("SFIXED64", 14, 14, 1, zzfrVar3);
        zzfa zzfaVar16 = new zzfa("SINT32", 15, 15, 1, zzfrVar4);
        zzfa zzfaVar17 = new zzfa("SINT64", 16, 16, 1, zzfrVar3);
        zzfa zzfaVar18 = new zzfa("GROUP", 17, 17, 1, zzfrVar7);
        zzfa zzfaVar19 = new zzfa("DOUBLE_LIST", 18, 18, 2, zzfrVar);
        zzfa zzfaVar20 = new zzfa("FLOAT_LIST", 19, 19, 2, zzfrVar2);
        zzfa zzfaVar21 = new zzfa("INT64_LIST", 20, 20, 2, zzfrVar3);
        zzfa zzfaVar22 = new zzfa("UINT64_LIST", 21, 21, 2, zzfrVar3);
        zzfa zzfaVar23 = new zzfa("INT32_LIST", 22, 22, 2, zzfrVar4);
        zzfa zzfaVar24 = new zzfa("FIXED64_LIST", 23, 23, 2, zzfrVar3);
        zzfa zzfaVar25 = new zzfa("FIXED32_LIST", 24, 24, 2, zzfrVar4);
        zzfa zzfaVar26 = new zzfa("BOOL_LIST", 25, 25, 2, zzfrVar5);
        zzfa zzfaVar27 = new zzfa("STRING_LIST", 26, 26, 2, zzfrVar6);
        zzfa zzfaVar28 = new zzfa("MESSAGE_LIST", 27, 27, 2, zzfrVar7);
        zzfa zzfaVar29 = new zzfa("BYTES_LIST", 28, 28, 2, zzfrVar8);
        zzfa zzfaVar30 = new zzfa("UINT32_LIST", 29, 29, 2, zzfrVar4);
        zzfa zzfaVar31 = new zzfa("ENUM_LIST", 30, 30, 2, zzfrVar9);
        zzfa zzfaVar32 = new zzfa("SFIXED32_LIST", 31, 31, 2, zzfrVar4);
        zzfa zzfaVar33 = new zzfa("SFIXED64_LIST", 32, 32, 2, zzfrVar3);
        zzfa zzfaVar34 = new zzfa("SINT32_LIST", 33, 33, 2, zzfrVar4);
        zzfa zzfaVar35 = new zzfa("SINT64_LIST", 34, 34, 2, zzfrVar3);
        zzfa zzfaVar36 = new zzfa("DOUBLE_LIST_PACKED", 35, 35, 3, zzfrVar);
        f26346b = zzfaVar36;
        zzfa zzfaVar37 = new zzfa("FLOAT_LIST_PACKED", 36, 36, 3, zzfrVar2);
        zzfa zzfaVar38 = new zzfa("INT64_LIST_PACKED", 37, 37, 3, zzfrVar3);
        zzfa zzfaVar39 = new zzfa("UINT64_LIST_PACKED", 38, 38, 3, zzfrVar3);
        zzfa zzfaVar40 = new zzfa("INT32_LIST_PACKED", 39, 39, 3, zzfrVar4);
        zzfa zzfaVar41 = new zzfa("FIXED64_LIST_PACKED", 40, 40, 3, zzfrVar3);
        zzfa zzfaVar42 = new zzfa("FIXED32_LIST_PACKED", 41, 41, 3, zzfrVar4);
        zzfa zzfaVar43 = new zzfa("BOOL_LIST_PACKED", 42, 42, 3, zzfrVar5);
        zzfa zzfaVar44 = new zzfa("UINT32_LIST_PACKED", 43, 43, 3, zzfrVar4);
        zzfa zzfaVar45 = new zzfa("ENUM_LIST_PACKED", 44, 44, 3, zzfrVar9);
        zzfa zzfaVar46 = new zzfa("SFIXED32_LIST_PACKED", 45, 45, 3, zzfrVar4);
        zzfa zzfaVar47 = new zzfa("SFIXED64_LIST_PACKED", 46, 46, 3, zzfrVar3);
        zzfa zzfaVar48 = new zzfa("SINT32_LIST_PACKED", 47, 47, 3, zzfrVar4);
        zzfa zzfaVar49 = new zzfa("SINT64_LIST_PACKED", 48, 48, 3, zzfrVar3);
        f26347c = zzfaVar49;
        f26349e = new zzfa[]{zzfaVar, zzfaVar2, zzfaVar3, zzfaVar4, zzfaVar5, zzfaVar6, zzfaVar7, zzfaVar8, zzfaVar9, zzfaVar10, zzfaVar11, zzfaVar12, zzfaVar13, zzfaVar14, zzfaVar15, zzfaVar16, zzfaVar17, zzfaVar18, zzfaVar19, zzfaVar20, zzfaVar21, zzfaVar22, zzfaVar23, zzfaVar24, zzfaVar25, zzfaVar26, zzfaVar27, zzfaVar28, zzfaVar29, zzfaVar30, zzfaVar31, zzfaVar32, zzfaVar33, zzfaVar34, zzfaVar35, zzfaVar36, zzfaVar37, zzfaVar38, zzfaVar39, zzfaVar40, zzfaVar41, zzfaVar42, zzfaVar43, zzfaVar44, zzfaVar45, zzfaVar46, zzfaVar47, zzfaVar48, zzfaVar49, new zzfa("GROUP_LIST", 49, 49, 2, zzfrVar7), new zzfa("MAP", 50, 50, 4, zzfr.VOID)};
        zzfa[] zzfaVarArrValues = values();
        f26348d = new zzfa[zzfaVarArrValues.length];
        for (zzfa zzfaVar50 : zzfaVarArrValues) {
            f26348d[zzfaVar50.zzab] = zzfaVar50;
        }
    }

    public zzfa(String str, int i10, int i11, int i12, zzfr zzfrVar) {
        super(str, i10);
        this.zzab = i11;
        int i13 = i12 - 1;
        if (i13 == 1 || i13 == 3) {
            zzfrVar.getClass();
        }
        if (i12 == 1) {
            zzfr zzfrVar2 = zzfr.VOID;
            zzfrVar.ordinal();
        }
    }

    public static zzfa[] values() {
        return (zzfa[]) f26349e.clone();
    }

    public final int a() {
        return this.zzab;
    }
}
