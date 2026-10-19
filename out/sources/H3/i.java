package H3;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.M1;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: compiled from: GlideUrl.java */
/* JADX INFO: loaded from: classes.dex */
public final class i implements A3.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f3646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final URL f3647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f3649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public URL f3650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile byte[] f3651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3652h;

    public i(URL url) {
        l lVar = j.f3653a;
        M1.d(url, "Argument must not be null");
        this.f3647c = url;
        this.f3648d = null;
        M1.d(lVar, "Argument must not be null");
        this.f3646b = lVar;
    }

    @Override // A3.b
    public final void a(MessageDigest messageDigest) {
        if (this.f3651g == null) {
            this.f3651g = c().getBytes(A3.b.f574a);
        }
        messageDigest.update(this.f3651g);
    }

    public final String c() {
        String str = this.f3648d;
        if (str != null) {
            return str;
        }
        URL url = this.f3647c;
        M1.d(url, "Argument must not be null");
        return url.toString();
    }

    public final URL d() throws MalformedURLException {
        if (this.f3650f == null) {
            if (TextUtils.isEmpty(this.f3649e)) {
                String string = this.f3648d;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f3647c;
                    M1.d(url, "Argument must not be null");
                    string = url.toString();
                }
                this.f3649e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f3650f = new URL(this.f3649e);
        }
        return this.f3650f;
    }

    @Override // A3.b
    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return c().equals(iVar.c()) && this.f3646b.equals(iVar.f3646b);
    }

    @Override // A3.b
    public final int hashCode() {
        if (this.f3652h == 0) {
            int iHashCode = c().hashCode();
            this.f3652h = iHashCode;
            this.f3652h = this.f3646b.f3654b.hashCode() + (iHashCode * 31);
        }
        return this.f3652h;
    }

    public final String toString() {
        return c();
    }

    public i(String str) {
        this(str, j.f3653a);
    }

    public i(String str, l lVar) {
        this.f3647c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f3648d = str;
            M1.d(lVar, "Argument must not be null");
            this.f3646b = lVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
