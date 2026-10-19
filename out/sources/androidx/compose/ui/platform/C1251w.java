package androidx.compose.ui.platform;

import android.content.Context;
import com.google.firebase.FirebaseCommonRegistrar;

/* JADX INFO: renamed from: androidx.compose.ui.platform.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1251w implements p183oa.c, B7.g.a, j1.j.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15109b;

    public /* synthetic */ C1251w(int i10) {
        this.f15109b = i10;
    }

    @Override // p183oa.c, p311z4.f
    public Object apply(Object obj) {
        return ((N7.a) obj).J();
    }

    @Override // B7.g.a
    public String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        p162n1.b bVar = (p162n1.b) obj;
        switch (this.f15109b) {
            case 3:
                bVar.getClass();
                break;
            default:
                bVar.getClass();
                break;
        }
    }
}
