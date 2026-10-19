package G9;

/* JADX INFO: compiled from: HttpUrl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3581c;

    /* JADX INFO: renamed from: G9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HttpUrl.java */
    public static final class C0041a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f3582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f3583b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3584c;

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f3582a);
            sb2.append("://");
            int i10 = -1;
            if (this.f3583b.indexOf(58) != -1) {
                sb2.append('[');
                sb2.append(this.f3583b);
                sb2.append(']');
            } else {
                sb2.append(this.f3583b);
            }
            int i11 = this.f3584c;
            if (i11 == -1) {
                String str = this.f3582a;
                if (str.equals("http")) {
                    i11 = 80;
                } else {
                    i11 = str.equals("https") ? 443 : -1;
                }
            }
            String str2 = this.f3582a;
            if (str2.equals("http")) {
                i10 = 80;
            } else if (str2.equals("https")) {
                i10 = 443;
            }
            if (i11 != i10) {
                sb2.append(':');
                sb2.append(i11);
            }
            return sb2.toString();
        }
    }

    public a(C0041a c0041a) {
        int i10;
        String str = c0041a.f3582a;
        this.f3579a = c0041a.f3583b;
        int i11 = c0041a.f3584c;
        if (i11 == -1) {
            if (str.equals("http")) {
                i10 = 80;
            } else if (str.equals("https")) {
                i10 = 443;
            } else {
                i11 = -1;
            }
            i11 = i10;
        }
        this.f3580b = i11;
        this.f3581c = c0041a.toString();
    }

    public static int a(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        if (c10 >= 'a' && c10 <= 'f') {
            return c10 - 'W';
        }
        if (c10 < 'A' || c10 > 'F') {
            return -1;
        }
        return c10 - '7';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f3581c.equals(this.f3581c);
    }

    public final int hashCode() {
        return this.f3581c.hashCode();
    }

    public final String toString() {
        return this.f3581c;
    }
}
