package com.google.firebase.inappmessaging;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.K;
import com.google.protobuf.S;
import com.google.protobuf.W;

/* JADX INFO: loaded from: classes3.dex */
public final class MessagesProto$Content extends GeneratedMessageLite<MessagesProto$Content, a> implements K {
    public static final int BANNER_FIELD_NUMBER = 1;
    public static final int CARD_FIELD_NUMBER = 4;
    private static final MessagesProto$Content DEFAULT_INSTANCE;
    public static final int IMAGE_ONLY_FIELD_NUMBER = 3;
    public static final int MODAL_FIELD_NUMBER = 2;
    private static volatile S<MessagesProto$Content> PARSER;
    private int messageDetailsCase_ = 0;
    private Object messageDetails_;

    public enum MessageDetailsCase {
        BANNER(1),
        MODAL(2),
        IMAGE_ONLY(3),
        CARD(4),
        MESSAGEDETAILS_NOT_SET(0);

        private final int value;

        MessageDetailsCase(int i10) {
            this.value = i10;
        }
    }

    public static final class a extends GeneratedMessageLite.a<MessagesProto$Content, a> implements K {
    }

    static {
        MessagesProto$Content messagesProto$Content = new MessagesProto$Content();
        DEFAULT_INSTANCE = messagesProto$Content;
        GeneratedMessageLite.F(MessagesProto$Content.class, messagesProto$Content);
    }

    public static MessagesProto$Content I() {
        return DEFAULT_INSTANCE;
    }

    public final b G() {
        return this.messageDetailsCase_ == 1 ? (b) this.messageDetails_ : b.J();
    }

    public final d H() {
        return this.messageDetailsCase_ == 4 ? (d) this.messageDetails_ : d.I();
    }

    public final e J() {
        return this.messageDetailsCase_ == 3 ? (e) this.messageDetails_ : e.H();
    }

    public final MessageDetailsCase K() {
        int i10 = this.messageDetailsCase_;
        if (i10 == 0) {
            return MessageDetailsCase.MESSAGEDETAILS_NOT_SET;
        }
        if (i10 == 1) {
            return MessageDetailsCase.BANNER;
        }
        if (i10 == 2) {
            return MessageDetailsCase.MODAL;
        }
        if (i10 == 3) {
            return MessageDetailsCase.IMAGE_ONLY;
        }
        if (i10 != 4) {
            return null;
        }
        return MessageDetailsCase.CARD;
    }

    public final f L() {
        return this.messageDetailsCase_ == 2 ? (f) this.messageDetails_ : f.K();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object w(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new W(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"messageDetails_", "messageDetailsCase_", b.class, f.class, e.class, d.class});
            case 3:
                return new MessagesProto$Content();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S<MessagesProto$Content> bVar = PARSER;
                if (bVar == null) {
                    synchronized (MessagesProto$Content.class) {
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
