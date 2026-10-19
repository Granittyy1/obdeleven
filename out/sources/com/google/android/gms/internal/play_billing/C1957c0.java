package com.google.android.gms.internal.play_billing;

import androidx.compose.foundation.C0936h;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1957c0 extends I0 implements InterfaceC1970g1 {
    private static final C1957c0 zzb;
    private N0 zzd = C1988m1.f26220f;

    static {
        C1957c0 c1957c0 = new C1957c0();
        zzb = c1957c0;
        I0.n(C1957c0.class, c1957c0);
    }

    public static C1954b0 q() {
        return (C1954b0) zzb.h();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void r(C1957c0 c1957c0, ArrayList arrayList) {
        N0 n10 = c1957c0.zzd;
        if (!n10.y()) {
            int size = n10.size();
            c1957c0.zzd = n10.o(size + size);
        }
        List list = c1957c0.zzd;
        Charset charset = O0.f26148a;
        int size2 = arrayList.size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size2);
        } else if (list instanceof C1988m1) {
            C1988m1 c1988m1 = (C1988m1) list;
            int i10 = ((C1988m1) list).f26222d + size2;
            int length = c1988m1.f26221c.length;
            if (i10 > length) {
                if (length != 0) {
                    while (length < i10) {
                        length = C0936h.b(length, 3, 2, 1, 10);
                    }
                    c1988m1.f26221c = Arrays.copyOf(c1988m1.f26221c, length);
                } else {
                    c1988m1.f26221c = new Object[Math.max(i10, 10)];
                }
            }
        }
        int size3 = list.size();
        int size4 = arrayList.size();
        for (int i11 = 0; i11 < size4; i11++) {
            Object obj = arrayList.get(i11);
            if (obj == null) {
                String strC = J4.i.c(list.size() - size3, "Element at index ", " is null.");
                int size5 = list.size();
                while (true) {
                    size5--;
                    if (size5 < size3) {
                        throw new NullPointerException(strC);
                    }
                    list.remove(size5);
                }
            } else {
                list.add(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.I0
    public final Object g(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C1991n1(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C1951a0.class});
        }
        if (i11 == 3) {
            return new C1957c0();
        }
        if (i11 == 4) {
            return new C1954b0(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
