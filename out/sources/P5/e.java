package P5;

import C.g;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: compiled from: TextAppearance.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f4947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextPaint f4948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f4949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f4950f;

    public e(d dVar, Context context, TextPaint textPaint, g gVar) {
        this.f4950f = dVar;
        this.f4947c = context;
        this.f4948d = textPaint;
        this.f4949e = gVar;
    }

    @Override // C.g
    public final void Z(int i10) {
        this.f4949e.Z(i10);
    }

    @Override // C.g
    public final void a0(Typeface typeface, boolean z10) {
        this.f4950f.g(this.f4947c, this.f4948d, typeface);
        this.f4949e.a0(typeface, z10);
    }
}
