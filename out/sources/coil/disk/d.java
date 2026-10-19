package coil.disk;

import okio.ByteString;
import p318zb.l;
import p318zb.t;
import p318zb.z;

/* JADX INFO: compiled from: RealDiskCache.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d implements coil.disk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f22954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DiskLruCache f22955b;

    /* JADX INFO: compiled from: RealDiskCache.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DiskLruCache.a f22956a;

        public a(DiskLruCache.a aVar) {
            this.f22956a = aVar;
        }

        public final b a() {
            DiskLruCache.c cVarH;
            DiskLruCache.a aVar = this.f22956a;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                aVar.a(true);
                cVarH = diskLruCache.h(aVar.f22929a.f22933a);
            }
            if (cVarH != null) {
                return new b(cVarH);
            }
            return null;
        }

        public final z b() {
            return this.f22956a.b(0);
        }
    }

    /* JADX INFO: compiled from: RealDiskCache.kt */
    public static final class b implements coil.disk.a.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DiskLruCache.c f22957b;

        public b(DiskLruCache.c cVar) {
            this.f22957b = cVar;
        }

        @Override // coil.disk.a.b
        public final z L() {
            DiskLruCache.c cVar = this.f22957b;
            if (cVar.f22943c) {
                throw new IllegalStateException("snapshot is closed");
            }
            return cVar.f22942b.f22935c.get(0);
        }

        @Override // coil.disk.a.b
        public final a V() {
            DiskLruCache.a aVarC;
            DiskLruCache.c cVar = this.f22957b;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                cVar.close();
                aVarC = diskLruCache.c(cVar.f22942b.f22933a);
            }
            if (aVarC != null) {
                return new a(aVarC);
            }
            return null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f22957b.close();
        }

        @Override // coil.disk.a.b
        public final z getData() {
            DiskLruCache.c cVar = this.f22957b;
            if (cVar.f22943c) {
                throw new IllegalStateException("snapshot is closed");
            }
            return cVar.f22942b.f22935c.get(1);
        }
    }

    public d(long j, Sa.a aVar, t tVar, z zVar) {
        this.f22954a = tVar;
        this.f22955b = new DiskLruCache(j, aVar, tVar, zVar);
    }

    @Override // coil.disk.a
    public final a a(String str) {
        ByteString byteString = ByteString.f45705d;
        DiskLruCache.a aVarC = this.f22955b.c(ByteString.a.c(str).c("SHA-256").f());
        if (aVarC != null) {
            return new a(aVarC);
        }
        return null;
    }

    @Override // coil.disk.a
    public final b b(String str) {
        ByteString byteString = ByteString.f45705d;
        DiskLruCache.c cVarH = this.f22955b.h(ByteString.a.c(str).c("SHA-256").f());
        if (cVarH != null) {
            return new b(cVarH);
        }
        return null;
    }

    @Override // coil.disk.a
    public final l c() {
        return this.f22954a;
    }
}
