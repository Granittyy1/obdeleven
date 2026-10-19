package com.google.firebase.inappmessaging;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.K;
import com.google.protobuf.S;
import com.google.protobuf.W;

/* JADX INFO: compiled from: MessagesProto.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends GeneratedMessageLite<d, a> implements K {
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 5;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final d DEFAULT_INSTANCE;
    public static final int LANDSCAPE_IMAGE_URL_FIELD_NUMBER = 4;
    private static volatile S<d> PARSER = null;
    public static final int PORTRAIT_IMAGE_URL_FIELD_NUMBER = 3;
    public static final int PRIMARY_ACTION_BUTTON_FIELD_NUMBER = 6;
    public static final int PRIMARY_ACTION_FIELD_NUMBER = 7;
    public static final int SECONDARY_ACTION_BUTTON_FIELD_NUMBER = 8;
    public static final int SECONDARY_ACTION_FIELD_NUMBER = 9;
    public static final int TITLE_FIELD_NUMBER = 1;
    private g body_;
    private c primaryActionButton_;
    private com.google.firebase.inappmessaging.a primaryAction_;
    private c secondaryActionButton_;
    private com.google.firebase.inappmessaging.a secondaryAction_;
    private g title_;
    private String portraitImageUrl_ = "";
    private String landscapeImageUrl_ = "";
    private String backgroundHexColor_ = "";

    /* JADX INFO: compiled from: MessagesProto.java */
    public static final class a extends GeneratedMessageLite.a<d, a> implements K {
    }

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        GeneratedMessageLite.F(d.class, dVar);
    }

    public static d I() {
        return DEFAULT_INSTANCE;
    }

    public final String G() {
        return this.backgroundHexColor_;
    }

    public final g H() {
        g gVar = this.body_;
        return gVar == null ? g.G() : gVar;
    }

    public final String J() {
        return this.landscapeImageUrl_;
    }

    public final String K() {
        return this.portraitImageUrl_;
    }

    public final com.google.firebase.inappmessaging.a L() {
        com.google.firebase.inappmessaging.a aVar = this.primaryAction_;
        return aVar == null ? com.google.firebase.inappmessaging.a.H() : aVar;
    }

    public final c M() {
        c cVar = this.primaryActionButton_;
        return cVar == null ? c.H() : cVar;
    }

    public final com.google.firebase.inappmessaging.a N() {
        com.google.firebase.inappmessaging.a aVar = this.secondaryAction_;
        return aVar == null ? com.google.firebase.inappmessaging.a.H() : aVar;
    }

    public final c O() {
        c cVar = this.secondaryActionButton_;
        return cVar == null ? c.H() : cVar;
    }

    public final g P() {
        g gVar = this.title_;
        return gVar == null ? g.G() : gVar;
    }

    public final boolean Q() {
        return this.body_ != null;
    }

    public final boolean R() {
        return this.primaryAction_ != null;
    }

    public final boolean S() {
        return this.primaryActionButton_ != null;
    }

    public final boolean T() {
        return this.secondaryAction_ != null;
    }

    public final boolean U() {
        return this.secondaryActionButton_ != null;
    }

    public final boolean V() {
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
                return new W(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\t\u0002\t\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\t\u0007\t\b\t\t\t", new Object[]{"title_", "body_", "portraitImageUrl_", "landscapeImageUrl_", "backgroundHexColor_", "primaryActionButton_", "primaryAction_", "secondaryActionButton_", "secondaryAction_"});
            case 3:
                return new d();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S<d> bVar = PARSER;
                if (bVar == null) {
                    synchronized (d.class) {
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
