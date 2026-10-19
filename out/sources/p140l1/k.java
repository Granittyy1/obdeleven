package p140l1;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: StatsDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class k implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f44203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f44204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f44205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, List<String>> f44206d;

    public k(d dVar) {
        dVar.getClass();
        this.f44203a = dVar;
        this.f44205c = Uri.EMPTY;
        this.f44206d = Collections.emptyMap();
    }

    @Override // p140l1.d
    public final void b(l lVar) {
        lVar.getClass();
        this.f44203a.b(lVar);
    }

    @Override // p140l1.d
    public final void close() throws IOException {
        this.f44203a.close();
    }

    @Override // p140l1.d
    public final long f(e eVar) throws IOException {
        d dVar = this.f44203a;
        this.f44205c = eVar.f44168a;
        this.f44206d = Collections.emptyMap();
        try {
            return dVar.f(eVar);
        } finally {
            Uri uri = dVar.getUri();
            if (uri != null) {
                this.f44205c = uri;
            }
            this.f44206d = dVar.g();
        }
    }

    @Override // p140l1.d
    public final Map<String, List<String>> g() {
        return this.f44203a.g();
    }

    @Override // p140l1.d
    public final Uri getUri() {
        return this.f44203a.getUri();
    }

    @Override // p078g1.i
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f44203a.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f44204b += (long) i12;
        }
        return i12;
    }
}
