package bo.app;

import android.net.Uri;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class g5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f21147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final URL f21148c;

    public g5(Uri uri) {
        kotlin.jvm.internal.i.e(uri, "uri");
        this.f21147b = uri;
        String string = uri.toString();
        kotlin.jvm.internal.i.d(string, "uri.toString()");
        this.f21146a = string;
        this.f21148c = new URL(string);
    }

    public final Uri a() {
        return this.f21147b;
    }

    public final URL b() {
        return this.f21148c;
    }

    public final String c() {
        return this.f21146a;
    }

    public String toString() {
        return this.f21146a;
    }

    public g5(String urlString) {
        kotlin.jvm.internal.i.e(urlString, "urlString");
        Uri uri = Uri.parse(urlString);
        kotlin.jvm.internal.i.d(uri, "parse(urlString)");
        this.f21147b = uri;
        this.f21146a = urlString;
        this.f21148c = new URL(urlString);
    }
}
