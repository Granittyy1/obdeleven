package com.google.firebase.inappmessaging;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.K;
import com.google.protobuf.S;
import com.google.protobuf.W;

/* JADX INFO: compiled from: MessagesProto.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends GeneratedMessageLite<a, C0281a> implements K {
    public static final int ACTION_URL_FIELD_NUMBER = 1;
    private static final a DEFAULT_INSTANCE;
    private static volatile S<a> PARSER;
    private String actionUrl_ = "";

    /* JADX INFO: renamed from: com.google.firebase.inappmessaging.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MessagesProto.java */
    public static final class C0281a extends GeneratedMessageLite.a<a, C0281a> implements K {
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        GeneratedMessageLite.F(a.class, aVar);
    }

    public static a H() {
        return DEFAULT_INSTANCE;
    }

    public final String G() {
        return this.actionUrl_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object w(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new W(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"actionUrl_"});
            case 3:
                return new a();
            case 4:
                return new C0281a(DEFAULT_INSTANCE);
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
