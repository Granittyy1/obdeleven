package io.ktor.utils.io;

import A8.p;
import Ia.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Lambda;
import p293xa.r;

/* JADX INFO: compiled from: ByteBufferChannel.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ByteBufferChannel$writeSuspension$1 extends Lambda implements l<kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ ByteBufferChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteBufferChannel$writeSuspension$1(ByteBufferChannel byteBufferChannel) {
        super(1);
        this.this$0 = byteBufferChannel;
    }

    @Override // Ia.l
    public final Object invoke(kotlin.coroutines.c<? super r> cVar) {
        kotlin.coroutines.c<? super r> ucont = cVar;
        kotlin.jvm.internal.i.e(ucont, "ucont");
        int i10 = this.this$0.writeSuspensionSize;
        loop0: while (true) {
            io.ktor.utils.io.internal.b bVarG = ByteBufferChannel.g(this.this$0);
            if (bVarG != null) {
                P3.d.c(bVarG.a());
                throw null;
            }
            if (!this.this$0.a0(i10)) {
                ucont.resumeWith(r.f47939a);
                break;
            }
            ByteBufferChannel byteBufferChannel = this.this$0;
            kotlin.coroutines.c cVarY = p.y(ucont);
            ByteBufferChannel byteBufferChannel2 = this.this$0;
            while (true) {
                if (((kotlin.coroutines.c) byteBufferChannel._writeOp) != null) {
                    throw new IllegalStateException("Operation is already in progress");
                }
                if (!byteBufferChannel2.a0(i10)) {
                    break;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ByteBufferChannel.f40577m;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(byteBufferChannel, null, cVarY)) {
                        if (!byteBufferChannel2.a0(i10)) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = ByteBufferChannel.f40577m;
                            while (!atomicReferenceFieldUpdater2.compareAndSet(byteBufferChannel, cVarY, null)) {
                                if (atomicReferenceFieldUpdater2.get(byteBufferChannel) != cVarY) {
                                    break loop0;
                                }
                            }
                            break;
                        }
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(byteBufferChannel) == null);
            }
        }
        this.this$0.w(i10);
        if (this.this$0.N()) {
            this.this$0.J();
        }
        return CoroutineSingletons.f43038b;
    }
}
