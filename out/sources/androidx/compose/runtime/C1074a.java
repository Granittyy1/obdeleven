package androidx.compose.runtime;

/* JADX INFO: renamed from: androidx.compose.runtime.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1074a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12935a;

    public C1074a(int i10) {
        this.f12935a = i10;
    }

    public final boolean a() {
        return this.f12935a != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{ location = ");
        return p005a4.q.c(sb2, this.f12935a, " }");
    }
}
