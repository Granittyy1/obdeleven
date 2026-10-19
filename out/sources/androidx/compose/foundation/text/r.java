package androidx.compose.foundation.text;

import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;

/* JADX INFO: compiled from: TextDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1260a f11520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.ui.text.F f11521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p013b0.c f11526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.compose.ui.text.font.d.a f11527h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<C1260a.c<androidx.compose.ui.text.p>> f11528i;
    public MultiParagraphIntrinsics j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LayoutDirection f11529k;

    public r(C1260a c1260a, androidx.compose.ui.text.F f10, int i10, int i11, boolean z10, int i12, p013b0.c cVar, androidx.compose.ui.text.font.d.a aVar, List list) {
        this.f11520a = c1260a;
        this.f11521b = f10;
        this.f11522c = i10;
        this.f11523d = i11;
        this.f11524e = z10;
        this.f11525f = i12;
        this.f11526g = cVar;
        this.f11527h = aVar;
        this.f11528i = list;
        if (i10 <= 0) {
            p245u.c.a("no maxLines");
        }
        if (i11 <= 0) {
            p245u.c.a("no minLines");
        }
        if (i11 <= i10) {
            return;
        }
        p245u.c.a("minLines greater than maxLines");
    }

    public final void a(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.j;
        if (multiParagraphIntrinsics == null || layoutDirection != this.f11529k || multiParagraphIntrinsics.a()) {
            this.f11529k = layoutDirection;
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(this.f11520a, androidx.compose.ui.text.G.b(this.f11521b, layoutDirection), this.f11528i, this.f11526g, this.f11527h);
        }
        this.j = multiParagraphIntrinsics;
    }
}
