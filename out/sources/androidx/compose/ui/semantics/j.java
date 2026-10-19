package androidx.compose.ui.semantics;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lambda f15204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lambda f15205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15206c;

    /* JADX WARN: Multi-variable type inference failed */
    public j(Ia.a aVar, boolean z10, Ia.a aVar2) {
        this.f15204a = (Lambda) aVar;
        this.f15205b = (Lambda) aVar2;
        this.f15206c = z10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Ia.a<java.lang.Float>, kotlin.jvm.internal.Lambda] */
    public final Ia.a<Float> a() {
        return this.f15205b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r1v6, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScrollAxisRange(value=");
        sb2.append(((Number) this.f15204a.invoke()).floatValue());
        sb2.append(", maxValue=");
        sb2.append(((Number) this.f15205b.invoke()).floatValue());
        sb2.append(", reverseScrolling=");
        return Z3.o.d(sb2, this.f15206c, ')');
    }
}
