package com.google.protobuf;

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
public class WireFormat$FieldType {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WireFormat$FieldType f29098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final WireFormat$FieldType f29099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final WireFormat$FieldType f29100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final WireFormat$FieldType f29101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ WireFormat$FieldType[] f29102f;
    private final WireFormat$JavaType javaType;
    private final int wireType;

    /* JADX INFO: Fake field, exist only in values array */
    WireFormat$FieldType EF10;

    /* JADX INFO: Fake field, exist only in values array */
    WireFormat$FieldType EF11;

    /* JADX INFO: renamed from: com.google.protobuf.WireFormat$FieldType$1, reason: invalid class name */
    public final enum AnonymousClass1 extends WireFormat$FieldType {
    }

    /* JADX INFO: renamed from: com.google.protobuf.WireFormat$FieldType$2, reason: invalid class name */
    public final enum AnonymousClass2 extends WireFormat$FieldType {
    }

    /* JADX INFO: renamed from: com.google.protobuf.WireFormat$FieldType$3, reason: invalid class name */
    public final enum AnonymousClass3 extends WireFormat$FieldType {
    }

    /* JADX INFO: renamed from: com.google.protobuf.WireFormat$FieldType$4, reason: invalid class name */
    public final enum AnonymousClass4 extends WireFormat$FieldType {
    }

    static {
        WireFormat$FieldType wireFormat$FieldType = new WireFormat$FieldType("DOUBLE", 0, WireFormat$JavaType.DOUBLE, 1);
        WireFormat$FieldType wireFormat$FieldType2 = new WireFormat$FieldType("FLOAT", 1, WireFormat$JavaType.FLOAT, 5);
        WireFormat$JavaType wireFormat$JavaType = WireFormat$JavaType.LONG;
        WireFormat$FieldType wireFormat$FieldType3 = new WireFormat$FieldType("INT64", 2, wireFormat$JavaType, 0);
        f29098b = wireFormat$FieldType3;
        WireFormat$FieldType wireFormat$FieldType4 = new WireFormat$FieldType("UINT64", 3, wireFormat$JavaType, 0);
        WireFormat$JavaType wireFormat$JavaType2 = WireFormat$JavaType.INT;
        WireFormat$FieldType wireFormat$FieldType5 = new WireFormat$FieldType("INT32", 4, wireFormat$JavaType2, 0);
        WireFormat$FieldType wireFormat$FieldType6 = new WireFormat$FieldType("FIXED64", 5, wireFormat$JavaType, 1);
        WireFormat$FieldType wireFormat$FieldType7 = new WireFormat$FieldType("FIXED32", 6, wireFormat$JavaType2, 5);
        WireFormat$FieldType wireFormat$FieldType8 = new WireFormat$FieldType("BOOL", 7, WireFormat$JavaType.BOOLEAN, 0);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1("STRING", 8, WireFormat$JavaType.STRING, 2);
        f29099c = anonymousClass1;
        WireFormat$JavaType wireFormat$JavaType3 = WireFormat$JavaType.MESSAGE;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2("GROUP", 9, wireFormat$JavaType3, 3);
        f29100d = anonymousClass2;
        AnonymousClass3 anonymousClass3 = new AnonymousClass3("MESSAGE", 10, wireFormat$JavaType3, 2);
        f29101e = anonymousClass3;
        f29102f = new WireFormat$FieldType[]{wireFormat$FieldType, wireFormat$FieldType2, wireFormat$FieldType3, wireFormat$FieldType4, wireFormat$FieldType5, wireFormat$FieldType6, wireFormat$FieldType7, wireFormat$FieldType8, anonymousClass1, anonymousClass2, anonymousClass3, new AnonymousClass4("BYTES", 11, WireFormat$JavaType.BYTE_STRING, 2), new WireFormat$FieldType("UINT32", 12, wireFormat$JavaType2, 0), new WireFormat$FieldType("ENUM", 13, WireFormat$JavaType.ENUM, 0), new WireFormat$FieldType("SFIXED32", 14, wireFormat$JavaType2, 5), new WireFormat$FieldType("SFIXED64", 15, wireFormat$JavaType, 1), new WireFormat$FieldType("SINT32", 16, wireFormat$JavaType2, 0), new WireFormat$FieldType("SINT64", 17, wireFormat$JavaType, 0)};
    }

    public WireFormat$FieldType(String str, int i10, WireFormat$JavaType wireFormat$JavaType, int i11) {
        super(str, i10);
        this.javaType = wireFormat$JavaType;
        this.wireType = i11;
    }

    public static WireFormat$FieldType valueOf(String str) {
        return (WireFormat$FieldType) Enum.valueOf(WireFormat$FieldType.class, str);
    }

    public static WireFormat$FieldType[] values() {
        return (WireFormat$FieldType[]) f29102f.clone();
    }

    public final WireFormat$JavaType a() {
        return this.javaType;
    }

    public final int b() {
        return this.wireType;
    }
}
