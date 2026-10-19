package io.grpc.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: renamed from: io.grpc.internal.n0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ManagedChannelOrphanWrapper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2235n0 extends K {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ReferenceQueue<C2235n0> f37635b = new ReferenceQueue<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f37636c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f37637d = Logger.getLogger(C2235n0.class.getName());

    /* JADX INFO: renamed from: io.grpc.internal.n0$a */
    /* JADX INFO: compiled from: ManagedChannelOrphanWrapper.java */
    public static final class a extends WeakReference<C2235n0> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final boolean f37638f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final RuntimeException f37639g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReferenceQueue<C2235n0> f37640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ConcurrentHashMap f37641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f37642c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SoftReference f37643d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicBoolean f37644e;

        static {
            RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
            runtimeException.setStackTrace(new StackTraceElement[0]);
            f37639g = runtimeException;
        }

        public a(C2235n0 c2235n0, ManagedChannelImpl managedChannelImpl, ReferenceQueue referenceQueue, ConcurrentHashMap concurrentHashMap) {
            super(c2235n0, referenceQueue);
            this.f37644e = new AtomicBoolean();
            this.f37643d = new SoftReference(f37638f ? new RuntimeException("ManagedChannel allocation site") : f37639g);
            this.f37642c = managedChannelImpl.toString();
            this.f37640a = referenceQueue;
            this.f37641b = concurrentHashMap;
            concurrentHashMap.put(this, this);
            a(referenceQueue);
        }

        public static void a(ReferenceQueue referenceQueue) {
            while (true) {
                a aVar = (a) referenceQueue.poll();
                if (aVar == null) {
                    return;
                }
                SoftReference softReference = aVar.f37643d;
                RuntimeException runtimeException = (RuntimeException) softReference.get();
                super.clear();
                aVar.f37641b.remove(aVar);
                softReference.clear();
                if (!aVar.f37644e.get()) {
                    Level level = Level.SEVERE;
                    Logger logger = C2235n0.f37637d;
                    if (logger.isLoggable(level)) {
                        LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was not shutdown properly!!! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow() and wait until awaitTermination() returns true.");
                        logRecord.setLoggerName(logger.getName());
                        logRecord.setParameters(new Object[]{aVar.f37642c});
                        logRecord.setThrown(runtimeException);
                        logger.log(logRecord);
                    }
                }
            }
        }

        @Override // java.lang.ref.Reference
        public final void clear() {
            super.clear();
            this.f37641b.remove(this);
            this.f37643d.clear();
            a(this.f37640a);
        }
    }

    public C2235n0() {
        throw null;
    }
}
