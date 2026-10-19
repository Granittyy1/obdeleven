package p132k6;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.K;
import com.google.protobuf.S;
import com.google.protobuf.W;

/* JADX INFO: compiled from: ClientSignalsProto.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends GeneratedMessageLite<a, C0474a> implements K {
    public static final int APP_VERSION_FIELD_NUMBER = 1;
    private static final a DEFAULT_INSTANCE;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
    private static volatile S<a> PARSER = null;
    public static final int PLATFORM_VERSION_FIELD_NUMBER = 2;
    public static final int TIME_ZONE_FIELD_NUMBER = 4;
    private String appVersion_ = "";
    private String platformVersion_ = "";
    private String languageCode_ = "";
    private String timeZone_ = "";

    /* JADX INFO: renamed from: k6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ClientSignalsProto.java */
    public static final class C0474a extends GeneratedMessageLite.a<a, C0474a> implements K {
        public C0474a() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        GeneratedMessageLite.F(a.class, aVar);
    }

    public static void H(a aVar, String str) {
        aVar.getClass();
        str.getClass();
        aVar.appVersion_ = str;
    }

    public static void I(a aVar, String str) {
        aVar.getClass();
        str.getClass();
        aVar.timeZone_ = str;
    }

    public static void J(a aVar, String str) {
        aVar.getClass();
        str.getClass();
        aVar.platformVersion_ = str;
    }

    public static void K(a aVar, String str) {
        aVar.getClass();
        str.getClass();
        aVar.languageCode_ = str;
    }

    public static C0474a L() {
        return DEFAULT_INSTANCE.v();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object w(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new W(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"appVersion_", "platformVersion_", "languageCode_", "timeZone_"});
            case 3:
                return new a();
            case 4:
                return new C0474a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S<a> bVar = PARSER;
                if (bVar == null) {
                    synchronized (a.class) {
                        try {
                            bVar = PARSER;
                            if (bVar == null) {
                                bVar = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                PARSER = bVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return bVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
