package C4;

import android.os.Bundle;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.text.F;
import java.util.List;
import kotlin.KotlinNothingValueException;
import p191p5.InterfaceC2755a;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements p311z4.i, O1.g.a, j1.j.a, InterfaceC2755a, p311z4.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2400b;

    public /* synthetic */ v(int i10) {
        this.f2400b = i10;
    }

    public static int c(int i10, int i11, F f10) {
        return (f10.hashCode() + i10) * i11;
    }

    public static Bundle d(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    public static Object e(int i10, List list) {
        return list.get(list.size() - i10);
    }

    public static String f(StringBuilder sb2, boolean z10, String str) {
        sb2.append(z10);
        sb2.append(str);
        return sb2.toString();
    }

    public static KotlinNothingValueException g(String str) {
        R.a.c(str);
        return new KotlinNothingValueException();
    }

    public static void h(long j, String str, StringBuilder sb2) {
        sb2.append((Object) H.i(j));
        sb2.append(str);
    }

    @Override // O1.g.a
    public boolean a(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override // p311z4.f
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // p191p5.InterfaceC2755a
    public Object i(p191p5.g gVar) {
        return -1;
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        switch (this.f2400b) {
            case 5:
                ((g1.v.c) obj).M();
                break;
            default:
                ((p162n1.b) obj).getClass();
                break;
        }
    }

    @Override // p311z4.i
    public void b(Exception exc) {
    }
}
