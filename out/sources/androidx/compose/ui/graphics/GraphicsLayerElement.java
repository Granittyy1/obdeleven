package androidx.compose.ui.graphics;

import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.NodeCoordinator;

/* JADX INFO: compiled from: GraphicsLayerModifier.kt */
/* JADX INFO: loaded from: classes.dex */
final class GraphicsLayerElement extends androidx.compose.ui.node.H<SimpleGraphicsLayerModifier> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f13482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f13483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f13484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f13485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f13486h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f13487i;
    public final float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f13488k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f13489l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l0 f13490m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f13491n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f13492o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f13493p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f13494q;

    public GraphicsLayerElement(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j, l0 l0Var, boolean z10, long j10, long j11, int i10) {
        this.f13480b = f10;
        this.f13481c = f11;
        this.f13482d = f12;
        this.f13483e = f13;
        this.f13484f = f14;
        this.f13485g = f15;
        this.f13486h = f16;
        this.f13487i = f17;
        this.j = f18;
        this.f13488k = f19;
        this.f13489l = j;
        this.f13490m = l0Var;
        this.f13491n = z10;
        this.f13492o = j10;
        this.f13493p = j11;
        this.f13494q = i10;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        final SimpleGraphicsLayerModifier simpleGraphicsLayerModifier = new SimpleGraphicsLayerModifier();
        simpleGraphicsLayerModifier.f13520p = this.f13480b;
        simpleGraphicsLayerModifier.f13521q = this.f13481c;
        simpleGraphicsLayerModifier.f13522r = this.f13482d;
        simpleGraphicsLayerModifier.f13523s = this.f13483e;
        simpleGraphicsLayerModifier.f13524t = this.f13484f;
        simpleGraphicsLayerModifier.f13525u = this.f13485g;
        simpleGraphicsLayerModifier.f13526v = this.f13486h;
        simpleGraphicsLayerModifier.f13527w = this.f13487i;
        simpleGraphicsLayerModifier.f13528x = this.j;
        simpleGraphicsLayerModifier.f13529y = this.f13488k;
        simpleGraphicsLayerModifier.f13530z = this.f13489l;
        simpleGraphicsLayerModifier.f13514A = this.f13490m;
        simpleGraphicsLayerModifier.f13515B = this.f13491n;
        simpleGraphicsLayerModifier.f13516C = this.f13492o;
        simpleGraphicsLayerModifier.f13517D = this.f13493p;
        simpleGraphicsLayerModifier.f13518E = this.f13494q;
        simpleGraphicsLayerModifier.f13519F = new Ia.l<U, p293xa.r>() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$layerBlock$1
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(U u10) {
                U u11 = u10;
                u11.i(simpleGraphicsLayerModifier.f13520p);
                u11.h(simpleGraphicsLayerModifier.f13521q);
                u11.b(simpleGraphicsLayerModifier.f13522r);
                u11.k(simpleGraphicsLayerModifier.f13523s);
                u11.g(simpleGraphicsLayerModifier.f13524t);
                u11.n(simpleGraphicsLayerModifier.f13525u);
                u11.m(simpleGraphicsLayerModifier.f13526v);
                u11.d(simpleGraphicsLayerModifier.f13527w);
                u11.f(simpleGraphicsLayerModifier.f13528x);
                u11.l(simpleGraphicsLayerModifier.f13529y);
                u11.f1(simpleGraphicsLayerModifier.f13530z);
                u11.O0(simpleGraphicsLayerModifier.f13514A);
                u11.z(simpleGraphicsLayerModifier.f13515B);
                simpleGraphicsLayerModifier.getClass();
                u11.e();
                u11.y(simpleGraphicsLayerModifier.f13516C);
                u11.A(simpleGraphicsLayerModifier.f13517D);
                u11.t(simpleGraphicsLayerModifier.f13518E);
                return p293xa.r.f47939a;
            }
        };
        return simpleGraphicsLayerModifier;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        SimpleGraphicsLayerModifier simpleGraphicsLayerModifier = (SimpleGraphicsLayerModifier) cVar;
        simpleGraphicsLayerModifier.f13520p = this.f13480b;
        simpleGraphicsLayerModifier.f13521q = this.f13481c;
        simpleGraphicsLayerModifier.f13522r = this.f13482d;
        simpleGraphicsLayerModifier.f13523s = this.f13483e;
        simpleGraphicsLayerModifier.f13524t = this.f13484f;
        simpleGraphicsLayerModifier.f13525u = this.f13485g;
        simpleGraphicsLayerModifier.f13526v = this.f13486h;
        simpleGraphicsLayerModifier.f13527w = this.f13487i;
        simpleGraphicsLayerModifier.f13528x = this.j;
        simpleGraphicsLayerModifier.f13529y = this.f13488k;
        simpleGraphicsLayerModifier.f13530z = this.f13489l;
        simpleGraphicsLayerModifier.f13514A = this.f13490m;
        simpleGraphicsLayerModifier.f13515B = this.f13491n;
        simpleGraphicsLayerModifier.f13516C = this.f13492o;
        simpleGraphicsLayerModifier.f13517D = this.f13493p;
        simpleGraphicsLayerModifier.f13518E = this.f13494q;
        NodeCoordinator nodeCoordinator = C1185f.d(simpleGraphicsLayerModifier, 2).f14528q;
        if (nodeCoordinator != null) {
            nodeCoordinator.V1(simpleGraphicsLayerModifier.f13519F, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.f13480b, graphicsLayerElement.f13480b) == 0 && Float.compare(this.f13481c, graphicsLayerElement.f13481c) == 0 && Float.compare(this.f13482d, graphicsLayerElement.f13482d) == 0 && Float.compare(this.f13483e, graphicsLayerElement.f13483e) == 0 && Float.compare(this.f13484f, graphicsLayerElement.f13484f) == 0 && Float.compare(this.f13485g, graphicsLayerElement.f13485g) == 0 && Float.compare(this.f13486h, graphicsLayerElement.f13486h) == 0 && Float.compare(this.f13487i, graphicsLayerElement.f13487i) == 0 && Float.compare(this.j, graphicsLayerElement.j) == 0 && Float.compare(this.f13488k, graphicsLayerElement.f13488k) == 0 && q0.a(this.f13489l, graphicsLayerElement.f13489l) && kotlin.jvm.internal.i.a(this.f13490m, graphicsLayerElement.f13490m) && this.f13491n == graphicsLayerElement.f13491n && kotlin.jvm.internal.i.a(null, null) && H.c(this.f13492o, graphicsLayerElement.f13492o) && H.c(this.f13493p, graphicsLayerElement.f13493p) && O.a(this.f13494q, graphicsLayerElement.f13494q);
    }

    public final int hashCode() {
        int iD = O.a.d(this.f13488k, O.a.d(this.j, O.a.d(this.f13487i, O.a.d(this.f13486h, O.a.d(this.f13485g, O.a.d(this.f13484f, O.a.d(this.f13483e, O.a.d(this.f13482d, O.a.d(this.f13481c, Float.hashCode(this.f13480b) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i10 = q0.f13792c;
        int iB = androidx.compose.animation.D.b((this.f13490m.hashCode() + C4.b.c(this.f13489l, iD, 31)) * 31, 961, this.f13491n);
        int i11 = H.f13505m;
        return Integer.hashCode(this.f13494q) + C4.b.c(this.f13493p, C4.b.c(this.f13492o, iB, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb2.append(this.f13480b);
        sb2.append(", scaleY=");
        sb2.append(this.f13481c);
        sb2.append(", alpha=");
        sb2.append(this.f13482d);
        sb2.append(", translationX=");
        sb2.append(this.f13483e);
        sb2.append(", translationY=");
        sb2.append(this.f13484f);
        sb2.append(", shadowElevation=");
        sb2.append(this.f13485g);
        sb2.append(", rotationX=");
        sb2.append(this.f13486h);
        sb2.append(", rotationY=");
        sb2.append(this.f13487i);
        sb2.append(", rotationZ=");
        sb2.append(this.j);
        sb2.append(", cameraDistance=");
        sb2.append(this.f13488k);
        sb2.append(", transformOrigin=");
        sb2.append((Object) q0.d(this.f13489l));
        sb2.append(", shape=");
        sb2.append(this.f13490m);
        sb2.append(", clip=");
        sb2.append(this.f13491n);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        C4.v.h(this.f13492o, ", spotShadowColor=", sb2);
        sb2.append((Object) H.i(this.f13493p));
        sb2.append(", compositingStrategy=");
        sb2.append((Object) ("CompositingStrategy(value=" + this.f13494q + ')'));
        sb2.append(')');
        return sb2.toString();
    }
}
