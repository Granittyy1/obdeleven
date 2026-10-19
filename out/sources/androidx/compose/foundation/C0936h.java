package androidx.compose.foundation;

import androidx.fragment.app.Fragment;
import com.parse.ParseUser;
import com.parse.SaveCallback;
import com.voltasit.obdeleven.presentation.signIn.SigninFragment;
import java.util.List;
import java.util.TreeSet;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.instance.SingleInstanceFactory;

/* JADX INFO: renamed from: androidx.compose.foundation.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0936h implements p183oa.b, com.google.gson.internal.f, SaveCallback, j1.j.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10064b;

    public static int b(int i10, int i11, int i12, int i13, int i14) {
        return Math.max(((i10 * i11) / i12) + i13, i14);
    }

    public static String c(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String d(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static SingleInstanceFactory e(BeanDefinition beanDefinition, Nb.a aVar) {
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(beanDefinition);
        aVar.b(singleInstanceFactory);
        return singleInstanceFactory;
    }

    public static void f(J.a.b bVar, long j) {
        bVar.a().o();
        bVar.j(j);
    }

    @Override // p183oa.b
    public void a(Object obj) {
        ((Throwable) obj).getMessage();
    }

    @Override // com.parse.ParseCallback1
    public void done(Throwable th) {
        List<String> list = SigninFragment.f33197n;
        ParseUser.logOut();
    }

    @Override // com.google.gson.internal.f
    public Object i() {
        return new TreeSet();
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        p162n1.b bVar = (p162n1.b) obj;
        switch (this.f10064b) {
            case 7:
                bVar.getClass();
                break;
            default:
                bVar.getClass();
                break;
        }
    }
}
