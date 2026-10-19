package p164n3;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.a;
import p104i3.b;
import p104i3.g;
import p154m3.c;
import p154m3.e;

/* JADX INFO: compiled from: GradientFill.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GradientType f44831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path.FillType f44832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f44833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p154m3.d f44834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f44835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f44836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f44837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f44838h;

    public d(String str, GradientType gradientType, Path.FillType fillType, c cVar, p154m3.d dVar, e eVar, e eVar2, boolean z10) {
        this.f44831a = gradientType;
        this.f44832b = fillType;
        this.f44833c = cVar;
        this.f44834d = dVar;
        this.f44835e = eVar;
        this.f44836f = eVar2;
        this.f44837g = str;
        this.f44838h = z10;
    }

    @Override // p164n3.b
    public final b a(LottieDrawable lottieDrawable, p079g3.b bVar, a aVar) {
        return new g(lottieDrawable, bVar, aVar, this);
    }
}
