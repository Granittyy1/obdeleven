package androidx.compose.ui.graphics;

import androidx.compose.ui.node.InterfaceC1198t;

/* JADX INFO: compiled from: GraphicsLayerModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SimpleGraphicsLayerModifier extends androidx.compose.ui.h.c implements InterfaceC1198t {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public l0 f13514A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f13515B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f13516C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f13517D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f13518E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Ia.l<? super U, p293xa.r> f13519F;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f13520p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f13521q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f13522r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f13523s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f13524t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f13525u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f13526v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f13527w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f13528x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f13529y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f13530z;

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final androidx.compose.ui.layout.F B(androidx.compose.ui.layout.H h8, androidx.compose.ui.layout.D d10, long j) {
        final androidx.compose.ui.layout.Y yQ = d10.Q(j);
        return h8.y1(yQ.f14220b, yQ.f14221c, kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar) {
                androidx.compose.ui.layout.Y.a.k(aVar, yQ, 0, 0, this.f13519F, 4);
                return p293xa.r.f47939a;
            }
        });
    }

    @Override // androidx.compose.ui.h.c
    public final boolean F1() {
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb2.append(this.f13520p);
        sb2.append(", scaleY=");
        sb2.append(this.f13521q);
        sb2.append(", alpha = ");
        sb2.append(this.f13522r);
        sb2.append(", translationX=");
        sb2.append(this.f13523s);
        sb2.append(", translationY=");
        sb2.append(this.f13524t);
        sb2.append(", shadowElevation=");
        sb2.append(this.f13525u);
        sb2.append(", rotationX=");
        sb2.append(this.f13526v);
        sb2.append(", rotationY=");
        sb2.append(this.f13527w);
        sb2.append(", rotationZ=");
        sb2.append(this.f13528x);
        sb2.append(", cameraDistance=");
        sb2.append(this.f13529y);
        sb2.append(", transformOrigin=");
        sb2.append((Object) q0.d(this.f13530z));
        sb2.append(", shape=");
        sb2.append(this.f13514A);
        sb2.append(", clip=");
        sb2.append(this.f13515B);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        C4.v.h(this.f13516C, ", spotShadowColor=", sb2);
        C4.v.h(this.f13517D, ", compositingStrategy=", sb2);
        sb2.append((Object) ("CompositingStrategy(value=" + this.f13518E + ')'));
        sb2.append(')');
        return sb2.toString();
    }
}
