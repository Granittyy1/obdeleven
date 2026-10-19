package O1;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: ChapterFrame.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f4735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f4736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h[] f4737g;

    public c(String str, int i10, int i11, long j, long j10, h[] hVarArr) {
        super("CHAP");
        this.f4732b = str;
        this.f4733c = i10;
        this.f4734d = i11;
        this.f4735e = j;
        this.f4736f = j10;
        this.f4737g = hVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f4733c == cVar.f4733c && this.f4734d == cVar.f4734d && this.f4735e == cVar.f4735e && this.f4736f == cVar.f4736f && Objects.equals(this.f4732b, cVar.f4732b) && Arrays.equals(this.f4737g, cVar.f4737g);
    }

    public final int hashCode() {
        int i10 = (((((((527 + this.f4733c) * 31) + this.f4734d) * 31) + ((int) this.f4735e)) * 31) + ((int) this.f4736f)) * 31;
        String str = this.f4732b;
        return i10 + (str != null ? str.hashCode() : 0);
    }
}
