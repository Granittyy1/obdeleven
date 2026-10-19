package com.google.firebase.inappmessaging;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.K;
import com.google.protobuf.S;
import com.google.protobuf.W;

/* JADX INFO: compiled from: MessagesProto.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends GeneratedMessageLite<e, a> implements K {
    public static final int ACTION_FIELD_NUMBER = 2;
    private static final e DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    private static volatile S<e> PARSER;
    private com.google.firebase.inappmessaging.a action_;
    private String imageUrl_ = "";

    /* JADX INFO: compiled from: MessagesProto.java */
    public static final class a extends GeneratedMessageLite.a<e, a> implements K {
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        GeneratedMessageLite.F(e.class, eVar);
    }

    public static e H() {
        return DEFAULT_INSTANCE;
    }

    public final com.google.firebase.inappmessaging.a G() {
        com.google.firebase.inappmessaging.a aVar = this.action_;
        return aVar == null ? com.google.firebase.inappmessaging.a.H() : aVar;
    }

    public final String I() {
        return this.imageUrl_;
    }

    public final boolean J() {
        return this.action_ != null;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object w(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new W(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"imageUrl_", "action_"});
            case 3:
                return new e();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S<e> bVar = PARSER;
                if (bVar == null) {
                    synchronized (e.class) {
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
