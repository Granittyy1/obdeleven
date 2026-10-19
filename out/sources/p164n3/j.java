package p164n3;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;
import java.util.Arrays;
import java.util.List;
import p104i3.b;
import p104i3.c;

/* JADX INFO: compiled from: ShapeGroup.java */
/* JADX INFO: loaded from: classes.dex */
public final class j implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<b> f44860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f44861c;

    public j(String str, List<b> list, boolean z10) {
        this.f44859a = str;
        this.f44860b = list;
        this.f44861c = z10;
    }

    @Override // p164n3.b
    public final b a(LottieDrawable lottieDrawable, p079g3.b bVar, a aVar) {
        return new c(lottieDrawable, aVar, this, bVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f44859a + "' Shapes: " + Arrays.toString(this.f44860b.toArray()) + '}';
    }
}
