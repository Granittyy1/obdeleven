package androidx.compose.ui.text.font;

import A1.C0575j;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.util.List;

/* JADX INFO: compiled from: FontWeight.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Comparable<l> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f15438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f15439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f15440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f15441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f15442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l f15443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f15444i;
    public static final l j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l f15445k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final List<l> f15446l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15447b;

    static {
        l lVar = new l(100);
        l lVar2 = new l(androidx.recyclerview.widget.t.d.DEFAULT_DRAG_ANIMATION_DURATION);
        l lVar3 = new l(CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS);
        l lVar4 = new l(CarouselScreenFragment.CAROUSEL_ANIMATION_MS);
        f15438c = lVar4;
        l lVar5 = new l(500);
        l lVar6 = new l(600);
        f15439d = lVar6;
        l lVar7 = new l(700);
        l lVar8 = new l(800);
        f15440e = lVar8;
        l lVar9 = new l(900);
        f15441f = lVar3;
        f15442g = lVar4;
        f15443h = lVar5;
        f15444i = lVar6;
        j = lVar7;
        f15445k = lVar9;
        f15446l = kotlin.collections.l.s(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9);
    }

    public l(int i10) {
        this.f15447b = i10;
        boolean z10 = false;
        if (1 <= i10 && i10 < 1001) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        Y.a.a("Font weight can be in range [1, 1000]. Current value: " + i10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(l lVar) {
        return kotlin.jvm.internal.i.g(this.f15447b, lVar.f15447b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.f15447b == ((l) obj).f15447b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15447b;
    }

    public final String toString() {
        return C0575j.b(new StringBuilder("FontWeight(weight="), this.f15447b, ')');
    }
}
