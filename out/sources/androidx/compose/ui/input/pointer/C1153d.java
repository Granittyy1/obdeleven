package androidx.compose.ui.input.pointer;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1153d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14072c;

    public C1153d(long j, long j10, long j11) {
        this.f14070a = j;
        this.f14071b = j10;
        this.f14072c = j11;
    }

    public final String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f14070a + ", position=" + ((Object) I.d.i(this.f14071b)) + ')';
    }
}
