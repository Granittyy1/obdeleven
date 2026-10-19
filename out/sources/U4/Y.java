package U4;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6379c;

    public Y(String str, boolean z10) {
        C0804l.e(str);
        this.f6377a = str;
        C0804l.e("com.google.android.gms");
        this.f6378b = "com.google.android.gms";
        this.f6379c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y10 = (Y) obj;
        return C0803k.a(this.f6377a, y10.f6377a) && C0803k.a(this.f6378b, y10.f6378b) && C0803k.a(null, null) && this.f6379c == y10.f6379c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6377a, this.f6378b, null, 4225, Boolean.valueOf(this.f6379c)});
    }

    public final String toString() {
        String str = this.f6377a;
        if (str != null) {
            return str;
        }
        C0804l.h(null);
        throw null;
    }
}
