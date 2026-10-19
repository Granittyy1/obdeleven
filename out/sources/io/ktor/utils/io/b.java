package io.ktor.utils.io;

import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p293xa.r;

/* JADX INFO: compiled from: ByteChannelSequential.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements a, ByteReadChannel, d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40595b;
    private volatile /* synthetic */ int _availableForRead;
    private volatile /* synthetic */ Object _closed;
    private volatile /* synthetic */ Object _lastReadView;
    private volatile /* synthetic */ long _totalBytesRead;
    private volatile /* synthetic */ long _totalBytesWritten;
    private volatile /* synthetic */ int channelSize;
    private volatile /* synthetic */ int lastReadAvailable$delegate;
    private volatile /* synthetic */ Object lastReadView$delegate;

    static {
        AtomicLongFieldUpdater.newUpdater(b.class, "_totalBytesRead");
        AtomicLongFieldUpdater.newUpdater(b.class, "_totalBytesWritten");
        AtomicIntegerFieldUpdater.newUpdater(b.class, "_availableForRead");
        AtomicIntegerFieldUpdater.newUpdater(b.class, "channelSize");
        f40595b = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closed");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object m(b bVar, byte[] bArr, int i10, int i11, ContinuationImpl continuationImpl) throws Throwable {
        ByteChannelSequentialBase$readAvailable$4 byteChannelSequentialBase$readAvailable$4;
        if (continuationImpl instanceof ByteChannelSequentialBase$readAvailable$4) {
            byteChannelSequentialBase$readAvailable$4 = (ByteChannelSequentialBase$readAvailable$4) continuationImpl;
            int i12 = byteChannelSequentialBase$readAvailable$4.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                byteChannelSequentialBase$readAvailable$4.label = i12 - Integer.MIN_VALUE;
            } else {
                byteChannelSequentialBase$readAvailable$4 = new ByteChannelSequentialBase$readAvailable$4(bVar, continuationImpl);
            }
        } else {
            byteChannelSequentialBase$readAvailable$4 = new ByteChannelSequentialBase$readAvailable$4(bVar, continuationImpl);
        }
        Object obj = byteChannelSequentialBase$readAvailable$4.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i13 = byteChannelSequentialBase$readAvailable$4.label;
        if (i13 == 0) {
            kotlin.b.b(obj);
            Throwable thQ = bVar.q();
            if (thQ != null) {
                throw thQ;
            }
            if (bVar.k() && bVar._availableForRead == 0) {
                return new Integer(-1);
            }
            if (i11 == 0) {
                return new Integer(0);
            }
            if (bVar._availableForRead == 0) {
                byteChannelSequentialBase$readAvailable$4.L$0 = bVar;
                byteChannelSequentialBase$readAvailable$4.L$1 = bArr;
                byteChannelSequentialBase$readAvailable$4.I$0 = i10;
                byteChannelSequentialBase$readAvailable$4.I$1 = i11;
                byteChannelSequentialBase$readAvailable$4.label = 1;
                bVar.i(1, byteChannelSequentialBase$readAvailable$4);
                return coroutineSingletons;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (b) byteChannelSequentialBase$readAvailable$4.L$0;
            kotlin.b.b(obj);
        }
        bVar.getClass();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object n(b bVar, byte[] src, int i10, ContinuationImpl continuationImpl) {
        ByteChannelSequentialBase$writeFully$2 byteChannelSequentialBase$writeFully$2;
        int i11;
        if (continuationImpl instanceof ByteChannelSequentialBase$writeFully$2) {
            byteChannelSequentialBase$writeFully$2 = (ByteChannelSequentialBase$writeFully$2) continuationImpl;
            int i12 = byteChannelSequentialBase$writeFully$2.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                byteChannelSequentialBase$writeFully$2.label = i12 - Integer.MIN_VALUE;
            } else {
                byteChannelSequentialBase$writeFully$2 = new ByteChannelSequentialBase$writeFully$2(bVar, continuationImpl);
            }
        } else {
            byteChannelSequentialBase$writeFully$2 = new ByteChannelSequentialBase$writeFully$2(bVar, continuationImpl);
        }
        Object obj = byteChannelSequentialBase$writeFully$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i13 = byteChannelSequentialBase$writeFully$2.label;
        if (i13 == 0) {
            kotlin.b.b(obj);
            if (i10 <= 0) {
                return r.f47939a;
            }
            byteChannelSequentialBase$writeFully$2.L$0 = bVar;
            byteChannelSequentialBase$writeFully$2.L$1 = src;
            i11 = 0;
            byteChannelSequentialBase$writeFully$2.I$0 = 0;
            byteChannelSequentialBase$writeFully$2.I$1 = i10;
            byteChannelSequentialBase$writeFully$2.label = 1;
            if (bVar.h(1, byteChannelSequentialBase$writeFully$2) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = byteChannelSequentialBase$writeFully$2.I$1;
            int i14 = byteChannelSequentialBase$writeFully$2.I$0;
            src = (byte[]) byteChannelSequentialBase$writeFully$2.L$1;
            b bVar2 = (b) byteChannelSequentialBase$writeFully$2.L$0;
            kotlin.b.b(obj);
            i11 = i14;
            bVar = bVar2;
        }
        int iMin = Math.min(bVar.j(), i10 - i11);
        p061ea.g gVar = null;
        kotlin.jvm.internal.i.e(null, "<this>");
        kotlin.jvm.internal.i.e(src, "src");
        p074fa.a aVarD = p074fa.b.d(null, 1, null);
        while (true) {
            try {
                int iMin2 = Math.min(iMin, aVarD.f34859e - aVarD.f34857c);
                P3.d.y(aVarD, src, i11, iMin2);
                i11 += iMin2;
                iMin -= iMin2;
                if (iMin <= 0) {
                    gVar.b();
                    throw null;
                }
                aVarD = p074fa.b.d(null, 1, aVarD);
            } catch (Throwable th) {
                gVar.b();
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static void v(b bVar, p074fa.a aVar, ContinuationImpl continuationImpl) {
        ByteChannelSequentialBase$writeFully$1 byteChannelSequentialBase$writeFully$1;
        p061ea.a aVar2;
        if (continuationImpl instanceof ByteChannelSequentialBase$writeFully$1) {
            byteChannelSequentialBase$writeFully$1 = (ByteChannelSequentialBase$writeFully$1) continuationImpl;
            int i10 = byteChannelSequentialBase$writeFully$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                byteChannelSequentialBase$writeFully$1.label = i10 - Integer.MIN_VALUE;
            } else {
                byteChannelSequentialBase$writeFully$1 = new ByteChannelSequentialBase$writeFully$1(bVar, continuationImpl);
            }
        } else {
            byteChannelSequentialBase$writeFully$1 = new ByteChannelSequentialBase$writeFully$1(bVar, continuationImpl);
        }
        Object obj = byteChannelSequentialBase$writeFully$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = byteChannelSequentialBase$writeFully$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            byteChannelSequentialBase$writeFully$1.L$0 = bVar;
            byteChannelSequentialBase$writeFully$1.L$1 = aVar;
            byteChannelSequentialBase$writeFully$1.label = 1;
            if (bVar.h(1, byteChannelSequentialBase$writeFully$1) == coroutineSingletons) {
                aVar2 = aVar;
                return;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p061ea.a aVar3 = (p061ea.a) byteChannelSequentialBase$writeFully$1.L$1;
            bVar = (b) byteChannelSequentialBase$writeFully$1.L$0;
            kotlin.b.b(obj);
            aVar2 = aVar3;
        }
        aVar2 = aVar;
        int i12 = aVar2.f34857c;
        bVar.getClass();
        kotlin.jvm.internal.i.e(null, "<this>");
        p074fa.b.d(null, 1, null);
        throw null;
    }

    @Override // io.ktor.utils.io.d
    public final boolean a(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        g gVar = th == null ? h.f40601a : new g(th);
        do {
            atomicReferenceFieldUpdater = f40595b;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, gVar)) {
                th.getClass();
                throw null;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return false;
    }

    @Override // io.ktor.utils.io.d
    public final Object b(p074fa.a aVar, kotlin.coroutines.c cVar) {
        v(this, aVar, (ContinuationImpl) cVar);
        return CoroutineSingletons.f43038b;
    }

    @Override // io.ktor.utils.io.d
    public final Object d(byte[] bArr, int i10, SuspendLambda suspendLambda) {
        return n(this, bArr, i10, suspendLambda);
    }

    @Override // io.ktor.utils.io.d
    public final boolean f() {
        return false;
    }

    @Override // io.ktor.utils.io.d
    public final void flush() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final r g(final int i10, ContinuationImpl continuationImpl) {
        ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1 byteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1;
        final b bVar;
        if (continuationImpl instanceof ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1) {
            byteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1 = (ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1) continuationImpl;
            int i11 = byteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                byteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1.label = i11 - Integer.MIN_VALUE;
            } else {
                byteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1 = new ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1(this, continuationImpl);
            }
        } else {
            byteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1 = new ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1(this, continuationImpl);
        }
        Object obj = byteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i12 = byteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1.label;
        if (i12 == 0) {
            kotlin.b.b(obj);
            bVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = byteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1.I$0;
            bVar = (b) byteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1.L$0;
            kotlin.b.b(obj);
        }
        if (bVar._availableForRead >= i10 || bVar.u()) {
            return r.f47939a;
        }
        new Ia.a<Boolean>() { // from class: io.ktor.utils.io.ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final Boolean invoke() {
                return Boolean.valueOf(this.this$0.r() < i10 && !this.this$0.u());
            }
        };
        byteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1.L$0 = bVar;
        byteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1.I$0 = i10;
        byteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1.label = 1;
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final r h(int i10, ContinuationImpl continuationImpl) {
        ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1 byteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1;
        b bVar;
        if (continuationImpl instanceof ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1) {
            byteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1 = (ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1) continuationImpl;
            int i11 = byteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                byteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1.label = i11 - Integer.MIN_VALUE;
            } else {
                byteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1 = new ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1(this, continuationImpl);
            }
        } else {
            byteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1 = new ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1(this, continuationImpl);
        }
        Object obj = byteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i12 = byteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1.label;
        if (i12 == 0) {
            kotlin.b.b(obj);
            bVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = byteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1.I$0;
            bVar = (b) byteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1.L$0;
            kotlin.b.b(obj);
        }
        if (bVar.j() >= i10 || bVar.k()) {
            return r.f47939a;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void i(int i10, ContinuationImpl continuationImpl) {
        ByteChannelSequentialBase$awaitSuspend$1 byteChannelSequentialBase$awaitSuspend$1;
        b bVar;
        if (continuationImpl instanceof ByteChannelSequentialBase$awaitSuspend$1) {
            byteChannelSequentialBase$awaitSuspend$1 = (ByteChannelSequentialBase$awaitSuspend$1) continuationImpl;
            int i11 = byteChannelSequentialBase$awaitSuspend$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                byteChannelSequentialBase$awaitSuspend$1.label = i11 - Integer.MIN_VALUE;
            } else {
                byteChannelSequentialBase$awaitSuspend$1 = new ByteChannelSequentialBase$awaitSuspend$1(this, continuationImpl);
            }
        } else {
            byteChannelSequentialBase$awaitSuspend$1 = new ByteChannelSequentialBase$awaitSuspend$1(this, continuationImpl);
        }
        Object obj = byteChannelSequentialBase$awaitSuspend$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i12 = byteChannelSequentialBase$awaitSuspend$1.label;
        if (i12 == 0) {
            kotlin.b.b(obj);
            if (i10 < 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            byteChannelSequentialBase$awaitSuspend$1.L$0 = this;
            byteChannelSequentialBase$awaitSuspend$1.I$0 = i10;
            byteChannelSequentialBase$awaitSuspend$1.label = 1;
            if (g(i10, byteChannelSequentialBase$awaitSuspend$1) == coroutineSingletons) {
                return;
            } else {
                bVar = this;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (b) byteChannelSequentialBase$awaitSuspend$1.L$0;
            kotlin.b.b(obj);
        }
        bVar.getClass();
        throw null;
    }

    public final int j() {
        return Math.max(0, 4088 - this.channelSize);
    }

    public final boolean k() {
        return this._closed != null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(p074fa.a aVar, ContinuationImpl continuationImpl) throws Throwable {
        ByteChannelSequentialBase$readAvailable$2 byteChannelSequentialBase$readAvailable$2;
        b bVar;
        if (continuationImpl instanceof ByteChannelSequentialBase$readAvailable$2) {
            byteChannelSequentialBase$readAvailable$2 = (ByteChannelSequentialBase$readAvailable$2) continuationImpl;
            int i10 = byteChannelSequentialBase$readAvailable$2.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                byteChannelSequentialBase$readAvailable$2.label = i10 - Integer.MIN_VALUE;
            } else {
                byteChannelSequentialBase$readAvailable$2 = new ByteChannelSequentialBase$readAvailable$2(this, continuationImpl);
            }
        } else {
            byteChannelSequentialBase$readAvailable$2 = new ByteChannelSequentialBase$readAvailable$2(this, continuationImpl);
        }
        Object obj = byteChannelSequentialBase$readAvailable$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = byteChannelSequentialBase$readAvailable$2.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            Throwable thQ = q();
            if (thQ != null) {
                throw thQ;
            }
            if (k() && this._availableForRead == 0) {
                return new Integer(-1);
            }
            if (aVar.f34859e - aVar.f34857c == 0) {
                return new Integer(0);
            }
            if (this._availableForRead == 0) {
                byteChannelSequentialBase$readAvailable$2.L$0 = this;
                byteChannelSequentialBase$readAvailable$2.L$1 = aVar;
                byteChannelSequentialBase$readAvailable$2.label = 1;
                i(1, byteChannelSequentialBase$readAvailable$2);
                return coroutineSingletons;
            }
            bVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (b) byteChannelSequentialBase$readAvailable$2.L$0;
            kotlin.b.b(obj);
        }
        bVar.getClass();
        throw null;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final boolean o(Throwable th) {
        if (q() == null && !k()) {
            if (th == null) {
                th = new CancellationException("Channel cancelled");
            }
            a(th);
        }
        return false;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final Object p(p074fa.a aVar, ContinuationImpl continuationImpl) {
        return l(aVar, continuationImpl);
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final Throwable q() {
        g gVar = (g) this._closed;
        if (gVar != null) {
            return gVar.f40600a;
        }
        return null;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final int r() {
        return this._availableForRead;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final Object s(byte[] bArr, int i10, int i11, ContinuationImpl continuationImpl) {
        return m(this, bArr, i10, i11, continuationImpl);
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final Object t(long j, ContinuationImpl continuationImpl) throws Throwable {
        Throwable thQ = q();
        if (thQ != null) {
            throw thQ;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p074fa.a.f35063h;
        p061ea.e pool = p061ea.b.f34861a;
        kotlin.jvm.internal.i.e(pool, "pool");
        ByteBuffer byteBuffer = p036ca.b.f22529a;
        throw null;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final boolean u() {
        g gVar = (g) this._closed;
        return (gVar != null ? gVar.f40600a : null) != null || (k() && this.channelSize == 0);
    }
}
