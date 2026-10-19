package p014b1;

import Ia.l;
import androidx.lifecycle.Y;
import androidx.lifecycle.a0;
import java.util.Arrays;
import kotlin.jvm.internal.c;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: InitializerViewModelFactory.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e<?>[] f20499a;

    public b(e<?>... initializers) {
        i.e(initializers, "initializers");
        this.f20499a = initializers;
    }

    @Override // androidx.lifecycle.a0.c
    public final <VM extends Y> VM create(Class<VM> cls, a extras) {
        VM vm;
        e eVar;
        l<a, T> lVar;
        i.e(extras, "extras");
        c cVarA = kotlin.jvm.internal.l.a(cls);
        e<?>[] eVarArr = this.f20499a;
        e[] initializers = (e[]) Arrays.copyOf(eVarArr, eVarArr.length);
        i.e(initializers, "initializers");
        int length = initializers.length;
        int i10 = 0;
        while (true) {
            vm = null;
            if (i10 >= length) {
                eVar = null;
                break;
            }
            eVar = initializers[i10];
            if (eVar.f20501a.equals(cVarA)) {
                break;
            }
            i10++;
        }
        if (eVar != null && (lVar = eVar.f20502b) != 0) {
            vm = (VM) lVar.invoke(extras);
        }
        if (vm != null) {
            return vm;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + cVarA.i()).toString());
    }
}
