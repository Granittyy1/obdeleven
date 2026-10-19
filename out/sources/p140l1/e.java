package p140l1;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p078g1.q;
import p241t7.b;

/* JADX INFO: compiled from: DataSpec.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f44167h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f44168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f44170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, String> f44171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f44172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f44173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f44174g;

    static {
        q.a("media3.datasource");
    }

    public e(Uri uri, int i10, byte[] bArr, Map map, long j, long j10, int i11) {
        b.e(j >= 0);
        b.e(j >= 0);
        b.e(j10 > 0 || j10 == -1);
        uri.getClass();
        this.f44168a = uri;
        this.f44169b = i10;
        this.f44170c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f44171d = Collections.unmodifiableMap(new HashMap(map));
        this.f44172e = j;
        this.f44173f = j10;
        this.f44174g = i11;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i10 = this.f44169b;
        if (i10 == 1) {
            str = "GET";
        } else if (i10 == 2) {
            str = "POST";
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb2.append(str);
        sb2.append(" ");
        sb2.append(this.f44168a);
        sb2.append(", ");
        sb2.append(this.f44172e);
        sb2.append(", ");
        sb2.append(this.f44173f);
        sb2.append(", null, ");
        return p005a4.q.c(sb2, this.f44174g, "]");
    }
}
