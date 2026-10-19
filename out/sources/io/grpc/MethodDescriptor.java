package io.grpc;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes3.dex */
public final class MethodDescriptor<ReqT, RespT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MethodType f36886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H9.b.a f36889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final H9.b.a f36890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f36891f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MethodType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final MethodType f36892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final MethodType f36893c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ MethodType[] f36894d;

        static {
            MethodType methodType = new MethodType("UNARY", 0);
            f36892b = methodType;
            MethodType methodType2 = new MethodType("CLIENT_STREAMING", 1);
            MethodType methodType3 = new MethodType("SERVER_STREAMING", 2);
            f36893c = methodType3;
            f36894d = new MethodType[]{methodType, methodType2, methodType3, new MethodType("BIDI_STREAMING", 3), new MethodType("UNKNOWN", 4)};
        }

        public MethodType() {
            throw null;
        }

        public static MethodType valueOf(String str) {
            return (MethodType) Enum.valueOf(MethodType.class, str);
        }

        public static MethodType[] values() {
            return (MethodType[]) f36894d.clone();
        }
    }

    public MethodDescriptor(String str, H9.b.a aVar, H9.b.a aVar2) {
        MethodType methodType = MethodType.f36892b;
        new AtomicReferenceArray(2);
        this.f36886a = methodType;
        A8.p.j(str, "fullMethodName");
        this.f36887b = str;
        int iLastIndexOf = str.lastIndexOf(47);
        this.f36888c = iLastIndexOf == -1 ? null : str.substring(0, iLastIndexOf);
        this.f36889d = aVar;
        this.f36890e = aVar2;
        this.f36891f = true;
    }

    public static String a(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        A8.p.j(str, "fullServiceName");
        sb2.append(str);
        sb2.append("/");
        A8.p.j(str2, "methodName");
        sb2.append(str2);
        return sb2.toString();
    }

    public final String toString() {
        com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
        aVarB.c(this.f36887b, "fullMethodName");
        aVarB.c(this.f36886a, "type");
        aVarB.d("idempotent", false);
        aVarB.d("safe", false);
        aVarB.d("sampledToLocalTracing", this.f36891f);
        aVarB.c(this.f36889d, "requestMarshaller");
        aVarB.c(this.f36890e, "responseMarshaller");
        aVarB.c(null, "schemaDescriptor");
        aVarB.f27795d = true;
        return aVarB.toString();
    }
}
