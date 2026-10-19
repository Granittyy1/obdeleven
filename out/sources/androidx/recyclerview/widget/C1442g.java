package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.recyclerview.widget.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ChildHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1442g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f19844a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f19848e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19847d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f19845b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f19846c = new ArrayList();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.g$a */
    /* JADX INFO: compiled from: ChildHelper.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f19849a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f19850b;

        public final void a(int i10) {
            if (i10 < 64) {
                this.f19849a &= ~(1 << i10);
                return;
            }
            a aVar = this.f19850b;
            if (aVar != null) {
                aVar.a(i10 - 64);
            }
        }

        public final int b(int i10) {
            a aVar = this.f19850b;
            if (aVar == null) {
                return i10 >= 64 ? Long.bitCount(this.f19849a) : Long.bitCount(this.f19849a & ((1 << i10) - 1));
            }
            if (i10 < 64) {
                return Long.bitCount(this.f19849a & ((1 << i10) - 1));
            }
            return Long.bitCount(this.f19849a) + aVar.b(i10 - 64);
        }

        public final void c() {
            if (this.f19850b == null) {
                this.f19850b = new a();
            }
        }

        public final boolean d(int i10) {
            if (i10 < 64) {
                return (this.f19849a & (1 << i10)) != 0;
            }
            c();
            return this.f19850b.d(i10 - 64);
        }

        public final void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f19850b.e(i10 - 64, z10);
                return;
            }
            long j = this.f19849a;
            boolean z11 = (Long.MIN_VALUE & j) != 0;
            long j10 = (1 << i10) - 1;
            this.f19849a = ((j & (~j10)) << 1) | (j & j10);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f19850b != null) {
                c();
                this.f19850b.e(0, z11);
            }
        }

        public final boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f19850b.f(i10 - 64);
            }
            long j = 1 << i10;
            long j10 = this.f19849a;
            boolean z10 = (j10 & j) != 0;
            long j11 = j10 & (~j);
            this.f19849a = j11;
            long j12 = j - 1;
            this.f19849a = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
            a aVar = this.f19850b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f19850b.f(0);
            }
            return z10;
        }

        public final void g() {
            this.f19849a = 0L;
            a aVar = this.f19850b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public final void h(int i10) {
            if (i10 < 64) {
                this.f19849a |= 1 << i10;
            } else {
                c();
                this.f19850b.h(i10 - 64);
            }
        }

        public final String toString() {
            if (this.f19850b == null) {
                return Long.toBinaryString(this.f19849a);
            }
            return this.f19850b.toString() + "xx" + Long.toBinaryString(this.f19849a);
        }
    }

    public C1442g(I i10) {
        this.f19844a = i10;
    }

    public final void a(View view, int i10, boolean z10) {
        RecyclerView recyclerView = this.f19844a.f19511a;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : f(i10);
        this.f19845b.e(childCount, z10);
        if (z10) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.B bN = RecyclerView.N(view);
        RecyclerView.Adapter adapter = recyclerView.f19635n;
        if (adapter != null && bN != null) {
            adapter.onViewAttachedToWindow(bN);
        }
        ArrayList arrayList = recyclerView.f19592E;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((RecyclerView.n) recyclerView.f19592E.get(size)).getClass();
            }
        }
    }

    public final void b(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        RecyclerView recyclerView = this.f19844a.f19511a;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : f(i10);
        this.f19845b.e(childCount, z10);
        if (z10) {
            i(view);
        }
        RecyclerView.B bN = RecyclerView.N(view);
        if (bN != null) {
            if (!bN.isTmpDetached() && !bN.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called attach on a child which is not detached: ");
                sb2.append(bN);
                throw new IllegalArgumentException(androidx.compose.animation.k.a(recyclerView, sb2));
            }
            if (RecyclerView.f19575S0) {
                bN.toString();
            }
            bN.clearTmpDetachFlag();
        } else if (RecyclerView.f19574R0) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            sb3.append(", index: ");
            sb3.append(childCount);
            throw new IllegalArgumentException(androidx.compose.animation.k.a(recyclerView, sb3));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i10) {
        int iF = f(i10);
        this.f19845b.f(iF);
        RecyclerView recyclerView = this.f19844a.f19511a;
        View childAt = recyclerView.getChildAt(iF);
        if (childAt != null) {
            RecyclerView.B bN = RecyclerView.N(childAt);
            if (bN != null) {
                if (bN.isTmpDetached() && !bN.shouldIgnore()) {
                    StringBuilder sb2 = new StringBuilder("called detach on an already detached child ");
                    sb2.append(bN);
                    throw new IllegalArgumentException(androidx.compose.animation.k.a(recyclerView, sb2));
                }
                if (RecyclerView.f19575S0) {
                    bN.toString();
                }
                bN.addFlags(256);
            }
        } else if (RecyclerView.f19574R0) {
            StringBuilder sb3 = new StringBuilder("No view at offset ");
            sb3.append(iF);
            throw new IllegalArgumentException(androidx.compose.animation.k.a(recyclerView, sb3));
        }
        recyclerView.detachViewFromParent(iF);
    }

    public final View d(int i10) {
        return this.f19844a.f19511a.getChildAt(f(i10));
    }

    public final int e() {
        return this.f19844a.f19511a.getChildCount() - this.f19846c.size();
    }

    public final int f(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int childCount = this.f19844a.f19511a.getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            a aVar = this.f19845b;
            int iB = i10 - (i11 - aVar.b(i11));
            if (iB == 0) {
                while (aVar.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iB;
        }
        return -1;
    }

    public final View g(int i10) {
        return this.f19844a.f19511a.getChildAt(i10);
    }

    public final int h() {
        return this.f19844a.f19511a.getChildCount();
    }

    public final void i(View view) {
        this.f19846c.add(view);
        I i10 = this.f19844a;
        RecyclerView.B bN = RecyclerView.N(view);
        if (bN != null) {
            bN.onEnteredHiddenState(i10.f19511a);
        }
    }

    public final void j(View view) {
        if (this.f19846c.remove(view)) {
            I i10 = this.f19844a;
            RecyclerView.B bN = RecyclerView.N(view);
            if (bN != null) {
                bN.onLeftHiddenState(i10.f19511a);
            }
        }
    }

    public final String toString() {
        return this.f19845b.toString() + ", hidden list:" + this.f19846c.size();
    }
}
