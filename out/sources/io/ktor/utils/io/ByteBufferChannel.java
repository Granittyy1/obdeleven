package io.ktor.utils.io;

import A8.p;
import Ia.l;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.InterfaceC2694i0;
import p293xa.r;

/* JADX INFO: compiled from: ByteBufferChannel.kt */
/* JADX INFO: loaded from: classes.dex */
public class ByteBufferChannel implements a, ByteReadChannel, d {
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(ByteBufferChannel.class, Object.class, "_state");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40575k = AtomicReferenceFieldUpdater.newUpdater(ByteBufferChannel.class, Object.class, "_closed");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40576l = AtomicReferenceFieldUpdater.newUpdater(ByteBufferChannel.class, Object.class, "_readOp");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40577m = AtomicReferenceFieldUpdater.newUpdater(ByteBufferChannel.class, Object.class, "_writeOp");
    private volatile /* synthetic */ Object _closed;
    private volatile /* synthetic */ Object _readOp;
    private volatile /* synthetic */ Object _state;
    volatile /* synthetic */ Object _writeOp;
    private volatile InterfaceC2694i0 attachedJob;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f40578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p086ga.d<io.ktor.utils.io.internal.e.c> f40579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f40582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final io.ktor.utils.io.internal.a<Boolean> f40583g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final io.ktor.utils.io.internal.a<r> f40584h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l<kotlin.coroutines.c<? super r>, Object> f40585i;
    private volatile io.ktor.utils.io.internal.c joining;
    private volatile long totalBytesRead;
    private volatile long totalBytesWritten;
    private volatile int writeSuspensionSize;

    public ByteBufferChannel(boolean z10) {
        this(z10, io.ktor.utils.io.internal.d.f40611c, 8);
    }

