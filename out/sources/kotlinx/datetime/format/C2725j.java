package kotlinx.datetime.format;

import java.util.Arrays;

/* JADX INFO: renamed from: kotlinx.datetime.format.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DateTimeFormatBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2725j {
    public static final <T extends InterfaceC2724i> void a(T t8, Ia.l<? super T, p293xa.r>[] lVarArr, Ia.l<? super T, p293xa.r> primaryFormat) {
        kotlin.jvm.internal.i.e(t8, "<this>");
        kotlin.jvm.internal.i.e(primaryFormat, "primaryFormat");
        if (!(t8 instanceof InterfaceC2717b)) {
            throw new IllegalStateException("impossible");
        }
        Ia.l[] lVarArr2 = (Ia.l[]) Arrays.copyOf(lVarArr, lVarArr.length);
        kotlin.jvm.internal.o.d(1, primaryFormat);
        ((InterfaceC2717b) t8).t(lVarArr2, primaryFormat);
    }

    public static final void b(InterfaceC2724i interfaceC2724i, char c10) {
        kotlin.jvm.internal.i.e(interfaceC2724i, "<this>");
        interfaceC2724i.d(String.valueOf(c10));
    }

    public static final <T extends InterfaceC2724i> void c(T t8, String ifZero, Ia.l<? super T, p293xa.r> format) {
        kotlin.jvm.internal.i.e(t8, "<this>");
        kotlin.jvm.internal.i.e(ifZero, "ifZero");
        kotlin.jvm.internal.i.e(format, "format");
        if (!(t8 instanceof InterfaceC2717b)) {
            throw new IllegalStateException("impossible");
        }
        kotlin.jvm.internal.o.d(1, format);
        ((InterfaceC2717b) t8).c(format, ifZero);
    }
}
