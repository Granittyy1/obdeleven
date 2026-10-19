package com.google.firebase.perf.v1;

import com.google.protobuf.D;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.K;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.S;
import com.google.protobuf.W;
import com.google.protobuf.WireFormat$FieldType;

/* JADX INFO: compiled from: ApplicationInfo.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends GeneratedMessageLite<c, a> implements K {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final c DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile S<c> PARSER;
    private com.google.firebase.perf.v1.a androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.f29077b;
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    /* JADX INFO: compiled from: ApplicationInfo.java */
    public static final class a extends GeneratedMessageLite.a<c, a> implements K {
        public a() {
            super(c.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: ApplicationInfo.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final D<String, String> f28540a;

        static {
            WireFormat$FieldType wireFormat$FieldType = WireFormat$FieldType.f29099c;
            f28540a = new D<>(wireFormat$FieldType, wireFormat$FieldType, "");
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        GeneratedMessageLite.F(c.class, cVar);
    }

    public static void H(c cVar, String str) {
        cVar.getClass();
        str.getClass();
        cVar.bitField0_ |= 1;
        cVar.googleAppId_ = str;
    }

    public static void I(c cVar, ApplicationProcessState applicationProcessState) {
        cVar.getClass();
        cVar.applicationProcessState_ = applicationProcessState.a();
        cVar.bitField0_ |= 8;
    }

    public static MapFieldLite J(c cVar) {
        if (!cVar.customAttributes_.c()) {
            cVar.customAttributes_ = cVar.customAttributes_.f();
        }
        return cVar.customAttributes_;
    }

    public static void K(c cVar, String str) {
        cVar.getClass();
        str.getClass();
        cVar.bitField0_ |= 2;
        cVar.appInstanceId_ = str;
    }

    public static void L(c cVar, com.google.firebase.perf.v1.a aVar) {
        cVar.getClass();
        cVar.androidAppInfo_ = aVar;
        cVar.bitField0_ |= 4;
    }

    public static c N() {
        return DEFAULT_INSTANCE;
    }

    public static a S() {
        return DEFAULT_INSTANCE.v();
    }

    public final com.google.firebase.perf.v1.a M() {
        com.google.firebase.perf.v1.a aVar = this.androidAppInfo_;
        return aVar == null ? com.google.firebase.perf.v1.a.K() : aVar;
    }

    public final boolean O() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean P() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean Q() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean R() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object w(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new W(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005ဌ\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", ApplicationProcessState.a.f28515a, "customAttributes_", b.f28540a});
            case 3:
                return new c();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S<c> bVar = PARSER;
                if (bVar == null) {
                    synchronized (c.class) {
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
