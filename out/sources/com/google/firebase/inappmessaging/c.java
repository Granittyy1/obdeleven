package com.google.firebase.inappmessaging;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.K;
import com.google.protobuf.S;
import com.google.protobuf.W;

/* JADX INFO: compiled from: MessagesProto.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends GeneratedMessageLite<c, a> implements K {
    public static final int BUTTON_HEX_COLOR_FIELD_NUMBER = 2;
    private static final c DEFAULT_INSTANCE;
    private static volatile S<c> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private String buttonHexColor_ = "";
    private g text_;

    /* JADX INFO: compiled from: MessagesProto.java */
    public static final class a extends GeneratedMessageLite.a<c, a> implements K {
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        GeneratedMessageLite.F(c.class, cVar);
    }

    public static c H() {
        return DEFAULT_INSTANCE;
    }

    public final String G() {
        return this.buttonHexColor_;
    }

    public final g I() {
        g gVar = this.text_;
        return gVar == null ? g.G() : gVar;
    }

    public final boolean J() {
        return this.text_ != null;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object w(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new W(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002Ȉ", new Object[]{"text_", "buttonHexColor_"});
            case 3:
                return new c();
            case 4:
                return new a(DEFAULT_INSTANCE);
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
