package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.layout.InterfaceC1160f;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.InterfaceC1198t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsModifierNode extends androidx.compose.ui.h.c implements androidx.compose.ui.modifier.e, InterfaceC1160f, InterfaceC1198t {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f10602t = new a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public InterfaceC0976k f10603p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C0973h f10604q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f10605r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Orientation f10606s;

    /* JADX INFO: compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    public static final class a implements InterfaceC1160f.a {
        @Override // androidx.compose.ui.layout.InterfaceC1160f.a
        public final boolean a() {
            return false;
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final androidx.compose.ui.layout.F B(androidx.compose.ui.layout.H h8, androidx.compose.ui.layout.D d10, long j) {
        final androidx.compose.ui.layout.Y yQ = d10.Q(j);
        return h8.y1(yQ.f14220b, yQ.f14221c, kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierNode$measure$1
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar) {
                aVar.d(yQ, 0, 0, 0.0f);
                return p293xa.r.f47939a;
            }
        });
    }

    @Override // androidx.compose.ui.modifier.e
    public final C.g N0() {
        Pair pair = new Pair(BeyondBoundsLayoutKt.f14170a, this);
        androidx.compose.ui.modifier.i iVar = new androidx.compose.ui.modifier.i((androidx.compose.ui.modifier.c) pair.c());
        androidx.compose.ui.modifier.c<?> cVar = (androidx.compose.ui.modifier.c) pair.c();
        Object objD = pair.d();
        if (cVar != iVar.f14303c) {
            R.a.b("Check failed.");
        }
        iVar.f14304d.setValue(objD);
        return iVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    public final boolean Q1(C0973h.a aVar, int i10) {
        boolean z10;
        if (!(InterfaceC1160f.b.a(i10, 5) ? true : InterfaceC1160f.b.a(i10, 6))) {
            if (!(InterfaceC1160f.b.a(i10, 3) ? true : InterfaceC1160f.b.a(i10, 4))) {
                if (!(InterfaceC1160f.b.a(i10, 1) ? true : InterfaceC1160f.b.a(i10, 2))) {
                    throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
                }
            } else if (this.f10606s == Orientation.f9957b) {
                z10 = true;
            }
            z10 = false;
        } else if (this.f10606s == Orientation.f9958c) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return false;
        }
        if (R1(i10)) {
            if (aVar.f10722b < this.f10603p.b() - 1) {
                return true;
            }
        } else if (aVar.f10721a > 0) {
            return true;
        }
        return false;
    }

    public final boolean R1(int i10) {
        if (!InterfaceC1160f.b.a(i10, 1)) {
            if (InterfaceC1160f.b.a(i10, 2)) {
                return true;
            }
            if (InterfaceC1160f.b.a(i10, 5)) {
                return this.f10605r;
            }
            if (InterfaceC1160f.b.a(i10, 6)) {
                if (!this.f10605r) {
                    return true;
                }
            } else if (InterfaceC1160f.b.a(i10, 3)) {
                int iOrdinal = C1185f.f(this).f14383A.ordinal();
                if (iOrdinal == 0) {
                    return this.f10605r;
                }
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!this.f10605r) {
                    return true;
                }
            } else {
                if (!InterfaceC1160f.b.a(i10, 4)) {
                    throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
                }
                int iOrdinal2 = C1185f.f(this).f14383A.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        return this.f10605r;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (!this.f10605r) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, androidx.compose.foundation.lazy.layout.h$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, androidx.compose.foundation.lazy.layout.h$a, java.lang.Object] */
    @Override // androidx.compose.ui.layout.InterfaceC1160f
    public final Object r0(Ia.l lVar, int i10) {
        if (this.f10603p.b() <= 0 || !this.f10603p.e() || !this.f13997o) {
            return lVar.invoke(f10602t);
        }
        int iC = R1(i10) ? this.f10603p.c() : this.f10603p.f();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        C0973h c0973h = this.f10604q;
        c0973h.getClass();
        ?? aVar = new C0973h.a(iC, iC);
        c0973h.f10720a.b(aVar);
        ref$ObjectRef.element = aVar;
        int iD = this.f10603p.d() * 2;
        int iB = this.f10603p.b();
        if (iD > iB) {
            iD = iB;
        }
        Object objInvoke = null;
        int i11 = 0;
        while (objInvoke == null && Q1((C0973h.a) ref$ObjectRef.element, i10) && i11 < iD) {
            C0973h.a aVar2 = (C0973h.a) ref$ObjectRef.element;
            int i12 = aVar2.f10721a;
            boolean zR1 = R1(i10);
            int i13 = aVar2.f10722b;
            if (zR1) {
                i13++;
            } else {
                i12--;
            }
            C0973h c0973h2 = this.f10604q;
            c0973h2.getClass();
            ?? aVar3 = new C0973h.a(i12, i13);
            c0973h2.f10720a.b(aVar3);
            this.f10604q.f10720a.m((C0973h.a) ref$ObjectRef.element);
            ref$ObjectRef.element = aVar3;
            i11++;
            C1185f.f(this).j();
            objInvoke = lVar.invoke(new C0975j(this, ref$ObjectRef, i10));
        }
        this.f10604q.f10720a.m((C0973h.a) ref$ObjectRef.element);
        C1185f.f(this).j();
        return objInvoke;
    }
}
