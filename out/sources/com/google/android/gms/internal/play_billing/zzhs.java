package com.google.android.gms.internal.play_billing;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF3' uses external variables
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
public final class zzhs {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ zzhs[] f26361b;
    private final zzht zzt;
    private final int zzu;

    /* JADX INFO: Fake field, exist only in values array */
    zzhs EF1;

    /* JADX INFO: Fake field, exist only in values array */
    zzhs EF2;

    /* JADX INFO: Fake field, exist only in values array */
    zzhs EF3;

    static {
        zzhs zzhsVar = new zzhs("DOUBLE", 0, zzht.f26365e, 1);
        zzhs zzhsVar2 = new zzhs("FLOAT", 1, zzht.f26364d, 5);
        zzht zzhtVar = zzht.f26363c;
        zzhs zzhsVar3 = new zzhs("INT64", 2, zzhtVar, 0);
        zzhs zzhsVar4 = new zzhs("UINT64", 3, zzhtVar, 0);
        zzht zzhtVar2 = zzht.f26362b;
        zzhs zzhsVar5 = new zzhs("INT32", 4, zzhtVar2, 0);
        zzhs zzhsVar6 = new zzhs("FIXED64", 5, zzhtVar, 1);
        zzhs zzhsVar7 = new zzhs("FIXED32", 6, zzhtVar2, 5);
        zzhs zzhsVar8 = new zzhs("BOOL", 7, zzht.f26366f, 0);
        zzhs zzhsVar9 = new zzhs("STRING", 8, zzht.f26367g, 2);
        zzht zzhtVar3 = zzht.j;
        f26361b = new zzhs[]{zzhsVar, zzhsVar2, zzhsVar3, zzhsVar4, zzhsVar5, zzhsVar6, zzhsVar7, zzhsVar8, zzhsVar9, new zzhs("GROUP", 9, zzhtVar3, 3), new zzhs("MESSAGE", 10, zzhtVar3, 2), new zzhs("BYTES", 11, zzht.f26368h, 2), new zzhs("UINT32", 12, zzhtVar2, 0), new zzhs("ENUM", 13, zzht.f26369i, 0), new zzhs("SFIXED32", 14, zzhtVar2, 5), new zzhs("SFIXED64", 15, zzhtVar, 1), new zzhs("SINT32", 16, zzhtVar2, 0), new zzhs("SINT64", 17, zzhtVar, 0)};
    }

    public zzhs(String str, int i10, zzht zzhtVar, int i11) {
        super(str, i10);
        this.zzt = zzhtVar;
        this.zzu = i11;
    }

    public static zzhs[] values() {
        return (zzhs[]) f26361b.clone();
    }
}
