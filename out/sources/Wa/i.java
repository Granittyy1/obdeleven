package Wa;

/* JADX INFO: compiled from: Formatter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class i<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e<T> f7088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7089b;

    /* JADX WARN: Multi-variable type inference failed */
    public i(e<? super T> eVar, int i10) {
        this.f7088a = eVar;
        this.f7089b = i10;
    }

    @Override // Wa.e
    public final void a(kotlinx.datetime.internal.format.parser.c cVar, StringBuilder sb2, boolean z10) {
        StringBuilder sb3 = new StringBuilder();
        this.f7088a.a(cVar, sb3, z10);
        String string = sb3.toString();
        kotlin.jvm.internal.i.d(string, "let(...)");
        int length = this.f7089b - string.length();
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(' ');
        }
        sb2.append((CharSequence) string);
    }
}
