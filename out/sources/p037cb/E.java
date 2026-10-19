package p037cb;

import java.util.Arrays;
import kotlin.jvm.internal.i;
import p011ab.e;

/* JADX INFO: compiled from: InlineClassDescriptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class E extends C1536l0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f22543l;

    public E(String str, F f10) {
        super(str, f10, 1);
        this.f22543l = true;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, xa.g] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, xa.g] */
    @Override // p037cb.C1536l0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof E) {
            e eVar = (e) obj;
            if (this.f22626a.equals(eVar.a())) {
                E e10 = (E) obj;
                if (e10.f22543l && Arrays.equals((e[]) this.j.getValue(), (e[]) e10.j.getValue())) {
                    int iF = eVar.f();
                    int i10 = this.f22628c;
                    if (i10 == iF) {
                        for (int i11 = 0; i11 < i10; i11++) {
                            if (i.a(i(i11).a(), eVar.i(i11).a()) && i.a(i(i11).e(), eVar.i(i11).e())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p037cb.C1536l0
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // p037cb.C1536l0, p011ab.e
    public final boolean isInline() {
        return this.f22543l;
    }
}
