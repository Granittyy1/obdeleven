package L;

import A1.C0575j;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import kotlin.jvm.internal.i;
import p211r0.j;

/* JADX INFO: compiled from: XmlVectorParser.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlResourceParser f4376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4377b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z6.a f4378c;

    public a(XmlResourceParser xmlResourceParser) {
        this.f4376a = xmlResourceParser;
        Z6.a aVar = new Z6.a();
        aVar.f7923a = new float[64];
        this.f4378c = aVar;
    }

    public final float a(TypedArray typedArray, String str, int i10, float f10) {
        if (j.e(this.f4376a, str)) {
            f10 = typedArray.getFloat(i10, f10);
        }
        b(typedArray.getChangingConfigurations());
        return f10;
    }

    public final void b(int i10) {
        this.f4377b = i10 | this.f4377b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.f4376a, aVar.f4376a) && this.f4377b == aVar.f4377b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4377b) + (this.f4376a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb2.append(this.f4376a);
        sb2.append(", config=");
        return C0575j.b(sb2, this.f4377b, ')');
    }
}
