package androidx.compose.foundation.lazy.layout;

import androidx.collection.C0884l;
import androidx.compose.ui.layout.AbstractC1155a;
import androidx.compose.ui.layout.e0;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LazyLayoutMeasureScope.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0989y implements InterfaceC0988x, androidx.compose.ui.layout.H {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0983s f10742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f10743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0985u f10744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.collection.B<List<androidx.compose.ui.layout.Y>> f10745e;

    public C0989y(C0983s c0983s, e0 e0Var) {
        this.f10742b = c0983s;
        this.f10743c = e0Var;
        this.f10744d = (InterfaceC0985u) ((LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1) c0983s.f10733b).invoke();
        androidx.collection.B b10 = C0884l.f9191a;
        this.f10745e = new androidx.collection.B<>();
    }

    @Override // p013b0.c
    public final long A0(float f10) {
        return this.f10743c.A0(f10);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0988x
    public final List<androidx.compose.ui.layout.Y> I0(int i10, long j) {
        androidx.collection.B<List<androidx.compose.ui.layout.Y>> b10 = this.f10745e;
        List<androidx.compose.ui.layout.Y> listB = b10.b(i10);
        if (listB != null) {
            return listB;
        }
        InterfaceC0985u interfaceC0985u = this.f10744d;
        Object objC = interfaceC0985u.c(i10);
        List<androidx.compose.ui.layout.D> listR0 = this.f10743c.R0(objC, this.f10742b.a(objC, i10, interfaceC0985u.f(i10)));
        int size = listR0.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(listR0.get(i11).Q(j));
        }
        b10.h(i10, arrayList);
        return arrayList;
    }

    @Override // androidx.compose.ui.layout.H
    public final androidx.compose.ui.layout.F L0(int i10, int i11, Map map, Ia.l lVar) {
        return this.f10743c.L0(i10, i11, map, lVar);
    }

    @Override // p013b0.c
    public final float P0() {
        return this.f10743c.P0();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1167m
    public final boolean S0() {
        return this.f10743c.S0();
    }

    @Override // p013b0.c
    public final float T0(float f10) {
        return this.f10743c.T0(f10);
    }

    @Override // p013b0.c
    public final long W(float f10) {
        return this.f10743c.W(f10);
    }

    @Override // p013b0.c
    public final int Z0(long j) {
        return this.f10743c.Z0(j);
    }

    @Override // p013b0.c
    public final float e0(long j) {
        return this.f10743c.e0(j);
    }

    @Override // p013b0.c
    public final int e1(float f10) {
        return this.f10743c.e1(f10);
    }

    @Override // p013b0.c
    public final float getDensity() {
        return this.f10743c.getDensity();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1167m
    public final LayoutDirection getLayoutDirection() {
        return this.f10743c.getLayoutDirection();
    }

    @Override // p013b0.c
    public final long o1(long j) {
        return this.f10743c.o1(j);
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0988x, p013b0.c
    public final long p(long j) {
        return this.f10743c.p(j);
    }

    @Override // p013b0.c
    public final float s1(long j) {
        return this.f10743c.s1(j);
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0988x, p013b0.c
    public final float u(int i10) {
        return this.f10743c.u(i10);
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0988x, p013b0.c
    public final float v(float f10) {
        return this.f10743c.v(f10);
    }

    @Override // p013b0.c
    public final long w0(int i10) {
        return this.f10743c.w0(i10);
    }

    @Override // androidx.compose.ui.layout.H
    public final androidx.compose.ui.layout.F y1(int i10, int i11, Map<AbstractC1155a, Integer> map, Ia.l<? super androidx.compose.ui.layout.Y.a, p293xa.r> lVar) {
        return this.f10743c.y1(i10, i11, map, lVar);
    }
}
