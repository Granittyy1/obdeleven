package androidx.compose.animation;

import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.UUID;
import p191p5.InterfaceC2755a;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class D implements p183oa.b, InterfaceC2755a, p228s6.d, j1.j.a, com.google.common.base.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9269b;

    public /* synthetic */ D(int i10) {
        this.f9269b = i10;
    }

    public static int b(int i10, int i11, boolean z10) {
        return (Boolean.hashCode(z10) + i10) * i11;
    }

    public static String c(String str) {
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.i.d(string, str);
        return string;
    }

    @Override // p183oa.b
    public void a(Object obj) {
        ((Throwable) obj).getMessage();
    }

    @Override // com.google.common.base.c
    public Object apply(Object obj) {
        return ((A1.p) obj).b().getClass().getSimpleName();
    }

    @Override // p228s6.d
    public Object f(p228s6.q qVar) {
        return FirebaseInstallationsRegistrar.lambda$getComponents$0(qVar);
    }

    @Override // p191p5.InterfaceC2755a
    public Object i(p191p5.g gVar) {
        return 403;
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        p162n1.b bVar = (p162n1.b) obj;
        switch (this.f9269b) {
            case 5:
                bVar.getClass();
                break;
            default:
                bVar.getClass();
                break;
        }
    }
}
