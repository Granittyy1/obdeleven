package androidx.recyclerview.widget;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: androidx.recyclerview.widget.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: GapWorker.java */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1453s implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ThreadLocal<RunnableC1453s> f19973f = new ThreadLocal<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f19974g = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f19976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f19977d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<RecyclerView> f19975b = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<c> f19978e = new ArrayList<>();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.s$a */
    /* JADX INFO: compiled from: GapWorker.java */
    public class a implements Comparator<c> {
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
        
            if (r0 == null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
        
            if (r0 != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
        
            return 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        
            return -1;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int compare(androidx.recyclerview.widget.RunnableC1453s.c r7, androidx.recyclerview.widget.RunnableC1453s.c r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.s$c r7 = (androidx.recyclerview.widget.RunnableC1453s.c) r7
                androidx.recyclerview.widget.s$c r8 = (androidx.recyclerview.widget.RunnableC1453s.c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f19986d
                r1 = 0
                r2 = 1
                if (r0 != 0) goto Lc
                r3 = r2
                goto Ld
            Lc:
                r3 = r1
            Ld:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f19986d
                if (r4 != 0) goto L13
                r4 = r2
                goto L14
            L13:
                r4 = r1
            L14:
                r5 = -1
                if (r3 == r4) goto L1d
                if (r0 != 0) goto L1b
            L19:
                r1 = r2
                goto L37
            L1b:
                r1 = r5
                goto L37
            L1d:
                boolean r0 = r7.f19983a
                boolean r3 = r8.f19983a
                if (r0 == r3) goto L26
                if (r0 == 0) goto L19
                goto L1b
            L26:
                int r0 = r8.f19984b
                int r2 = r7.f19984b
                int r0 = r0 - r2
                if (r0 == 0) goto L2f
                r1 = r0
                goto L37
            L2f:
                int r7 = r7.f19985c
                int r8 = r8.f19985c
                int r7 = r7 - r8
                if (r7 == 0) goto L37
                r1 = r7
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RunnableC1453s.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.s$b */
    /* JADX INFO: compiled from: GapWorker.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19980b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int[] f19981c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f19982d;

        public final void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i12 = this.f19982d;
            int i13 = i12 * 2;
            int[] iArr = this.f19981c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f19981c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i13 >= iArr.length) {
                int[] iArr3 = new int[i12 * 4];
                this.f19981c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f19981c;
            iArr4[i13] = i10;
            iArr4[i13 + 1] = i11;
            this.f19982d++;
        }

        public final void b(RecyclerView recyclerView, boolean z10) {
            this.f19982d = 0;
            int[] iArr = this.f19981c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.l lVar = recyclerView.f19636o;
            if (recyclerView.f19635n == null || lVar == null || !lVar.f19689i) {
                return;
            }
            if (z10) {
                if (!recyclerView.f19628f.g()) {
                    lVar.k(recyclerView.f19635n.getItemCount(), this);
                }
            } else if (!recyclerView.Q()) {
                lVar.j(this.f19979a, this.f19980b, recyclerView.f19655y0, this);
            }
            int i10 = this.f19982d;
            if (i10 > lVar.j) {
                lVar.j = i10;
                lVar.f19690k = z10;
                recyclerView.f19626d.m();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.s$c */
    /* JADX INFO: compiled from: GapWorker.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f19983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19985c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RecyclerView f19986d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f19987e;
    }

    public static RecyclerView.B c(RecyclerView recyclerView, int i10, long j) {
        int iH = recyclerView.f19629g.h();
        for (int i11 = 0; i11 < iH; i11++) {
            RecyclerView.B bN = RecyclerView.N(recyclerView.f19629g.g(i11));
            if (bN.mPosition == i10 && !bN.isInvalid()) {
                return null;
            }
        }
        RecyclerView.s sVar = recyclerView.f19626d;
        try {
            recyclerView.V();
            RecyclerView.B bK = sVar.k(i10, j);
            if (bK != null) {
                if (!bK.isBound() || bK.isInvalid()) {
                    sVar.a(bK, false);
                } else {
                    sVar.h(bK.itemView);
                }
            }
            return bK;
        } finally {
            recyclerView.W(false);
        }
    }

    public final void a(int i10, int i11, RecyclerView recyclerView) {
        if (recyclerView.f19647u) {
            if (RecyclerView.f19574R0 && !this.f19975b.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f19976c == 0) {
                this.f19976c = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        b bVar = recyclerView.f19653x0;
        bVar.f19979a = i10;
        bVar.f19980b = i11;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0135  */
    public final void b(long j) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        ArrayList<RecyclerView> arrayList = this.f19975b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = arrayList.get(i11);
            if (recyclerView3.getWindowVisibility() == 0) {
                b bVar = recyclerView3.f19653x0;
                bVar.b(recyclerView3, false);
                i10 += bVar.f19982d;
            }
        }
        ArrayList<c> arrayList2 = this.f19978e;
        arrayList2.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = arrayList.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar2 = recyclerView4.f19653x0;
                int iAbs = Math.abs(bVar2.f19980b) + Math.abs(bVar2.f19979a);
                for (int i14 = 0; i14 < bVar2.f19982d * 2; i14 += 2) {
                    if (i12 >= arrayList2.size()) {
                        cVar2 = new c();
                        arrayList2.add(cVar2);
                    } else {
                        cVar2 = arrayList2.get(i12);
                    }
                    int[] iArr = bVar2.f19981c;
                    int i15 = iArr[i14 + 1];
                    cVar2.f19983a = i15 <= iAbs;
                    cVar2.f19984b = iAbs;
                    cVar2.f19985c = i15;
                    cVar2.f19986d = recyclerView4;
                    cVar2.f19987e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(arrayList2, f19974g);
        for (int i16 = 0; i16 < arrayList2.size() && (recyclerView = (cVar = arrayList2.get(i16)).f19986d) != null; i16++) {
            RecyclerView.B bC = c(recyclerView, cVar.f19987e, cVar.f19983a ? Long.MAX_VALUE : j);
            if (bC != null && bC.mNestedRecyclerView != null && bC.isBound() && !bC.isInvalid() && (recyclerView2 = bC.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.f19594F && recyclerView2.f19629g.h() != 0) {
                    RecyclerView.i iVar = recyclerView2.f19612O;
                    if (iVar != null) {
                        iVar.j();
                    }
                    RecyclerView.l lVar = recyclerView2.f19636o;
                    RecyclerView.s sVar = recyclerView2.f19626d;
                    if (lVar != null) {
                        lVar.m0(sVar);
                        recyclerView2.f19636o.n0(sVar);
                    }
                    sVar.f19712a.clear();
                    sVar.f();
                }
                b bVar3 = recyclerView2.f19653x0;
                bVar3.b(recyclerView2, true);
                if (bVar3.f19982d != 0) {
                    try {
                        int i17 = p271w0.j.f47686a;
                        Trace.beginSection("RV Nested Prefetch");
                        RecyclerView.x xVar = recyclerView2.f19655y0;
                        RecyclerView.Adapter adapter = recyclerView2.f19635n;
                        xVar.f19739d = 1;
                        xVar.f19740e = adapter.getItemCount();
                        xVar.f19742g = false;
                        xVar.f19743h = false;
                        xVar.f19744i = false;
                        for (int i18 = 0; i18 < bVar3.f19982d * 2; i18 += 2) {
                            c(recyclerView2, bVar3.f19981c[i18], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i19 = p271w0.j.f47686a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            cVar.f19983a = false;
            cVar.f19984b = 0;
            cVar.f19985c = 0;
            cVar.f19986d = null;
            cVar.f19987e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i10 = p271w0.j.f47686a;
            Trace.beginSection("RV Prefetch");
            ArrayList<RecyclerView> arrayList = this.f19975b;
            if (arrayList.isEmpty()) {
                this.f19976c = 0L;
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i11 = 0; i11 < size; i11++) {
                RecyclerView recyclerView = arrayList.get(i11);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.f19976c = 0L;
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f19977d);
                this.f19976c = 0L;
            }
        } finally {
            this.f19976c = 0L;
            int i12 = p271w0.j.f47686a;
            Trace.endSection();
        }
    }
}
