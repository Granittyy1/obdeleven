package D2;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: TransitionSet.java */
/* JADX INFO: loaded from: classes.dex */
public class L extends F {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ArrayList<F> f2540E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f2541F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f2542G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f2543H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f2544I;

    /* JADX INFO: compiled from: TransitionSet.java */
    public class a extends J {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ F f2545b;

        public a(F f10) {
            this.f2545b = f10;
        }

        @Override // D2.F.e
        public final void e(F f10) {
            this.f2545b.F();
            f10.B(this);
        }
    }

    /* JADX INFO: compiled from: TransitionSet.java */
    public static class b extends J {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public L f2546b;

        @Override // D2.J, D2.F.e
        public final void d(F f10) {
            L l10 = this.f2546b;
            if (l10.f2543H) {
                return;
            }
            l10.M();
            l10.f2543H = true;
        }

        @Override // D2.F.e
        public final void e(F f10) {
            L l10 = this.f2546b;
            int i10 = l10.f2542G - 1;
            l10.f2542G = i10;
            if (i10 == 0) {
                l10.f2543H = false;
                l10.q();
            }
            f10.B(this);
        }
    }

    public L() {
        this.f2540E = new ArrayList<>();
        this.f2541F = true;
        this.f2543H = false;
        this.f2544I = 0;
    }

