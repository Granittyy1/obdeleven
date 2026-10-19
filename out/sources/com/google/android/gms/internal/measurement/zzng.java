package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF12' uses external variables
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
public class zzng {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ zzng[] f26082b;
    private final zznq zzt;
    private final int zzu;

    /* JADX INFO: Fake field, exist only in values array */
    zzng EF10;

    /* JADX INFO: Fake field, exist only in values array */
    zzng EF11;

    /* JADX INFO: Fake field, exist only in values array */
    zzng EF12;

    static {
        zzng zzngVar = new zzng("DOUBLE", 0, zznq.DOUBLE, 1);
        zzng zzngVar2 = new zzng("FLOAT", 1, zznq.FLOAT, 5);
        zznq zznqVar = zznq.LONG;
        zzng zzngVar3 = new zzng("INT64", 2, zznqVar, 0);
        zzng zzngVar4 = new zzng("UINT64", 3, zznqVar, 0);
        zznq zznqVar2 = zznq.INT;
        zzng zzngVar5 = new zzng("INT32", 4, zznqVar2, 0);
        zzng zzngVar6 = new zzng("FIXED64", 5, zznqVar, 1);
        zzng zzngVar7 = new zzng("FIXED32", 6, zznqVar2, 5);
        zzng zzngVar8 = new zzng("BOOL", 7, zznq.BOOLEAN, 0);
        zznj zznjVar = new zznj("STRING", 8, zznq.STRING, 2);
        zznq zznqVar3 = zznq.MESSAGE;
        f26082b = new zzng[]{zzngVar, zzngVar2, zzngVar3, zzngVar4, zzngVar5, zzngVar6, zzngVar7, zzngVar8, zznjVar, new zznl("GROUP", 9, zznqVar3, 3), new zznn("MESSAGE", 10, zznqVar3, 2), new zznp("BYTES", 11, zznq.BYTE_STRING, 2), new zzng("UINT32", 12, zznqVar2, 0), new zzng("ENUM", 13, zznq.ENUM, 0), new zzng("SFIXED32", 14, zznqVar2, 5), new zzng("SFIXED64", 15, zznqVar, 1), new zzng("SINT32", 16, zznqVar2, 0), new zzng("SINT64", 17, zznqVar, 0)};
    }

    public zzng(String str, int i10, zznq zznqVar, int i11) {
        super(str, i10);
        this.zzt = zznqVar;
        this.zzu = i11;
    }

    public static zzng[] values() {
        return (zzng[]) f26082b.clone();
    }
}
