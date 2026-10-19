package G9;

import io.grpc.okhttp.internal.c;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: Request.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G9.a f3585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f3586b;

    /* JADX INFO: compiled from: Request.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public G9.a f3587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c.a f3588b;

        public final void a(String str, String str2) {
            c.a aVar = this.f3588b;
            aVar.getClass();
            if (str.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                char cCharAt = str.charAt(i11);
                if (cCharAt <= 31 || cCharAt >= 127) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i11), str));
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException("value == null");
            }
            int length2 = str2.length();
            for (int i12 = 0; i12 < length2; i12++) {
                char cCharAt2 = str2.charAt(i12);
                if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i12), str2));
                }
            }
            while (true) {
                ArrayList arrayList = aVar.f37999a;
                if (i10 >= arrayList.size()) {
                    arrayList.add(str);
                    arrayList.add(str2.trim());
                    return;
                } else {
                    if (str.equalsIgnoreCase((String) arrayList.get(i10))) {
                        arrayList.remove(i10);
                        arrayList.remove(i10);
                        i10 -= 2;
                    }
                    i10 += 2;
                }
            }
        }
    }

    public b(a aVar) {
        this.f3585a = aVar.f3587a;
        c.a aVar2 = aVar.f3588b;
        aVar2.getClass();
        this.f3586b = new c(aVar2);
    }

    public final String toString() {
        return "Request{url=" + this.f3585a + '}';
    }
}
