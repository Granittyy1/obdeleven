package androidx.compose.foundation.gestures;

import androidx.compose.runtime.InterfaceC1084f;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements j1.j.a {
    public static Integer a(String str, int i10, int i11) {
        return Integer.valueOf(Integer.parseInt(str.substring(i10), i11));
    }

    public static String b(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static void c(Ia.p pVar, InterfaceC1084f interfaceC1084f, int i10) {
        pVar.invoke(interfaceC1084f, Integer.valueOf(i10));
        interfaceC1084f.J();
    }

    public static void d(StringBuilder sb2, int i10, String str) {
        sb2.append(i10);
        O.e.j(sb2.toString(), str);
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((p162n1.b) obj).getClass();
    }
}
