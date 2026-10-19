package io.grpc.okhttp.internal;

import java.util.ArrayList;

/* JADX INFO: compiled from: Headers.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f37998a;

    /* JADX INFO: compiled from: Headers.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f37999a = new ArrayList(20);
    }

    public c(a aVar) {
        ArrayList arrayList = aVar.f37999a;
        this.f37998a = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        String[] strArr = this.f37998a;
        int length = strArr.length / 2;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            String str = null;
            sb2.append((i11 < 0 || i11 >= strArr.length) ? null : strArr[i11]);
            sb2.append(": ");
            int i12 = i11 + 1;
            if (i12 >= 0 && i12 < strArr.length) {
                str = strArr[i12];
            }
            sb2.append(str);
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
