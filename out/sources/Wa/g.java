package Wa;

import Ia.l;

/* JADX INFO: compiled from: Formatter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class g<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e<T> f7084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<T, Boolean> f7085b;

    public g(e formatter, l lVar) {
        kotlin.jvm.internal.i.e(formatter, "formatter");
        this.f7084a = formatter;
        this.f7085b = lVar;
    }

    @Override // Wa.e
    public final void a(kotlinx.datetime.internal.format.parser.c cVar, StringBuilder sb2, boolean z10) {
        Character ch = (z10 || !this.f7085b.invoke(cVar).booleanValue()) ? '+' : '-';
        sb2.append(ch.charValue());
        this.f7084a.a(cVar, sb2, z10 || ch.charValue() == '-');
    }
}
