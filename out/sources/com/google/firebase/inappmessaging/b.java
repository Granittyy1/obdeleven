package com.google.firebase.inappmessaging;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.K;
import com.google.protobuf.S;
import com.google.protobuf.W;

/* JADX INFO: compiled from: MessagesProto.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends GeneratedMessageLite<b, a> implements K {
    public static final int ACTION_FIELD_NUMBER = 4;
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 5;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final b DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile S<b> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private com.google.firebase.inappmessaging.a action_;
    private g body_;
    private g title_;
    private String imageUrl_ = "";
    private String backgroundHexColor_ = "";

    /* JADX INFO: compiled from: MessagesProto.java */
    public static final class a extends GeneratedMessageLite.a<b, a> implements K {
    }

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        GeneratedMessageLite.F(b.class, bVar);
    }

    public static b J() {
        return DEFAULT_INSTANCE;
    }

    public final com.google.firebase.inappmessaging.a G() {
        com.google.firebase.inappmessaging.a aVar = this.action_;
        return aVar == null ? com.google.firebase.inappmessaging.a.H() : aVar;
    }

    public final String H() {
        return this.backgroundHexColor_;
    }

    public final g I() {
        g gVar = this.body_;
        return gVar == null ? g.G() : gVar;
    }

    public final String K() {
        return this.imageUrl_;
    }

    public final g L() {
        g gVar = this.title_;
        return gVar == null ? g.G() : gVar;
    }

    public final boolean M() {
        return this.action_ != null;
    }

    public final boolean N() {
        return this.body_ != null;
    }

    public final boolean O() {
        return this.title_ != null;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object w(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new W(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\t\u0003Ȉ\u0004\t\u0005Ȉ", new Object[]{"title_", "body_", "imageUrl_", "action_", "backgroundHexColor_"});
            case 3:
                return new b();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S<b> bVar = PARSER;
                if (bVar == null) {
                    synchronized (b.class) {
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
