package p140l1;

import B1.a;
import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import p114j1.A;
import p241t7.b;

/* JADX INFO: compiled from: DataSchemeDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f44163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f44164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44166h;

    @Override // p140l1.d
    public final void close() {
        if (this.f44164f != null) {
            this.f44164f = null;
            l();
        }
        this.f44163e = null;
    }

    @Override // p140l1.d
    public final long f(e eVar) throws IOException {
        m(eVar);
        this.f44163e = eVar;
        Uri uriNormalizeScheme = eVar.f44168a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        b.d("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i10 = A.f40996a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new ParserException(a.h(uriNormalizeScheme, "Unexpected URI format: "), null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f44164f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw new ParserException(B7.b.c("Error while parsing Base64 encoded string: ", str), e10, true, 0);
            }
        } else {
            this.f44164f = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        byte[] bArr = this.f44164f;
        long length = bArr.length;
        long j = eVar.f44172e;
        if (j > length) {
            this.f44164f = null;
            throw new DataSourceException(2008);
        }
        int i11 = (int) j;
        this.f44165g = i11;
        int length2 = bArr.length - i11;
        this.f44166h = length2;
        long j10 = eVar.f44173f;
        if (j10 != -1) {
            this.f44166h = (int) Math.min(length2, j10);
        }
        n(eVar);
        return j10 != -1 ? j10 : this.f44166h;
    }

    @Override // p140l1.d
    public final Uri getUri() {
        e eVar = this.f44163e;
        if (eVar != null) {
            return eVar.f44168a;
        }
        return null;
    }

    @Override // p078g1.i
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f44166h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        byte[] bArr2 = this.f44164f;
        int i13 = A.f40996a;
        System.arraycopy(bArr2, this.f44165g, bArr, i10, iMin);
        this.f44165g += iMin;
        this.f44166h -= iMin;
        k(iMin);
        return iMin;
    }
}
