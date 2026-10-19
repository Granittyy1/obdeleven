package p141l2;

import android.net.Uri;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: NavDeepLinkRequest.kt */
/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f44214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44216c;

    public B(String str, String str2, Uri uri) {
        this.f44214a = uri;
        this.f44215b = str;
        this.f44216c = str2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavDeepLinkRequest{");
        Uri uri = this.f44214a;
        if (uri != null) {
            sb2.append(" uri=");
            sb2.append(String.valueOf(uri));
        }
        String str = this.f44215b;
        if (str != null) {
            sb2.append(" action=");
            sb2.append(str);
        }
        String str2 = this.f44216c;
        if (str2 != null) {
            sb2.append(" mimetype=");
            sb2.append(str2);
        }
        sb2.append(" }");
        String string = sb2.toString();
        i.d(string, "toString(...)");
        return string;
    }
}
