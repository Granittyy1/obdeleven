package p061ea;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.i;
import p074fa.a;

/* JADX INFO: compiled from: BytePacketBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c extends g {
    public c() {
        this(null);
    }

    @Override // p061ea.g, java.lang.Appendable
    public final Appendable append(char c10) throws EOFException {
        super.append(c10);
        return this;
    }

    @Override // p061ea.g
    /* JADX INFO: renamed from: c */
    public final g append(char c10) throws EOFException {
        super.append(c10);
        return this;
    }

    @Override // p061ea.g
    /* JADX INFO: renamed from: h */
    public final g append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // p061ea.g
    /* JADX INFO: renamed from: i */
    public final g append(CharSequence charSequence, int i10, int i11) {
        g gVarAppend = super.append(charSequence, i10, i11);
        i.c(gVarAppend, "null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return (c) gVarAppend;
    }

    @Override // p061ea.g
    public final void j(ByteBuffer source) {
        i.e(source, "source");
    }

    public final d s() throws EOFException {
        int i10 = (this.f34876f - this.f34878h) + this.f34879i;
        a aVarP = p();
        if (aVarP != null) {
            return new d(aVarP, i10, this.f34872b);
        }
        d dVar = d.f34862i;
        return d.f34862i;
    }

    public final String toString() {
        return "BytePacketBuilder[0x" + hashCode() + ']';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a.f35063h;
        e pool = b.f34861a;
        i.e(pool, "pool");
        super(pool);
    }

    @Override // p061ea.g, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // p061ea.g, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i10, int i11) {
        g gVarAppend = super.append(charSequence, i10, i11);
        i.c(gVarAppend, "null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return (c) gVarAppend;
    }
}
