package Wa;

import Ia.l;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: FormatterOperation.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class j<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FunctionReferenceImpl f7090a;

    /* JADX WARN: Multi-variable type inference failed */
    public j(l<? super T, String> lVar) {
        this.f7090a = (FunctionReferenceImpl) lVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [Ia.l, kotlin.jvm.internal.FunctionReferenceImpl] */
    @Override // Wa.e
    public final void a(kotlinx.datetime.internal.format.parser.c cVar, StringBuilder sb2, boolean z10) {
        sb2.append((CharSequence) this.f7090a.invoke(cVar));
    }
}
