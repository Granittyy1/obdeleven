package p104i3;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;
import p116j3.a;
import p116j3.d;

/* JADX INFO: compiled from: TrimPathContent.java */
/* JADX INFO: loaded from: classes.dex */
public final class s implements b, a.InterfaceC0468a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f36718b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ShapeTrimPath.Type f36719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f36720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f36721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f36722f;

    public s(com.airbnb.lottie.model.layer.a aVar, ShapeTrimPath shapeTrimPath) {
        shapeTrimPath.getClass();
        this.f36717a = shapeTrimPath.f23428e;
        this.f36719c = shapeTrimPath.f23424a;
        a<Float, Float> aVarA = shapeTrimPath.f23425b.a();
        this.f36720d = (d) aVarA;
        a<Float, Float> aVarA2 = shapeTrimPath.f23426c.a();
        this.f36721e = (d) aVarA2;
        a<Float, Float> aVarA3 = shapeTrimPath.f23427d.a();
        this.f36722f = (d) aVarA3;
        aVar.d(aVarA);
        aVar.d(aVarA2);
        aVar.d(aVarA3);
        aVarA.a(this);
        aVarA2.a(this);
        aVarA3.a(this);
    }

    @Override // p116j3.a.InterfaceC0468a
    public final void a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f36718b;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((a.InterfaceC0468a) arrayList.get(i10)).a();
            i10++;
        }
    }

    public final void d(a.InterfaceC0468a interfaceC0468a) {
        this.f36718b.add(interfaceC0468a);
    }

    @Override // p104i3.b
    public final void b(List<b> list, List<b> list2) {
    }
}
