package androidx.compose.ui.text.style;

import java.util.ArrayList;

/* JADX INFO: compiled from: TextDecoration.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f15670b = new h(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f15671c = new h(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f15672d = new h(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15673a;

    public h(int i10) {
        this.f15673a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return this.f15673a == ((h) obj).f15673a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15673a;
    }

    public final String toString() {
        int i10 = this.f15673a;
        if (i10 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return B7.b.g(new StringBuilder("TextDecoration["), p039d0.a.b(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
