package androidx.compose.ui.text.input;

/* JADX INFO: compiled from: ImeOptions.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f15549g = new l(false, 0, true, 1, 1, Z.c.f7671d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Z.c f15555f;

    public l(boolean z10, int i10, boolean z11, int i11, int i12, Z.c cVar) {
        this.f15550a = z10;
        this.f15551b = i10;
        this.f15552c = z11;
        this.f15553d = i11;
        this.f15554e = i12;
        this.f15555f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f15550a == lVar.f15550a && m.a(this.f15551b, lVar.f15551b) && this.f15552c == lVar.f15552c && n.a(this.f15553d, lVar.f15553d) && k.a(this.f15554e, lVar.f15554e) && kotlin.jvm.internal.i.a(null, null) && kotlin.jvm.internal.i.a(this.f15555f, lVar.f15555f);
    }

    public final int hashCode() {
        return this.f15555f.f7672b.hashCode() + p005a4.q.b(this.f15554e, p005a4.q.b(this.f15553d, androidx.compose.animation.D.b(p005a4.q.b(this.f15551b, Boolean.hashCode(this.f15550a) * 31, 31), 31, this.f15552c), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.f15550a + ", capitalization=" + ((Object) m.b(this.f15551b)) + ", autoCorrect=" + this.f15552c + ", keyboardType=" + ((Object) n.b(this.f15553d)) + ", imeAction=" + ((Object) k.b(this.f15554e)) + ", platformImeOptions=null, hintLocales=" + this.f15555f + ')';
    }
}
