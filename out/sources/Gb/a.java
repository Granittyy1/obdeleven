package Gb;

import androidx.lifecycle.Y;
import androidx.lifecycle.b0;
import kotlin.jvm.internal.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import org.koin.androidx.viewmodel.factory.KoinViewModelFactory;
import p014b1.f;
import p241t7.b;

/* JADX INFO: compiled from: GetViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static final Y a(c cVar, b0 viewModelStore, String str, p014b1.a extras, Pb.a aVar, org.koin.core.scope.a scope, Ia.a aVar2) {
        String value;
        String strF;
        i.e(viewModelStore, "viewModelStore");
        i.e(extras, "extras");
        i.e(scope, "scope");
        Class clsR = b.r(cVar);
        f fVar = new f(viewModelStore, new KoinViewModelFactory(cVar, scope, aVar, aVar2), extras);
        if (aVar == null && str == null) {
            strF = null;
        } else {
            if (aVar == null || (value = aVar.getValue()) == null) {
                value = "";
            }
            if (str == null) {
                str = "";
            }
            strF = O.a.f(value, str, "");
        }
        if (strF != null) {
            return fVar.a(l.a(clsR), strF);
        }
        c cVarA = l.a(clsR);
        String strI = cVarA.i();
        if (strI != null) {
            return fVar.a(cVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
