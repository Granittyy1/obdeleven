package androidx.compose.ui.graphics.layer;

import A8.A;
import android.graphics.Canvas;
import androidx.collection.L;
import androidx.collection.V;
import androidx.compose.foundation.lazy.q;
import androidx.compose.ui.graphics.C1139o;
import androidx.compose.ui.graphics.C1142s;
import androidx.compose.ui.graphics.C1143t;
import androidx.compose.ui.graphics.C1144u;
import androidx.compose.ui.graphics.C1146w;
import androidx.compose.ui.graphics.C1149z;
import androidx.compose.ui.graphics.E;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Y;
import androidx.compose.ui.graphics.b0;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: compiled from: GraphicsLayer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(J.e eVar, b bVar) {
        boolean z10;
        boolean z11;
        float f10;
        E eA = eVar.W0().a();
        b bVar2 = eVar.W0().f3949b;
        if (bVar.f13678s) {
            return;
        }
        bVar.a();
        GraphicsLayerImpl graphicsLayerImpl = bVar.f13661a;
        if (!graphicsLayerImpl.j()) {
            try {
                graphicsLayerImpl.G(bVar.f13662b, bVar.f13663c, bVar, bVar.f13665e);
            } catch (Throwable unused) {
            }
        }
        boolean z12 = graphicsLayerImpl.H() > 0.0f;
        if (z12) {
            eA.t();
        }
        Canvas canvasA = C1139o.a(eA);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j = bVar.f13679t;
            float f11 = (int) (j >> 32);
            float f12 = (int) (j & 4294967295L);
            long j10 = bVar.f13680u;
            float f13 = f11 + ((int) (j10 >> 32));
            float f14 = f12 + ((int) (j10 & 4294967295L));
            float fA = graphicsLayerImpl.a();
            int iJ = graphicsLayerImpl.J();
            if (fA < 1.0f || !C1149z.a(iJ, 3) || a.a(graphicsLayerImpl.q(), 1)) {
                C1142s c1142sA = bVar.f13675p;
                if (c1142sA == null) {
                    c1142sA = C1143t.a();
                    bVar.f13675p = c1142sA;
                }
                c1142sA.b(fA);
                c1142sA.j(iJ);
                c1142sA.k(null);
                canvasA.saveLayer(f11, f12, f13, f14, c1142sA.f13794a);
                f10 = f12;
            } else {
                canvasA.save();
                f10 = f12;
            }
            canvasA.translate(f11, f10);
            canvasA.concat(graphicsLayerImpl.F());
        }
        boolean z13 = !zIsHardwareAccelerated && bVar.f13682w;
        if (z13) {
            eA.g();
            b0 b0VarD = bVar.d();
            if (b0VarD instanceof b0.b) {
                eA.q(b0VarD.a(), 1);
            } else if (b0VarD instanceof b0.c) {
                C1144u c1144uA = bVar.f13672m;
                if (c1144uA != null) {
                    c1144uA.o();
                } else {
                    c1144uA = C1146w.a();
                    bVar.f13672m = c1144uA;
                }
                c1144uA.q(((b0.c) b0VarD).f13541a, Path.Direction.f13511b);
                eA.l(c1144uA, 1);
            } else if (b0VarD instanceof b0.a) {
                eA.l(((b0.a) b0VarD).f13539a, 1);
            }
        }
        if (bVar2 != null) {
            q qVar = bVar2.f13677r;
            if (!qVar.f10773a) {
                Y.a("Only add dependencies during a tracking");
            }
            L l10 = (L) qVar.f10776d;
            if (l10 != null) {
                l10.d(bVar);
            } else if (((b) qVar.f10774b) != null) {
                L lA = V.a();
                b bVar3 = (b) qVar.f10774b;
                kotlin.jvm.internal.i.b(bVar3);
                lA.d(bVar3);
                lA.d(bVar);
                qVar.f10776d = lA;
                qVar.f10774b = null;
            } else {
                qVar.f10774b = bVar;
            }
            L l11 = (L) qVar.f10777e;
            if (l11 != null) {
                z11 = !l11.l(bVar);
            } else if (((b) qVar.f10775c) != bVar) {
                z11 = true;
            } else {
                qVar.f10775c = null;
                z11 = false;
            }
            if (z11) {
                bVar.f13676q++;
            }
        }
        if (C1139o.a(eA).isHardwareAccelerated()) {
            z10 = zIsHardwareAccelerated;
            graphicsLayerImpl.K(eA);
        } else {
            J.a aVar = bVar.f13674o;
            if (aVar == null) {
                aVar = new J.a();
                bVar.f13674o = aVar;
            }
            p013b0.c cVar = bVar.f13662b;
            LayoutDirection layoutDirection = bVar.f13663c;
            long jK = A.k(bVar.f13680u);
            J.a.b bVar4 = aVar.f3941c;
            p013b0.c cVarB = bVar4.b();
            LayoutDirection layoutDirectionD = bVar4.d();
            E eA2 = bVar4.a();
            long jE = bVar4.e();
            z10 = zIsHardwareAccelerated;
            b bVar5 = bVar4.f3949b;
            bVar4.g(cVar);
            bVar4.i(layoutDirection);
            bVar4.f(eA);
            bVar4.j(jK);
            bVar4.f3949b = bVar;
            eA.g();
            try {
                bVar.c(aVar);
                eA.o();
                bVar4.g(cVarB);
                bVar4.i(layoutDirectionD);
                bVar4.f(eA2);
                bVar4.j(jE);
                bVar4.f3949b = bVar5;
            } catch (Throwable th) {
                eA.o();
                bVar4.g(cVarB);
                bVar4.i(layoutDirectionD);
                bVar4.f(eA2);
                bVar4.j(jE);
                bVar4.f3949b = bVar5;
                throw th;
            }
        }
        if (z13) {
            eA.o();
        }
        if (z12) {
            eA.h();
        }
        if (z10) {
            return;
        }
        canvasA.restore();
    }
}