    @Override // D2.F
    public final void A(ViewGroup viewGroup) {
        super.A(viewGroup);
        int size = this.f2540E.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f2540E.get(i10).A(viewGroup);
        }
    }

    @Override // D2.F
    public final void D(View view) {
        for (int i10 = 0; i10 < this.f2540E.size(); i10++) {
            this.f2540E.get(i10).D(view);
        }
        this.f2503g.remove(view);
    }

    @Override // D2.F
    public final void E(View view) {
        super.E(view);
        int size = this.f2540E.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f2540E.get(i10).E(view);
        }
    }

    @Override // D2.F
    public final void F() {
        if (this.f2540E.isEmpty()) {
            M();
            q();
            return;
        }
        b bVar = new b();
        bVar.f2546b = this;
        Iterator<F> it = this.f2540E.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.f2542G = this.f2540E.size();
        if (this.f2541F) {
            Iterator<F> it2 = this.f2540E.iterator();
            while (it2.hasNext()) {
                it2.next().F();
            }
            return;
        }
        for (int i10 = 1; i10 < this.f2540E.size(); i10++) {
            this.f2540E.get(i10 - 1).a(new a(this.f2540E.get(i10)));
        }
        F f10 = this.f2540E.get(0);
        if (f10 != null) {
            f10.F();
        }
    }

    @Override // D2.F
    public final void G(long j) {
        ArrayList<F> arrayList;
        this.f2500d = j;
        if (j < 0 || (arrayList = this.f2540E) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f2540E.get(i10).G(j);
        }
    }

    @Override // D2.F
    public final void H(F.d dVar) {
        this.f2521z = dVar;
        this.f2544I |= 8;
        int size = this.f2540E.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f2540E.get(i10).H(dVar);
        }
    }

    @Override // D2.F
    public final void I(TimeInterpolator timeInterpolator) {
        this.f2544I |= 1;
        ArrayList<F> arrayList = this.f2540E;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f2540E.get(i10).I(timeInterpolator);
            }
        }
        this.f2501e = timeInterpolator;
    }

    @Override // D2.F
    public final void J(AbstractC0697y abstractC0697y) {
        super.J(abstractC0697y);
        this.f2544I |= 4;
        if (this.f2540E != null) {
            for (int i10 = 0; i10 < this.f2540E.size(); i10++) {
                this.f2540E.get(i10).J(abstractC0697y);
            }
        }
    }

    @Override // D2.F
    public final void K(f0 f0Var) {
        this.f2520y = f0Var;
        this.f2544I |= 2;
        int size = this.f2540E.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f2540E.get(i10).K(f0Var);
        }
    }

    @Override // D2.F
    public final void L(long j) {
        this.f2499c = j;
    }

    @Override // D2.F
    public final String N(String str) {
        String strN = super.N(str);
        for (int i10 = 0; i10 < this.f2540E.size(); i10++) {
            StringBuilder sbF = C4.b.f(strN, "\n");
            sbF.append(this.f2540E.get(i10).N(str + "  "));
            strN = sbF.toString();
        }
        return strN;
    }

    public final void O(F f10) {
        this.f2540E.add(f10);
        f10.f2510o = this;
        long j = this.f2500d;
        if (j >= 0) {
            f10.G(j);
        }
        if ((this.f2544I & 1) != 0) {
            f10.I(this.f2501e);
        }
        if ((this.f2544I & 2) != 0) {
            f10.K(this.f2520y);
        }
        if ((this.f2544I & 4) != 0) {
            f10.J(this.f2497A);
        }
        if ((this.f2544I & 8) != 0) {
            f10.H(this.f2521z);
        }
    }

    public final void P(int i10) {
        if (i10 == 0) {
            this.f2541F = true;
        } else {
            if (i10 != 1) {
                throw new AndroidRuntimeException(J4.i.b(i10, "Invalid parameter for TransitionSet ordering: "));
            }
            this.f2541F = false;
        }
    }

    @Override // D2.F
    public final void b(int i10) {
        for (int i11 = 0; i11 < this.f2540E.size(); i11++) {
            this.f2540E.get(i11).b(i10);
        }
        super.b(i10);
    }

    @Override // D2.F
    public final void c(View view) {
        for (int i10 = 0; i10 < this.f2540E.size(); i10++) {
            this.f2540E.get(i10).c(view);
        }
        this.f2503g.add(view);
    }

    @Override // D2.F
    public final void d(Class cls) {
        for (int i10 = 0; i10 < this.f2540E.size(); i10++) {
            this.f2540E.get(i10).d(cls);
        }
        super.d(cls);
    }

    @Override // D2.F
    public final void e(String str) {
        for (int i10 = 0; i10 < this.f2540E.size(); i10++) {
            this.f2540E.get(i10).e(str);
        }
        super.e(str);
    }

    @Override // D2.F
    public final void g(O o10) {
        if (z(o10.f2554b)) {
            for (F f10 : this.f2540E) {
                if (f10.z(o10.f2554b)) {
                    f10.g(o10);
                    o10.f2555c.add(f10);
                }
            }
        }
    }

    @Override // D2.F
    public final void i(O o10) {
        super.i(o10);
        int size = this.f2540E.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f2540E.get(i10).i(o10);
        }
    }

    @Override // D2.F
    public final void j(O o10) {
        if (z(o10.f2554b)) {
            for (F f10 : this.f2540E) {
                if (f10.z(o10.f2554b)) {
                    f10.j(o10);
                    o10.f2555c.add(f10);
                }
            }
        }
    }

    @Override // D2.F
    /* JADX INFO: renamed from: n */
    public final F clone() {
        L l10 = (L) super.clone();
        l10.f2540E = new ArrayList<>();
        int size = this.f2540E.size();
        for (int i10 = 0; i10 < size; i10++) {
            F fClone = this.f2540E.get(i10).clone();
            l10.f2540E.add(fClone);
            fClone.f2510o = l10;
        }
        return l10;
    }

    @Override // D2.F
    public final void p(ViewGroup viewGroup, P p10, P p11, ArrayList<O> arrayList, ArrayList<O> arrayList2) {
        long j = this.f2499c;
        int size = this.f2540E.size();
        for (int i10 = 0; i10 < size; i10++) {
            F f10 = this.f2540E.get(i10);
            if (j > 0 && (this.f2541F || i10 == 0)) {
                long j10 = f10.f2499c;
                if (j10 > 0) {
                    f10.L(j10 + j);
                } else {
                    f10.L(j);
                }
            }
            f10.p(viewGroup, p10, p11, arrayList, arrayList2);
        }
    }

    @Override // D2.F
    public final void r(int i10) {
        for (int i11 = 0; i11 < this.f2540E.size(); i11++) {
            this.f2540E.get(i11).r(i10);
        }
        super.r(i10);
    }

    @Override // D2.F
    public final void s(Class cls) {
        for (int i10 = 0; i10 < this.f2540E.size(); i10++) {
            this.f2540E.get(i10).s(cls);
        }
        super.s(cls);
    }

    @Override // D2.F
    public final void t(String str) {
        for (int i10 = 0; i10 < this.f2540E.size(); i10++) {
            this.f2540E.get(i10).t(str);
        }
        super.t(str);
    }

    public L(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2540E = new ArrayList<>();
        this.f2541F = true;
        this.f2543H = false;
        this.f2544I = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, E.f2492h);
        P(p211r0.j.c(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }
}
