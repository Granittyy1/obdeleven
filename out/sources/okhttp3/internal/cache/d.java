package okhttp3.internal.cache;

import java.io.IOException;
import p293xa.r;
import p318zb.H;
import p318zb.n;

/* JADX INFO: compiled from: DiskLruCache.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DiskLruCache f45440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DiskLruCache.a f45441e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(H h8, DiskLruCache diskLruCache, DiskLruCache.a aVar) {
        super(h8);
        this.f45440d = diskLruCache;
        this.f45441e = aVar;
    }

    @Override // p318zb.n, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.f45439c) {
            return;
        }
        this.f45439c = true;
        DiskLruCache diskLruCache = this.f45440d;
        DiskLruCache.a aVar = this.f45441e;
        synchronized (diskLruCache) {
            try {
                int i10 = aVar.f45426h - 1;
                aVar.f45426h = i10;
                if (i10 == 0 && aVar.f45424f) {
                    diskLruCache.C(aVar);
                }
                r rVar = r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
