package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: BroadcastChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BroadcastChannelImpl<E> extends BufferedChannel<E> implements kotlinx.coroutines.channels.a<E> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f43237n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ReentrantLock f43238o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f43239p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f43240q;

    /* JADX INFO: compiled from: BroadcastChannel.kt */
    public final class a extends BufferedChannel<E> {
        public a() {
            super(null, BroadcastChannelImpl.this.f43237n);
        }

        @Override // kotlinx.coroutines.channels.BufferedChannel
        public final boolean p(CancellationException cancellationException) {
            BroadcastChannelImpl<E> broadcastChannelImpl = BroadcastChannelImpl.this;
            ReentrantLock reentrantLock = broadcastChannelImpl.f43238o;
            reentrantLock.lock();
            try {
                BroadcastChannelImpl.V(broadcastChannelImpl, this);
                return super.p(cancellationException);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* JADX INFO: compiled from: BroadcastChannel.kt */
    public final class b extends k<E> {
        public b() {
            super(1, BufferOverflow.f43244c, null);
        }

        @Override // kotlinx.coroutines.channels.BufferedChannel
        public final boolean p(CancellationException cancellationException) {
            BroadcastChannelImpl.V(BroadcastChannelImpl.this, this);
            return super.p(cancellationException);
        }
    }

    public BroadcastChannelImpl(int i10) {
        super(null, 0);
        this.f43237n = i10;
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException(J4.i.c(i10, "BroadcastChannel capacity must be positive or Channel.CONFLATED, but ", " was specified").toString());
        }
        this.f43238o = new ReentrantLock();
        this.f43239p = EmptyList.f42983b;
        this.f43240q = kotlinx.coroutines.channels.b.f43268a;
        new HashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void V(BroadcastChannelImpl broadcastChannelImpl, BufferedChannel bufferedChannel) {
        ReentrantLock reentrantLock = broadcastChannelImpl.f43238o;
        reentrantLock.lock();
        try {
            Iterable iterable = (Iterable) broadcastChannelImpl.f43239p;
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (((BufferedChannel) obj) != bufferedChannel) {
                    arrayList.add(obj);
                }
            }
            broadcastChannelImpl.f43239p = arrayList;
            p293xa.r rVar = p293xa.r.f47939a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final E W() {
        ReentrantLock reentrantLock = this.f43238o;
        reentrantLock.lock();
        try {
            if (v()) {
                Throwable thY = y();
                if (thY == null) {
                    throw new IllegalStateException("This broadcast channel is closed");
                }
                throw thY;
            }
            E e10 = (E) this.f43240q;
            if (e10 == kotlinx.coroutines.channels.b.f43268a) {
                throw new IllegalStateException("No value");
            }
            reentrantLock.unlock();
            return e10;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.q
    public final boolean a(Throwable th) {
        ReentrantLock reentrantLock = this.f43238o;
        reentrantLock.lock();
        try {
            Iterator it = ((Iterable) this.f43239p).iterator();
            while (it.hasNext()) {
                ((BufferedChannel) it.next()).a(th);
            }
            Iterable iterable = (Iterable) this.f43239p;
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (((BufferedChannel) obj).C()) {
                    arrayList.add(obj);
                }
            }
            this.f43239p = arrayList;
            return q(th, false);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.a
    public final BufferedChannel m() {
        ReentrantLock reentrantLock = this.f43238o;
        reentrantLock.lock();
        try {
            BufferedChannel bVar = this.f43237n == -1 ? new b() : new a();
            boolean zV = v();
            D3.l lVar = kotlinx.coroutines.channels.b.f43268a;
            if (zV && this.f43240q == lVar) {
                bVar.a(y());
                return bVar;
            }
            if (this.f43240q != lVar) {
                bVar.n(W());
            }
            this.f43239p = kotlin.collections.q.d0((Collection) this.f43239p, bVar);
            return bVar;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.q
    public final Object n(E e10) {
        ReentrantLock reentrantLock = this.f43238o;
        reentrantLock.lock();
        try {
            if (v()) {
                Object objN = super.n(e10);
                reentrantLock.unlock();
                return objN;
            }
            Iterable iterable = (Iterable) this.f43239p;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    if (((BufferedChannel) it.next()).P()) {
                        h.b bVar = h.f43291b;
                        reentrantLock.unlock();
                        return bVar;
                    }
                }
            }
            if (this.f43237n == -1) {
                this.f43240q = e10;
            }
            Iterator it2 = ((Iterable) this.f43239p).iterator();
            while (it2.hasNext()) {
                ((BufferedChannel) it2.next()).n(e10);
            }
            p293xa.r rVar = p293xa.r.f47939a;
            reentrantLock.unlock();
            return rVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public final boolean p(CancellationException cancellationException) {
        ReentrantLock reentrantLock = this.f43238o;
        reentrantLock.lock();
        try {
            Iterator it = ((Iterable) this.f43239p).iterator();
            while (it.hasNext()) {
                ((BufferedChannel) it.next()).p(cancellationException);
            }
            this.f43240q = kotlinx.coroutines.channels.b.f43268a;
            return super.p(cancellationException);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007b -> B:30:0x007e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.q
    public final java.lang.Object t(E r7, kotlin.coroutines.c<? super p293xa.r> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.BroadcastChannelImpl$send$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.BroadcastChannelImpl$send$1 r0 = (kotlinx.coroutines.channels.BroadcastChannelImpl$send$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.BroadcastChannelImpl$send$1 r0 = new kotlinx.coroutines.channels.BroadcastChannelImpl$send$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.L$2
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r2 = r0.L$1
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.BroadcastChannelImpl r4 = (kotlinx.coroutines.channels.BroadcastChannelImpl) r4
            kotlin.b.b(r8)
            goto L7e
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            kotlin.b.b(r8)
            java.util.concurrent.locks.ReentrantLock r8 = r6.f43238o
            r8.lock()
            boolean r2 = r6.v()     // Catch: java.lang.Throwable -> L4f
            if (r2 != 0) goto L97
            int r2 = r6.f43237n     // Catch: java.lang.Throwable -> L4f
            r4 = -1
            if (r2 != r4) goto L51
            r6.f43240q = r7     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r7 = move-exception
            goto L9c
        L51:
            java.lang.Object r2 = r6.f43239p     // Catch: java.lang.Throwable -> L4f
            r8.unlock()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r8 = r2.iterator()
            r4 = r6
            r5 = r8
            r8 = r7
            r7 = r5
        L60:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L94
            java.lang.Object r2 = r7.next()
            kotlinx.coroutines.channels.BufferedChannel r2 = (kotlinx.coroutines.channels.BufferedChannel) r2
            r0.L$0 = r4
            r0.L$1 = r8
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r2 = r2.O(r8, r0)
            if (r2 != r1) goto L7b
            return r1
        L7b:
            r5 = r2
            r2 = r8
            r8 = r5
        L7e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L92
            boolean r8 = r4.v()
            if (r8 != 0) goto L8d
            goto L92
        L8d:
            java.lang.Throwable r7 = r4.A()
            throw r7
        L92:
            r8 = r2
            goto L60
        L94:
            xa.r r7 = p293xa.r.f47939a
            return r7
        L97:
            java.lang.Throwable r7 = r6.A()     // Catch: java.lang.Throwable -> L4f
            throw r7     // Catch: java.lang.Throwable -> L4f
        L9c:
            r8.unlock()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BroadcastChannelImpl.t(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f43240q != kotlinx.coroutines.channels.b.f43268a) {
            str = "CONFLATED_ELEMENT=" + this.f43240q + "; ";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("BROADCAST=<");
        sb2.append(super.toString());
        sb2.append(">; SUBSCRIBERS=");
        sb2.append(kotlin.collections.q.U((Iterable) this.f43239p, ";", "<", ">", null, 56));
        return sb2.toString();
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.q
    public final boolean v() {
        ReentrantLock reentrantLock = this.f43238o;
        reentrantLock.lock();
        try {
            return super.v();
        } finally {
            reentrantLock.unlock();
        }
    }
}
