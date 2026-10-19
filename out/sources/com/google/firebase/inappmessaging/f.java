package com.google.firebase.inappmessaging;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.K;
import com.google.protobuf.S;
import com.google.protobuf.W;

/* JADX INFO: compiled from: MessagesProto.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends GeneratedMessageLite<f, a> implements K {
    public static final int ACTION_BUTTON_FIELD_NUMBER = 4;
    public static final int ACTION_FIELD_NUMBER = 5;
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 6;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final f DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile S<f> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private c actionButton_;
    private com.google.firebase.inappmessaging.a action_;
    private g body_;
    private g title_;
    private String imageUrl_ = "";
    private String backgroundHexColor_ = "";

    /* JADX INFO: compiled from: MessagesProto.java */
    public static final class a extends GeneratedMessageLite.a<f, a> implements K {
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        GeneratedMessageLite.F(f.class, fVar);
    }

    public static f K() {
        return DEFAULT_INSTANCE;
    }

    public final com.google.firebase.inappmessaging.a G() {
        com.google.firebase.inappmessaging.a aVar = this.action_;
        return aVar == null ? com.google.firebase.inappmessaging.a.H() : aVar;
    }

    public final c H() {
        c cVar = this.actionButton_;
        return cVar == null ? c.H() : cVar;
    }

    public final String I() {
        return this.backgroundHexColor_;
    }

    public final g J() {
        g gVar = this.body_;
        return gVar == null ? g.G() : gVar;
    }

    public final String L() {
        return this.imageUrl_;
    }

    public final g M() {
        g gVar = this.title_;
        return gVar == null ? g.G() : gVar;
    }

    public final boolean N() {
        return this.action_ != null;
    }

    public final boolean O() {
        return this.body_ != null;
    }

    public final boolean P() {
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
                return new W(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002\t\u0003Ȉ\u0004\t\u0005\t\u0006Ȉ", new Object[]{"title_", "body_", "imageUrl_", "actionButton_", "action_", "backgroundHexColor_"});
            case 3:
                return new f();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S<f> bVar = PARSER;
                if (bVar == null) {
                    synchronized (f.class) {
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
