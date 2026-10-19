package okhttp3.internal.cache;

import Ia.l;
import java.io.IOException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: DiskLruCache.kt */
/* JADX INFO: loaded from: classes2.dex */
final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends Lambda implements l<IOException, r> {
    final /* synthetic */ DiskLruCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.this$0 = diskLruCache;
    }

    @Override // Ia.l
    public final r invoke(IOException iOException) {
        IOException it = iOException;
        i.e(it, "it");
        DiskLruCache diskLruCache = this.this$0;
        byte[] bArr = p172nb.b.f45026a;
        diskLruCache.j = true;
        return r.f47939a;
    }
}