    public static void G(ByteBufferChannel byteBufferChannel, io.ktor.utils.io.internal.c cVar) {
        if (((io.ktor.utils.io.internal.e) byteBufferChannel._state) != io.ktor.utils.io.internal.e.f.f40625c) {
            return;
        }
        cVar.getClass();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object T(ByteBufferChannel byteBufferChannel, int i10, l block, ContinuationImpl continuationImpl) throws Throwable {
        ByteBufferChannel$write$1 byteBufferChannel$write$1;
        int i11;
        int i12;
        if (continuationImpl instanceof ByteBufferChannel$write$1) {
            byteBufferChannel$write$1 = (ByteBufferChannel$write$1) continuationImpl;
            int i13 = byteBufferChannel$write$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                byteBufferChannel$write$1.label = i13 - Integer.MIN_VALUE;
            } else {
                byteBufferChannel$write$1 = new ByteBufferChannel$write$1(byteBufferChannel, continuationImpl);
            }
        } else {
            byteBufferChannel$write$1 = new ByteBufferChannel$write$1(byteBufferChannel, continuationImpl);
        }
        Object obj = byteBufferChannel$write$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i14 = byteBufferChannel$write$1.label;
        if (i14 == 0) {
            kotlin.b.b(obj);
            if (i10 <= 0) {
                throw new IllegalArgumentException("min should be positive");
            }
            if (i10 > 4088) {
                throw new IllegalArgumentException(J4.i.c(i10, "Min(", ") should'nt be greater than (4088)").toString());
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i15 = byteBufferChannel$write$1.I$0;
            l lVar = (l) byteBufferChannel$write$1.L$1;
            ByteBufferChannel byteBufferChannel2 = (ByteBufferChannel) byteBufferChannel$write$1.L$0;
            kotlin.b.b(obj);
            i10 = i15;
            byteBufferChannel = byteBufferChannel2;
            block = lVar;
        }
        do {
            byteBufferChannel.getClass();
            kotlin.jvm.internal.i.e(block, "block");
            if (i10 <= 0) {
                throw new IllegalArgumentException("min should be positive");
            }
            if (i10 > 4088) {
                throw new IllegalArgumentException(J4.i.c(i10, "Min(", ") shouldn't be greater than 4088").toString());
            }
            io.ktor.utils.io.internal.c cVar = byteBufferChannel.joining;
            if (cVar != null) {
                G(byteBufferChannel, cVar);
            }
            ByteBuffer byteBufferM = byteBufferChannel.M();
            boolean z10 = false;
            if (byteBufferM == null) {
                i12 = 0;
            } else {
                io.ktor.utils.io.internal.g gVar = ((io.ktor.utils.io.internal.e) byteBufferChannel._state).f40614b;
                try {
                    io.ktor.utils.io.internal.b bVar = (io.ktor.utils.io.internal.b) byteBufferChannel._closed;
                    if (bVar != null) {
                        P3.d.c(bVar.a());
                        throw null;
                    }
                    do {
                        i11 = gVar._availableForWrite$internal;
                        if (i11 < i10) {
                            i11 = 0;
                            break;
                        }
                    } while (!io.ktor.utils.io.internal.g.f40630c.compareAndSet(gVar, i11, 0));
                    if (i11 <= 0) {
                        i12 = 0;
                    } else {
                        byteBufferChannel.x(byteBufferM, byteBufferChannel.f40582f, i11);
                        int iPosition = byteBufferM.position();
                        int iLimit = byteBufferM.limit();
                        block.invoke(byteBufferM);
                        if (iLimit != byteBufferM.limit()) {
                            throw new IllegalStateException("Buffer limit modified");
                        }
                        int iPosition2 = byteBufferM.position() - iPosition;
                        if (iPosition2 < 0) {
                            throw new IllegalStateException("Position has been moved backward: pushback is not supported");
                        }
                        if (iPosition2 < 0) {
                            throw new IllegalStateException();
                        }
                        byteBufferChannel.l(byteBufferM, gVar, iPosition2);
                        if (iPosition2 < i11) {
                            gVar.a(i11 - iPosition2);
                        }
                        i12 = iPosition2;
                        z10 = true;
                    }
                    if (gVar.d() || byteBufferChannel.f40578b) {
                        byteBufferChannel.w(1);
                    }
                    byteBufferChannel.I();
                    byteBufferChannel.R();
                } catch (Throwable th) {
                    if (gVar.d() || byteBufferChannel.f40578b) {
                        byteBufferChannel.w(1);
                    }
                    byteBufferChannel.I();
                    byteBufferChannel.R();
                    throw th;
                }
            }
            if (!z10) {
                i12 = -1;
            }
            if (i12 >= 0) {
                return r.f47939a;
            }
            byteBufferChannel$write$1.L$0 = byteBufferChannel;
            byteBufferChannel$write$1.L$1 = block;
            byteBufferChannel$write$1.I$0 = i10;
            byteBufferChannel$write$1.label = 1;
        } while (byteBufferChannel.j(i10, block, byteBufferChannel$write$1) != coroutineSingletons);
        return coroutineSingletons;
    }

    public static final io.ktor.utils.io.internal.b g(ByteBufferChannel byteBufferChannel) {
        return (io.ktor.utils.io.internal.b) byteBufferChannel._closed;
    }

    public static int z(ByteBufferChannel byteBufferChannel, p074fa.a aVar) throws Throwable {
        int iMin;
        boolean z10;
        int i10 = aVar.f34859e - aVar.f34857c;
        int i11 = 0;
        do {
            ByteBuffer byteBufferL = byteBufferChannel.L();
            if (byteBufferL == null) {
                z10 = false;
                iMin = 0;
            } else {
                io.ktor.utils.io.internal.g gVar = ((io.ktor.utils.io.internal.e) byteBufferChannel._state).f40614b;
                try {
                    if (gVar._availableForRead$internal == 0) {
                        byteBufferChannel.H();
                        byteBufferChannel.R();
                        z10 = false;
                        iMin = 0;
                    } else {
                        int i12 = aVar.f34859e - aVar.f34857c;
                        int iMin2 = Math.min(byteBufferL.remaining(), Math.min(i12, i10));
                        while (true) {
                            int i13 = gVar._availableForRead$internal;
                            int iMin3 = Math.min(iMin2, i13);
                            if (iMin3 == 0) {
                                iMin = 0;
                                break;
                            }
                            if (io.ktor.utils.io.internal.g.f40629b.compareAndSet(gVar, i13, i13 - iMin3)) {
                                iMin = Math.min(iMin2, i13);
                                break;
                            }
                        }
                        if (iMin <= 0) {
                            z10 = false;
                        } else {
                            if (i12 < byteBufferL.remaining()) {
                                byteBufferL.limit(byteBufferL.position() + i12);
                            }
                            I2.e.t(aVar, byteBufferL);
                            byteBufferChannel.k(byteBufferL, gVar, iMin);
                            z10 = true;
                        }
                        byteBufferChannel.H();
                        byteBufferChannel.R();
                    }
                } catch (Throwable th) {
                    byteBufferChannel.H();
                    byteBufferChannel.R();
                    throw th;
                }
            }
            i11 += iMin;
            i10 -= iMin;
            if (!z10 || aVar.f34859e <= aVar.f34857c) {
                break;
            }
        } while (((io.ktor.utils.io.internal.e) byteBufferChannel._state).f40614b._availableForRead$internal > 0);
        return i11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A(p074fa.a aVar, ContinuationImpl continuationImpl) throws Throwable {
        ByteBufferChannel$readAvailableSuspend$3 byteBufferChannel$readAvailableSuspend$3;
        ByteBufferChannel byteBufferChannel;
        if (continuationImpl instanceof ByteBufferChannel$readAvailableSuspend$3) {
            byteBufferChannel$readAvailableSuspend$3 = (ByteBufferChannel$readAvailableSuspend$3) continuationImpl;
            int i10 = byteBufferChannel$readAvailableSuspend$3.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                byteBufferChannel$readAvailableSuspend$3.label = i10 - Integer.MIN_VALUE;
            } else {
                byteBufferChannel$readAvailableSuspend$3 = new ByteBufferChannel$readAvailableSuspend$3(this, continuationImpl);
            }
        } else {
            byteBufferChannel$readAvailableSuspend$3 = new ByteBufferChannel$readAvailableSuspend$3(this, continuationImpl);
        }
        Object objD = byteBufferChannel$readAvailableSuspend$3.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = byteBufferChannel$readAvailableSuspend$3.label;
        if (i11 != 0) {
            if (i11 == 1) {
                aVar = (p074fa.a) byteBufferChannel$readAvailableSuspend$3.L$1;
                byteBufferChannel = (ByteBufferChannel) byteBufferChannel$readAvailableSuspend$3.L$0;
                kotlin.b.b(objD);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objD);
            }
        }
        kotlin.b.b(objD);
        byteBufferChannel$readAvailableSuspend$3.L$0 = this;
        byteBufferChannel$readAvailableSuspend$3.L$1 = aVar;
        byteBufferChannel$readAvailableSuspend$3.label = 1;
        objD = D(byteBufferChannel$readAvailableSuspend$3);
        if (objD == coroutineSingletons) {
            return coroutineSingletons;
        }
        byteBufferChannel = this;
        if (!((Boolean) objD).booleanValue()) {
            return new Integer(-1);
        }
        byteBufferChannel$readAvailableSuspend$3.L$0 = null;
        byteBufferChannel$readAvailableSuspend$3.L$1 = null;
        byteBufferChannel$readAvailableSuspend$3.label = 2;
        objD = byteBufferChannel.p(aVar, byteBufferChannel$readAvailableSuspend$3);
        return objD == coroutineSingletons ? coroutineSingletons : objD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(byte[] bArr, int i10, int i11, ContinuationImpl continuationImpl) throws Throwable {
        ByteBufferChannel$readAvailableSuspend$1 byteBufferChannel$readAvailableSuspend$1;
        ByteBufferChannel byteBufferChannel;
        if (continuationImpl instanceof ByteBufferChannel$readAvailableSuspend$1) {
            byteBufferChannel$readAvailableSuspend$1 = (ByteBufferChannel$readAvailableSuspend$1) continuationImpl;
            int i12 = byteBufferChannel$readAvailableSuspend$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                byteBufferChannel$readAvailableSuspend$1.label = i12 - Integer.MIN_VALUE;
            } else {
                byteBufferChannel$readAvailableSuspend$1 = new ByteBufferChannel$readAvailableSuspend$1(this, continuationImpl);
            }
        } else {
            byteBufferChannel$readAvailableSuspend$1 = new ByteBufferChannel$readAvailableSuspend$1(this, continuationImpl);
        }
        Object objD = byteBufferChannel$readAvailableSuspend$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i13 = byteBufferChannel$readAvailableSuspend$1.label;
        if (i13 != 0) {
            if (i13 == 1) {
                i11 = byteBufferChannel$readAvailableSuspend$1.I$1;
                i10 = byteBufferChannel$readAvailableSuspend$1.I$0;
                bArr = (byte[]) byteBufferChannel$readAvailableSuspend$1.L$1;
                byteBufferChannel = (ByteBufferChannel) byteBufferChannel$readAvailableSuspend$1.L$0;
                kotlin.b.b(objD);
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objD);
            }
        }
        kotlin.b.b(objD);
        byteBufferChannel$readAvailableSuspend$1.L$0 = this;
        byteBufferChannel$readAvailableSuspend$1.L$1 = bArr;
        byteBufferChannel$readAvailableSuspend$1.I$0 = i10;
        byteBufferChannel$readAvailableSuspend$1.I$1 = i11;
        byteBufferChannel$readAvailableSuspend$1.label = 1;
        objD = D(byteBufferChannel$readAvailableSuspend$1);
        if (objD == coroutineSingletons) {
            return coroutineSingletons;
        }
        byteBufferChannel = this;
        if (!((Boolean) objD).booleanValue()) {
            return new Integer(-1);
        }
        byteBufferChannel$readAvailableSuspend$1.L$0 = null;
        byteBufferChannel$readAvailableSuspend$1.L$1 = null;
        byteBufferChannel$readAvailableSuspend$1.label = 2;
        objD = byteBufferChannel.s(bArr, i10, i11, byteBufferChannel$readAvailableSuspend$1);
        return objD == coroutineSingletons ? coroutineSingletons : objD;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:12:0x0037, B:31:0x009c, B:36:0x00a9, B:21:0x005e, B:23:0x006a, B:24:0x0073, B:26:0x0083, B:28:0x0089), top: B:52:0x0037, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0083 A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:12:0x0037, B:31:0x009c, B:36:0x00a9, B:21:0x005e, B:23:0x006a, B:24:0x0073, B:26:0x0083, B:28:0x0089), top: B:52:0x0037, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6 A[PHI: r2 r4 r5 r11 r12
      0x00a6: PHI (r2v3 kotlin.jvm.internal.Ref$LongRef) = (r2v4 kotlin.jvm.internal.Ref$LongRef), (r2v4 kotlin.jvm.internal.Ref$LongRef), (r2v6 kotlin.jvm.internal.Ref$LongRef) binds: [B:25:0x0081, B:27:0x0087, B:32:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r4v3 ea.c) = (r4v14 ea.c), (r4v15 ea.c), (r4v16 ea.c) binds: [B:25:0x0081, B:27:0x0087, B:32:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r5v1 io.ktor.utils.io.ByteBufferChannel) = 
      (r5v2 io.ktor.utils.io.ByteBufferChannel)
      (r5v2 io.ktor.utils.io.ByteBufferChannel)
      (r5v4 io.ktor.utils.io.ByteBufferChannel)
     binds: [B:25:0x0081, B:27:0x0087, B:32:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r11v6 fa.a) = (r11v7 fa.a), (r11v7 fa.a), (r11v12 fa.a) binds: [B:25:0x0081, B:27:0x0087, B:32:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r12v2 ea.g) = (r12v15 ea.g), (r12v16 ea.g), (r12v17 ea.g) binds: [B:25:0x0081, B:27:0x0087, B:32:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:12:0x0037, B:31:0x009c, B:36:0x00a9, B:21:0x005e, B:23:0x006a, B:24:0x0073, B:26:0x0083, B:28:0x0089), top: B:52:0x0037, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0099 -> B:31:0x009c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a6 -> B:35:0x00a7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object C(long r11, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.C(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object D(ContinuationImpl continuationImpl) throws Throwable {
        if (((io.ktor.utils.io.internal.e) this._state).f40614b._availableForRead$internal >= 1) {
            return Boolean.TRUE;
        }
        io.ktor.utils.io.internal.b bVar = (io.ktor.utils.io.internal.b) this._closed;
        if (bVar == null) {
            return E(1, continuationImpl);
        }
        Throwable th = bVar.f40608a;
        if (th != null) {
            P3.d.c(th);
            throw null;
        }
        io.ktor.utils.io.internal.g gVar = ((io.ktor.utils.io.internal.e) this._state).f40614b;
        boolean z10 = gVar.c() && gVar._availableForRead$internal >= 1;
        if (((kotlin.coroutines.c) this._readOp) == null) {
            return Boolean.valueOf(z10);
        }
        throw new IllegalStateException("Read operation is already in progress");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E(int i10, ContinuationImpl continuationImpl) throws Throwable {
        ByteBufferChannel$readSuspendImpl$1 byteBufferChannel$readSuspendImpl$1;
        ByteBufferChannel byteBufferChannel;
        if (continuationImpl instanceof ByteBufferChannel$readSuspendImpl$1) {
            byteBufferChannel$readSuspendImpl$1 = (ByteBufferChannel$readSuspendImpl$1) continuationImpl;
            int i11 = byteBufferChannel$readSuspendImpl$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                byteBufferChannel$readSuspendImpl$1.label = i11 - Integer.MIN_VALUE;
            } else {
                byteBufferChannel$readSuspendImpl$1 = new ByteBufferChannel$readSuspendImpl$1(this, continuationImpl);
            }
        } else {
            byteBufferChannel$readSuspendImpl$1 = new ByteBufferChannel$readSuspendImpl$1(this, continuationImpl);
        }
        Object objD = byteBufferChannel$readSuspendImpl$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i12 = byteBufferChannel$readSuspendImpl$1.label;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteBufferChannel = (ByteBufferChannel) byteBufferChannel$readSuspendImpl$1.L$0;
            try {
                kotlin.b.b(objD);
            } catch (Throwable th) {
                th = th;
                byteBufferChannel._readOp = null;
                throw th;
            }
        }
        kotlin.b.b(objD);
        io.ktor.utils.io.internal.e eVar = (io.ktor.utils.io.internal.e) this._state;
        if (eVar.f40614b._availableForRead$internal >= i10 || !(this.joining == null || ((kotlin.coroutines.c) this._writeOp) == null || (eVar != io.ktor.utils.io.internal.e.a.f40615c && !(eVar instanceof io.ktor.utils.io.internal.e.b)))) {
            return Boolean.TRUE;
        }
        try {
            byteBufferChannel$readSuspendImpl$1.L$0 = this;
            byteBufferChannel$readSuspendImpl$1.I$0 = i10;
            byteBufferChannel$readSuspendImpl$1.label = 1;
            io.ktor.utils.io.internal.a<Boolean> aVar = this.f40583g;
            O(i10, aVar);
            objD = aVar.d(p.y(byteBufferChannel$readSuspendImpl$1));
            return objD == coroutineSingletons ? coroutineSingletons : objD;
        } catch (Throwable th2) {
            th = th2;
            byteBufferChannel = this;
            byteBufferChannel._readOp = null;
            throw th;
        }
    }

    public final void F(io.ktor.utils.io.internal.e.c cVar) {
        this.f40579c.H0(cVar);
    }

    public final void H() {
        io.ktor.utils.io.internal.e eVarE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        io.ktor.utils.io.internal.e eVar = null;
        loop0: while (true) {
            Object obj = this._state;
            io.ktor.utils.io.internal.e eVar2 = (io.ktor.utils.io.internal.e) obj;
            io.ktor.utils.io.internal.e.b bVar = (io.ktor.utils.io.internal.e.b) eVar;
            if (bVar != null) {
                bVar.f40614b.f();
                K();
                eVar = null;
            }
            eVarE = eVar2.e();
            if ((eVarE instanceof io.ktor.utils.io.internal.e.b) && ((io.ktor.utils.io.internal.e) this._state) == eVar2 && eVarE.f40614b.g()) {
                eVarE = io.ktor.utils.io.internal.e.a.f40615c;
                eVar = eVarE;
            }
            do {
                atomicReferenceFieldUpdater = j;
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, eVarE)) {
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
        io.ktor.utils.io.internal.e.a aVar = io.ktor.utils.io.internal.e.a.f40615c;
        if (eVarE == aVar) {
            io.ktor.utils.io.internal.e.b bVar2 = (io.ktor.utils.io.internal.e.b) eVar;
            if (bVar2 != null) {
                F(bVar2.f40616c);
            }
            K();
            return;
        }
        if (eVarE instanceof io.ktor.utils.io.internal.e.b) {
            io.ktor.utils.io.internal.g gVar = eVarE.f40614b;
            if (gVar._availableForWrite$internal == gVar.f40632a && eVarE.f40614b.g()) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, eVarE, aVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != eVarE) {
                        return;
                    }
                }
                eVarE.f40614b.f();
                F(((io.ktor.utils.io.internal.e.b) eVarE).f40616c);
                K();
            }
        }
    }

    public final void I() {
        io.ktor.utils.io.internal.e eVarF;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        io.ktor.utils.io.internal.e.b bVar;
        io.ktor.utils.io.internal.e eVar = null;
        loop0: while (true) {
            Object obj = this._state;
            eVarF = ((io.ktor.utils.io.internal.e) obj).f();
            if (eVarF instanceof io.ktor.utils.io.internal.e.b) {
                io.ktor.utils.io.internal.g gVar = eVarF.f40614b;
                if (gVar._availableForWrite$internal == gVar.f40632a) {
                    eVarF = io.ktor.utils.io.internal.e.a.f40615c;
                    eVar = eVarF;
                }
            }
            do {
                atomicReferenceFieldUpdater = j;
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, eVarF)) {
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
        if (eVarF != io.ktor.utils.io.internal.e.a.f40615c || (bVar = (io.ktor.utils.io.internal.e.b) eVar) == null) {
            return;
        }
        F(bVar.f40616c);
    }

    public final void J() {
        kotlin.coroutines.c cVar = (kotlin.coroutines.c) f40576l.getAndSet(this, null);
        if (cVar != null) {
            io.ktor.utils.io.internal.b bVar = (io.ktor.utils.io.internal.b) this._closed;
            Throwable th = bVar != null ? bVar.f40608a : null;
            if (th != null) {
                cVar.resumeWith(kotlin.b.a(th));
            } else {
                cVar.resumeWith(Boolean.TRUE);
            }
        }
    }

    public final void K() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            kotlin.coroutines.c cVar = (kotlin.coroutines.c) this._writeOp;
            if (cVar == null) {
                return;
            }
            io.ktor.utils.io.internal.b bVar = (io.ktor.utils.io.internal.b) this._closed;
            if (bVar == null && this.joining != null) {
                io.ktor.utils.io.internal.e eVar = (io.ktor.utils.io.internal.e) this._state;
                if (!(eVar instanceof io.ktor.utils.io.internal.e.g) && !(eVar instanceof io.ktor.utils.io.internal.e.C0459e) && eVar != io.ktor.utils.io.internal.e.f.f40625c) {
                    return;
                }
            }
            do {
                atomicReferenceFieldUpdater = f40577m;
                if (atomicReferenceFieldUpdater.compareAndSet(this, cVar, null)) {
                    cVar.resumeWith(bVar == null ? r.f47939a : kotlin.b.a(bVar.a()));
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == cVar);
        }
    }

    public final ByteBuffer L() throws Throwable {
        Throwable th;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable th2;
        while (true) {
            Object obj = this._state;
            io.ktor.utils.io.internal.e eVar = (io.ktor.utils.io.internal.e) obj;
            if (kotlin.jvm.internal.i.a(eVar, io.ktor.utils.io.internal.e.f.f40625c) ? true : kotlin.jvm.internal.i.a(eVar, io.ktor.utils.io.internal.e.a.f40615c)) {
                io.ktor.utils.io.internal.b bVar = (io.ktor.utils.io.internal.b) this._closed;
                if (bVar == null || (th = bVar.f40608a) == null) {
                    return null;
                }
                P3.d.c(th);
                throw null;
            }
            io.ktor.utils.io.internal.b bVar2 = (io.ktor.utils.io.internal.b) this._closed;
            if (bVar2 != null && (th2 = bVar2.f40608a) != null) {
                P3.d.c(th2);
                throw null;
            }
            if (eVar.f40614b._availableForRead$internal == 0) {
                return null;
            }
            io.ktor.utils.io.internal.e eVarC = eVar.c();
            do {
                atomicReferenceFieldUpdater = j;
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, eVarC)) {
                    ByteBuffer byteBufferA = eVarC.a();
                    x(byteBufferA, this.f40581e, eVarC.f40614b._availableForRead$internal);
                    return byteBufferA;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    public final ByteBuffer M() throws Throwable {
        io.ktor.utils.io.internal.e eVarD;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        kotlin.coroutines.c cVar = (kotlin.coroutines.c) this._writeOp;
        if (cVar != null) {
            throw new IllegalStateException("Write operation is already in progress: " + cVar);
        }
        io.ktor.utils.io.internal.e.c cVarY = null;
        while (true) {
            Object obj = this._state;
            io.ktor.utils.io.internal.e eVar = (io.ktor.utils.io.internal.e) obj;
            if (this.joining != null) {
                if (cVarY != null) {
                    F(cVarY);
                }
                return null;
            }
            if (((io.ktor.utils.io.internal.b) this._closed) != null) {
                if (cVarY != null) {
                    F(cVarY);
                }
                io.ktor.utils.io.internal.b bVar = (io.ktor.utils.io.internal.b) this._closed;
                kotlin.jvm.internal.i.b(bVar);
                P3.d.c(bVar.a());
                throw null;
            }
            if (eVar == io.ktor.utils.io.internal.e.a.f40615c) {
                if (cVarY == null) {
                    cVarY = this.f40579c.y();
                    cVarY.f40614b.f();
                }
                eVarD = cVarY.f40621g;
            } else {
                if (eVar == io.ktor.utils.io.internal.e.f.f40625c) {
                    if (cVarY != null) {
                        F(cVarY);
                    }
                    if (this.joining != null) {
                        return null;
                    }
                    io.ktor.utils.io.internal.b bVar2 = (io.ktor.utils.io.internal.b) this._closed;
                    kotlin.jvm.internal.i.b(bVar2);
                    P3.d.c(bVar2.a());
                    throw null;
                }
                eVarD = eVar.d();
            }
            io.ktor.utils.io.internal.e eVar2 = eVarD;
            io.ktor.utils.io.internal.e.c cVar2 = cVarY;
            do {
                atomicReferenceFieldUpdater = j;
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, eVar2)) {
                    if (((io.ktor.utils.io.internal.b) this._closed) != null) {
                        I();
                        R();
                        io.ktor.utils.io.internal.b bVar3 = (io.ktor.utils.io.internal.b) this._closed;
                        kotlin.jvm.internal.i.b(bVar3);
                        P3.d.c(bVar3.a());
                        throw null;
                    }
                    ByteBuffer byteBufferB = eVar2.b();
                    if (cVar2 != null) {
                        if (eVar == null) {
                            kotlin.jvm.internal.i.m("old");
                            throw null;
                        }
                        if (eVar != io.ktor.utils.io.internal.e.a.f40615c) {
                            F(cVar2);
                        }
                    }
                    x(byteBufferB, this.f40582f, eVar2.f40614b._availableForWrite$internal);
                    return byteBufferB;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
            cVarY = cVar2;
        }
    }

    public final boolean N() {
        return this.joining != null && (((io.ktor.utils.io.internal.e) this._state) == io.ktor.utils.io.internal.e.a.f40615c || (((io.ktor.utils.io.internal.e) this._state) instanceof io.ktor.utils.io.internal.e.b));
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:? A[LOOP:3: B:56:0x00ac->B:90:?, LOOP_END, SYNTHETIC] */
    public final void O(int i10, kotlin.coroutines.c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            io.ktor.utils.io.internal.e eVar = (io.ktor.utils.io.internal.e) this._state;
            if (eVar.f40614b._availableForRead$internal >= i10 || !(this.joining == null || ((kotlin.coroutines.c) this._writeOp) == null || (eVar != io.ktor.utils.io.internal.e.a.f40615c && !(eVar instanceof io.ktor.utils.io.internal.e.b)))) {
                break;
            }
            io.ktor.utils.io.internal.b bVar = (io.ktor.utils.io.internal.b) this._closed;
            if (bVar != null) {
                Throwable th = bVar.f40608a;
                if (th != null) {
                    cVar.resumeWith(kotlin.b.a(th));
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                    return;
                }
                boolean zC = ((io.ktor.utils.io.internal.e) this._state).f40614b.c();
                boolean z10 = false;
                boolean z11 = ((io.ktor.utils.io.internal.e) this._state).f40614b._availableForRead$internal >= i10;
                if (zC && z11) {
                    z10 = true;
                }
                cVar.resumeWith(Boolean.valueOf(z10));
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.f43038b;
                return;
            }
            while (true) {
                if (((kotlin.coroutines.c) this._readOp) != null) {
                    throw new IllegalStateException("Operation is already in progress");
                }
                if (((io.ktor.utils.io.internal.b) this._closed) != null) {
                    break;
                }
                io.ktor.utils.io.internal.e eVar2 = (io.ktor.utils.io.internal.e) this._state;
                if (eVar2.f40614b._availableForRead$internal >= i10 || !(this.joining == null || ((kotlin.coroutines.c) this._writeOp) == null || (eVar2 != io.ktor.utils.io.internal.e.a.f40615c && !(eVar2 instanceof io.ktor.utils.io.internal.e.b)))) {
                    break;
                }
                do {
                    atomicReferenceFieldUpdater = f40576l;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, cVar)) {
                        if (((io.ktor.utils.io.internal.b) this._closed) != null) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, cVar, null)) {
                                if (atomicReferenceFieldUpdater.get(this) != cVar) {
                                }
                            }
                            break;
                            break;
                        }
                        io.ktor.utils.io.internal.e eVar3 = (io.ktor.utils.io.internal.e) this._state;
                        if (eVar3.f40614b._availableForRead$internal >= i10 || (this.joining != null && ((kotlin.coroutines.c) this._writeOp) != null && (eVar3 == io.ktor.utils.io.internal.e.a.f40615c || (eVar3 instanceof io.ktor.utils.io.internal.e.b)))) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, cVar, null)) {
                                if (atomicReferenceFieldUpdater.get(this) != cVar) {
                                }
                            }
                            break;
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            }
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.f43038b;
        }
        cVar.resumeWith(Boolean.TRUE);
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.f43038b;
    }

    public final boolean P(io.ktor.utils.io.internal.c cVar) {
        if (!Q(true)) {
            return false;
        }
        v(cVar);
        kotlin.coroutines.c cVar2 = (kotlin.coroutines.c) f40576l.getAndSet(this, null);
        if (cVar2 != null) {
            cVar2.resumeWith(kotlin.b.a(new IllegalStateException("Joining is in progress")));
        }
        K();
        return true;
    }

    public final boolean Q(boolean z10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        io.ktor.utils.io.internal.e.c cVar = null;
        while (true) {
            Object obj = this._state;
            io.ktor.utils.io.internal.e eVar = (io.ktor.utils.io.internal.e) obj;
            io.ktor.utils.io.internal.b bVar = (io.ktor.utils.io.internal.b) this._closed;
            if (cVar != null) {
                if ((bVar != null ? bVar.f40608a : null) == null) {
                    cVar.f40614b.f();
                }
                K();
                cVar = null;
            }
            io.ktor.utils.io.internal.e.f fVar = io.ktor.utils.io.internal.e.f.f40625c;
            if (eVar == fVar) {
                return true;
            }
            if (eVar != io.ktor.utils.io.internal.e.a.f40615c) {
                if (bVar != null && (eVar instanceof io.ktor.utils.io.internal.e.b) && (eVar.f40614b.g() || bVar.f40608a != null)) {
                    if (bVar.f40608a != null) {
                        io.ktor.utils.io.internal.g gVar = eVar.f40614b;
                        gVar.getClass();
                        io.ktor.utils.io.internal.g.f40630c.getAndSet(gVar, 0);
                    }
                    cVar = ((io.ktor.utils.io.internal.e.b) eVar).f40616c;
                } else {
                    if (!z10 || !(eVar instanceof io.ktor.utils.io.internal.e.b) || !eVar.f40614b.g()) {
                        return false;
                    }
                    cVar = ((io.ktor.utils.io.internal.e.b) eVar).f40616c;
                }
            }
            io.ktor.utils.io.internal.e.c cVar2 = cVar;
            do {
                atomicReferenceFieldUpdater = j;
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, fVar)) {
                    if (cVar2 != null && ((io.ktor.utils.io.internal.e) this._state) == io.ktor.utils.io.internal.e.f.f40625c) {
                        F(cVar2);
                    }
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
            cVar = cVar2;
        }
    }

    public final void R() {
        if (((io.ktor.utils.io.internal.b) this._closed) == null || !Q(false)) {
            return;
        }
        io.ktor.utils.io.internal.c cVar = this.joining;
        if (cVar != null) {
            v(cVar);
        }
        J();
        K();
    }

    public final Object S(ContinuationImpl continuationImpl) throws Throwable {
        if (!a0(1)) {
            io.ktor.utils.io.internal.b bVar = (io.ktor.utils.io.internal.b) this._closed;
            if (bVar == null) {
                return r.f47939a;
            }
            P3.d.c(bVar.a());
            throw null;
        }
        this.writeSuspensionSize = 1;
        if (this.attachedJob != null) {
            ((ByteBufferChannel$writeSuspension$1) this.f40585i).invoke(continuationImpl);
            return CoroutineSingletons.f43038b;
        }
        io.ktor.utils.io.internal.a<r> aVar = this.f40584h;
        ((ByteBufferChannel$writeSuspension$1) this.f40585i).invoke(aVar);
        Object objD = aVar.d(p.y(continuationImpl));
        return objD == CoroutineSingletons.f43038b ? objD : r.f47939a;
    }

    public final int U(byte[] bArr, int i10, int i11) throws Throwable {
        io.ktor.utils.io.internal.c cVar = this.joining;
        if (cVar != null) {
            G(this, cVar);
        }
        ByteBuffer byteBufferM = M();
        int i12 = 0;
        if (byteBufferM == null) {
            return 0;
        }
        io.ktor.utils.io.internal.g gVar = ((io.ktor.utils.io.internal.e) this._state).f40614b;
        try {
            io.ktor.utils.io.internal.b bVar = (io.ktor.utils.io.internal.b) this._closed;
            if (bVar != null) {
                P3.d.c(bVar.a());
                throw null;
            }
            while (true) {
                int iH = gVar.h(Math.min(i11 - i12, byteBufferM.remaining()));
                if (iH == 0) {
                    l(byteBufferM, gVar, i12);
                    if (gVar.d() || this.f40578b) {
                        w(1);
                    }
                    I();
                    R();
                    return i12;
                }
                if (iH <= 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                byteBufferM.put(bArr, i10 + i12, iH);
                i12 += iH;
                x(byteBufferM, m(this.f40582f + i12, byteBufferM), gVar._availableForWrite$internal);
            }
        } catch (Throwable th) {
            if (gVar.d() || this.f40578b) {
                w(1);
            }
            I();
            R();
            throw th;
        }
    }

    public final void V(p061ea.a aVar) throws Throwable {
        io.ktor.utils.io.internal.c cVar = this.joining;
        if (cVar != null) {
            G(this, cVar);
        }
        ByteBuffer byteBufferM = M();
        if (byteBufferM == null) {
            return;
        }
        io.ktor.utils.io.internal.g gVar = ((io.ktor.utils.io.internal.e) this._state).f40614b;
        try {
            io.ktor.utils.io.internal.b bVar = (io.ktor.utils.io.internal.b) this._closed;
            if (bVar != null) {
                P3.d.c(bVar.a());
                throw null;
            }
            int i10 = 0;
            while (true) {
                int iH = gVar.h(Math.min(aVar.f34857c - aVar.f34856b, byteBufferM.remaining()));
                if (iH == 0) {
                    break;
                }
                kotlin.jvm.internal.h.g(aVar, byteBufferM, iH);
                i10 += iH;
                x(byteBufferM, m(this.f40582f + i10, byteBufferM), gVar._availableForWrite$internal);
            }
            l(byteBufferM, gVar, i10);
            if (gVar.d() || this.f40578b) {
                w(1);
            }
            I();
            R();
        } catch (Throwable th) {
            if (gVar.d() || this.f40578b) {
                w(1);
            }
            I();
            R();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0056 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0054 -> B:24:0x0057). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object W(p074fa.a r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteBufferChannel$writeFullySuspend$3
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ByteBufferChannel$writeFullySuspend$3 r0 = (io.ktor.utils.io.ByteBufferChannel$writeFullySuspend$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$writeFullySuspend$3 r0 = new io.ktor.utils.io.ByteBufferChannel$writeFullySuspend$3
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 == r3) goto L34
            r6 = 2
            if (r2 != r6) goto L2c
            kotlin.b.b(r7)
            xa.r r6 = p293xa.r.f47939a
            return r6
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$1
            ea.a r6 = (p061ea.a) r6
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteBufferChannel r2 = (io.ktor.utils.io.ByteBufferChannel) r2
            kotlin.b.b(r7)
            goto L57
        L40:
            kotlin.b.b(r7)
            r2 = r5
        L44:
            int r7 = r6.f34857c
            int r4 = r6.f34856b
            if (r7 <= r4) goto L62
            r0.L$0 = r2
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = r2.S(r0)
            if (r7 != r1) goto L57
            return r1
        L57:
            io.ktor.utils.io.internal.c r7 = r2.joining
            if (r7 == 0) goto L5e
            G(r2, r7)
        L5e:
            r2.V(r6)
            goto L44
        L62:
            xa.r r6 = p293xa.r.f47939a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.W(fa.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0066 -> B:26:0x0069). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object X(byte[] r7, int r8, int r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof io.ktor.utils.io.ByteBufferChannel$writeFullySuspend$5
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.ByteBufferChannel$writeFullySuspend$5 r0 = (io.ktor.utils.io.ByteBufferChannel$writeFullySuspend$5) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$writeFullySuspend$5 r0 = new io.ktor.utils.io.ByteBufferChannel$writeFullySuspend$5
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            int r7 = r0.I$1
            int r8 = r0.I$0
            java.lang.Object r9 = r0.L$1
            byte[] r9 = (byte[]) r9
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteBufferChannel r2 = (io.ktor.utils.io.ByteBufferChannel) r2
            kotlin.b.b(r10)
            goto L69
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            kotlin.b.b(r10)
            r2 = r6
        L3f:
            if (r9 <= 0) goto L75
            r0.L$0 = r2
            r0.L$1 = r7
            r0.I$0 = r8
            r0.I$1 = r9
            r0.label = r3
            io.ktor.utils.io.internal.c r10 = r2.joining
            if (r10 == 0) goto L52
            G(r2, r10)
        L52:
            int r10 = r2.U(r7, r8, r9)
            if (r10 <= 0) goto L5f
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r10)
            r10 = r4
            goto L63
        L5f:
            java.lang.Object r10 = r2.Z(r7, r8, r9, r0)
        L63:
            if (r10 != r1) goto L66
            return r1
        L66:
            r5 = r9
            r9 = r7
            r7 = r5
        L69:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            int r8 = r8 + r10
            int r7 = r7 - r10
            r5 = r9
            r9 = r7
            r7 = r5
            goto L3f
        L75:
            xa.r r7 = p293xa.r.f47939a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.X(byte[], int, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Y(int i10, ContinuationImpl continuationImpl) throws Throwable {
        ByteBufferChannel$writeSuspend$3 byteBufferChannel$writeSuspend$3;
        ByteBufferChannel byteBufferChannel;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (continuationImpl instanceof ByteBufferChannel$writeSuspend$3) {
            byteBufferChannel$writeSuspend$3 = (ByteBufferChannel$writeSuspend$3) continuationImpl;
            int i11 = byteBufferChannel$writeSuspend$3.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                byteBufferChannel$writeSuspend$3.label = i11 - Integer.MIN_VALUE;
            } else {
                byteBufferChannel$writeSuspend$3 = new ByteBufferChannel$writeSuspend$3(this, continuationImpl);
            }
        } else {
            byteBufferChannel$writeSuspend$3 = new ByteBufferChannel$writeSuspend$3(this, continuationImpl);
        }
        Object obj = byteBufferChannel$writeSuspend$3.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i12 = byteBufferChannel$writeSuspend$3.label;
        if (i12 == 0) {
            kotlin.b.b(obj);
            byteBufferChannel = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = byteBufferChannel$writeSuspend$3.I$0;
            byteBufferChannel = (ByteBufferChannel) byteBufferChannel$writeSuspend$3.L$0;
            kotlin.b.b(obj);
        }
        while (byteBufferChannel.a0(i10)) {
            byteBufferChannel$writeSuspend$3.L$0 = byteBufferChannel;
            byteBufferChannel$writeSuspend$3.I$0 = i10;
            byteBufferChannel$writeSuspend$3.label = 1;
            C2693i c2693i = new C2693i(1, p.y(byteBufferChannel$writeSuspend$3));
            c2693i.s();
            while (true) {
                io.ktor.utils.io.internal.b bVar = (io.ktor.utils.io.internal.b) byteBufferChannel._closed;
                if (bVar != null) {
                    P3.d.c(bVar.a());
                    throw null;
                }
                if (!byteBufferChannel.a0(i10)) {
                    c2693i.resumeWith(r.f47939a);
                    break;
                }
                while (true) {
                    if (((kotlin.coroutines.c) byteBufferChannel._writeOp) != null) {
                        throw new IllegalStateException("Operation is already in progress");
                    }
                    if (!byteBufferChannel.a0(i10)) {
                        break;
                    }
                    do {
                        atomicReferenceFieldUpdater = f40577m;
                        if (atomicReferenceFieldUpdater.compareAndSet(byteBufferChannel, null, c2693i)) {
                            if (!byteBufferChannel.a0(i10)) {
                                while (!atomicReferenceFieldUpdater.compareAndSet(byteBufferChannel, c2693i, null)) {
                                    if (atomicReferenceFieldUpdater.get(byteBufferChannel) != c2693i) {
                                        break;
                                    }
                                }
                                break;
                            }
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(byteBufferChannel) == null);
                }
            }
            byteBufferChannel.w(i10);
            if (byteBufferChannel.N()) {
                byteBufferChannel.J();
            }
            Object objP = c2693i.p();
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.f43038b;
            if (objP == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        io.ktor.utils.io.internal.b bVar2 = (io.ktor.utils.io.internal.b) byteBufferChannel._closed;
        if (bVar2 == null) {
            return r.f47939a;
        }
        P3.d.c(bVar2.a());
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0059 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0067  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0057 -> B:22:0x005a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object Z(byte[] r6, int r7, int r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof io.ktor.utils.io.ByteBufferChannel$writeSuspend$1
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.ByteBufferChannel$writeSuspend$1 r0 = (io.ktor.utils.io.ByteBufferChannel$writeSuspend$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$writeSuspend$1 r0 = new io.ktor.utils.io.ByteBufferChannel$writeSuspend$1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L45
            if (r2 == r3) goto L32
            r6 = 2
            if (r2 != r6) goto L2a
            kotlin.b.b(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            int r6 = r0.I$1
            int r7 = r0.I$0
            java.lang.Object r8 = r0.L$1
            byte[] r8 = (byte[]) r8
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteBufferChannel r2 = (io.ktor.utils.io.ByteBufferChannel) r2
            kotlin.b.b(r9)
            r4 = r8
            r8 = r6
            r6 = r4
            goto L5a
        L45:
            kotlin.b.b(r9)
            r2 = r5
        L49:
            r0.L$0 = r2
            r0.L$1 = r6
            r0.I$0 = r7
            r0.I$1 = r8
            r0.label = r3
            java.lang.Object r9 = r2.S(r0)
            if (r9 != r1) goto L5a
            return r1
        L5a:
            io.ktor.utils.io.internal.c r9 = r2.joining
            if (r9 == 0) goto L61
            G(r2, r9)
        L61:
            int r9 = r2.U(r6, r7, r8)
            if (r9 <= 0) goto L49
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.Z(byte[], int, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.d
    public boolean a(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        io.ktor.utils.io.internal.c cVar;
        if (((io.ktor.utils.io.internal.b) this._closed) != null) {
            return false;
        }
        io.ktor.utils.io.internal.b bVar = th == null ? io.ktor.utils.io.internal.b.f40607b : new io.ktor.utils.io.internal.b(th);
        ((io.ktor.utils.io.internal.e) this._state).f40614b.c();
        do {
            atomicReferenceFieldUpdater = f40575k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, bVar)) {
                ((io.ktor.utils.io.internal.e) this._state).f40614b.c();
                io.ktor.utils.io.internal.g gVar = ((io.ktor.utils.io.internal.e) this._state).f40614b;
                if (gVar._availableForWrite$internal == gVar.f40632a || th != null) {
                    R();
                }
                kotlin.coroutines.c cVar2 = (kotlin.coroutines.c) f40576l.getAndSet(this, null);
                if (cVar2 != null) {
                    if (th != null) {
                        cVar2.resumeWith(kotlin.b.a(th));
                    } else {
                        cVar2.resumeWith(Boolean.valueOf(((io.ktor.utils.io.internal.e) this._state).f40614b._availableForRead$internal > 0));
                    }
                }
                kotlin.coroutines.c cVar3 = (kotlin.coroutines.c) f40577m.getAndSet(this, null);
                if (cVar3 != null) {
                    cVar3.resumeWith(kotlin.b.a(th == null ? new ClosedWriteChannelException("Byte channel was closed") : th));
                }
                if (((io.ktor.utils.io.internal.e) this._state) == io.ktor.utils.io.internal.e.f.f40625c && (cVar = this.joining) != null) {
                    v(cVar);
                }
                if (th != null) {
                    InterfaceC2694i0 interfaceC2694i0 = this.attachedJob;
                    if (interfaceC2694i0 != null) {
                        interfaceC2694i0.i(null);
                    }
                    this.f40583g.b(th);
                    this.f40584h.b(th);
                    return true;
                }
                this.f40584h.b(new ClosedWriteChannelException("Byte channel was closed"));
                io.ktor.utils.io.internal.a<Boolean> aVar = this.f40583g;
                Boolean boolValueOf = Boolean.valueOf(((io.ktor.utils.io.internal.e) this._state).f40614b.c());
                aVar.getClass();
                aVar.resumeWith(boolValueOf);
                io.ktor.utils.io.internal.a.C0458a c0458a = (io.ktor.utils.io.internal.a.C0458a) io.ktor.utils.io.internal.a.f40603c.getAndSet(aVar, null);
                if (c0458a != null) {
                    c0458a.a();
                }
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return false;
    }

    public final boolean a0(int i10) {
        io.ktor.utils.io.internal.c cVar = this.joining;
        io.ktor.utils.io.internal.e eVar = (io.ktor.utils.io.internal.e) this._state;
        if (((io.ktor.utils.io.internal.b) this._closed) != null) {
            return false;
        }
        if (cVar == null) {
            if (eVar.f40614b._availableForWrite$internal >= i10 || eVar == io.ktor.utils.io.internal.e.a.f40615c) {
                return false;
            }
        } else if (eVar == io.ktor.utils.io.internal.e.f.f40625c || (eVar instanceof io.ktor.utils.io.internal.e.g) || (eVar instanceof io.ktor.utils.io.internal.e.C0459e)) {
            return false;
        }
        return true;
    }

    @Override // io.ktor.utils.io.d
    public final Object b(p074fa.a aVar, kotlin.coroutines.c cVar) throws Throwable {
        V(aVar);
        if (aVar.f34857c <= aVar.f34856b) {
            return r.f47939a;
        }
        Object objW = W(aVar, (ContinuationImpl) cVar);
        return objW == CoroutineSingletons.f43038b ? objW : r.f47939a;
    }

    @Override // io.ktor.utils.io.a
    @p293xa.d
    public final void c(InterfaceC2694i0 interfaceC2694i0) {
        InterfaceC2694i0 interfaceC2694i1 = this.attachedJob;
        if (interfaceC2694i1 != null) {
            interfaceC2694i1.i(null);
        }
        this.attachedJob = interfaceC2694i0;
        interfaceC2694i0.f0(true, true, new l<Throwable, r>() { // from class: io.ktor.utils.io.ByteBufferChannel$attachJob$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Throwable th) {
                Throwable th2 = th;
                this.this$0.attachedJob = null;
                if (th2 != null) {
                    ByteBufferChannel byteBufferChannel = this.this$0;
                    Throwable th3 = th2;
                    while (true) {
                        if (th3 instanceof CancellationException) {
                            if (th3.equals(th3.getCause())) {
                                break;
                            }
                            Throwable cause = th3.getCause();
                            if (cause != null) {
                                th3 = cause;
                            }
                        }
                        th2 = th3;
                        break;
                    }
                    byteBufferChannel.a(th2);
                }
                return r.f47939a;
            }
        });
    }

    @Override // io.ktor.utils.io.d
    public final Object d(byte[] bArr, int i10, SuspendLambda suspendLambda) throws Throwable {
        io.ktor.utils.io.internal.c cVar = this.joining;
        if (cVar != null) {
            G(this, cVar);
        }
        int i11 = 0;
        while (i10 > 0) {
            int iU = U(bArr, i11, i10);
            if (iU == 0) {
                break;
            }
            i11 += iU;
            i10 -= iU;
        }
        if (i10 == 0) {
            return r.f47939a;
        }
        Object objX = X(bArr, i11, i10, suspendLambda);
        return objX == CoroutineSingletons.f43038b ? objX : r.f47939a;
    }

    @Override // io.ktor.utils.io.d
    public final Object e(int i10, l<? super ByteBuffer, r> lVar, kotlin.coroutines.c<? super r> cVar) {
        return T(this, i10, lVar, (ContinuationImpl) cVar);
    }

    @Override // io.ktor.utils.io.d
    public final boolean f() {
        return this.f40578b;
    }

    @Override // io.ktor.utils.io.d
    public final void flush() {
        w(1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(int i10, l lVar, ContinuationImpl continuationImpl) {
        ByteBufferChannel$awaitFreeSpaceOrDelegate$1 byteBufferChannel$awaitFreeSpaceOrDelegate$1;
        ByteBufferChannel byteBufferChannel;
        if (continuationImpl instanceof ByteBufferChannel$awaitFreeSpaceOrDelegate$1) {
            byteBufferChannel$awaitFreeSpaceOrDelegate$1 = (ByteBufferChannel$awaitFreeSpaceOrDelegate$1) continuationImpl;
            int i11 = byteBufferChannel$awaitFreeSpaceOrDelegate$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                byteBufferChannel$awaitFreeSpaceOrDelegate$1.label = i11 - Integer.MIN_VALUE;
            } else {
                byteBufferChannel$awaitFreeSpaceOrDelegate$1 = new ByteBufferChannel$awaitFreeSpaceOrDelegate$1(this, continuationImpl);
            }
        } else {
            byteBufferChannel$awaitFreeSpaceOrDelegate$1 = new ByteBufferChannel$awaitFreeSpaceOrDelegate$1(this, continuationImpl);
        }
        Object obj = byteBufferChannel$awaitFreeSpaceOrDelegate$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i12 = byteBufferChannel$awaitFreeSpaceOrDelegate$1.label;
        if (i12 == 0) {
            kotlin.b.b(obj);
            byteBufferChannel$awaitFreeSpaceOrDelegate$1.L$0 = this;
            byteBufferChannel$awaitFreeSpaceOrDelegate$1.L$1 = lVar;
            byteBufferChannel$awaitFreeSpaceOrDelegate$1.I$0 = i10;
            byteBufferChannel$awaitFreeSpaceOrDelegate$1.label = 1;
            if (Y(i10, byteBufferChannel$awaitFreeSpaceOrDelegate$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            byteBufferChannel = this;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return r.f47939a;
            }
            byteBufferChannel = (ByteBufferChannel) byteBufferChannel$awaitFreeSpaceOrDelegate$1.L$0;
            kotlin.b.b(obj);
        }
        io.ktor.utils.io.internal.c cVar = byteBufferChannel.joining;
        if (cVar != null) {
            G(byteBufferChannel, cVar);
        }
        return r.f47939a;
    }

    public final void k(ByteBuffer byteBuffer, io.ktor.utils.io.internal.g gVar, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f40581e = m(this.f40581e + i10, byteBuffer);
        gVar.a(i10);
        this.totalBytesRead += (long) i10;
        K();
    }

    public final void l(ByteBuffer byteBuffer, io.ktor.utils.io.internal.g gVar, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f40582f = m(this.f40582f + i10, byteBuffer);
        gVar.b(i10);
        this.totalBytesWritten += (long) i10;
    }

    public final int m(int i10, ByteBuffer byteBuffer) {
        int iCapacity = byteBuffer.capacity();
        int i11 = this.f40580d;
        return i10 >= iCapacity - i11 ? i10 - (byteBuffer.capacity() - i11) : i10;
    }

    /* JADX WARN: Code duplicated, block: B:152:0x0327 A[Catch: all -> 0x0051, TryCatch #6 {all -> 0x0051, blocks: (B:14:0x0041, B:38:0x00ed, B:40:0x00f3, B:42:0x00f7, B:43:0x00fa, B:145:0x030c, B:148:0x0314, B:150:0x0320, B:152:0x0327, B:154:0x032d, B:156:0x0337, B:160:0x0362, B:163:0x036c, B:173:0x0387, B:175:0x038b, B:167:0x0375, B:46:0x0102, B:185:0x03c1, B:187:0x03c7, B:191:0x03d1, B:192:0x03d9, B:193:0x03df, B:189:0x03cb, B:195:0x03e2, B:196:0x03e6, B:21:0x0070), top: B:214:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x032d A[Catch: all -> 0x0051, TryCatch #6 {all -> 0x0051, blocks: (B:14:0x0041, B:38:0x00ed, B:40:0x00f3, B:42:0x00f7, B:43:0x00fa, B:145:0x030c, B:148:0x0314, B:150:0x0320, B:152:0x0327, B:154:0x032d, B:156:0x0337, B:160:0x0362, B:163:0x036c, B:173:0x0387, B:175:0x038b, B:167:0x0375, B:46:0x0102, B:185:0x03c1, B:187:0x03c7, B:191:0x03d1, B:192:0x03d9, B:193:0x03df, B:189:0x03cb, B:195:0x03e2, B:196:0x03e6, B:21:0x0070), top: B:214:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x0337 A[Catch: all -> 0x0051, TryCatch #6 {all -> 0x0051, blocks: (B:14:0x0041, B:38:0x00ed, B:40:0x00f3, B:42:0x00f7, B:43:0x00fa, B:145:0x030c, B:148:0x0314, B:150:0x0320, B:152:0x0327, B:154:0x032d, B:156:0x0337, B:160:0x0362, B:163:0x036c, B:173:0x0387, B:175:0x038b, B:167:0x0375, B:46:0x0102, B:185:0x03c1, B:187:0x03c7, B:191:0x03d1, B:192:0x03d9, B:193:0x03df, B:189:0x03cb, B:195:0x03e2, B:196:0x03e6, B:21:0x0070), top: B:214:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x035a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:159:0x035b  */
    /* JADX WARN: Code duplicated, block: B:162:0x036a  */
    /* JADX WARN: Code duplicated, block: B:163:0x036c A[Catch: all -> 0x0051, TryCatch #6 {all -> 0x0051, blocks: (B:14:0x0041, B:38:0x00ed, B:40:0x00f3, B:42:0x00f7, B:43:0x00fa, B:145:0x030c, B:148:0x0314, B:150:0x0320, B:152:0x0327, B:154:0x032d, B:156:0x0337, B:160:0x0362, B:163:0x036c, B:173:0x0387, B:175:0x038b, B:167:0x0375, B:46:0x0102, B:185:0x03c1, B:187:0x03c7, B:191:0x03d1, B:192:0x03d9, B:193:0x03df, B:189:0x03cb, B:195:0x03e2, B:196:0x03e6, B:21:0x0070), top: B:214:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x0373  */
    /* JADX WARN: Code duplicated, block: B:167:0x0375 A[Catch: all -> 0x0051, TryCatch #6 {all -> 0x0051, blocks: (B:14:0x0041, B:38:0x00ed, B:40:0x00f3, B:42:0x00f7, B:43:0x00fa, B:145:0x030c, B:148:0x0314, B:150:0x0320, B:152:0x0327, B:154:0x032d, B:156:0x0337, B:160:0x0362, B:163:0x036c, B:173:0x0387, B:175:0x038b, B:167:0x0375, B:46:0x0102, B:185:0x03c1, B:187:0x03c7, B:191:0x03d1, B:192:0x03d9, B:193:0x03df, B:189:0x03cb, B:195:0x03e2, B:196:0x03e6, B:21:0x0070), top: B:214:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x037c  */
    /* JADX WARN: Code duplicated, block: B:172:0x0386  */
    /* JADX WARN: Code duplicated, block: B:175:0x038b A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #6 {all -> 0x0051, blocks: (B:14:0x0041, B:38:0x00ed, B:40:0x00f3, B:42:0x00f7, B:43:0x00fa, B:145:0x030c, B:148:0x0314, B:150:0x0320, B:152:0x0327, B:154:0x032d, B:156:0x0337, B:160:0x0362, B:163:0x036c, B:173:0x0387, B:175:0x038b, B:167:0x0375, B:46:0x0102, B:185:0x03c1, B:187:0x03c7, B:191:0x03d1, B:192:0x03d9, B:193:0x03df, B:189:0x03cb, B:195:0x03e2, B:196:0x03e6, B:21:0x0070), top: B:214:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x03ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:195:0x03e2 A[Catch: all -> 0x0051, TryCatch #6 {all -> 0x0051, blocks: (B:14:0x0041, B:38:0x00ed, B:40:0x00f3, B:42:0x00f7, B:43:0x00fa, B:145:0x030c, B:148:0x0314, B:150:0x0320, B:152:0x0327, B:154:0x032d, B:156:0x0337, B:160:0x0362, B:163:0x036c, B:173:0x0387, B:175:0x038b, B:167:0x0375, B:46:0x0102, B:185:0x03c1, B:187:0x03c7, B:191:0x03d1, B:192:0x03d9, B:193:0x03df, B:189:0x03cb, B:195:0x03e2, B:196:0x03e6, B:21:0x0070), top: B:214:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f3 A[Catch: all -> 0x0051, TryCatch #6 {all -> 0x0051, blocks: (B:14:0x0041, B:38:0x00ed, B:40:0x00f3, B:42:0x00f7, B:43:0x00fa, B:145:0x030c, B:148:0x0314, B:150:0x0320, B:152:0x0327, B:154:0x032d, B:156:0x0337, B:160:0x0362, B:163:0x036c, B:173:0x0387, B:175:0x038b, B:167:0x0375, B:46:0x0102, B:185:0x03c1, B:187:0x03c7, B:191:0x03d1, B:192:0x03d9, B:193:0x03df, B:189:0x03cb, B:195:0x03e2, B:196:0x03e6, B:21:0x0070), top: B:214:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f7 A[Catch: all -> 0x0051, TryCatch #6 {all -> 0x0051, blocks: (B:14:0x0041, B:38:0x00ed, B:40:0x00f3, B:42:0x00f7, B:43:0x00fa, B:145:0x030c, B:148:0x0314, B:150:0x0320, B:152:0x0327, B:154:0x032d, B:156:0x0337, B:160:0x0362, B:163:0x036c, B:173:0x0387, B:175:0x038b, B:167:0x0375, B:46:0x0102, B:185:0x03c1, B:187:0x03c7, B:191:0x03d1, B:192:0x03d9, B:193:0x03df, B:189:0x03cb, B:195:0x03e2, B:196:0x03e6, B:21:0x0070), top: B:214:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0100  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x0320 -> B:151:0x0323). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:174:0x0389 -> B:151:0x0323). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:176:0x03ab -> B:151:0x0323). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object n(io.ktor.utils.io.ByteBufferChannel r27, long r28, kotlin.coroutines.jvm.internal.ContinuationImpl r30) {
        /*
            Method dump skipped, instruction units count: 1013
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.n(io.ktor.utils.io.ByteBufferChannel, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final boolean o(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel has been cancelled");
        }
        return a(th);
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final Object p(p074fa.a aVar, ContinuationImpl continuationImpl) throws Throwable {
        int iZ = z(this, aVar);
        if (iZ == 0 && ((io.ktor.utils.io.internal.b) this._closed) != null) {
            iZ = ((io.ktor.utils.io.internal.e) this._state).f40614b.c() ? z(this, aVar) : -1;
        } else if (iZ <= 0 && aVar.f34859e > aVar.f34857c) {
            return A(aVar, continuationImpl);
        }
        return new Integer(iZ);
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final Throwable q() {
        io.ktor.utils.io.internal.b bVar = (io.ktor.utils.io.internal.b) this._closed;
        if (bVar != null) {
            return bVar.f40608a;
        }
        return null;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final int r() {
        return ((io.ktor.utils.io.internal.e) this._state).f40614b._availableForRead$internal;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final Object s(byte[] bArr, int i10, int i11, ContinuationImpl continuationImpl) throws Throwable {
        int iY = y(bArr, i10, i11);
        if (iY == 0 && ((io.ktor.utils.io.internal.b) this._closed) != null) {
            iY = ((io.ktor.utils.io.internal.e) this._state).f40614b.c() ? y(bArr, i10, i11) : -1;
        } else if (iY <= 0 && i11 != 0) {
            return B(bArr, i10, i11, continuationImpl);
        }
        return new Integer(iY);
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final Object t(long j10, ContinuationImpl continuationImpl) throws Throwable {
        if (((io.ktor.utils.io.internal.b) this._closed) == null) {
            return C(j10, continuationImpl);
        }
        Throwable thQ = q();
        if (thQ != null) {
            P3.d.c(thQ);
            throw null;
        }
        p061ea.c cVar = new p061ea.c(null);
        try {
            p074fa.a aVarD = p074fa.b.d(cVar, 1, null);
            while (true) {
                try {
                    if (aVarD.f34859e - aVarD.f34857c > j10) {
                        int i10 = aVarD.f34858d;
                        aVarD.f34856b = i10;
                        aVarD.f34857c = i10;
                        aVarD.f34859e = (int) j10;
                    }
                    j10 -= (long) z(this, aVarD);
                    if (j10 <= 0 || u()) {
                        break;
                    }
                    aVarD = p074fa.b.d(cVar, 1, aVarD);
                } catch (Throwable th) {
                    cVar.b();
                    throw th;
                }
            }
            cVar.b();
            return cVar.s();
        } catch (Throwable th2) {
            cVar.close();
            throw th2;
        }
    }

    public final String toString() {
        return "ByteBufferChannel(" + hashCode() + ", " + ((io.ktor.utils.io.internal.e) this._state) + ')';
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final boolean u() {
        return ((io.ktor.utils.io.internal.e) this._state) == io.ktor.utils.io.internal.e.f.f40625c && ((io.ktor.utils.io.internal.b) this._closed) != null;
    }

    public final void v(io.ktor.utils.io.internal.c cVar) {
        if (((io.ktor.utils.io.internal.b) this._closed) == null) {
            return;
        }
        this.joining = null;
        cVar.getClass();
        throw null;
    }

    public final void w(int i10) {
        io.ktor.utils.io.internal.e eVar;
        io.ktor.utils.io.internal.e.f fVar;
        do {
            eVar = (io.ktor.utils.io.internal.e) this._state;
            fVar = io.ktor.utils.io.internal.e.f.f40625c;
            if (eVar == fVar) {
                return;
            } else {
                eVar.f40614b.c();
            }
        } while (eVar != ((io.ktor.utils.io.internal.e) this._state));
        int i11 = eVar.f40614b._availableForWrite$internal;
        if (eVar.f40614b._availableForRead$internal >= 1) {
            J();
        }
        io.ktor.utils.io.internal.c cVar = this.joining;
        if (i11 >= i10) {
            if (cVar == null || ((io.ktor.utils.io.internal.e) this._state) == fVar) {
                K();
            }
        }
    }

    public final void x(ByteBuffer byteBuffer, int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int iCapacity = byteBuffer.capacity() - this.f40580d;
        int i12 = i11 + i10;
        if (i12 <= iCapacity) {
            iCapacity = i12;
        }
        byteBuffer.limit(iCapacity);
        byteBuffer.position(i10);
    }

    public final int y(byte[] bArr, int i10, int i11) throws Throwable {
        int iMin;
        ByteBuffer byteBufferL = L();
        if (byteBufferL == null) {
            return 0;
        }
        io.ktor.utils.io.internal.g gVar = ((io.ktor.utils.io.internal.e) this._state).f40614b;
        try {
            if (gVar._availableForRead$internal == 0) {
                H();
                R();
                return 0;
            }
            int iCapacity = byteBufferL.capacity() - this.f40580d;
            int i12 = 0;
            while (true) {
                int i13 = i11 - i12;
                if (i13 == 0) {
                    break;
                }
                int i14 = this.f40581e;
                int iMin2 = Math.min(iCapacity - i14, i13);
                while (true) {
                    int i15 = gVar._availableForRead$internal;
                    int iMin3 = Math.min(iMin2, i15);
                    if (iMin3 == 0) {
                        iMin = 0;
                        break;
                    }
                    if (io.ktor.utils.io.internal.g.f40629b.compareAndSet(gVar, i15, i15 - iMin3)) {
                        iMin = Math.min(iMin2, i15);
                        break;
                    }
                }
                if (iMin == 0) {
                    break;
                }
                byteBufferL.limit(i14 + iMin);
                byteBufferL.position(i14);
                byteBufferL.get(bArr, i10 + i12, iMin);
                k(byteBufferL, gVar, iMin);
                i12 += iMin;
            }
            H();
            R();
            return i12;
        } catch (Throwable th) {
            H();
            R();
            throw th;
        }
    }

    public ByteBufferChannel(ByteBuffer byteBuffer) {
        this(false, io.ktor.utils.io.internal.d.f40612d, 0);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        kotlin.jvm.internal.i.d(byteBufferSlice, "content.slice()");
        io.ktor.utils.io.internal.e.c cVar = new io.ktor.utils.io.internal.e.c(0, byteBufferSlice);
        cVar.f40614b.e();
        this._state = cVar.f40621g;
        I();
        a(null);
        R();
    }

    public ByteBufferChannel(boolean z10, p086ga.d<io.ktor.utils.io.internal.e.c> pool, int i10) {
        kotlin.jvm.internal.i.e(pool, "pool");
        this.f40578b = z10;
        this.f40579c = pool;
        this.f40580d = i10;
        this._state = io.ktor.utils.io.internal.e.a.f40615c;
        this._closed = null;
        this._readOp = null;
        this._writeOp = null;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p074fa.a.f35063h;
        io.ktor.utils.io.internal.c cVar = this.joining;
        if (cVar != null) {
            G(this, cVar);
        }
        p074fa.a.f35065k.getClass();
        io.ktor.utils.io.internal.g gVar = ((io.ktor.utils.io.internal.e) this._state).f40614b;
        this.f40583g = new io.ktor.utils.io.internal.a<>();
        this.f40584h = new io.ktor.utils.io.internal.a<>();
        this.f40585i = new ByteBufferChannel$writeSuspension$1(this);
    }
}
