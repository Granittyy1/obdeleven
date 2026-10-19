package p005a4;

import androidx.compose.animation.core.InterfaceC0921v;
import androidx.compose.foundation.text.selection.CrossStatus;
import androidx.compose.foundation.text.selection.h;
import androidx.compose.foundation.text.selection.i;
import androidx.compose.foundation.text.selection.j;
import com.braze.ui.inappmessage.c;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.internal.FeatureManager;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p162n1.b;
import p165n4.s;
import p183oa.d;
import p228s6.q;
import p296y0.a;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements FeatureManager.a, InterfaceC0921v, j, d, p228s6.d, j1.j.a, a.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8040b;

    public /* synthetic */ p(int i10) {
        this.f8040b = i10;
    }

    public static int d(int i10, int i11, List list) {
        return (list.hashCode() + i10) * i11;
    }

    @Override // p183oa.d
    public boolean a(Object obj) {
        return !((Boolean) obj).booleanValue();
    }

    @Override // y0.a.c
    public boolean c() {
        return false;
    }

    @Override // com.facebook.internal.FeatureManager.a
    public void e(boolean z10) {
        if (z10) {
            ConcurrentHashMap concurrentHashMap = ModelManager.f24945a;
            s.F(new c(1));
        }
    }

    @Override // p228s6.d
    public Object f(q qVar) {
        switch (this.f8040b) {
            case 5:
                return FirebaseSessionsRegistrar.m13getComponents$lambda4(qVar);
            default:
                return ExecutorsRegistrar.f28050a.get();
        }
    }

    @Override // androidx.compose.foundation.text.selection.j
    public i g(androidx.compose.foundation.text.selection.s sVar) {
        h hVar = sVar.f11623c;
        return new i(hVar.a(hVar.f11598a), hVar.a(hVar.f11599b), sVar.b() == CrossStatus.f11530b);
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((b) obj).getClass();
    }

    @Override // androidx.compose.animation.core.InterfaceC0921v
    public float b(float f10) {
        return f10;
    }
}
