package androidx.compose.ui.text.font;

import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.voltasit.obdeleven.presentation.startup.StartupActivity;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements com.google.common.base.c, p183oa.b, p228s6.d, y0.a.c, j1.j.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15454b;

    public /* synthetic */ s(int i10) {
        this.f15454b = i10;
    }

    public static String b(String str, String str2) {
        return str + str2;
    }

    @Override // p183oa.b
    public void a(Object obj) {
        Q3.d.B();
    }

    @Override // com.google.common.base.c
    public Object apply(Object obj) {
        return new p162n1.f((p114j1.c) obj);
    }

    @Override // y0.a.c
    public boolean c() {
        int i10 = StartupActivity.f33274e;
        return true;
    }

    @Override // p228s6.d
    public Object f(p228s6.q qVar) {
        return FirebaseSessionsRegistrar.m10getComponents$lambda1(qVar);
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        p162n1.b bVar = (p162n1.b) obj;
        switch (this.f15454b) {
            case 5:
                bVar.getClass();
                break;
            default:
                bVar.getClass();
                break;
        }
    }
}
