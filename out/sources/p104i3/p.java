package p104i3;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.voltasit.obdeleven.domain.usecases.user.C2126g;
import java.util.ArrayList;
import java.util.List;
import p116j3.a;
import p116j3.m;
import p164n3.k;

/* JADX INFO: compiled from: ShapeContent.java */
/* JADX INFO: loaded from: classes.dex */
public final class p implements k, a.InterfaceC0468a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f36710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LottieDrawable f36711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f36712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f36713e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f36709a = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2126g f36714f = new C2126g();

    public p(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar, k kVar) {
        kVar.getClass();
        this.f36710b = kVar.f44865d;
        this.f36711c = lottieDrawable;
        m mVar = new m((List) kVar.f44864c.f3048c);
        this.f36712d = mVar;
        aVar.d(mVar);
        mVar.a(this);
    }

    @Override // p116j3.a.InterfaceC0468a
    public final void a() {
        this.f36713e = false;
        this.f36711c.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:12:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    /* JADX WARN: Code duplicated, block: B:21:0x003b A[SYNTHETIC] */
    @Override // p104i3.b
    public final void b(List<b> list, List<b> list2) {
        ArrayList arrayList = null;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i10 >= arrayList2.size()) {
                this.f36712d.j = arrayList;
                return;
            }
            b bVar = (b) arrayList2.get(i10);
            if (bVar instanceof s) {
                s sVar = (s) bVar;
                if (sVar.f36719c == ShapeTrimPath.Type.f23429b) {
                    ((ArrayList) this.f36714f.f30991b).add(sVar);
                    sVar.d(this);
                } else if (!(bVar instanceof q)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((q) bVar);
                }
            } else if (!(bVar instanceof q)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((q) bVar);
            }
            i10++;
        }
    }

    @Override // p104i3.k
    public final Path getPath() {
        boolean z10 = this.f36713e;
        Path path = this.f36709a;
        if (z10) {
            return path;
        }
        path.reset();
        if (this.f36710b) {
            this.f36713e = true;
            return path;
        }
        Path pathE = this.f36712d.e();
        if (pathE == null) {
            return path;
        }
        path.set(pathE);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f36714f.c(path);
        this.f36713e = true;
        return path;
    }
}
