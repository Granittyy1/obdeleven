package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: RecyclerView.java */
/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f19512a;

    public J(RecyclerView recyclerView) {
        this.f19512a = recyclerView;
    }

    public final void a(C1436a.C0200a c0200a) {
        int i10 = c0200a.f19813a;
        RecyclerView recyclerView = this.f19512a;
        if (i10 == 1) {
            recyclerView.f19636o.c0(c0200a.f19814b, c0200a.f19816d);
            return;
        }
        if (i10 == 2) {
            recyclerView.f19636o.f0(c0200a.f19814b, c0200a.f19816d);
        } else if (i10 == 4) {
            recyclerView.f19636o.g0(c0200a.f19814b, c0200a.f19816d);
        } else {
            if (i10 != 8) {
                return;
            }
            recyclerView.f19636o.e0(c0200a.f19814b, c0200a.f19816d);
        }
    }

    public final RecyclerView.B b(int i10) {
        RecyclerView recyclerView = this.f19512a;
        int iH = recyclerView.f19629g.h();
        RecyclerView.B b10 = null;
        for (int i11 = 0; i11 < iH; i11++) {
            RecyclerView.B bN = RecyclerView.N(recyclerView.f19629g.g(i11));
            if (bN != null && !bN.isRemoved() && bN.mPosition == i10) {
                if (!recyclerView.f19629g.f19846c.contains(bN.itemView)) {
                    b10 = bN;
                    break;
                }
                b10 = bN;
            }
        }
        if (b10 == null) {
            return null;
        }
        if (!recyclerView.f19629g.f19846c.contains(b10.itemView)) {
            return b10;
        }
        boolean z10 = RecyclerView.f19574R0;
        return null;
    }

    public final void c(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = this.f19512a;
        int iH = recyclerView.f19629g.h();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < iH; i15++) {
            View viewG = recyclerView.f19629g.g(i15);
            RecyclerView.B bN = RecyclerView.N(viewG);
            if (bN != null && !bN.shouldIgnore() && (i13 = bN.mPosition) >= i10 && i13 < i14) {
                bN.addFlags(2);
                bN.addChangePayload(obj);
                ((RecyclerView.m) viewG.getLayoutParams()).f19703c = true;
            }
        }
        RecyclerView.s sVar = recyclerView.f19626d;
        ArrayList<RecyclerView.B> arrayList = sVar.f19714c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RecyclerView.B b10 = arrayList.get(size);
            if (b10 != null && (i12 = b10.mPosition) >= i10 && i12 < i14) {
                b10.addFlags(2);
                sVar.g(size);
            }
        }
        recyclerView.f19589C0 = true;
    }

    public final void d(int i10, int i11) {
        RecyclerView recyclerView = this.f19512a;
        int iH = recyclerView.f19629g.h();
        for (int i12 = 0; i12 < iH; i12++) {
            RecyclerView.B bN = RecyclerView.N(recyclerView.f19629g.g(i12));
            if (bN != null && !bN.shouldIgnore() && bN.mPosition >= i10) {
                if (RecyclerView.f19575S0) {
                    bN.toString();
                }
                bN.offsetPosition(i11, false);
                recyclerView.f19655y0.f19741f = true;
            }
        }
        ArrayList<RecyclerView.B> arrayList = recyclerView.f19626d.f19714c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView.B b10 = arrayList.get(i13);
            if (b10 != null && b10.mPosition >= i10) {
                if (RecyclerView.f19575S0) {
                    b10.toString();
                }
                b10.offsetPosition(i11, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f19587B0 = true;
    }

    public final void e(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = this.f19512a;
        int iH = recyclerView.f19629g.h();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < iH; i20++) {
            RecyclerView.B bN = RecyclerView.N(recyclerView.f19629g.g(i20));
            if (bN != null && (i18 = bN.mPosition) >= i13 && i18 <= i12) {
                if (RecyclerView.f19575S0) {
                    bN.toString();
                }
                if (bN.mPosition == i10) {
                    bN.offsetPosition(i11 - i10, false);
                } else {
                    bN.offsetPosition(i14, false);
                }
                recyclerView.f19655y0.f19741f = true;
            }
        }
        RecyclerView.s sVar = recyclerView.f19626d;
        sVar.getClass();
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        ArrayList<RecyclerView.B> arrayList = sVar.f19714c;
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            RecyclerView.B b10 = arrayList.get(i21);
            if (b10 != null && (i17 = b10.mPosition) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    b10.offsetPosition(i11 - i10, false);
                } else {
                    b10.offsetPosition(i19, false);
                }
                if (RecyclerView.f19575S0) {
                    b10.toString();
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f19587B0 = true;
    }
}
