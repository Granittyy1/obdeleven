package androidx.compose.ui.text;

import A1.C0575j;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;

/* JADX INFO: compiled from: MultiParagraphIntrinsics.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidParagraphIntrinsics f15589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15591c;

    public k(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i10, int i11) {
        this.f15589a = androidParagraphIntrinsics;
        this.f15590b = i10;
        this.f15591c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f15589a.equals(kVar.f15589a) && this.f15590b == kVar.f15590b && this.f15591c == kVar.f15591c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15591c) + p005a4.q.b(this.f15590b, this.f15589a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb2.append(this.f15589a);
        sb2.append(", startIndex=");
        sb2.append(this.f15590b);
        sb2.append(", endIndex=");
        return C0575j.b(sb2, this.f15591c, ')');
    }
}
