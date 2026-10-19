package p027c1;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.lifecycle.InterfaceC1369l;
import androidx.lifecycle.Y;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import kotlin.jvm.internal.i;
import p014b1.a;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final Y a(kotlin.jvm.internal.c cVar, c0 c0Var, String str, a0.c cVar2, a extras, InterfaceC1084f interfaceC1084f) {
        a0 a0VarA;
        if (cVar2 != null) {
            b0 store = c0Var.getViewModelStore();
            i.e(store, "store");
            i.e(extras, "extras");
            a0VarA = new a0(store, cVar2, extras);
        } else if (c0Var instanceof InterfaceC1369l) {
            b0 store2 = c0Var.getViewModelStore();
            a0.c factory = ((InterfaceC1369l) c0Var).getDefaultViewModelProviderFactory();
            i.e(store2, "store");
            i.e(factory, "factory");
            i.e(extras, "extras");
            a0VarA = new a0(store2, factory, extras);
        } else {
            a0VarA = a0.b.a(c0Var, null, 6);
        }
        return str != null ? a0VarA.f17796a.a(cVar, str) : a0VarA.a(cVar);
    }
}
