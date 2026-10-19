package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.E0;
import com.google.android.gms.internal.play_billing.I0;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class E0<MessageType extends I0<MessageType, BuilderType>, BuilderType extends E0<MessageType, BuilderType>> extends AbstractC1969g0<MessageType, BuilderType> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I0 f26123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public I0 f26124c;

    public E0(MessageType messagetype) {
        this.f26123b = messagetype;
        if (messagetype.p()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f26124c = (I0) messagetype.g(4);
    }

    public final MessageType c() {
        MessageType messagetype = (MessageType) e();
        messagetype.getClass();
        if (I0.f(messagetype, true)) {
            return messagetype;
        }
        throw new zzhg();
    }

    public final Object clone() throws CloneNotSupportedException {
        E0 e10 = (E0) this.f26123b.g(5);
        e10.f26124c = e();
        return e10;
    }

    public final MessageType e() {
        if (!this.f26124c.p()) {
            return (MessageType) this.f26124c;
        }
        this.f26124c.l();
        return (MessageType) this.f26124c;
    }

    public final void f() {
        if (this.f26124c.p()) {
            return;
        }
        I0 i10 = (I0) this.f26123b.g(4);
        C1985l1.f26210c.a(i10.getClass()).g(i10, this.f26124c);
        this.f26124c = i10;
    }
}
