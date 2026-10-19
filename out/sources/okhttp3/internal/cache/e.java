package okhttp3.internal.cache;

import java.io.IOException;
import p318zb.C2838e;
import p318zb.v;

/* JADX INFO: compiled from: DiskLruCache.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends p184ob.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DiskLruCache f45442e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DiskLruCache diskLruCache, String str) {
        super(str, true);
        this.f45442e = diskLruCache;
    }

    @Override // p184ob.a
    public final long a() {
        DiskLruCache diskLruCache = this.f45442e;
        synchronized (diskLruCache) {
            if (!diskLruCache.f45408l || diskLruCache.f45409m) {
                return -1L;
            }
            try {
                diskLruCache.M();
            } catch (IOException unused) {
                diskLruCache.f45410n = true;
            }
            try {
                if (diskLruCache.k()) {
                    diskLruCache.B();
                    diskLruCache.f45406i = 0;
                }
            } catch (IOException unused2) {
                diskLruCache.f45411o = true;
                diskLruCache.f45404g = v.a(new C2838e());
            }
            return -1L;
        }
    }
}
