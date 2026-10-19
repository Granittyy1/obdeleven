package O1;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: ChapterTocFrame.java */
/* JADX INFO: loaded from: classes.dex */
public final class d extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f4741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h[] f4742f;

    public d(String str, boolean z10, boolean z11, String[] strArr, h[] hVarArr) {
        super("CTOC");
        this.f4738b = str;
        this.f4739c = z10;
        this.f4740d = z11;
        this.f4741e = strArr;
        this.f4742f = hVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f4739c == dVar.f4739c && this.f4740d == dVar.f4740d && Objects.equals(this.f4738b, dVar.f4738b) && Arrays.equals(this.f4741e, dVar.f4741e) && Arrays.equals(this.f4742f, dVar.f4742f);
    }

    public final int hashCode() {
        int i10 = (((527 + (this.f4739c ? 1 : 0)) * 31) + (this.f4740d ? 1 : 0)) * 31;
        String str = this.f4738b;
        return i10 + (str != null ? str.hashCode() : 0);
    }
}
