package p220r9;

import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.a;
import com.voltasit.obdeleven.presentation.models.StartView;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.activity.e;
import java.util.List;

/* JADX INFO: compiled from: LoginUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C {
    public static boolean a(String str) {
        return str == null || str.isEmpty();
    }

    public static void b(MainActivity mainActivity, e eVar) {
        List<String> list = a.f29638c;
        a.C0320a.a(mainActivity).k(StartView.AUTO.a(), "start_view");
        a.C0320a.a(mainActivity).o("selected_car", "");
        Application.f29634b.b();
        eVar.run();
    }
}
