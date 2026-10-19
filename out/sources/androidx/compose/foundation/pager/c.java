package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.Y;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: MeasuredPage.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Y> f10960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f10962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.compose.ui.d.b f10963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.compose.ui.d.c f10964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LayoutDirection f10965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f10966i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f10967k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int[] f10968l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10969m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10970n;

    public c() {
        throw null;
    }

    public c(int i10, int i11, List list, long j, Object obj, Orientation orientation, androidx.compose.ui.d.b bVar, androidx.compose.ui.d.c cVar, LayoutDirection layoutDirection, boolean z10) {
        this.f10958a = i10;
        this.f10959b = i11;
        this.f10960c = list;
        this.f10961d = j;
        this.f10962e = obj;
        this.f10963f = bVar;
        this.f10964g = cVar;
        this.f10965h = layoutDirection;
        this.f10966i = z10;
        this.j = orientation == Orientation.f9957b;
        int size = list.size();
        int iMax = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Y y10 = (Y) list.get(i12);
            iMax = Math.max(iMax, !this.j ? y10.f14221c : y10.f14220b);
        }
        this.f10967k = iMax;
        this.f10968l = new int[this.f10960c.size() * 2];
        this.f10970n = Integer.MIN_VALUE;
    }

    public final void a(int i10) {
        this.f10969m += i10;
        int[] iArr = this.f10968l;
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            boolean z10 = this.j;
            if ((z10 && i11 % 2 == 1) || (!z10 && i11 % 2 == 0)) {
                iArr[i11] = iArr[i11] + i10;
            }
        }
    }

    public final void b(int i10, int i11, int i12) {
        int i13;
        this.f10969m = i10;
        boolean z10 = this.j;
        this.f10970n = z10 ? i12 : i11;
        List<Y> list = this.f10960c;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            Y y10 = list.get(i14);
            int i15 = i14 * 2;
            int[] iArr = this.f10968l;
            if (z10) {
                androidx.compose.ui.d.b bVar = this.f10963f;
                if (bVar == null) {
                    p245u.c.b("null horizontalAlignment");
                    throw new KotlinNothingValueException();
                }
                iArr[i15] = bVar.a(y10.f14220b, i11, this.f10965h);
                iArr[i15 + 1] = i10;
                i13 = y10.f14221c;
            } else {
                iArr[i15] = i10;
                int i16 = i15 + 1;
                androidx.compose.ui.d.c cVar = this.f10964g;
                if (cVar == null) {
                    p245u.c.b("null verticalAlignment");
                    throw new KotlinNothingValueException();
                }
                iArr[i16] = cVar.a(y10.f14221c, i12);
                i13 = y10.f14220b;
            }
            i10 += i13;
        }
    }

    @Override // androidx.compose.foundation.pager.d
    public final int getIndex() {
        return this.f10958a;
    }

    @Override // androidx.compose.foundation.pager.d
    public final int getOffset() {
        return this.f10969m;
    }
}
