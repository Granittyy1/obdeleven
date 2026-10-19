package androidx.datastore.preferences.protobuf;

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
/* JADX INFO: loaded from: classes.dex */
public final class JavaType {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JavaType f17132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final JavaType f17133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final JavaType f17134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final JavaType f17135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final JavaType f17136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final JavaType f17137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final JavaType f17138h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final JavaType f17139i;
    public static final JavaType j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final JavaType f17140k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ JavaType[] f17141l;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        JavaType javaType = new JavaType("VOID", 0, Void.class, Void.class, null);
        f17132b = javaType;
        Class cls = Integer.TYPE;
        JavaType javaType2 = new JavaType("INT", 1, cls, Integer.class, 0);
        f17133c = javaType2;
        JavaType javaType3 = new JavaType("LONG", 2, Long.TYPE, Long.class, 0L);
        f17134d = javaType3;
        JavaType javaType4 = new JavaType("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f17135e = javaType4;
        JavaType javaType5 = new JavaType("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f17136f = javaType5;
        JavaType javaType6 = new JavaType("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f17137g = javaType6;
        JavaType javaType7 = new JavaType("STRING", 6, String.class, String.class, "");
        f17138h = javaType7;
        JavaType javaType8 = new JavaType("BYTE_STRING", 7, ByteString.class, ByteString.class, ByteString.f17095b);
        f17139i = javaType8;
        JavaType javaType9 = new JavaType("ENUM", 8, cls, Integer.class, null);
        j = javaType9;
        JavaType javaType10 = new JavaType("MESSAGE", 9, Object.class, Object.class, null);
        f17140k = javaType10;
        f17141l = new JavaType[]{javaType, javaType2, javaType3, javaType4, javaType5, javaType6, javaType7, javaType8, javaType9, javaType10};
    }

    public JavaType(String str, int i10, Class cls, Class cls2, Serializable serializable) {
        super(str, i10);
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = serializable;
    }

    public static JavaType valueOf(String str) {
        return (JavaType) Enum.valueOf(JavaType.class, str);
    }

    public static JavaType[] values() {
        return (JavaType[]) f17141l.clone();
    }

    public final Class<?> a() {
        return this.boxedType;
    }
}
