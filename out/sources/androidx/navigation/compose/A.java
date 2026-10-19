package androidx.navigation.compose;

import androidx.compose.animation.InterfaceC0927e;
import java.util.Iterator;
import p141l2.C2749t;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19068c;

    public /* synthetic */ A(int i10, Object obj) {
        this.f19067b = i10;
        this.f19068c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0070  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // Ia.l
    public final Object invoke(Object obj) {
        androidx.compose.animation.y yVarInvoke;
        Ia.l lVar;
        Object obj2 = this.f19068c;
        switch (this.f19067b) {
            case 0:
                InterfaceC0927e<C2749t> interfaceC0927e = (InterfaceC0927e) obj;
                p141l2.C c10 = interfaceC0927e.h().f44299c;
                kotlin.jvm.internal.i.c(c10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                int i10 = p141l2.C.f44217f;
                Iterator it = l2.C.a.c((C1412e.a) c10).iterator();
                do {
                    if (it.hasNext()) {
                        p141l2.C c11 = (p141l2.C) it.next();
                        if (c11 instanceof C1412e.a) {
                            Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.y> lVar2 = ((C1412e.a) c11).f19159l;
                            if (lVar2 != null) {
                                yVarInvoke = lVar2.invoke(interfaceC0927e);
                            }
                        } else if (c11 instanceof C1411d.a) {
                            ((C1411d.a) c11).getClass();
                        }
                        yVarInvoke = null;
                    } else {
                        yVarInvoke = null;
                    }
                    if (yVarInvoke == null) {
                        return yVarInvoke;
                    }
                    lVar = (Ia.l) obj2;
                    if (lVar != null) {
                        return (androidx.compose.animation.y) lVar.invoke(interfaceC0927e);
                    }
                    return null;
                } while (yVarInvoke == null);
                if (yVarInvoke == null) {
                    return yVarInvoke;
                }
                lVar = (Ia.l) obj2;
                if (lVar != null) {
                    return (androidx.compose.animation.y) lVar.invoke(interfaceC0927e);
                }
                return null;
            default:
                p141l2.C destination = (p141l2.C) obj;
                kotlin.jvm.internal.i.e(destination, "destination");
                return Boolean.valueOf(!((p163n2.j) obj2).f44795l.containsKey(Integer.valueOf(destination.f44219c.f44813d)));
        }
    }
}
