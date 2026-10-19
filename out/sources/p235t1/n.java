package p235t1;

import androidx.media3.exoplayer.source.i;
import com.google.common.collect.ImmutableList;
import java.util.List;
import p078g1.y;
import p114j1.f;
import p259v1.j;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements f, j.h.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f47039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f47040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f47041d;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3) {
        this.f47039b = obj;
        this.f47040c = obj2;
        this.f47041d = obj3;
    }

    @Override // p114j1.f
    public void a(Object obj) {
        i.a aVar = (i.a) this.f47039b;
        ((i) obj).X(aVar.f18703a, aVar.f18704b, (j) this.f47040c, (k) this.f47041d);
    }

    @Override // v1.j.h.a
    public List c(int i10, y yVar, int[] iArr) {
        ImmutableList.b bVar = ImmutableList.f27874c;
        ImmutableList.a aVar = new ImmutableList.a();
        for (int i11 = 0; i11 < yVar.f35491a; i11++) {
            int i12 = i11;
            aVar.c(new j.g(i10, yVar, i12, (j.d) this.f47039b, iArr[i11], (String) this.f47040c, (String) this.f47041d));
        }
        return aVar.h();
    }
}
