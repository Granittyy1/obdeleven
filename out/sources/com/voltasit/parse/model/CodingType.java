package com.voltasit.parse.model;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class CodingType {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CodingType f34402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CodingType f34403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final CodingType f34404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final CodingType f34405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final CodingType f34406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ CodingType[] f34407g;
    private final HistoryDB.HistoryTypeValue historyTypeValue;
    private final String name;

    static {
        HistoryDB.HistoryTypeValue historyTypeValue = HistoryDB.HistoryTypeValue.UNKNOWN;
        CodingType codingType = new CodingType("UNKNOWN", 0, "Unknown", historyTypeValue);
        f34402b = codingType;
        CodingType codingType2 = new CodingType("NO_CODING", 1, "", historyTypeValue);
        f34403c = codingType2;
        CodingType codingType3 = new CodingType("NO_DATA", 2, "NoData", historyTypeValue);
        f34404d = codingType3;
        CodingType codingType4 = new CodingType("CODING", 3, "CODING", HistoryDB.HistoryTypeValue.CODING);
        f34405e = codingType4;
        CodingType codingType5 = new CodingType("LONG_CODING", 4, "LONG_CODING", HistoryDB.HistoryTypeValue.LONG_CODING);
        f34406f = codingType5;
        f34407g = new CodingType[]{codingType, codingType2, codingType3, codingType4, codingType5, new CodingType("SUB_CODING", 5, "SUB_CODING", HistoryDB.HistoryTypeValue.SUB_CODING), new CodingType("SUB_LONG_CODING", 6, "SUB_LONG_CODING", HistoryDB.HistoryTypeValue.SUB_LONG_CODING)};
    }

    public CodingType(String str, int i10, String str2, HistoryDB.HistoryTypeValue historyTypeValue) {
        super(str, i10);
        this.name = str2;
        this.historyTypeValue = historyTypeValue;
    }

    public static CodingType a(String str) {
        for (CodingType codingType : values()) {
            if (codingType.name.equals(str)) {
                return codingType;
            }
        }
        return f34402b;
    }

    public static CodingType valueOf(String str) {
        return (CodingType) Enum.valueOf(CodingType.class, str);
    }

    public static CodingType[] values() {
        return (CodingType[]) f34407g.clone();
    }

    public final HistoryDB.HistoryTypeValue b() {
        return this.historyTypeValue;
    }

    public final String c() {
        return this.name;
    }
}
