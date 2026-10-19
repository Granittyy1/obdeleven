package p186p0;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: compiled from: LocusIdCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocusId f45795b;

    /* JADX INFO: compiled from: LocusIdCompat.java */
    public static class a {
        public static LocusId a(String str) {
            return new LocusId(str);
        }

        public static String b(LocusId locusId) {
            return locusId.getId();
        }
    }

    public b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("id cannot be empty");
        }
        this.f45794a = str;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f45795b = a.a(str);
        } else {
            this.f45795b = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        String str = ((b) obj).f45794a;
        String str2 = this.f45794a;
        if (str2 == null) {
            return str == null;
        }
        return str2.equals(str);
    }

    public final int hashCode() {
        String str = this.f45794a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocusIdCompat[");
        sb2.append(this.f45794a.length() + "_chars");
        sb2.append("]");
        return sb2.toString();
    }
}
